package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when breakpoint is resolved to an actual script and location.
 */
public class BreakpointResolved {

    private final org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId;

    private final org.openqa.selenium.devtools.debugger.model.Location location;

    public BreakpointResolved(org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId, org.openqa.selenium.devtools.debugger.model.Location location) {
        this.breakpointId = java.util.Objects.requireNonNull(breakpointId, "breakpointId is required");
        this.location = java.util.Objects.requireNonNull(location, "location is required");
    }

    /**
     * Breakpoint unique identifier.
     */
    public org.openqa.selenium.devtools.debugger.model.BreakpointId getBreakpointId() {
        return breakpointId;
    }

    /**
     * Actual breakpoint location.
     */
    public org.openqa.selenium.devtools.debugger.model.Location getLocation() {
        return location;
    }

    private static BreakpointResolved fromJson(JsonInput input) {
        org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId = null;
        org.openqa.selenium.devtools.debugger.model.Location location = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "breakpointId":
                    breakpointId = input.read(org.openqa.selenium.devtools.debugger.model.BreakpointId.class);
                    break;
                case "location":
                    location = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BreakpointResolved(breakpointId, location);
    }
}
