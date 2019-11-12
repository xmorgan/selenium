package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when WebSocket message is sent.
 */
public class WebSocketFrameSent {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final org.openqa.selenium.devtools.network.model.WebSocketFrame response;

    public WebSocketFrameSent(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, org.openqa.selenium.devtools.network.model.WebSocketFrame response) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.response = java.util.Objects.requireNonNull(response, "response is required");
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
     * WebSocket response data.
     */
    public org.openqa.selenium.devtools.network.model.WebSocketFrame getResponse() {
        return response;
    }

    private static WebSocketFrameSent fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        org.openqa.selenium.devtools.network.model.WebSocketFrame response = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "response":
                    response = input.read(org.openqa.selenium.devtools.network.model.WebSocketFrame.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketFrameSent(requestId, timestamp, response);
    }
}
