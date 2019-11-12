package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about a signed exchange response.
 */
@org.openqa.selenium.Beta()
public class SignedExchangeError {

    private final java.lang.String message;

    private final java.lang.Integer signatureIndex;

    private final org.openqa.selenium.devtools.network.model.SignedExchangeErrorField errorField;

    public SignedExchangeError(java.lang.String message, java.lang.Integer signatureIndex, org.openqa.selenium.devtools.network.model.SignedExchangeErrorField errorField) {
        this.message = java.util.Objects.requireNonNull(message, "message is required");
        this.signatureIndex = signatureIndex;
        this.errorField = errorField;
    }

    /**
     * Error message.
     */
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * The index of the signature which caused the error.
     */
    public java.lang.Integer getSignatureIndex() {
        return signatureIndex;
    }

    /**
     * The field which caused the error.
     */
    public org.openqa.selenium.devtools.network.model.SignedExchangeErrorField getErrorField() {
        return errorField;
    }

    private static SignedExchangeError fromJson(JsonInput input) {
        java.lang.String message = null;
        java.lang.Integer signatureIndex = null;
        org.openqa.selenium.devtools.network.model.SignedExchangeErrorField errorField = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "message":
                    message = input.nextString();
                    break;
                case "signatureIndex":
                    signatureIndex = input.nextNumber().intValue();
                    break;
                case "errorField":
                    errorField = input.read(org.openqa.selenium.devtools.network.model.SignedExchangeErrorField.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SignedExchangeError(message, signatureIndex, errorField);
    }
}
