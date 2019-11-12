package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when WebSocket message error occurs.
 */
public class WebSocketFrameError {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final java.lang.String errorMessage;

    public WebSocketFrameError(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, java.lang.String errorMessage) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.errorMessage = java.util.Objects.requireNonNull(errorMessage, "errorMessage is required");
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
     * WebSocket error message.
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }

    private static WebSocketFrameError fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        java.lang.String errorMessage = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "errorMessage":
                    errorMessage = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketFrameError(requestId, timestamp, errorMessage);
    }
}
