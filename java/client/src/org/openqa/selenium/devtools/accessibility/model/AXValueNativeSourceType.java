package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of possible native property sources (as a subtype of a particular AXValueSourceType).
 */
public enum AXValueNativeSourceType {

    FIGCAPTION("figcaption"),
    LABEL("label"),
    LABELFOR("labelfor"),
    LABELWRAPPED("labelwrapped"),
    LEGEND("legend"),
    TABLECAPTION("tablecaption"),
    TITLE("title"),
    OTHER("other");

    private String value;

    AXValueNativeSourceType(String value) {
        this.value = value;
    }

    public static AXValueNativeSourceType fromString(String s) {
        return java.util.Arrays.stream(AXValueNativeSourceType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AXValueNativeSourceType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AXValueNativeSourceType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
