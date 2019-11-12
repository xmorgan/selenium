package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Called when distrubution is changed.
 */
@org.openqa.selenium.Beta()
public class DistributedNodesUpdated {

    private final org.openqa.selenium.devtools.dom.model.NodeId insertionPointId;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> distributedNodes;

    public DistributedNodesUpdated(org.openqa.selenium.devtools.dom.model.NodeId insertionPointId, java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> distributedNodes) {
        this.insertionPointId = java.util.Objects.requireNonNull(insertionPointId, "insertionPointId is required");
        this.distributedNodes = java.util.Objects.requireNonNull(distributedNodes, "distributedNodes is required");
    }

    /**
     * Insertion point where distrubuted nodes were updated.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getInsertionPointId() {
        return insertionPointId;
    }

    /**
     * Distributed nodes for given insertion point.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> getDistributedNodes() {
        return distributedNodes;
    }

    private static DistributedNodesUpdated fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId insertionPointId = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> distributedNodes = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "insertionPointId":
                    insertionPointId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "distributedNodes":
                    distributedNodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DistributedNodesUpdated(insertionPointId, distributedNodes);
    }
}
