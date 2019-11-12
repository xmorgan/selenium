package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when exception was thrown and unhandled.
 */
public class ExceptionThrown {

    private final org.openqa.selenium.devtools.runtime.model.Timestamp timestamp;

    private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

    public ExceptionThrown(org.openqa.selenium.devtools.runtime.model.Timestamp timestamp, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
    }

    /**
     * Timestamp of the exception.
     */
    public org.openqa.selenium.devtools.runtime.model.Timestamp getTimestamp() {
        return timestamp;
    }

    public org.openqa.selenium.devtools.runtime.model.ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }

    private static ExceptionThrown fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.Timestamp timestamp = null;
        org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.runtime.model.Timestamp.class);
                    break;
                case "exceptionDetails":
                    exceptionDetails = input.read(org.openqa.selenium.devtools.runtime.model.ExceptionDetails.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ExceptionThrown(timestamp, exceptionDetails);
    }
}
