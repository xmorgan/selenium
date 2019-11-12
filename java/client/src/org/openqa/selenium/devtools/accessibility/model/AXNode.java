package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A node in the accessibility tree.
 */
public class AXNode {

    private final org.openqa.selenium.devtools.accessibility.model.AXNodeId nodeId;

    private final java.lang.Boolean ignored;

    private final java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> ignoredReasons;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue role;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue name;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue description;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue value;

    private final java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> properties;

    private final java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNodeId> childIds;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendDOMNodeId;

    public AXNode(org.openqa.selenium.devtools.accessibility.model.AXNodeId nodeId, java.lang.Boolean ignored, java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> ignoredReasons, org.openqa.selenium.devtools.accessibility.model.AXValue role, org.openqa.selenium.devtools.accessibility.model.AXValue name, org.openqa.selenium.devtools.accessibility.model.AXValue description, org.openqa.selenium.devtools.accessibility.model.AXValue value, java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> properties, java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNodeId> childIds, org.openqa.selenium.devtools.dom.model.BackendNodeId backendDOMNodeId) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.ignored = java.util.Objects.requireNonNull(ignored, "ignored is required");
        this.ignoredReasons = ignoredReasons;
        this.role = role;
        this.name = name;
        this.description = description;
        this.value = value;
        this.properties = properties;
        this.childIds = childIds;
        this.backendDOMNodeId = backendDOMNodeId;
    }

    /**
     * Unique identifier for this node.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXNodeId getNodeId() {
        return nodeId;
    }

    /**
     * Whether this node is ignored for accessibility
     */
    public java.lang.Boolean getIgnored() {
        return ignored;
    }

    /**
     * Collection of reasons why this node is hidden.
     */
    public java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> getIgnoredReasons() {
        return ignoredReasons;
    }

    /**
     * This `Node`'s role, whether explicit or implicit.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getRole() {
        return role;
    }

    /**
     * The accessible name for this `Node`.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getName() {
        return name;
    }

    /**
     * The accessible description for this `Node`.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getDescription() {
        return description;
    }

    /**
     * The value for this `Node`.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getValue() {
        return value;
    }

    /**
     * All other properties
     */
    public java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> getProperties() {
        return properties;
    }

    /**
     * IDs for each of this node's child nodes.
     */
    public java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNodeId> getChildIds() {
        return childIds;
    }

    /**
     * The backend ID for the associated DOM node, if any.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendDOMNodeId() {
        return backendDOMNodeId;
    }

    private static AXNode fromJson(JsonInput input) {
        org.openqa.selenium.devtools.accessibility.model.AXNodeId nodeId = null;
        java.lang.Boolean ignored = null;
        java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> ignoredReasons = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue role = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue name = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue description = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue value = null;
        java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty> properties = null;
        java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNodeId> childIds = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendDOMNodeId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.accessibility.model.AXNodeId.class);
                    break;
                case "ignored":
                    ignored = input.nextBoolean();
                    break;
                case "ignoredReasons":
                    ignoredReasons = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty>>() {
                    }.getType());
                    break;
                case "role":
                    role = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "name":
                    name = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "description":
                    description = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "properties":
                    properties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXProperty>>() {
                    }.getType());
                    break;
                case "childIds":
                    childIds = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNodeId>>() {
                    }.getType());
                    break;
                case "backendDOMNodeId":
                    backendDOMNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AXNode(nodeId, ignored, ignoredReasons, role, name, description, value, properties, childIds, backendDOMNodeId);
    }
}
