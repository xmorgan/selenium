package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when additional information about a requestWillBeSent event is available from the
 * network stack. Not every requestWillBeSent event will have an additional
 * requestWillBeSentExtraInfo fired for it, and there is no guarantee whether requestWillBeSent
 * or requestWillBeSentExtraInfo will be fired first for the same request.
 */
@org.openqa.selenium.Beta()
public class RequestWillBeSentExtraInfo {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final java.util.List<org.openqa.selenium.devtools.network.model.BlockedCookieWithReason> blockedCookies;

    private final org.openqa.selenium.devtools.network.model.Headers headers;

    public RequestWillBeSentExtraInfo(org.openqa.selenium.devtools.network.model.RequestId requestId, java.util.List<org.openqa.selenium.devtools.network.model.BlockedCookieWithReason> blockedCookies, org.openqa.selenium.devtools.network.model.Headers headers) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.blockedCookies = java.util.Objects.requireNonNull(blockedCookies, "blockedCookies is required");
        this.headers = java.util.Objects.requireNonNull(headers, "headers is required");
    }

    /**
     * Request identifier. Used to match this information to an existing requestWillBeSent event.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * A list of cookies which will not be sent with this request along with corresponding reasons
     * for blocking.
     */
    public java.util.List<org.openqa.selenium.devtools.network.model.BlockedCookieWithReason> getBlockedCookies() {
        return blockedCookies;
    }

    /**
     * Raw request headers as they will be sent over the wire.
     */
    public org.openqa.selenium.devtools.network.model.Headers getHeaders() {
        return headers;
    }

    private static RequestWillBeSentExtraInfo fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        java.util.List<org.openqa.selenium.devtools.network.model.BlockedCookieWithReason> blockedCookies = null;
        org.openqa.selenium.devtools.network.model.Headers headers = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "blockedCookies":
                    blockedCookies = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.BlockedCookieWithReason>>() {
                    }.getType());
                    break;
                case "headers":
                    headers = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RequestWillBeSentExtraInfo(requestId, blockedCookies, headers);
    }
}
