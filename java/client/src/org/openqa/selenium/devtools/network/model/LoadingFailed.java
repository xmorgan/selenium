package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when HTTP request has failed to load.
 */
public class LoadingFailed {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final org.openqa.selenium.devtools.network.model.ResourceType type;

    private final java.lang.String errorText;

    private final java.lang.Boolean canceled;

    private final org.openqa.selenium.devtools.network.model.BlockedReason blockedReason;

    public LoadingFailed(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, org.openqa.selenium.devtools.network.model.ResourceType type, java.lang.String errorText, java.lang.Boolean canceled, org.openqa.selenium.devtools.network.model.BlockedReason blockedReason) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.errorText = java.util.Objects.requireNonNull(errorText, "errorText is required");
        this.canceled = canceled;
        this.blockedReason = blockedReason;
    }

    /**
     * Request identifier.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * Timestamp.
     */
    public org.openqa.selenium.devtools.network.model.MonotonicTime getTimestamp() {
        return timestamp;
    }

    /**
     * Resource type.
     */
    public org.openqa.selenium.devtools.network.model.ResourceType getType() {
        return type;
    }

    /**
     * User friendly error message.
     */
    public java.lang.String getErrorText() {
        return errorText;
    }

    /**
     * True if loading was canceled.
     */
    public java.lang.Boolean getCanceled() {
        return canceled;
    }

    /**
     * The reason why loading was blocked, if any.
     */
    public org.openqa.selenium.devtools.network.model.BlockedReason getBlockedReason() {
        return blockedReason;
    }

    private static LoadingFailed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        org.openqa.selenium.devtools.network.model.ResourceType type = null;
        java.lang.String errorText = null;
        java.lang.Boolean canceled = null;
        org.openqa.selenium.devtools.network.model.BlockedReason blockedReason = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "type":
                    type = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "errorText":
                    errorText = input.nextString();
                    break;
                case "canceled":
                    canceled = input.nextBoolean();
                    break;
                case "blockedReason":
                    blockedReason = input.read(org.openqa.selenium.devtools.network.model.BlockedReason.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LoadingFailed(requestId, timestamp, type, errorText, canceled, blockedReason);
    }
}
