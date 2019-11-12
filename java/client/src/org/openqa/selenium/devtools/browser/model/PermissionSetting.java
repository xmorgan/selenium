package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public enum PermissionSetting {

    GRANTED("granted"), DENIED("denied"), PROMPT("prompt");

    private String value;

    PermissionSetting(String value) {
        this.value = value;
    }

    public static PermissionSetting fromString(String s) {
        return java.util.Arrays.stream(PermissionSetting.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within PermissionSetting "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static PermissionSetting fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
