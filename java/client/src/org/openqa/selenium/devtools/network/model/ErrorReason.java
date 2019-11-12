package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Network level fetch failure reason.
 */
public enum ErrorReason {

    FAILED("Failed"),
    ABORTED("Aborted"),
    TIMEDOUT("TimedOut"),
    ACCESSDENIED("AccessDenied"),
    CONNECTIONCLOSED("ConnectionClosed"),
    CONNECTIONRESET("ConnectionReset"),
    CONNECTIONREFUSED("ConnectionRefused"),
    CONNECTIONABORTED("ConnectionAborted"),
    CONNECTIONFAILED("ConnectionFailed"),
    NAMENOTRESOLVED("NameNotResolved"),
    INTERNETDISCONNECTED("InternetDisconnected"),
    ADDRESSUNREACHABLE("AddressUnreachable"),
    BLOCKEDBYCLIENT("BlockedByClient"),
    BLOCKEDBYRESPONSE("BlockedByResponse");

    private String value;

    ErrorReason(String value) {
        this.value = value;
    }

    public static ErrorReason fromString(String s) {
        return java.util.Arrays.stream(ErrorReason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ErrorReason "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ErrorReason fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
