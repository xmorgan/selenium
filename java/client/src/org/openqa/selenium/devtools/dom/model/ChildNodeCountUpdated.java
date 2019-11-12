package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when `Container`'s child node count has changed.
 */
public class ChildNodeCountUpdated {

    private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

    private final java.lang.Integer childNodeCount;

    public ChildNodeCountUpdated(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.Integer childNodeCount) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.childNodeCount = java.util.Objects.requireNonNull(childNodeCount, "childNodeCount is required");
    }

    /**
     * Id of the node that has changed.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
        return nodeId;
    }

    /**
     * New node count.
     */
    public java.lang.Integer getChildNodeCount() {
        return childNodeCount;
    }

    private static ChildNodeCountUpdated fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
        java.lang.Integer childNodeCount = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "childNodeCount":
                    childNodeCount = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ChildNodeCountUpdated(nodeId, childNodeCount);
    }
}
