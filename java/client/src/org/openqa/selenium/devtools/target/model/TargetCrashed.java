package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when a target has crashed.
 */
public class TargetCrashed {

    private final org.openqa.selenium.devtools.target.model.TargetID targetId;

    private final java.lang.String status;

    private final java.lang.Integer errorCode;

    public TargetCrashed(org.openqa.selenium.devtools.target.model.TargetID targetId, java.lang.String status, java.lang.Integer errorCode) {
        this.targetId = java.util.Objects.requireNonNull(targetId, "targetId is required");
        this.status = java.util.Objects.requireNonNull(status, "status is required");
        this.errorCode = java.util.Objects.requireNonNull(errorCode, "errorCode is required");
    }

    public org.openqa.selenium.devtools.target.model.TargetID getTargetId() {
        return targetId;
    }

    /**
     * Termination status type.
     */
    public java.lang.String getStatus() {
        return status;
    }

    /**
     * Termination error code.
     */
    public java.lang.Integer getErrorCode() {
        return errorCode;
    }

    private static TargetCrashed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.target.model.TargetID targetId = null;
        java.lang.String status = null;
        java.lang.Integer errorCode = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "targetId":
                    targetId = input.read(org.openqa.selenium.devtools.target.model.TargetID.class);
                    break;
                case "status":
                    status = input.nextString();
                    break;
                case "errorCode":
                    errorCode = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TargetCrashed(targetId, status, errorCode);
    }
}
