package org.openqa.selenium.devtools.cachestorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Data entry.
 */
public class DataEntry {

    private final java.lang.String requestURL;

    private final java.lang.String requestMethod;

    private final java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> requestHeaders;

    private final java.lang.Number responseTime;

    private final java.lang.Integer responseStatus;

    private final java.lang.String responseStatusText;

    private final org.openqa.selenium.devtools.cachestorage.model.CachedResponseType responseType;

    private final java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> responseHeaders;

    public DataEntry(java.lang.String requestURL, java.lang.String requestMethod, java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> requestHeaders, java.lang.Number responseTime, java.lang.Integer responseStatus, java.lang.String responseStatusText, org.openqa.selenium.devtools.cachestorage.model.CachedResponseType responseType, java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> responseHeaders) {
        this.requestURL = java.util.Objects.requireNonNull(requestURL, "requestURL is required");
        this.requestMethod = java.util.Objects.requireNonNull(requestMethod, "requestMethod is required");
        this.requestHeaders = java.util.Objects.requireNonNull(requestHeaders, "requestHeaders is required");
        this.responseTime = java.util.Objects.requireNonNull(responseTime, "responseTime is required");
        this.responseStatus = java.util.Objects.requireNonNull(responseStatus, "responseStatus is required");
        this.responseStatusText = java.util.Objects.requireNonNull(responseStatusText, "responseStatusText is required");
        this.responseType = java.util.Objects.requireNonNull(responseType, "responseType is required");
        this.responseHeaders = java.util.Objects.requireNonNull(responseHeaders, "responseHeaders is required");
    }

    /**
     * Request URL.
     */
    public java.lang.String getRequestURL() {
        return requestURL;
    }

    /**
     * Request method.
     */
    public java.lang.String getRequestMethod() {
        return requestMethod;
    }

    /**
     * Request headers
     */
    public java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * Number of seconds since epoch.
     */
    public java.lang.Number getResponseTime() {
        return responseTime;
    }

    /**
     * HTTP response status code.
     */
    public java.lang.Integer getResponseStatus() {
        return responseStatus;
    }

    /**
     * HTTP response status text.
     */
    public java.lang.String getResponseStatusText() {
        return responseStatusText;
    }

    /**
     * HTTP response type
     */
    public org.openqa.selenium.devtools.cachestorage.model.CachedResponseType getResponseType() {
        return responseType;
    }

    /**
     * Response headers
     */
    public java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> getResponseHeaders() {
        return responseHeaders;
    }

    private static DataEntry fromJson(JsonInput input) {
        java.lang.String requestURL = null;
        java.lang.String requestMethod = null;
        java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> requestHeaders = null;
        java.lang.Number responseTime = null;
        java.lang.Integer responseStatus = null;
        java.lang.String responseStatusText = null;
        org.openqa.selenium.devtools.cachestorage.model.CachedResponseType responseType = null;
        java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> responseHeaders = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestURL":
                    requestURL = input.nextString();
                    break;
                case "requestMethod":
                    requestMethod = input.nextString();
                    break;
                case "requestHeaders":
                    requestHeaders = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header>>() {
                    }.getType());
                    break;
                case "responseTime":
                    responseTime = input.nextNumber();
                    break;
                case "responseStatus":
                    responseStatus = input.nextNumber().intValue();
                    break;
                case "responseStatusText":
                    responseStatusText = input.nextString();
                    break;
                case "responseType":
                    responseType = input.read(org.openqa.selenium.devtools.cachestorage.model.CachedResponseType.class);
                    break;
                case "responseHeaders":
                    responseHeaders = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DataEntry(requestURL, requestMethod, requestHeaders, responseTime, responseStatus, responseStatusText, responseType, responseHeaders);
    }
}
