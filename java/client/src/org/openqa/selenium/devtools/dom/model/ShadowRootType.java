package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Shadow root type.
 */
public enum ShadowRootType {

    USER_AGENT("user-agent"), OPEN("open"), CLOSED("closed");

    private String value;

    ShadowRootType(String value) {
        this.value = value;
    }

    public static ShadowRootType fromString(String s) {
        return java.util.Arrays.stream(ShadowRootType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ShadowRootType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ShadowRootType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
