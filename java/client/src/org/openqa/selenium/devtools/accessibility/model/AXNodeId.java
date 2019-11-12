package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique accessibility node identifier.
 */
public class AXNodeId {

    private final java.lang.String aXNodeId;

    public AXNodeId(java.lang.String aXNodeId) {
        this.aXNodeId = java.util.Objects.requireNonNull(aXNodeId, "Missing value for AXNodeId");
    }

    private static AXNodeId fromJson(JsonInput input) {
        return new AXNodeId(input.nextString());
    }

    public String toJson() {
        return aXNodeId.toString();
    }

    public String toString() {
        return aXNodeId.toString();
    }
}
