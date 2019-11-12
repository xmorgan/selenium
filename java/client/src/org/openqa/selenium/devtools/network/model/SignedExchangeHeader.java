package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about a signed exchange header.
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#cbor-representation
 */
@org.openqa.selenium.Beta()
public class SignedExchangeHeader {

    private final java.lang.String requestUrl;

    private final java.lang.Integer responseCode;

    private final org.openqa.selenium.devtools.network.model.Headers responseHeaders;

    private final java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeSignature> signatures;

    private final java.lang.String headerIntegrity;

    public SignedExchangeHeader(java.lang.String requestUrl, java.lang.Integer responseCode, org.openqa.selenium.devtools.network.model.Headers responseHeaders, java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeSignature> signatures, java.lang.String headerIntegrity) {
        this.requestUrl = java.util.Objects.requireNonNull(requestUrl, "requestUrl is required");
        this.responseCode = java.util.Objects.requireNonNull(responseCode, "responseCode is required");
        this.responseHeaders = java.util.Objects.requireNonNull(responseHeaders, "responseHeaders is required");
        this.signatures = java.util.Objects.requireNonNull(signatures, "signatures is required");
        this.headerIntegrity = java.util.Objects.requireNonNull(headerIntegrity, "headerIntegrity is required");
    }

    /**
     * Signed exchange request URL.
     */
    public java.lang.String getRequestUrl() {
        return requestUrl;
    }

    /**
     * Signed exchange response code.
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Signed exchange response headers.
     */
    public org.openqa.selenium.devtools.network.model.Headers getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Signed exchange response signature.
     */
    public java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeSignature> getSignatures() {
        return signatures;
    }

    /**
     * Signed exchange header integrity hash in the form of "sha256-<base64-hash-value>".
     */
    public java.lang.String getHeaderIntegrity() {
        return headerIntegrity;
    }

    private static SignedExchangeHeader fromJson(JsonInput input) {
        java.lang.String requestUrl = null;
        java.lang.Integer responseCode = null;
        org.openqa.selenium.devtools.network.model.Headers responseHeaders = null;
        java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeSignature> signatures = null;
        java.lang.String headerIntegrity = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestUrl":
                    requestUrl = input.nextString();
                    break;
                case "responseCode":
                    responseCode = input.nextNumber().intValue();
                    break;
                case "responseHeaders":
                    responseHeaders = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "signatures":
                    signatures = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeSignature>>() {
                    }.getType());
                    break;
                case "headerIntegrity":
                    headerIntegrity = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SignedExchangeHeader(requestUrl, responseCode, responseHeaders, signatures, headerIntegrity);
    }
}
