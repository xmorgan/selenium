package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The action to take when a certificate error occurs. continue will continue processing the
 * request and cancel will cancel the request.
 */
public enum CertificateErrorAction {

    CONTINUE("continue"), CANCEL("cancel");

    private String value;

    CertificateErrorAction(String value) {
        this.value = value;
    }

    public static CertificateErrorAction fromString(String s) {
        return java.util.Arrays.stream(CertificateErrorAction.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CertificateErrorAction "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static CertificateErrorAction fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
