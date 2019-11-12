package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when the domain is enabled and the request URL matches the
 * specified filter. The request is paused until the client responds
 * with one of continueRequest, failRequest or fulfillRequest.
 * The stage of the request can be determined by presence of responseErrorReason
 * and responseStatusCode -- the request is at the response stage if either
 * of these fields is present and in the request stage otherwise.
 */
public class RequestPaused {

    private final org.openqa.selenium.devtools.fetch.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.Request request;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.network.model.ResourceType resourceType;

    private final org.openqa.selenium.devtools.network.model.ErrorReason responseErrorReason;

    private final java.lang.Integer responseStatusCode;

    private final java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry> responseHeaders;

    private final org.openqa.selenium.devtools.fetch.model.RequestId networkId;

    public RequestPaused(org.openqa.selenium.devtools.fetch.model.RequestId requestId, org.openqa.selenium.devtools.network.model.Request request, org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.network.model.ResourceType resourceType, org.openqa.selenium.devtools.network.model.ErrorReason responseErrorReason, java.lang.Integer responseStatusCode, java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry> responseHeaders, org.openqa.selenium.devtools.fetch.model.RequestId networkId) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.request = java.util.Objects.requireNonNull(request, "request is required");
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType is required");
        this.responseErrorReason = responseErrorReason;
        this.responseStatusCode = responseStatusCode;
        this.responseHeaders = responseHeaders;
        this.networkId = networkId;
    }

    /**
     * Each request the page makes will have a unique id.
     */
    public org.openqa.selenium.devtools.fetch.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * The details of the request.
     */
    public org.openqa.selenium.devtools.network.model.Request getRequest() {
        return request;
    }

    /**
     * The id of the frame that initiated the request.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * How the requested resource will be used.
     */
    public org.openqa.selenium.devtools.network.model.ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Response error if intercepted at response stage.
     */
    public org.openqa.selenium.devtools.network.model.ErrorReason getResponseErrorReason() {
        return responseErrorReason;
    }

    /**
     * Response code if intercepted at response stage.
     */
    public java.lang.Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * Response headers if intercepted at the response stage.
     */
    public java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
     * then this networkId will be the same as the requestId present in the requestWillBeSent event.
     */
    public org.openqa.selenium.devtools.fetch.model.RequestId getNetworkId() {
        return networkId;
    }

    private static RequestPaused fromJson(JsonInput input) {
        org.openqa.selenium.devtools.fetch.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.Request request = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.network.model.ResourceType resourceType = null;
        org.openqa.selenium.devtools.network.model.ErrorReason responseErrorReason = null;
        java.lang.Integer responseStatusCode = null;
        java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry> responseHeaders = null;
        org.openqa.selenium.devtools.fetch.model.RequestId networkId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.fetch.model.RequestId.class);
                    break;
                case "request":
                    request = input.read(org.openqa.selenium.devtools.network.model.Request.class);
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "resourceType":
                    resourceType = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "responseErrorReason":
                    responseErrorReason = input.read(org.openqa.selenium.devtools.network.model.ErrorReason.class);
                    break;
                case "responseStatusCode":
                    responseStatusCode = input.nextNumber().intValue();
                    break;
                case "responseHeaders":
                    responseHeaders = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry>>() {
                    }.getType());
                    break;
                case "networkId":
                    networkId = input.read(org.openqa.selenium.devtools.fetch.model.RequestId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RequestPaused(requestId, request, frameId, resourceType, responseErrorReason, responseStatusCode, responseHeaders, networkId);
    }
}
