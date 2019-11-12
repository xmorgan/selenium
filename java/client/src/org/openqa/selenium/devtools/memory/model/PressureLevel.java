package org.openqa.selenium.devtools.memory.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Memory pressure level.
 */
public enum PressureLevel {

    MODERATE("moderate"), CRITICAL("critical");

    private String value;

    PressureLevel(String value) {
        this.value = value;
    }

    public static PressureLevel fromString(String s) {
        return java.util.Arrays.stream(PressureLevel.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within PressureLevel "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static PressureLevel fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
