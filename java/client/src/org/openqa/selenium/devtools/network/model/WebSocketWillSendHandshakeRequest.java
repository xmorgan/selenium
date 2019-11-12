package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when WebSocket is about to initiate handshake.
 */
public class WebSocketWillSendHandshakeRequest {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch wallTime;

    private final org.openqa.selenium.devtools.network.model.WebSocketRequest request;

    public WebSocketWillSendHandshakeRequest(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, org.openqa.selenium.devtools.network.model.TimeSinceEpoch wallTime, org.openqa.selenium.devtools.network.model.WebSocketRequest request) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.wallTime = java.util.Objects.requireNonNull(wallTime, "wallTime is required");
        this.request = java.util.Objects.requireNonNull(request, "request is required");
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
     * UTC Timestamp.
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getWallTime() {
        return wallTime;
    }

    /**
     * WebSocket request data.
     */
    public org.openqa.selenium.devtools.network.model.WebSocketRequest getRequest() {
        return request;
    }

    private static WebSocketWillSendHandshakeRequest fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch wallTime = null;
        org.openqa.selenium.devtools.network.model.WebSocketRequest request = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "wallTime":
                    wallTime = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "request":
                    request = input.read(org.openqa.selenium.devtools.network.model.WebSocketRequest.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketWillSendHandshakeRequest(requestId, timestamp, wallTime, request);
    }
}
