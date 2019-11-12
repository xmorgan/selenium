package org.openqa.selenium.devtools.emulation.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * advance: If the scheduler runs out of immediate work, the virtual time base may fast forward to
 * allow the next delayed task (if any) to run; pause: The virtual time base may not advance;
 * pauseIfNetworkFetchesPending: The virtual time base may not advance if there are any pending
 * resource fetches.
 */
@org.openqa.selenium.Beta()
public enum VirtualTimePolicy {

    ADVANCE("advance"), PAUSE("pause"), PAUSEIFNETWORKFETCHESPENDING("pauseIfNetworkFetchesPending");

    private String value;

    VirtualTimePolicy(String value) {
        this.value = value;
    }

    public static VirtualTimePolicy fromString(String s) {
        return java.util.Arrays.stream(VirtualTimePolicy.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within VirtualTimePolicy "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static VirtualTimePolicy fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
