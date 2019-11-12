package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * There is a certificate error. If overriding certificate errors is enabled, then it should be
 * handled with the `handleCertificateError` command. Note: this event does not fire if the
 * certificate error has been allowed internally. Only one client per target should override
 * certificate errors at the same time.
 */
@java.lang.Deprecated()
public class CertificateError {

    private final java.lang.Integer eventId;

    private final java.lang.String errorType;

    private final java.lang.String requestURL;

    public CertificateError(java.lang.Integer eventId, java.lang.String errorType, java.lang.String requestURL) {
        this.eventId = java.util.Objects.requireNonNull(eventId, "eventId is required");
        this.errorType = java.util.Objects.requireNonNull(errorType, "errorType is required");
        this.requestURL = java.util.Objects.requireNonNull(requestURL, "requestURL is required");
    }

    /**
     * The ID of the event.
     */
    public java.lang.Integer getEventId() {
        return eventId;
    }

    /**
     * The type of the error.
     */
    public java.lang.String getErrorType() {
        return errorType;
    }

    /**
     * The url that was requested.
     */
    public java.lang.String getRequestURL() {
        return requestURL;
    }

    private static CertificateError fromJson(JsonInput input) {
        java.lang.Integer eventId = null;
        java.lang.String errorType = null;
        java.lang.String requestURL = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "eventId":
                    eventId = input.nextNumber().intValue();
                    break;
                case "errorType":
                    errorType = input.nextString();
                    break;
                case "requestURL":
                    requestURL = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CertificateError(eventId, errorType, requestURL);
    }
}
