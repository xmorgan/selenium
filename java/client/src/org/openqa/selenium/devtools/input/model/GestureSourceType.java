package org.openqa.selenium.devtools.input.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public enum GestureSourceType {

    DEFAULT("default"), TOUCH("touch"), MOUSE("mouse");

    private String value;

    GestureSourceType(String value) {
        this.value = value;
    }

    public static GestureSourceType fromString(String s) {
        return java.util.Arrays.stream(GestureSourceType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within GestureSourceType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static GestureSourceType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
