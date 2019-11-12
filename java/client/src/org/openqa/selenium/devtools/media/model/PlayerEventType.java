package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Break out events into different types
 */
public enum PlayerEventType {

    PLAYBACKEVENT("playbackEvent"), SYSTEMEVENT("systemEvent"), MESSAGEEVENT("messageEvent");

    private String value;

    PlayerEventType(String value) {
        this.value = value;
    }

    public static PlayerEventType fromString(String s) {
        return java.util.Arrays.stream(PlayerEventType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within PlayerEventType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static PlayerEventType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
