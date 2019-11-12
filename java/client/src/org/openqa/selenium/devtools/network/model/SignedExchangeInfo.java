package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about a signed exchange response.
 */
@org.openqa.selenium.Beta()
public class SignedExchangeInfo {

    private final org.openqa.selenium.devtools.network.model.Response outerResponse;

    private final org.openqa.selenium.devtools.network.model.SignedExchangeHeader header;

    private final org.openqa.selenium.devtools.network.model.SecurityDetails securityDetails;

    private final java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeError> errors;

    public SignedExchangeInfo(org.openqa.selenium.devtools.network.model.Response outerResponse, org.openqa.selenium.devtools.network.model.SignedExchangeHeader header, org.openqa.selenium.devtools.network.model.SecurityDetails securityDetails, java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeError> errors) {
        this.outerResponse = java.util.Objects.requireNonNull(outerResponse, "outerResponse is required");
        this.header = header;
        this.securityDetails = securityDetails;
        this.errors = errors;
    }

    /**
     * The outer response of signed HTTP exchange which was received from network.
     */
    public org.openqa.selenium.devtools.network.model.Response getOuterResponse() {
        return outerResponse;
    }

    /**
     * Information about the signed exchange header.
     */
    public org.openqa.selenium.devtools.network.model.SignedExchangeHeader getHeader() {
        return header;
    }

    /**
     * Security details for the signed exchange header.
     */
    public org.openqa.selenium.devtools.network.model.SecurityDetails getSecurityDetails() {
        return securityDetails;
    }

    /**
     * Errors occurred while handling the signed exchagne.
     */
    public java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeError> getErrors() {
        return errors;
    }

    private static SignedExchangeInfo fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.Response outerResponse = null;
        org.openqa.selenium.devtools.network.model.SignedExchangeHeader header = null;
        org.openqa.selenium.devtools.network.model.SecurityDetails securityDetails = null;
        java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeError> errors = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "outerResponse":
                    outerResponse = input.read(org.openqa.selenium.devtools.network.model.Response.class);
                    break;
                case "header":
                    header = input.read(org.openqa.selenium.devtools.network.model.SignedExchangeHeader.class);
                    break;
                case "securityDetails":
                    securityDetails = input.read(org.openqa.selenium.devtools.network.model.SecurityDetails.class);
                    break;
                case "errors":
                    errors = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.SignedExchangeError>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SignedExchangeInfo(outerResponse, header, securityDetails, errors);
    }
}
