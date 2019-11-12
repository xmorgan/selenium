package org.openqa.selenium.devtools.domdebugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * DOM breakpoint type.
 */
public enum DOMBreakpointType {

    SUBTREE_MODIFIED("subtree-modified"), ATTRIBUTE_MODIFIED("attribute-modified"), NODE_REMOVED("node-removed");

    private String value;

    DOMBreakpointType(String value) {
        this.value = value;
    }

    public static DOMBreakpointType fromString(String s) {
        return java.util.Arrays.stream(DOMBreakpointType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within DOMBreakpointType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static DOMBreakpointType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
