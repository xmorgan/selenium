package org.openqa.selenium.devtools.serviceworker.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * ServiceWorker registration.
 */
public class ServiceWorkerRegistration {

    private final org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId;

    private final java.lang.String scopeURL;

    private final java.lang.Boolean isDeleted;

    public ServiceWorkerRegistration(org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId, java.lang.String scopeURL, java.lang.Boolean isDeleted) {
        this.registrationId = java.util.Objects.requireNonNull(registrationId, "registrationId is required");
        this.scopeURL = java.util.Objects.requireNonNull(scopeURL, "scopeURL is required");
        this.isDeleted = java.util.Objects.requireNonNull(isDeleted, "isDeleted is required");
    }

    public org.openqa.selenium.devtools.serviceworker.model.RegistrationID getRegistrationId() {
        return registrationId;
    }

    public java.lang.String getScopeURL() {
        return scopeURL;
    }

    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }

    private static ServiceWorkerRegistration fromJson(JsonInput input) {
        org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId = null;
        java.lang.String scopeURL = null;
        java.lang.Boolean isDeleted = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "registrationId":
                    registrationId = input.read(org.openqa.selenium.devtools.serviceworker.model.RegistrationID.class);
                    break;
                case "scopeURL":
                    scopeURL = input.nextString();
                    break;
                case "isDeleted":
                    isDeleted = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ServiceWorkerRegistration(registrationId, scopeURL, isDeleted);
    }
}
