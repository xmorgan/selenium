package org.openqa.selenium.devtools.backgroundservice.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The Background Service that will be associated with the commands/events.
 * Every Background Service operates independently, but they share the same
 * API.
 */
public enum ServiceName {

    BACKGROUNDFETCH("backgroundFetch"),
    BACKGROUNDSYNC("backgroundSync"),
    PUSHMESSAGING("pushMessaging"),
    NOTIFICATIONS("notifications"),
    PAYMENTHANDLER("paymentHandler"),
    PERIODICBACKGROUNDSYNC("periodicBackgroundSync");

    private String value;

    ServiceName(String value) {
        this.value = value;
    }

    public static ServiceName fromString(String s) {
        return java.util.Arrays.stream(ServiceName.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ServiceName "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ServiceName fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
