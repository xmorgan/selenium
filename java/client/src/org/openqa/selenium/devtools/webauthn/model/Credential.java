package org.openqa.selenium.devtools.webauthn.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class Credential {

    private final java.lang.String credentialId;

    private final java.lang.Boolean isResidentCredential;

    private final java.lang.String rpId;

    private final java.lang.String privateKey;

    private final java.lang.String userHandle;

    private final java.lang.Integer signCount;

    public Credential(java.lang.String credentialId, java.lang.Boolean isResidentCredential, java.lang.String rpId, java.lang.String privateKey, java.lang.String userHandle, java.lang.Integer signCount) {
        this.credentialId = java.util.Objects.requireNonNull(credentialId, "credentialId is required");
        this.isResidentCredential = java.util.Objects.requireNonNull(isResidentCredential, "isResidentCredential is required");
        this.rpId = rpId;
        this.privateKey = java.util.Objects.requireNonNull(privateKey, "privateKey is required");
        this.userHandle = userHandle;
        this.signCount = java.util.Objects.requireNonNull(signCount, "signCount is required");
    }

    public java.lang.String getCredentialId() {
        return credentialId;
    }

    public java.lang.Boolean getIsResidentCredential() {
        return isResidentCredential;
    }

    /**
     * Relying Party ID the credential is scoped to. Must be set when adding a
     * credential.
     */
    public java.lang.String getRpId() {
        return rpId;
    }

    /**
     * The ECDSA P-256 private key in PKCS#8 format.
     */
    public java.lang.String getPrivateKey() {
        return privateKey;
    }

    /**
     * An opaque byte sequence with a maximum size of 64 bytes mapping the
     * credential to a specific user.
     */
    public java.lang.String getUserHandle() {
        return userHandle;
    }

    /**
     * Signature counter. This is incremented by one for each successful
     * assertion.
     * See https://w3c.github.io/webauthn/#signature-counter
     */
    public java.lang.Integer getSignCount() {
        return signCount;
    }

    private static Credential fromJson(JsonInput input) {
        java.lang.String credentialId = null;
        java.lang.Boolean isResidentCredential = null;
        java.lang.String rpId = null;
        java.lang.String privateKey = null;
        java.lang.String userHandle = null;
        java.lang.Integer signCount = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "credentialId":
                    credentialId = input.nextString();
                    break;
                case "isResidentCredential":
                    isResidentCredential = input.nextBoolean();
                    break;
                case "rpId":
                    rpId = input.nextString();
                    break;
                case "privateKey":
                    privateKey = input.nextString();
                    break;
                case "userHandle":
                    userHandle = input.nextString();
                    break;
                case "signCount":
                    signCount = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Credential(credentialId, isResidentCredential, rpId, privateKey, userHandle, signCount);
    }
}
