package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * HTTP response data.
 */
public class Response {

    private final java.lang.String url;

    private final java.lang.Integer status;

    private final java.lang.String statusText;

    private final org.openqa.selenium.devtools.network.model.Headers headers;

    private final java.lang.String headersText;

    private final java.lang.String mimeType;

    private final org.openqa.selenium.devtools.network.model.Headers requestHeaders;

    private final java.lang.String requestHeadersText;

    private final java.lang.Boolean connectionReused;

    private final java.lang.Number connectionId;

    private final java.lang.String remoteIPAddress;

    private final java.lang.Integer remotePort;

    private final java.lang.Boolean fromDiskCache;

    private final java.lang.Boolean fromServiceWorker;

    private final java.lang.Boolean fromPrefetchCache;

    private final java.lang.Number encodedDataLength;

    private final org.openqa.selenium.devtools.network.model.ResourceTiming timing;

    private final java.lang.String protocol;

    private final org.openqa.selenium.devtools.security.model.SecurityState securityState;

    private final org.openqa.selenium.devtools.network.model.SecurityDetails securityDetails;

    public Response(java.lang.String url, java.lang.Integer status, java.lang.String statusText, org.openqa.selenium.devtools.network.model.Headers headers, java.lang.String headersText, java.lang.String mimeType, org.openqa.selenium.devtools.network.model.Headers requestHeaders, java.lang.String requestHeadersText, java.lang.Boolean connectionReused, java.lang.Number connectionId, java.lang.String remoteIPAddress, java.lang.Integer remotePort, java.lang.Boolean fromDiskCache, java.lang.Boolean fromServiceWorker, java.lang.Boolean fromPrefetchCache, java.lang.Number encodedDataLength, org.openqa.selenium.devtools.network.model.ResourceTiming timing, java.lang.String protocol, org.openqa.selenium.devtools.security.model.SecurityState securityState, org.openqa.selenium.devtools.network.model.SecurityDetails securityDetails) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.status = java.util.Objects.requireNonNull(status, "status is required");
        this.statusText = java.util.Objects.requireNonNull(statusText, "statusText is required");
        this.headers = java.util.Objects.requireNonNull(headers, "headers is required");
        this.headersText = headersText;
        this.mimeType = java.util.Objects.requireNonNull(mimeType, "mimeType is required");
        this.requestHeaders = requestHeaders;
        this.requestHeadersText = requestHeadersText;
        this.connectionReused = java.util.Objects.requireNonNull(connectionReused, "connectionReused is required");
        this.connectionId = java.util.Objects.requireNonNull(connectionId, "connectionId is required");
        this.remoteIPAddress = remoteIPAddress;
        this.remotePort = remotePort;
        this.fromDiskCache = fromDiskCache;
        this.fromServiceWorker = fromServiceWorker;
        this.fromPrefetchCache = fromPrefetchCache;
        this.encodedDataLength = java.util.Objects.requireNonNull(encodedDataLength, "encodedDataLength is required");
        this.timing = timing;
        this.protocol = protocol;
        this.securityState = java.util.Objects.requireNonNull(securityState, "securityState is required");
        this.securityDetails = securityDetails;
    }

    /**
     * Response URL. This URL can be different from CachedResource.url in case of redirect.
     */
    public java.lang.String getUrl() {
        return url;
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
     * Resource mimeType as determined by the browser.
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }

    /**
     * Refined HTTP request headers that were actually transmitted over the network.
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

    /**
     * Specifies whether physical connection was actually reused for this request.
     */
    public java.lang.Boolean getConnectionReused() {
        return connectionReused;
    }

    /**
     * Physical connection id that was actually used for this request.
     */
    public java.lang.Number getConnectionId() {
        return connectionId;
    }

    /**
     * Remote IP address.
     */
    public java.lang.String getRemoteIPAddress() {
        return remoteIPAddress;
    }

    /**
     * Remote port.
     */
    public java.lang.Integer getRemotePort() {
        return remotePort;
    }

    /**
     * Specifies that the request was served from the disk cache.
     */
    public java.lang.Boolean getFromDiskCache() {
        return fromDiskCache;
    }

    /**
     * Specifies that the request was served from the ServiceWorker.
     */
    public java.lang.Boolean getFromServiceWorker() {
        return fromServiceWorker;
    }

    /**
     * Specifies that the request was served from the prefetch cache.
     */
    public java.lang.Boolean getFromPrefetchCache() {
        return fromPrefetchCache;
    }

    /**
     * Total number of bytes received for this request so far.
     */
    public java.lang.Number getEncodedDataLength() {
        return encodedDataLength;
    }

    /**
     * Timing information for the given request.
     */
    public org.openqa.selenium.devtools.network.model.ResourceTiming getTiming() {
        return timing;
    }

    /**
     * Protocol used to fetch this request.
     */
    public java.lang.String getProtocol() {
        return protocol;
    }

    /**
     * Security state of the request resource.
     */
    public org.openqa.selenium.devtools.security.model.SecurityState getSecurityState() {
        return securityState;
    }

    /**
     * Security details for the request.
     */
    public org.openqa.selenium.devtools.network.model.SecurityDetails getSecurityDetails() {
        return securityDetails;
    }

    private static Response fromJson(JsonInput input) {
        java.lang.String url = null;
        java.lang.Integer status = null;
        java.lang.String statusText = null;
        org.openqa.selenium.devtools.network.model.Headers headers = null;
        java.lang.String headersText = null;
        java.lang.String mimeType = null;
        org.openqa.selenium.devtools.network.model.Headers requestHeaders = null;
        java.lang.String requestHeadersText = null;
        java.lang.Boolean connectionReused = null;
        java.lang.Number connectionId = null;
        java.lang.String remoteIPAddress = null;
        java.lang.Integer remotePort = null;
        java.lang.Boolean fromDiskCache = null;
        java.lang.Boolean fromServiceWorker = null;
        java.lang.Boolean fromPrefetchCache = null;
        java.lang.Number encodedDataLength = null;
        org.openqa.selenium.devtools.network.model.ResourceTiming timing = null;
        java.lang.String protocol = null;
        org.openqa.selenium.devtools.security.model.SecurityState securityState = null;
        org.openqa.selenium.devtools.network.model.SecurityDetails securityDetails = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
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
                case "mimeType":
                    mimeType = input.nextString();
                    break;
                case "requestHeaders":
                    requestHeaders = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "requestHeadersText":
                    requestHeadersText = input.nextString();
                    break;
                case "connectionReused":
                    connectionReused = input.nextBoolean();
                    break;
                case "connectionId":
                    connectionId = input.nextNumber();
                    break;
                case "remoteIPAddress":
                    remoteIPAddress = input.nextString();
                    break;
                case "remotePort":
                    remotePort = input.nextNumber().intValue();
                    break;
                case "fromDiskCache":
                    fromDiskCache = input.nextBoolean();
                    break;
                case "fromServiceWorker":
                    fromServiceWorker = input.nextBoolean();
                    break;
                case "fromPrefetchCache":
                    fromPrefetchCache = input.nextBoolean();
                    break;
                case "encodedDataLength":
                    encodedDataLength = input.nextNumber();
                    break;
                case "timing":
                    timing = input.read(org.openqa.selenium.devtools.network.model.ResourceTiming.class);
                    break;
                case "protocol":
                    protocol = input.nextString();
                    break;
                case "securityState":
                    securityState = input.read(org.openqa.selenium.devtools.security.model.SecurityState.class);
                    break;
                case "securityDetails":
                    securityDetails = input.read(org.openqa.selenium.devtools.network.model.SecurityDetails.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Response(url, status, statusText, headers, headersText, mimeType, requestHeaders, requestHeadersText, connectionReused, connectionId, remoteIPAddress, remotePort, fromDiskCache, fromServiceWorker, fromPrefetchCache, encodedDataLength, timing, protocol, securityState, securityDetails);
    }
}
