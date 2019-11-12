package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when the domain is enabled with handleAuthRequests set to true.
 * The request is paused until client responds with continueWithAuth.
 */
public class AuthRequired {

    private final org.openqa.selenium.devtools.fetch.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.Request request;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.network.model.ResourceType resourceType;

    private final org.openqa.selenium.devtools.fetch.model.AuthChallenge authChallenge;

    public AuthRequired(org.openqa.selenium.devtools.fetch.model.RequestId requestId, org.openqa.selenium.devtools.network.model.Request request, org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.network.model.ResourceType resourceType, org.openqa.selenium.devtools.fetch.model.AuthChallenge authChallenge) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.request = java.util.Objects.requireNonNull(request, "request is required");
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType is required");
        this.authChallenge = java.util.Objects.requireNonNull(authChallenge, "authChallenge is required");
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
     * Details of the Authorization Challenge encountered.
     * If this is set, client should respond with continueRequest that
     * contains AuthChallengeResponse.
     */
    public org.openqa.selenium.devtools.fetch.model.AuthChallenge getAuthChallenge() {
        return authChallenge;
    }

    private static AuthRequired fromJson(JsonInput input) {
        org.openqa.selenium.devtools.fetch.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.Request request = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.network.model.ResourceType resourceType = null;
        org.openqa.selenium.devtools.fetch.model.AuthChallenge authChallenge = null;
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
                case "authChallenge":
                    authChallenge = input.read(org.openqa.selenium.devtools.fetch.model.AuthChallenge.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AuthRequired(requestId, request, frameId, resourceType, authChallenge);
    }
}
