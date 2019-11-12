package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when `Element`'s attribute is removed.
 */
public class AttributeRemoved {

    private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

    private final java.lang.String name;

    public AttributeRemoved(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String name) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
    }

    /**
     * Id of the node that has changed.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
        return nodeId;
    }

    /**
     * A ttribute name.
     */
    public java.lang.String getName() {
        return name;
    }

    private static AttributeRemoved fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
        java.lang.String name = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "name":
                    name = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AttributeRemoved(nodeId, name);
    }
}
