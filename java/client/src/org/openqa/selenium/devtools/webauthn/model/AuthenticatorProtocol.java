package org.openqa.selenium.devtools.webauthn.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public enum AuthenticatorProtocol {

    U2F("u2f"), CTAP2("ctap2");

    private String value;

    AuthenticatorProtocol(String value) {
        this.value = value;
    }

    public static AuthenticatorProtocol fromString(String s) {
        return java.util.Arrays.stream(AuthenticatorProtocol.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AuthenticatorProtocol "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AuthenticatorProtocol fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
