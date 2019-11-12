package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of AudioNode types
 */
public class NodeType {

    private final java.lang.String nodeType;

    public NodeType(java.lang.String nodeType) {
        this.nodeType = java.util.Objects.requireNonNull(nodeType, "Missing value for NodeType");
    }

    private static NodeType fromJson(JsonInput input) {
        return new NodeType(input.nextString());
    }

    public String toJson() {
        return nodeType.toString();
    }

    public String toString() {
        return nodeType.toString();
    }
}
