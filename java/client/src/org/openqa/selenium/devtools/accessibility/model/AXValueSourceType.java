package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of possible property sources.
 */
public enum AXValueSourceType {

    ATTRIBUTE("attribute"),
    IMPLICIT("implicit"),
    STYLE("style"),
    CONTENTS("contents"),
    PLACEHOLDER("placeholder"),
    RELATEDELEMENT("relatedElement");

    private String value;

    AXValueSourceType(String value) {
        this.value = value;
    }

    public static AXValueSourceType fromString(String s) {
        return java.util.Arrays.stream(AXValueSourceType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AXValueSourceType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AXValueSourceType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
