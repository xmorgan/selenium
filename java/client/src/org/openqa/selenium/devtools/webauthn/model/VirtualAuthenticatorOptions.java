package org.openqa.selenium.devtools.webauthn.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class VirtualAuthenticatorOptions {

    private final org.openqa.selenium.devtools.webauthn.model.AuthenticatorProtocol protocol;

    private final org.openqa.selenium.devtools.webauthn.model.AuthenticatorTransport transport;

    private final java.lang.Boolean hasResidentKey;

    private final java.lang.Boolean hasUserVerification;

    private final java.lang.Boolean automaticPresenceSimulation;

    public VirtualAuthenticatorOptions(org.openqa.selenium.devtools.webauthn.model.AuthenticatorProtocol protocol, org.openqa.selenium.devtools.webauthn.model.AuthenticatorTransport transport, java.lang.Boolean hasResidentKey, java.lang.Boolean hasUserVerification, java.lang.Boolean automaticPresenceSimulation) {
        this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
        this.transport = java.util.Objects.requireNonNull(transport, "transport is required");
        this.hasResidentKey = java.util.Objects.requireNonNull(hasResidentKey, "hasResidentKey is required");
        this.hasUserVerification = java.util.Objects.requireNonNull(hasUserVerification, "hasUserVerification is required");
        this.automaticPresenceSimulation = automaticPresenceSimulation;
    }

    public org.openqa.selenium.devtools.webauthn.model.AuthenticatorProtocol getProtocol() {
        return protocol;
    }

    public org.openqa.selenium.devtools.webauthn.model.AuthenticatorTransport getTransport() {
        return transport;
    }

    public java.lang.Boolean getHasResidentKey() {
        return hasResidentKey;
    }

    public java.lang.Boolean getHasUserVerification() {
        return hasUserVerification;
    }

    /**
     * If set to true, tests of user presence will succeed immediately.
     * Otherwise, they will not be resolved. Defaults to true.
     */
    public java.lang.Boolean getAutomaticPresenceSimulation() {
        return automaticPresenceSimulation;
    }

    private static VirtualAuthenticatorOptions fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webauthn.model.AuthenticatorProtocol protocol = null;
        org.openqa.selenium.devtools.webauthn.model.AuthenticatorTransport transport = null;
        java.lang.Boolean hasResidentKey = null;
        java.lang.Boolean hasUserVerification = null;
        java.lang.Boolean automaticPresenceSimulation = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "protocol":
                    protocol = input.read(org.openqa.selenium.devtools.webauthn.model.AuthenticatorProtocol.class);
                    break;
                case "transport":
                    transport = input.read(org.openqa.selenium.devtools.webauthn.model.AuthenticatorTransport.class);
                    break;
                case "hasResidentKey":
                    hasResidentKey = input.nextBoolean();
                    break;
                case "hasUserVerification":
                    hasUserVerification = input.nextBoolean();
                    break;
                case "automaticPresenceSimulation":
                    automaticPresenceSimulation = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new VirtualAuthenticatorOptions(protocol, transport, hasResidentKey, hasUserVerification, automaticPresenceSimulation);
    }
}
