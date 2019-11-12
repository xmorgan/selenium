package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Backend node with a friendly name.
 */
public class BackendNode {

    private final java.lang.Integer nodeType;

    private final java.lang.String nodeName;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

    public BackendNode(java.lang.Integer nodeType, java.lang.String nodeName, org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId) {
        this.nodeType = java.util.Objects.requireNonNull(nodeType, "nodeType is required");
        this.nodeName = java.util.Objects.requireNonNull(nodeName, "nodeName is required");
        this.backendNodeId = java.util.Objects.requireNonNull(backendNodeId, "backendNodeId is required");
    }

    /**
     * `Node`'s nodeType.
     */
    public java.lang.Integer getNodeType() {
        return nodeType;
    }

    /**
     * `Node`'s nodeName.
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }

    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
        return backendNodeId;
    }

    private static BackendNode fromJson(JsonInput input) {
        java.lang.Integer nodeType = null;
        java.lang.String nodeName = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeType":
                    nodeType = input.nextNumber().intValue();
                    break;
                case "nodeName":
                    nodeName = input.nextString();
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BackendNode(nodeType, nodeName, backendNodeId);
    }
}
