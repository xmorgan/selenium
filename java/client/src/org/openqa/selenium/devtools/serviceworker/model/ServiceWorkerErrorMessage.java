package org.openqa.selenium.devtools.serviceworker.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * ServiceWorker error message.
 */
public class ServiceWorkerErrorMessage {

    private final java.lang.String errorMessage;

    private final org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId;

    private final java.lang.String versionId;

    private final java.lang.String sourceURL;

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    public ServiceWorkerErrorMessage(java.lang.String errorMessage, org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId, java.lang.String versionId, java.lang.String sourceURL, java.lang.Integer lineNumber, java.lang.Integer columnNumber) {
        this.errorMessage = java.util.Objects.requireNonNull(errorMessage, "errorMessage is required");
        this.registrationId = java.util.Objects.requireNonNull(registrationId, "registrationId is required");
        this.versionId = java.util.Objects.requireNonNull(versionId, "versionId is required");
        this.sourceURL = java.util.Objects.requireNonNull(sourceURL, "sourceURL is required");
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = java.util.Objects.requireNonNull(columnNumber, "columnNumber is required");
    }

    public java.lang.String getErrorMessage() {
        return errorMessage;
    }

    public org.openqa.selenium.devtools.serviceworker.model.RegistrationID getRegistrationId() {
        return registrationId;
    }

    public java.lang.String getVersionId() {
        return versionId;
    }

    public java.lang.String getSourceURL() {
        return sourceURL;
    }

    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }

    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }

    private static ServiceWorkerErrorMessage fromJson(JsonInput input) {
        java.lang.String errorMessage = null;
        org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId = null;
        java.lang.String versionId = null;
        java.lang.String sourceURL = null;
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "errorMessage":
                    errorMessage = input.nextString();
                    break;
                case "registrationId":
                    registrationId = input.read(org.openqa.selenium.devtools.serviceworker.model.RegistrationID.class);
                    break;
                case "versionId":
                    versionId = input.nextString();
                    break;
                case "sourceURL":
                    sourceURL = input.nextString();
                    break;
                case "lineNumber":
                    lineNumber = input.nextNumber().intValue();
                    break;
                case "columnNumber":
                    columnNumber = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ServiceWorkerErrorMessage(errorMessage, registrationId, versionId, sourceURL, lineNumber, columnNumber);
    }
}
