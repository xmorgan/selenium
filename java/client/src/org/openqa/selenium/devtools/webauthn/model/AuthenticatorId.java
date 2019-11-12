package org.openqa.selenium.devtools.webauthn.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class AuthenticatorId {

    private final java.lang.String authenticatorId;

    public AuthenticatorId(java.lang.String authenticatorId) {
        this.authenticatorId = java.util.Objects.requireNonNull(authenticatorId, "Missing value for AuthenticatorId");
    }

    private static AuthenticatorId fromJson(JsonInput input) {
        return new AuthenticatorId(input.nextString());
    }

    public String toJson() {
        return authenticatorId.toString();
    }

    public String toString() {
        return authenticatorId.toString();
    }
}
