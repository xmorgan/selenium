package org.openqa.selenium.devtools.security;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Security
 */
public class Security {

    /**
     * Disables tracking security state changes.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Security.disable", params.build());
    }

    /**
     * Enables tracking security state changes.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Security.enable", params.build());
    }

    /**
     * Enable/disable whether all certificate errors should be ignored.
     */
    @Beta()
    public static Command<Void> setIgnoreCertificateErrors(java.lang.Boolean ignore) {
        java.util.Objects.requireNonNull(ignore, "ignore is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("ignore", ignore);
        return new Command<>("Security.setIgnoreCertificateErrors", params.build());
    }

    /**
     * Handles a certificate error that fired a certificateError event.
     */
    @Deprecated()
    public static Command<Void> handleCertificateError(java.lang.Integer eventId, org.openqa.selenium.devtools.security.model.CertificateErrorAction action) {
        java.util.Objects.requireNonNull(eventId, "eventId is required");
        java.util.Objects.requireNonNull(action, "action is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("eventId", eventId);
        params.put("action", action);
        return new Command<>("Security.handleCertificateError", params.build());
    }

    /**
     * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
     * be handled by the DevTools client and should be answered with `handleCertificateError` commands.
     */
    @Deprecated()
    public static Command<Void> setOverrideCertificateErrors(java.lang.Boolean override) {
        java.util.Objects.requireNonNull(override, "override is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("override", override);
        return new Command<>("Security.setOverrideCertificateErrors", params.build());
    }

    public static Event<org.openqa.selenium.devtools.security.model.CertificateError> certificateError() {
        return new Event<>("Security.certificateError", input -> input.read(org.openqa.selenium.devtools.security.model.CertificateError.class));
    }

    public static Event<org.openqa.selenium.devtools.security.model.SecurityStateChanged> securityStateChanged() {
        return new Event<>("Security.securityStateChanged", input -> input.read(org.openqa.selenium.devtools.security.model.SecurityStateChanged.class));
    }
}
