package org.openqa.selenium.devtools.webauthn;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain allows configuring virtual authenticators to test the WebAuthn
 * API.
 */
@Beta()
public class WebAuthn {

    /**
     * Enable the WebAuthn domain and start intercepting credential storage and
     * retrieval with a virtual authenticator.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("WebAuthn.enable", params.build());
    }

    /**
     * Disable the WebAuthn domain.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("WebAuthn.disable", params.build());
    }

    /**
     * Creates and adds a virtual authenticator.
     */
    public static Command<org.openqa.selenium.devtools.webauthn.model.AuthenticatorId> addVirtualAuthenticator(org.openqa.selenium.devtools.webauthn.model.VirtualAuthenticatorOptions options) {
        java.util.Objects.requireNonNull(options, "options is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("options", options);
        return new Command<>("WebAuthn.addVirtualAuthenticator", params.build(), ConverterFunctions.map("authenticatorId", org.openqa.selenium.devtools.webauthn.model.AuthenticatorId.class));
    }

    /**
     * Removes the given authenticator.
     */
    public static Command<Void> removeVirtualAuthenticator(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        return new Command<>("WebAuthn.removeVirtualAuthenticator", params.build());
    }

    /**
     * Adds the credential to the specified authenticator.
     */
    public static Command<Void> addCredential(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId, org.openqa.selenium.devtools.webauthn.model.Credential credential) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        java.util.Objects.requireNonNull(credential, "credential is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        params.put("credential", credential);
        return new Command<>("WebAuthn.addCredential", params.build());
    }

    /**
     * Returns a single credential stored in the given virtual authenticator that
     * matches the credential ID.
     */
    public static Command<org.openqa.selenium.devtools.webauthn.model.Credential> getCredential(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId, java.lang.String credentialId) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        java.util.Objects.requireNonNull(credentialId, "credentialId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        params.put("credentialId", credentialId);
        return new Command<>("WebAuthn.getCredential", params.build(), ConverterFunctions.map("credential", org.openqa.selenium.devtools.webauthn.model.Credential.class));
    }

    /**
     * Returns all the credentials stored in the given virtual authenticator.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.webauthn.model.Credential>> getCredentials(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        return new Command<>("WebAuthn.getCredentials", params.build(), ConverterFunctions.map("credentials", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.webauthn.model.Credential>>() {
        }.getType()));
    }

    /**
     * Removes a credential from the authenticator.
     */
    public static Command<Void> removeCredential(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId, java.lang.String credentialId) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        java.util.Objects.requireNonNull(credentialId, "credentialId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        params.put("credentialId", credentialId);
        return new Command<>("WebAuthn.removeCredential", params.build());
    }

    /**
     * Clears all the credentials from the specified device.
     */
    public static Command<Void> clearCredentials(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        return new Command<>("WebAuthn.clearCredentials", params.build());
    }

    /**
     * Sets whether User Verification succeeds or fails for an authenticator.
     * The default is true.
     */
    public static Command<Void> setUserVerified(org.openqa.selenium.devtools.webauthn.model.AuthenticatorId authenticatorId, java.lang.Boolean isUserVerified) {
        java.util.Objects.requireNonNull(authenticatorId, "authenticatorId is required");
        java.util.Objects.requireNonNull(isUserVerified, "isUserVerified is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("authenticatorId", authenticatorId);
        params.put("isUserVerified", isUserVerified);
        return new Command<>("WebAuthn.setUserVerified", params.build());
    }
}
