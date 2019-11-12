package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * WebSocket response data.
 */
public class WebSocketResponse {

    private final java.lang.Integer status;

    private final java.lang.String statusText;

    private final org.openqa.selenium.devtools.network.model.Headers headers;

    private final java.lang.String headersText;

    private final org.openqa.selenium.devtools.network.model.Headers requestHeaders;

    private final java.lang.String requestHeadersText;

    public WebSocketResponse(java.lang.Integer status, java.lang.String statusText, org.openqa.selenium.devtools.network.model.Headers headers, java.lang.String headersText, org.openqa.selenium.devtools.network.model.Headers requestHeaders, java.lang.String requestHeadersText) {
        this.status = java.util.Objects.requireNonNull(status, "status is required");
        this.statusText = java.util.Objects.requireNonNull(statusText, "statusText is required");
        this.headers = java.util.Objects.requireNonNull(headers, "headers is required");
        this.headersText = headersText;
        this.requestHeaders = requestHeaders;
        this.requestHeadersText = requestHeadersText;
    }

    /**
     * HTTP response status code.
     */
    public java.lang.Integer getStatus() {
        return status;
    }

    /**
     * HTTP response status text.
     */
    public java.lang.String getStatusText() {
        return statusText;
    }

    /**
     * HTTP response headers.
     */
    public org.openqa.selenium.devtools.network.model.Headers getHeaders() {
        return headers;
    }

    /**
     * HTTP response headers text.
     */
    public java.lang.String getHeadersText() {
        return headersText;
    }

    /**
     * HTTP request headers.
     */
    public org.openqa.selenium.devtools.network.model.Headers getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * HTTP request headers text.
     */
    public java.lang.String getRequestHeadersText() {
        return requestHeadersText;
    }

    private static WebSocketResponse fromJson(JsonInput input) {
        java.lang.Integer status = null;
        java.lang.String statusText = null;
        org.openqa.selenium.devtools.network.model.Headers headers = null;
        java.lang.String headersText = null;
        org.openqa.selenium.devtools.network.model.Headers requestHeaders = null;
        java.lang.String requestHeadersText = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "status":
                    status = input.nextNumber().intValue();
                    break;
                case "statusText":
                    statusText = input.nextString();
                    break;
                case "headers":
                    headers = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "headersText":
                    headersText = input.nextString();
                    break;
                case "requestHeaders":
                    requestHeaders = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "requestHeadersText":
                    requestHeadersText = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketResponse(status, statusText, headers, headersText, requestHeaders, requestHeadersText);
    }
}
