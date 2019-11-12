package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Stages of the interception to begin intercepting. Request will intercept before the request is
 * sent. Response will intercept after the response is received.
 */
@org.openqa.selenium.Beta()
public enum InterceptionStage {

    REQUEST("Request"), HEADERSRECEIVED("HeadersReceived");

    private String value;

    InterceptionStage(String value) {
        this.value = value;
    }

    public static InterceptionStage fromString(String s) {
        return java.util.Arrays.stream(InterceptionStage.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within InterceptionStage "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static InterceptionStage fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
