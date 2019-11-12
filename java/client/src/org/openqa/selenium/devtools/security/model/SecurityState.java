package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The security level of a page or resource.
 */
public enum SecurityState {

    UNKNOWN("unknown"), NEUTRAL("neutral"), INSECURE("insecure"), SECURE("secure"), INFO("info");

    private String value;

    SecurityState(String value) {
        this.value = value;
    }

    public static SecurityState fromString(String s) {
        return java.util.Arrays.stream(SecurityState.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SecurityState "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static SecurityState fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
