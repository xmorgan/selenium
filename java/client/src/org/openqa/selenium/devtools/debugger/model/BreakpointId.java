package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Breakpoint identifier.
 */
public class BreakpointId {

    private final java.lang.String breakpointId;

    public BreakpointId(java.lang.String breakpointId) {
        this.breakpointId = java.util.Objects.requireNonNull(breakpointId, "Missing value for BreakpointId");
    }

    private static BreakpointId fromJson(JsonInput input) {
        return new BreakpointId(input.nextString());
    }

    public String toJson() {
        return breakpointId.toString();
    }

    public String toString() {
        return breakpointId.toString();
    }
}
