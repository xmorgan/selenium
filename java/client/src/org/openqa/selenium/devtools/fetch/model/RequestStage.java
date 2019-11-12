package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Stages of the request to handle. Request will intercept before the request is
 * sent. Response will intercept after the response is received (but before response
 * body is received.
 */
@org.openqa.selenium.Beta()
public enum RequestStage {

    REQUEST("Request"), RESPONSE("Response");

    private String value;

    RequestStage(String value) {
        this.value = value;
    }

    public static RequestStage fromString(String s) {
        return java.util.Arrays.stream(RequestStage.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within RequestStage "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static RequestStage fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
