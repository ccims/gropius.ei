/**
 * Copyright (c) 2020 Tim Neumann
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.impl;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Issue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.IssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CcimsDatamodelPackageImpl extends EPackageImpl implements CcimsDatamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 Tim Neumann";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossComponentIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueManagementSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossComponentIssueManagementSystemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CcimsDatamodelPackageImpl() {
		super(eNS_URI, CcimsDatamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CcimsDatamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CcimsDatamodelPackage init() {
		if (isInited) return (CcimsDatamodelPackage)EPackage.Registry.INSTANCE.getEPackage(CcimsDatamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCcimsDatamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CcimsDatamodelPackageImpl theCcimsDatamodelPackage = registeredCcimsDatamodelPackage instanceof CcimsDatamodelPackageImpl ? (CcimsDatamodelPackageImpl)registeredCcimsDatamodelPackage : new CcimsDatamodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCcimsDatamodelPackage.createPackageContents();

		// Initialize created meta-data
		theCcimsDatamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCcimsDatamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CcimsDatamodelPackage.eNS_URI, theCcimsDatamodelPackage);
		return theCcimsDatamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ProvidedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ConsumedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterface_Name() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossComponentIssue() {
		return crossComponentIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossComponentIssue_Title() {
		return (EAttribute)crossComponentIssueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossComponentIssue_TextBody() {
		return (EAttribute)crossComponentIssueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossComponentIssue_IsOpen() {
		return (EAttribute)crossComponentIssueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssue_Assignees() {
		return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssue_RepresentedIssues() {
		return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssue_ConcernedComponents() {
		return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssue_Labels() {
		return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssue_LinkedIssues() {
		return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssue_ConcernedInterface() {
		return (EReference)crossComponentIssueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeveloper() {
		return developerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeveloper_DevelopedComponents() {
		return (EReference)developerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeveloper_Name() {
		return (EAttribute)developerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeveloper_AssignedIssues() {
		return (EReference)developerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_Location() {
		return (EReference)issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_ConcernedComponent() {
		return (EReference)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Id() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssueManagementSystem() {
		return issueManagementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueManagementSystem_Name() {
		return (EAttribute)issueManagementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueManagementSystem_LocationUri() {
		return (EAttribute)issueManagementSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueManagementSystem_StoredIssues() {
		return (EReference)issueManagementSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Name() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossComponentIssueManagementSystem() {
		return crossComponentIssueManagementSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssueManagementSystem_IssueRootLocations() {
		return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssueManagementSystem_ManagedCroCoIssues() {
		return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssueManagementSystem_Labels() {
		return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssueManagementSystem_Developers() {
		return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossComponentIssueManagementSystem_Components() {
		return (EReference)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossComponentIssueManagementSystem_LocationUri() {
		return (EAttribute)crossComponentIssueManagementSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CcimsDatamodelFactory getCcimsDatamodelFactory() {
		return (CcimsDatamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PROVIDED_INTERFACES);
		createEReference(componentEClass, COMPONENT__CONSUMED_INTERFACES);
		createEAttribute(componentEClass, COMPONENT__NAME);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);

		crossComponentIssueEClass = createEClass(CROSS_COMPONENT_ISSUE);
		createEAttribute(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__TITLE);
		createEAttribute(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__TEXT_BODY);
		createEAttribute(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__IS_OPEN);
		createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__ASSIGNEES);
		createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__REPRESENTED_ISSUES);
		createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__CONCERNED_COMPONENTS);
		createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__LABELS);
		createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__LINKED_ISSUES);
		createEReference(crossComponentIssueEClass, CROSS_COMPONENT_ISSUE__CONCERNED_INTERFACE);

		developerEClass = createEClass(DEVELOPER);
		createEReference(developerEClass, DEVELOPER__DEVELOPED_COMPONENTS);
		createEAttribute(developerEClass, DEVELOPER__NAME);
		createEReference(developerEClass, DEVELOPER__ASSIGNED_ISSUES);

		issueEClass = createEClass(ISSUE);
		createEReference(issueEClass, ISSUE__LOCATION);
		createEReference(issueEClass, ISSUE__CONCERNED_COMPONENT);
		createEAttribute(issueEClass, ISSUE__ID);

		issueManagementSystemEClass = createEClass(ISSUE_MANAGEMENT_SYSTEM);
		createEAttribute(issueManagementSystemEClass, ISSUE_MANAGEMENT_SYSTEM__NAME);
		createEAttribute(issueManagementSystemEClass, ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI);
		createEReference(issueManagementSystemEClass, ISSUE_MANAGEMENT_SYSTEM__STORED_ISSUES);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__NAME);

		crossComponentIssueManagementSystemEClass = createEClass(CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM);
		createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__ISSUE_ROOT_LOCATIONS);
		createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__MANAGED_CRO_CO_ISSUES);
		createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LABELS);
		createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__DEVELOPERS);
		createEReference(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__COMPONENTS);
		createEAttribute(crossComponentIssueManagementSystemEClass, CROSS_COMPONENT_ISSUE_MANAGEMENT_SYSTEM__LOCATION_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ProvidedInterfaces(), this.getInterface(), null, "providedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_ConsumedInterfaces(), this.getInterface(), null, "consumedInterfaces", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComponent_Name(), theTypesPackage.getString(), "name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), theTypesPackage.getString(), "name", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(crossComponentIssueEClass, CrossComponentIssue.class, "CrossComponentIssue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrossComponentIssue_Title(), theTypesPackage.getString(), "title", null, 1, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrossComponentIssue_TextBody(), theTypesPackage.getString(), "textBody", null, 1, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrossComponentIssue_IsOpen(), theTypesPackage.getBoolean(), "isOpen", null, 1, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssue_Assignees(), this.getDeveloper(), this.getDeveloper_AssignedIssues(), "assignees", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssue_RepresentedIssues(), this.getIssue(), null, "representedIssues", null, 1, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssue_ConcernedComponents(), this.getComponent(), null, "concernedComponents", null, 1, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssue_Labels(), this.getLabel(), null, "labels", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssue_LinkedIssues(), this.getCrossComponentIssue(), null, "linkedIssues", null, 0, -1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssue_ConcernedInterface(), this.getInterface(), null, "concernedInterface", null, 0, 1, CrossComponentIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(developerEClass, Developer.class, "Developer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeveloper_DevelopedComponents(), this.getComponent(), null, "developedComponents", null, 1, -1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeveloper_Name(), theTypesPackage.getString(), "name", null, 1, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeveloper_AssignedIssues(), this.getCrossComponentIssue(), this.getCrossComponentIssue_Assignees(), "assignedIssues", null, 0, -1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssue_Location(), this.getIssueManagementSystem(), this.getIssueManagementSystem_StoredIssues(), "location", null, 1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIssue_ConcernedComponent(), this.getComponent(), null, "concernedComponent", null, 1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIssue_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(issueManagementSystemEClass, IssueManagementSystem.class, "IssueManagementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueManagementSystem_Name(), theTypesPackage.getString(), "name", null, 1, 1, IssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIssueManagementSystem_LocationUri(), theTypesPackage.getString(), "locationUri", null, 1, 1, IssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIssueManagementSystem_StoredIssues(), this.getIssue(), this.getIssue_Location(), "storedIssues", null, 0, -1, IssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Name(), theTypesPackage.getString(), "name", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(crossComponentIssueManagementSystemEClass, CrossComponentIssueManagementSystem.class, "CrossComponentIssueManagementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossComponentIssueManagementSystem_IssueRootLocations(), this.getIssueManagementSystem(), null, "issueRootLocations", null, 1, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssueManagementSystem_ManagedCroCoIssues(), this.getCrossComponentIssue(), null, "managedCroCoIssues", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssueManagementSystem_Labels(), this.getLabel(), null, "labels", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssueManagementSystem_Developers(), this.getDeveloper(), null, "developers", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrossComponentIssueManagementSystem_Components(), this.getComponent(), null, "components", null, 0, -1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrossComponentIssueManagementSystem_LocationUri(), theTypesPackage.getString(), "locationUri", null, 1, 1, CrossComponentIssueManagementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "CCIMS-Metamodel"
		   });
	}

} //CcimsDatamodelPackageImpl