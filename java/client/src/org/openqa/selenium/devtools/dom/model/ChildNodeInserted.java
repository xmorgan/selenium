package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Mirrors `DOMNodeInserted` event.
 */
public class ChildNodeInserted {

    private final org.openqa.selenium.devtools.dom.model.NodeId parentNodeId;

    private final org.openqa.selenium.devtools.dom.model.NodeId previousNodeId;

    private final org.openqa.selenium.devtools.dom.model.Node node;

    public ChildNodeInserted(org.openqa.selenium.devtools.dom.model.NodeId parentNodeId, org.openqa.selenium.devtools.dom.model.NodeId previousNodeId, org.openqa.selenium.devtools.dom.model.Node node) {
        this.parentNodeId = java.util.Objects.requireNonNull(parentNodeId, "parentNodeId is required");
        this.previousNodeId = java.util.Objects.requireNonNull(previousNodeId, "previousNodeId is required");
        this.node = java.util.Objects.requireNonNull(node, "node is required");
    }

    /**
     * Id of the node that has changed.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getParentNodeId() {
        return parentNodeId;
    }

    /**
     * If of the previous siblint.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getPreviousNodeId() {
        return previousNodeId;
    }

    /**
     * Inserted node data.
     */
    public org.openqa.selenium.devtools.dom.model.Node getNode() {
        return node;
    }

    private static ChildNodeInserted fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId parentNodeId = null;
        org.openqa.selenium.devtools.dom.model.NodeId previousNodeId = null;
        org.openqa.selenium.devtools.dom.model.Node node = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "parentNodeId":
                    parentNodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "previousNodeId":
                    previousNodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "node":
                    node = input.read(org.openqa.selenium.devtools.dom.model.Node.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ChildNodeInserted(parentNodeId, previousNodeId, node);
    }
}
