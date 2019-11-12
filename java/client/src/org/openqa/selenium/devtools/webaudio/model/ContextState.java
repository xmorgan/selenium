package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of AudioContextState from the spec
 */
public enum ContextState {

    SUSPENDED("suspended"), RUNNING("running"), CLOSED("closed");

    private String value;

    ContextState(String value) {
        this.value = value;
    }

    public static ContextState fromString(String s) {
        return java.util.Arrays.stream(ContextState.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ContextState "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ContextState fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
