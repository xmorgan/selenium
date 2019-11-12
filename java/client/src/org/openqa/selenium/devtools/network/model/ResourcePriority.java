package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Loading priority of a resource request.
 */
public enum ResourcePriority {

    VERYLOW("VeryLow"), LOW("Low"), MEDIUM("Medium"), HIGH("High"), VERYHIGH("VeryHigh");

    private String value;

    ResourcePriority(String value) {
        this.value = value;
    }

    public static ResourcePriority fromString(String s) {
        return java.util.Arrays.stream(ResourcePriority.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ResourcePriority "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ResourcePriority fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
