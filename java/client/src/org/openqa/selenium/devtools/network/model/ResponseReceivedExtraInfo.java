package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when additional information about a responseReceived event is available from the network
 * stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for
 * it, and responseReceivedExtraInfo may be fired before or after responseReceived.
 */
@org.openqa.selenium.Beta()
public class ResponseReceivedExtraInfo {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final java.util.List<org.openqa.selenium.devtools.network.model.BlockedSetCookieWithReason> blockedCookies;

    private final org.openqa.selenium.devtools.network.model.Headers headers;

    private final java.lang.String headersText;

    public ResponseReceivedExtraInfo(org.openqa.selenium.devtools.network.model.RequestId requestId, java.util.List<org.openqa.selenium.devtools.network.model.BlockedSetCookieWithReason> blockedCookies, org.openqa.selenium.devtools.network.model.Headers headers, java.lang.String headersText) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.blockedCookies = java.util.Objects.requireNonNull(blockedCookies, "blockedCookies is required");
        this.headers = java.util.Objects.requireNonNull(headers, "headers is required");
        this.headersText = headersText;
    }

    /**
     * Request identifier. Used to match this information to another responseReceived event.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * A list of cookies which were not stored from the response along with the corresponding
     * reasons for blocking. The cookies here may not be valid due to syntax errors, which
     * are represented by the invalid cookie line string instead of a proper cookie.
     */
    public java.util.List<org.openqa.selenium.devtools.network.model.BlockedSetCookieWithReason> getBlockedCookies() {
        return blockedCookies;
    }

    /**
     * Raw response headers as they were received over the wire.
     */
    public org.openqa.selenium.devtools.network.model.Headers getHeaders() {
        return headers;
    }

    /**
     * Raw response header text as it was received over the wire. The raw text may not always be
     * available, such as in the case of HTTP/2 or QUIC.
     */
    public java.lang.String getHeadersText() {
        return headersText;
    }

    private static ResponseReceivedExtraInfo fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        java.util.List<org.openqa.selenium.devtools.network.model.BlockedSetCookieWithReason> blockedCookies = null;
        org.openqa.selenium.devtools.network.model.Headers headers = null;
        java.lang.String headersText = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "blockedCookies":
                    blockedCookies = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.BlockedSetCookieWithReason>>() {
                    }.getType());
                    break;
                case "headers":
                    headers = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "headersText":
                    headersText = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ResponseReceivedExtraInfo(requestId, blockedCookies, headers, headersText);
    }
}
