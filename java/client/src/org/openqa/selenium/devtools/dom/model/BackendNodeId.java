package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique DOM node identifier used to reference a node that may not have been pushed to the
 * front-end.
 */
public class BackendNodeId {

    private final java.lang.Integer backendNodeId;

    public BackendNodeId(java.lang.Integer backendNodeId) {
        this.backendNodeId = java.util.Objects.requireNonNull(backendNodeId, "Missing value for BackendNodeId");
    }

    private static BackendNodeId fromJson(JsonInput input) {
        return new BackendNodeId(input.nextNumber().intValue());
    }

    public String toJson() {
        return backendNodeId.toString();
    }

    public String toString() {
        return backendNodeId.toString();
    }
}
