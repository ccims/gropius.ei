/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Component;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Developer;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Interface;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Label;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location;

/**
 * @author Tim Neumann
 *
 */
public class MockDataGenerator {
    private static int RANDOM_LABEL_MAX_COUNT = 6;
    private static int RANDOM_DEVELOPER_MAX_COUNT = 5;
    private static int RANDOM_COMPONENNT_MAX_COUNT = 10;
    private static int RANDOM_INTERFACE_MAX_COUNT = 10;
    private static int RANDOM_ISSUE_MAX_COUNT = 40;
    private static int CONSUMED_INTERFACES_PER_COMPONENT_MAX = 5;
    private static int ASSIGNE_PER_ISSUE_MAX = 3;
    private static int LABEL_PER_ISSUE_MAX = 3;
    private static int LINKED_ISSUE_PER_ISSUE_MAX = 3;
    private static int LOCATIONS_PER_ISSUE_MAX = 3;
    private MockDataGenerator() {
        // hide
    }
    
    /**
     * @return A generated CrossComponentIssueManagementSystem with some mock data
     */
    public static CrossComponentIssueManagementSystem generateMockData() {
        Random rng = new Random(1L);
        List<Label> labels = new ArrayList<>();
        labels.add(label("WIP"));
        labels.add(label("enhancement"));
        int count = rng.nextInt(RANDOM_LABEL_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            labels.add(label("Label " + i));
        }
        
        List<Developer> developers = new ArrayList<>();
        developers.add(developer("Tim"));
        count = rng.nextInt(RANDOM_DEVELOPER_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            developers.add(developer("Developer " + i));
        }
        
        List<Component> components = new ArrayList<>();
        count = rng.nextInt(RANDOM_COMPONENNT_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            components.add(component("Component " + i));
        }
        
        List<Interface> interfaces = new ArrayList<>();
        count = rng.nextInt(RANDOM_INTERFACE_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            interfaces.add(interfaz("Interface " + i));
        }
        
        Map<Interface, Component> interfaceLocationMap = new HashMap<>();
        
        for (Interface intf : interfaces) {
            Component comp = components.get(rng.nextInt(components.size()));
            comp.getProvidedInterfaces().add(intf);
            interfaceLocationMap.put(intf, comp);
        }
        
        for (Component comp : components) {
            count = rng.nextInt(CONSUMED_INTERFACES_PER_COMPONENT_MAX);
            for (int i = 0; i < count; i++) {
                Interface intf = interfaces.get(rng.nextInt(interfaces.size()));
                if (!comp.getProvidedInterfaces().contains(intf) && !comp.getConsumedInterfaces().contains(intf)) {
                    comp.getConsumedInterfaces().add(intf);
                }
            }
        }
        
        List<CrossComponentIssue> issues = new ArrayList<>();
        count = rng.nextInt(RANDOM_ISSUE_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            issues.add(issue("Issue " + i, "Issue " + i + " description", rng.nextBoolean()));
        }
        
        for (CrossComponentIssue issue : issues) {
            count = rng.nextInt(ASSIGNE_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                Developer dev = developers.get(rng.nextInt(developers.size()));
                if (!issue.getAssignees().contains(dev)) {
                    issue.getAssignees().add(dev);
                }
            }
            count = rng.nextInt(LABEL_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                Label label = labels.get(rng.nextInt(labels.size()));
                if (!issue.getLabels().contains(label)) {
                    issue.getLabels().add(label);
                }
            }
            count = rng.nextInt(LINKED_ISSUE_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                CrossComponentIssue linkedIssue = issues.get(rng.nextInt(issues.size()));
                if (!issue.getLinkedIssues().contains(linkedIssue)) {
                    issue.getLinkedIssues().add(linkedIssue);
                }
            }
            count = rng.nextInt(LOCATIONS_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                Location location = CcimsDatamodelFactory.eINSTANCE.createLocation();
                if (rng.nextBoolean()) {
                    location.setLine(rng.nextInt(5000));
                } else {
                    location.setLine(-1);
                }
                
                location.setResourcePath("projectX/Y/Z.java");
                if(rng.nextBoolean()) {
                    Interface intf = interfaces.get(rng.nextInt(interfaces.size()));
                    Component comp = interfaceLocationMap.get(intf);
                    location.setInterface(intf);
                    location.setComponent(comp);
                } else {
                    Component comp = components.get(rng.nextInt(components.size()));
                    location.setComponent(comp);
                }
                issue.getLocations().add(location);
            }
        }
        
        CrossComponentIssueManagementSystem ccims = CcimsDatamodelFactory.eINSTANCE
                .createCrossComponentIssueManagementSystem();
        ccims.setLocationUri("local://mock");
        ccims.getComponents().addAll(components);
        ccims.getDevelopers().addAll(developers);
        ccims.getLabels().addAll(labels);
        ccims.getManagedCroCoIssues().addAll(issues);
        
        return ccims;
    }
    
    private static Label label(String name) {
        Label res = CcimsDatamodelFactory.eINSTANCE.createLabel();
        res.setName(name);
        return res;
    }
    
    private static Developer developer(String name) {
        Developer res = CcimsDatamodelFactory.eINSTANCE.createDeveloper();
        res.setName(name);
        return res;
    }
    
    private static Component component(String name) {
        Component res = CcimsDatamodelFactory.eINSTANCE.createComponent();
        res.setName(name);
        return res;
    }
    
    private static Interface interfaz(String name) {
        Interface res = CcimsDatamodelFactory.eINSTANCE.createInterface();
        res.setName(name);
        return res;
    }
    
    private static CrossComponentIssue issue(String title, String description, boolean isOpen) {
        CrossComponentIssue res = CcimsDatamodelFactory.eINSTANCE.createCrossComponentIssue();
        res.setTitle(title);
        res.setTextBody(description);
        res.setIsOpen(isOpen);
        return res;
    }
}