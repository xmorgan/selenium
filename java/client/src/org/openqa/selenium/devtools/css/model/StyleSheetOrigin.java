package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Stylesheet type: "injected" for stylesheets injected via extension, "user-agent" for user-agent
 * stylesheets, "inspector" for stylesheets created by the inspector (i.e. those holding the "via
 * inspector" rules), "regular" for regular stylesheets.
 */
public enum StyleSheetOrigin {

    INJECTED("injected"), USER_AGENT("user-agent"), INSPECTOR("inspector"), REGULAR("regular");

    private String value;

    StyleSheetOrigin(String value) {
        this.value = value;
    }

    public static StyleSheetOrigin fromString(String s) {
        return java.util.Arrays.stream(StyleSheetOrigin.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within StyleSheetOrigin "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static StyleSheetOrigin fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
