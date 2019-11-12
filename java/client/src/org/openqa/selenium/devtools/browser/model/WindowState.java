package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The state of the browser window.
 */
@org.openqa.selenium.Beta()
public enum WindowState {

    NORMAL("normal"), MINIMIZED("minimized"), MAXIMIZED("maximized"), FULLSCREEN("fullscreen");

    private String value;

    WindowState(String value) {
        this.value = value;
    }

    public static WindowState fromString(String s) {
        return java.util.Arrays.stream(WindowState.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within WindowState "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static WindowState fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
