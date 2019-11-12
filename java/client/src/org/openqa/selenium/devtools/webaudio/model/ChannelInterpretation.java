package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of AudioNode::ChannelInterpretation from the spec
 */
public enum ChannelInterpretation {

    DISCRETE("discrete"), SPEAKERS("speakers");

    private String value;

    ChannelInterpretation(String value) {
        this.value = value;
    }

    public static ChannelInterpretation fromString(String s) {
        return java.util.Arrays.stream(ChannelInterpretation.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ChannelInterpretation "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ChannelInterpretation fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
