package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired upon WebSocket creation.
 */
public class WebSocketCreated {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final java.lang.String url;

    private final org.openqa.selenium.devtools.network.model.Initiator initiator;

    public WebSocketCreated(org.openqa.selenium.devtools.network.model.RequestId requestId, java.lang.String url, org.openqa.selenium.devtools.network.model.Initiator initiator) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.initiator = initiator;
    }

    /**
     * Request identifier.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * WebSocket request URL.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Request initiator.
     */
    public org.openqa.selenium.devtools.network.model.Initiator getInitiator() {
        return initiator;
    }

    private static WebSocketCreated fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        java.lang.String url = null;
        org.openqa.selenium.devtools.network.model.Initiator initiator = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "initiator":
                    initiator = input.read(org.openqa.selenium.devtools.network.model.Initiator.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketCreated(requestId, url, initiator);
    }
}
