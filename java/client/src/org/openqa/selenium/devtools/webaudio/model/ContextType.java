package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of BaseAudioContext types
 */
public enum ContextType {

    REALTIME("realtime"), OFFLINE("offline");

    private String value;

    ContextType(String value) {
        this.value = value;
    }

    public static ContextType fromString(String s) {
        return java.util.Arrays.stream(ContextType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ContextType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ContextType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
