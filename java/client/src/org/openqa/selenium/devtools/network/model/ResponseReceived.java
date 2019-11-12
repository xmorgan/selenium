package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when HTTP response is available.
 */
public class ResponseReceived {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.LoaderId loaderId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final org.openqa.selenium.devtools.network.model.ResourceType type;

    private final org.openqa.selenium.devtools.network.model.Response response;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    public ResponseReceived(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.LoaderId loaderId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, org.openqa.selenium.devtools.network.model.ResourceType type, org.openqa.selenium.devtools.network.model.Response response, org.openqa.selenium.devtools.page.model.FrameId frameId) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.loaderId = java.util.Objects.requireNonNull(loaderId, "loaderId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.response = java.util.Objects.requireNonNull(response, "response is required");
        this.frameId = frameId;
    }

    /**
     * Request identifier.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    public org.openqa.selenium.devtools.network.model.LoaderId getLoaderId() {
        return loaderId;
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
     * Response data.
     */
    public org.openqa.selenium.devtools.network.model.Response getResponse() {
        return response;
    }

    /**
     * Frame identifier.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    private static ResponseReceived fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.LoaderId loaderId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        org.openqa.selenium.devtools.network.model.ResourceType type = null;
        org.openqa.selenium.devtools.network.model.Response response = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "loaderId":
                    loaderId = input.read(org.openqa.selenium.devtools.network.model.LoaderId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "type":
                    type = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "response":
                    response = input.read(org.openqa.selenium.devtools.network.model.Response.class);
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ResponseReceived(requestId, loaderId, timestamp, type, response, frameId);
    }
}
