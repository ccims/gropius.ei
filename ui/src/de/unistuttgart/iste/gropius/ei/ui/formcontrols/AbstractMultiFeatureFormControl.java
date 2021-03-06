/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * <p>
 * Based on org.eclipse.emf.parsley.composite.MultipleFeatureControl.
 * It was licensed under Eclipse Public License v1.0 there.
 * It had these contributors there:
 * 
 * Copyright (c) 2008, 2013 itemis AG and others.
 * Contributors:
 * itemis AG - Initial API and implementation
 * Lorenzo Bettini - refactoring for EmfParsley
 * </p>
 */
package de.unistuttgart.iste.gropius.ei.ui.formcontrols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.widgets.IWidgetFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;

/**
 * Highly customizable abstract base class for form control widgets for fields
 * where the value is a list of objects.
 * <p>
 * Possible customizations:
 * 
 * @author Tim Neumann
 * 
 *         <p>
 *         Based on {@link org.eclipse.emf.parsley.composite.MultipleFeatureControl} with these
 *         authors:
 * @author Dennis Huebner
 * @author Lorenzo Bettini (modifications)
 * 
 * @param <V> The type of value of each feature. To allow any data set this to
 *            Object.
 * @param <O> The type of the owner of the features. This is the type of the
 *            object displayed by the whole form
 */
public abstract class AbstractMultiFeatureFormControl<V, O extends EObject> extends Composite {
    private final IWidgetFactory widgetFactory;
    private final ILabelProvider labelProvider;
    private final ProposalCreator proposalCreator;
    
    private final O object;
    private final EStructuralFeature feature;
    private final boolean readonly;
    
    private ISelectionProvider internalProvider = new InternalSelectionProvider();
    
    /**
     * Create the abstract multi feature form control
     * 
     * @param parent          The parent composite
     * @param widgetFactory   The widget factory to use
     * @param labelProvider   The label provider to use
     * @param object          The EObject to use
     * @param feature         The EStructuralFeature to use
     * @param proposalCreator The ProposalCreator to use
     * @param readonly        Whether this control is readonly
     * @param style           The style of the Composite
     */
    public AbstractMultiFeatureFormControl(final Composite parent, IWidgetFactory widgetFactory,
            final ILabelProvider labelProvider,
            final O object, final EStructuralFeature feature, final ProposalCreator proposalCreator,
            boolean readonly, int style) {
        super(parent, style);
        this.widgetFactory = widgetFactory;
        this.labelProvider = labelProvider;
        this.proposalCreator = proposalCreator;
        this.object = object;
        this.feature = feature;
        this.readonly = readonly;
    }
    
    /**
     * Initialize the control.
     * <p>
     * This must be called by after creating the control before it will be visible
     */
    public void init() {
        createControls();
    }
    
    /**
     * Creates the child controls of for this composite.
     * <p>
     * This should not be called bt clients.
     * <p>
     * Use the appropriate getters to get the parent, object and feature as well as
     * the providers and factories
     */
    protected abstract void createControls();

    /**
     * Refresh the displayed value of this control
     * <p>
     * This should use {@link #getValue()} to get the latest value and update what
     * is displayed.
     */
    protected abstract void refreshValue();
    
    /**
     * An internal selection provider, which calls
     * {@link AbstractMultiFeatureFormControl#refreshValue()} every time the
     * selection is set.
     */
    class InternalSelectionProvider implements ISelectionProvider {
        private List<ISelectionChangedListener> listeners = new ArrayList<>();
        private ISelection selection;
        
        @Override
        public void setSelection(ISelection selection) {
            this.selection = selection;
            refreshValue();
            for (ISelectionChangedListener currListener : this.listeners) {
                currListener.selectionChanged(new SelectionChangedEvent(this,
                        this.selection));
            }
        }
        
        
        @Override
        public void addSelectionChangedListener(ISelectionChangedListener listener) {
            this.listeners.add(listener);
        }
        
        @Override
        public void removeSelectionChangedListener(ISelectionChangedListener listener) {
            this.listeners.remove(listener);
        }
        
        @Override
        public ISelection getSelection() {
            return this.selection;
        }
    }
    
    /**
     * Add a selection changed listener to the internal selection provider
     * 
     * @param listener The listener to add
     */
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        this.internalProvider.addSelectionChangedListener(listener);
    }
    
    /**
     * Remove a selection changed listener from the internal selection provider
     * 
     * @param listener The listener to remove
     */
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        this.internalProvider.removeSelectionChangedListener(listener);
    }
    
    /**
     * @return the current value of this control as a Selection
     */
    protected ISelection getValueAsSelection() {
        return this.internalProvider.getSelection();
    }
    
    /**
     * @return the current value of this control
     */
    public List<V> getValue() {
        ISelection selection = getValueAsSelection();
        if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
            return ((StructuredSelection) selection).toList();
        }
        return Collections.emptyList();
    }
    
    /**
     * Set the current value of this control as a Selection
     * 
     * @param newValue The new value to set.
     */
    protected void setValue(IStructuredSelection newValue) {
        this.internalProvider.setSelection(newValue);
    }
    
    /**
     * Set the current value of this control
     * 
     * @param newValue The new value to set.
     */
    public void setValue(List<V> newValue) {
        setValue(new StructuredSelection(newValue));
    }
    
    /**
     * @return the widgetFactory
     */
    protected IWidgetFactory getWidgetFactory() {
        return this.widgetFactory;
    }
    
    /**
     * @return the labelProvider
     */
    protected ILabelProvider getLabelProvider() {
        return this.labelProvider;
    }
    
    /**
     * @return the proposalCreator
     */
    protected ProposalCreator getProposalCreator() {
        return this.proposalCreator;
    }
    
    /**
     * @return the object
     */
    protected O getObject() {
        return this.object;
    }
    
    /**
     * @return the feature
     */
    protected EStructuralFeature getFeature() {
        return this.feature;
    }
    
    /**
     * @return the readonly
     */
    protected boolean isReadonly() {
        return this.readonly;
    }
    
    /**
     * @return the internalProvider
     */
    protected ISelectionProvider getInternalProvider() {
        return this.internalProvider;
    }
    
}
