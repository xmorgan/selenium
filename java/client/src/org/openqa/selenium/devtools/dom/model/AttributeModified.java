package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when `Element`'s attribute is modified.
 */
public class AttributeModified {

    private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

    private final java.lang.String name;

    private final java.lang.String value;

    public AttributeModified(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String name, java.lang.String value) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    /**
     * Id of the node that has changed.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
        return nodeId;
    }

    /**
     * Attribute name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Attribute value.
     */
    public java.lang.String getValue() {
        return value;
    }

    private static AttributeModified fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
        java.lang.String name = null;
        java.lang.String value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AttributeModified(nodeId, name, value);
    }
}
