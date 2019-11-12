package org.openqa.selenium.devtools.webauthn.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public enum AuthenticatorTransport {

    USB("usb"), NFC("nfc"), BLE("ble"), CABLE("cable"), INTERNAL("internal");

    private String value;

    AuthenticatorTransport(String value) {
        this.value = value;
    }

    public static AuthenticatorTransport fromString(String s) {
        return java.util.Arrays.stream(AuthenticatorTransport.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AuthenticatorTransport "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AuthenticatorTransport fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
