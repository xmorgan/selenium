package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when WebSocket is closed.
 */
public class WebSocketClosed {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    public WebSocketClosed(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
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

    private static WebSocketClosed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketClosed(requestId, timestamp);
    }
}
