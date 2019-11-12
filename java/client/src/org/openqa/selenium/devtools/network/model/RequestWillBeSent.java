package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when page is about to send HTTP request.
 */
public class RequestWillBeSent {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.LoaderId loaderId;

    private final java.lang.String documentURL;

    private final org.openqa.selenium.devtools.network.model.Request request;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch wallTime;

    private final org.openqa.selenium.devtools.network.model.Initiator initiator;

    private final org.openqa.selenium.devtools.network.model.Response redirectResponse;

    private final org.openqa.selenium.devtools.network.model.ResourceType type;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.Boolean hasUserGesture;

    public RequestWillBeSent(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.LoaderId loaderId, java.lang.String documentURL, org.openqa.selenium.devtools.network.model.Request request, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, org.openqa.selenium.devtools.network.model.TimeSinceEpoch wallTime, org.openqa.selenium.devtools.network.model.Initiator initiator, org.openqa.selenium.devtools.network.model.Response redirectResponse, org.openqa.selenium.devtools.network.model.ResourceType type, org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.Boolean hasUserGesture) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.loaderId = java.util.Objects.requireNonNull(loaderId, "loaderId is required");
        this.documentURL = java.util.Objects.requireNonNull(documentURL, "documentURL is required");
        this.request = java.util.Objects.requireNonNull(request, "request is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.wallTime = java.util.Objects.requireNonNull(wallTime, "wallTime is required");
        this.initiator = java.util.Objects.requireNonNull(initiator, "initiator is required");
        this.redirectResponse = redirectResponse;
        this.type = type;
        this.frameId = frameId;
        this.hasUserGesture = hasUserGesture;
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
     * URL of the document this request is loaded for.
     */
    public java.lang.String getDocumentURL() {
        return documentURL;
    }

    /**
     * Request data.
     */
    public org.openqa.selenium.devtools.network.model.Request getRequest() {
        return request;
    }

    /**
     * Timestamp.
     */
    public org.openqa.selenium.devtools.network.model.MonotonicTime getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp.
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getWallTime() {
        return wallTime;
    }

    /**
     * Request initiator.
     */
    public org.openqa.selenium.devtools.network.model.Initiator getInitiator() {
        return initiator;
    }

    /**
     * Redirect response data.
     */
    public org.openqa.selenium.devtools.network.model.Response getRedirectResponse() {
        return redirectResponse;
    }

    /**
     * Type of this resource.
     */
    public org.openqa.selenium.devtools.network.model.ResourceType getType() {
        return type;
    }

    /**
     * Frame identifier.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Whether the request is initiated by a user gesture. Defaults to false.
     */
    public java.lang.Boolean getHasUserGesture() {
        return hasUserGesture;
    }

    private static RequestWillBeSent fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.LoaderId loaderId = null;
        java.lang.String documentURL = null;
        org.openqa.selenium.devtools.network.model.Request request = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch wallTime = null;
        org.openqa.selenium.devtools.network.model.Initiator initiator = null;
        org.openqa.selenium.devtools.network.model.Response redirectResponse = null;
        org.openqa.selenium.devtools.network.model.ResourceType type = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        java.lang.Boolean hasUserGesture = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "loaderId":
                    loaderId = input.read(org.openqa.selenium.devtools.network.model.LoaderId.class);
                    break;
                case "documentURL":
                    documentURL = input.nextString();
                    break;
                case "request":
                    request = input.read(org.openqa.selenium.devtools.network.model.Request.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "wallTime":
                    wallTime = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "initiator":
                    initiator = input.read(org.openqa.selenium.devtools.network.model.Initiator.class);
                    break;
                case "redirectResponse":
                    redirectResponse = input.read(org.openqa.selenium.devtools.network.model.Response.class);
                    break;
                case "type":
                    type = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "hasUserGesture":
                    hasUserGesture = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RequestWillBeSent(requestId, loaderId, documentURL, request, timestamp, wallTime, initiator, redirectResponse, type, frameId, hasUserGesture);
    }
}
