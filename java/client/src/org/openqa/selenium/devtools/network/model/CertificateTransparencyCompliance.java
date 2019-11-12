package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Whether the request complied with Certificate Transparency policy.
 */
public enum CertificateTransparencyCompliance {

    UNKNOWN("unknown"), NOT_COMPLIANT("not-compliant"), COMPLIANT("compliant");

    private String value;

    CertificateTransparencyCompliance(String value) {
        this.value = value;
    }

    public static CertificateTransparencyCompliance fromString(String s) {
        return java.util.Arrays.stream(CertificateTransparencyCompliance.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CertificateTransparencyCompliance "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static CertificateTransparencyCompliance fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
