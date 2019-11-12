package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Field type for a signed exchange related error.
 */
@org.openqa.selenium.Beta()
public enum SignedExchangeErrorField {

    SIGNATURESIG("signatureSig"),
    SIGNATUREINTEGRITY("signatureIntegrity"),
    SIGNATURECERTURL("signatureCertUrl"),
    SIGNATURECERTSHA256("signatureCertSha256"),
    SIGNATUREVALIDITYURL("signatureValidityUrl"),
    SIGNATURETIMESTAMPS("signatureTimestamps");

    private String value;

    SignedExchangeErrorField(String value) {
        this.value = value;
    }

    public static SignedExchangeErrorField fromString(String s) {
        return java.util.Arrays.stream(SignedExchangeErrorField.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SignedExchangeErrorField "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static SignedExchangeErrorField fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
