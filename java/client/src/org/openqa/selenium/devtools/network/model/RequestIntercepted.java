package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
 * mocked.
 * Deprecated, use Fetch.requestPaused instead.
 */
@org.openqa.selenium.Beta()
@java.lang.Deprecated()
public class RequestIntercepted {

    private final org.openqa.selenium.devtools.network.model.InterceptionId interceptionId;

    private final org.openqa.selenium.devtools.network.model.Request request;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.network.model.ResourceType resourceType;

    private final java.lang.Boolean isNavigationRequest;

    private final java.lang.Boolean isDownload;

    private final java.lang.String redirectUrl;

    private final org.openqa.selenium.devtools.network.model.AuthChallenge authChallenge;

    private final org.openqa.selenium.devtools.network.model.ErrorReason responseErrorReason;

    private final java.lang.Integer responseStatusCode;

    private final org.openqa.selenium.devtools.network.model.Headers responseHeaders;

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    public RequestIntercepted(org.openqa.selenium.devtools.network.model.InterceptionId interceptionId, org.openqa.selenium.devtools.network.model.Request request, org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.network.model.ResourceType resourceType, java.lang.Boolean isNavigationRequest, java.lang.Boolean isDownload, java.lang.String redirectUrl, org.openqa.selenium.devtools.network.model.AuthChallenge authChallenge, org.openqa.selenium.devtools.network.model.ErrorReason responseErrorReason, java.lang.Integer responseStatusCode, org.openqa.selenium.devtools.network.model.Headers responseHeaders, org.openqa.selenium.devtools.network.model.RequestId requestId) {
        this.interceptionId = java.util.Objects.requireNonNull(interceptionId, "interceptionId is required");
        this.request = java.util.Objects.requireNonNull(request, "request is required");
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType is required");
        this.isNavigationRequest = java.util.Objects.requireNonNull(isNavigationRequest, "isNavigationRequest is required");
        this.isDownload = isDownload;
        this.redirectUrl = redirectUrl;
        this.authChallenge = authChallenge;
        this.responseErrorReason = responseErrorReason;
        this.responseStatusCode = responseStatusCode;
        this.responseHeaders = responseHeaders;
        this.requestId = requestId;
    }

    /**
     * Each request the page makes will have a unique id, however if any redirects are encountered
     * while processing that fetch, they will be reported with the same id as the original fetch.
     * Likewise if HTTP authentication is needed then the same fetch id will be used.
     */
    public org.openqa.selenium.devtools.network.model.InterceptionId getInterceptionId() {
        return interceptionId;
    }

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
     * Whether this is a navigation request, which can abort the navigation completely.
     */
    public java.lang.Boolean getIsNavigationRequest() {
        return isNavigationRequest;
    }

    /**
     * Set if the request is a navigation that will result in a download.
     * Only present after response is received from the server (i.e. HeadersReceived stage).
     */
    public java.lang.Boolean getIsDownload() {
        return isDownload;
    }

    /**
     * Redirect location, only sent if a redirect was intercepted.
     */
    public java.lang.String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Details of the Authorization Challenge encountered. If this is set then
     * continueInterceptedRequest must contain an authChallengeResponse.
     */
    public org.openqa.selenium.devtools.network.model.AuthChallenge getAuthChallenge() {
        return authChallenge;
    }

    /**
     * Response error if intercepted at response stage or if redirect occurred while intercepting
     * request.
     */
    public org.openqa.selenium.devtools.network.model.ErrorReason getResponseErrorReason() {
        return responseErrorReason;
    }

    /**
     * Response code if intercepted at response stage or if redirect occurred while intercepting
     * request or auth retry occurred.
     */
    public java.lang.Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    /**
     * Response headers if intercepted at the response stage or if redirect occurred while
     * intercepting request or auth retry occurred.
     */
    public org.openqa.selenium.devtools.network.model.Headers getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * If the intercepted request had a corresponding requestWillBeSent event fired for it, then
     * this requestId will be the same as the requestId present in the requestWillBeSent event.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    private static RequestIntercepted fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.InterceptionId interceptionId = null;
        org.openqa.selenium.devtools.network.model.Request request = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.network.model.ResourceType resourceType = null;
        java.lang.Boolean isNavigationRequest = null;
        java.lang.Boolean isDownload = null;
        java.lang.String redirectUrl = null;
        org.openqa.selenium.devtools.network.model.AuthChallenge authChallenge = null;
        org.openqa.selenium.devtools.network.model.ErrorReason responseErrorReason = null;
        java.lang.Integer responseStatusCode = null;
        org.openqa.selenium.devtools.network.model.Headers responseHeaders = null;
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "interceptionId":
                    interceptionId = input.read(org.openqa.selenium.devtools.network.model.InterceptionId.class);
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
                case "isNavigationRequest":
                    isNavigationRequest = input.nextBoolean();
                    break;
                case "isDownload":
                    isDownload = input.nextBoolean();
                    break;
                case "redirectUrl":
                    redirectUrl = input.nextString();
                    break;
                case "authChallenge":
                    authChallenge = input.read(org.openqa.selenium.devtools.network.model.AuthChallenge.class);
                    break;
                case "responseErrorReason":
                    responseErrorReason = input.read(org.openqa.selenium.devtools.network.model.ErrorReason.class);
                    break;
                case "responseStatusCode":
                    responseStatusCode = input.nextNumber().intValue();
                    break;
                case "responseHeaders":
                    responseHeaders = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RequestIntercepted(interceptionId, request, frameId, resourceType, isNavigationRequest, isDownload, redirectUrl, authChallenge, responseErrorReason, responseStatusCode, responseHeaders, requestId);
    }
}
