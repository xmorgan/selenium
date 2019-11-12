package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique DOM node identifier.
 */
public class NodeId {

    private final java.lang.Integer nodeId;

    public NodeId(java.lang.Integer nodeId) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "Missing value for NodeId");
    }

    private static NodeId fromJson(JsonInput input) {
        return new NodeId(input.nextNumber().intValue());
    }

    public String toJson() {
        return nodeId.toString();
    }

    public String toString() {
        return nodeId.toString();
    }
}
