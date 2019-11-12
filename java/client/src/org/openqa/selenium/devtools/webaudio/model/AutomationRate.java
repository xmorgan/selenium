package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of AudioParam::AutomationRate from the spec
 */
public enum AutomationRate {

    A_RATE("a-rate"), K_RATE("k-rate");

    private String value;

    AutomationRate(String value) {
        this.value = value;
    }

    public static AutomationRate fromString(String s) {
        return java.util.Arrays.stream(AutomationRate.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AutomationRate "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AutomationRate fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
