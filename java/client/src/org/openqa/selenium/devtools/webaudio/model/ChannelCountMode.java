package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of AudioNode::ChannelCountMode from the spec
 */
public enum ChannelCountMode {

    CLAMPED_MAX("clamped-max"), EXPLICIT("explicit"), MAX("max");

    private String value;

    ChannelCountMode(String value) {
        this.value = value;
    }

    public static ChannelCountMode fromString(String s) {
        return java.util.Arrays.stream(ChannelCountMode.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ChannelCountMode "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ChannelCountMode fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
