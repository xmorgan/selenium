package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when backend wants to provide client with the missing DOM structure. This happens upon
 * most of the calls requesting node ids.
 */
public class SetChildNodes {

    private final org.openqa.selenium.devtools.dom.model.NodeId parentId;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.Node> nodes;

    public SetChildNodes(org.openqa.selenium.devtools.dom.model.NodeId parentId, java.util.List<org.openqa.selenium.devtools.dom.model.Node> nodes) {
        this.parentId = java.util.Objects.requireNonNull(parentId, "parentId is required");
        this.nodes = java.util.Objects.requireNonNull(nodes, "nodes is required");
    }

    /**
     * Parent node id to populate with children.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getParentId() {
        return parentId;
    }

    /**
     * Child nodes array.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.Node> getNodes() {
        return nodes;
    }

    private static SetChildNodes fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId parentId = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.Node> nodes = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "parentId":
                    parentId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "nodes":
                    nodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.Node>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SetChildNodes(parentId, nodes);
    }
}
