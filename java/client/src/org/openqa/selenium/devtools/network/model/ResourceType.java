package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Resource type as it was perceived by the rendering engine.
 */
public enum ResourceType {

    DOCUMENT("Document"),
    STYLESHEET("Stylesheet"),
    IMAGE("Image"),
    MEDIA("Media"),
    FONT("Font"),
    SCRIPT("Script"),
    TEXTTRACK("TextTrack"),
    XHR("XHR"),
    FETCH("Fetch"),
    EVENTSOURCE("EventSource"),
    WEBSOCKET("WebSocket"),
    MANIFEST("Manifest"),
    SIGNEDEXCHANGE("SignedExchange"),
    PING("Ping"),
    CSPVIOLATIONREPORT("CSPViolationReport"),
    OTHER("Other");

    private String value;

    ResourceType(String value) {
        this.value = value;
    }

    public static ResourceType fromString(String s) {
        return java.util.Arrays.stream(ResourceType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ResourceType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ResourceType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
