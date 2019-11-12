package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Mirrors `DOMNodeRemoved` event.
 */
public class ChildNodeRemoved {

    private final org.openqa.selenium.devtools.dom.model.NodeId parentNodeId;

    private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

    public ChildNodeRemoved(org.openqa.selenium.devtools.dom.model.NodeId parentNodeId, org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        this.parentNodeId = java.util.Objects.requireNonNull(parentNodeId, "parentNodeId is required");
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
    }

    /**
     * Parent id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getParentNodeId() {
        return parentNodeId;
    }

    /**
     * Id of the node that has been removed.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
        return nodeId;
    }

    private static ChildNodeRemoved fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId parentNodeId = null;
        org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "parentNodeId":
                    parentNodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ChildNodeRemoved(parentNodeId, nodeId);
    }
}
