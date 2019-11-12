package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when unhandled exception was revoked.
 */
public class ExceptionRevoked {

    private final java.lang.String reason;

    private final java.lang.Integer exceptionId;

    public ExceptionRevoked(java.lang.String reason, java.lang.Integer exceptionId) {
        this.reason = java.util.Objects.requireNonNull(reason, "reason is required");
        this.exceptionId = java.util.Objects.requireNonNull(exceptionId, "exceptionId is required");
    }

    /**
     * Reason describing why exception was revoked.
     */
    public java.lang.String getReason() {
        return reason;
    }

    /**
     * The id of revoked exception, as reported in `exceptionThrown`.
     */
    public java.lang.Integer getExceptionId() {
        return exceptionId;
    }

    private static ExceptionRevoked fromJson(JsonInput input) {
        java.lang.String reason = null;
        java.lang.Integer exceptionId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "reason":
                    reason = input.nextString();
                    break;
                case "exceptionId":
                    exceptionId = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ExceptionRevoked(reason, exceptionId);
    }
}
