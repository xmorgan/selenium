package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about a signed exchange signature.
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#rfc.section.3.1
 */
@org.openqa.selenium.Beta()
public class SignedExchangeSignature {

    private final java.lang.String label;

    private final java.lang.String signature;

    private final java.lang.String integrity;

    private final java.lang.String certUrl;

    private final java.lang.String certSha256;

    private final java.lang.String validityUrl;

    private final java.lang.Integer date;

    private final java.lang.Integer expires;

    private final java.util.List<java.lang.String> certificates;

    public SignedExchangeSignature(java.lang.String label, java.lang.String signature, java.lang.String integrity, java.lang.String certUrl, java.lang.String certSha256, java.lang.String validityUrl, java.lang.Integer date, java.lang.Integer expires, java.util.List<java.lang.String> certificates) {
        this.label = java.util.Objects.requireNonNull(label, "label is required");
        this.signature = java.util.Objects.requireNonNull(signature, "signature is required");
        this.integrity = java.util.Objects.requireNonNull(integrity, "integrity is required");
        this.certUrl = certUrl;
        this.certSha256 = certSha256;
        this.validityUrl = java.util.Objects.requireNonNull(validityUrl, "validityUrl is required");
        this.date = java.util.Objects.requireNonNull(date, "date is required");
        this.expires = java.util.Objects.requireNonNull(expires, "expires is required");
        this.certificates = certificates;
    }

    /**
     * Signed exchange signature label.
     */
    public java.lang.String getLabel() {
        return label;
    }

    /**
     * The hex string of signed exchange signature.
     */
    public java.lang.String getSignature() {
        return signature;
    }

    /**
     * Signed exchange signature integrity.
     */
    public java.lang.String getIntegrity() {
        return integrity;
    }

    /**
     * Signed exchange signature cert Url.
     */
    public java.lang.String getCertUrl() {
        return certUrl;
    }

    /**
     * The hex string of signed exchange signature cert sha256.
     */
    public java.lang.String getCertSha256() {
        return certSha256;
    }

    /**
     * Signed exchange signature validity Url.
     */
    public java.lang.String getValidityUrl() {
        return validityUrl;
    }

    /**
     * Signed exchange signature date.
     */
    public java.lang.Integer getDate() {
        return date;
    }

    /**
     * Signed exchange signature expires.
     */
    public java.lang.Integer getExpires() {
        return expires;
    }

    /**
     * The encoded certificates.
     */
    public java.util.List<java.lang.String> getCertificates() {
        return certificates;
    }

    private static SignedExchangeSignature fromJson(JsonInput input) {
        java.lang.String label = null;
        java.lang.String signature = null;
        java.lang.String integrity = null;
        java.lang.String certUrl = null;
        java.lang.String certSha256 = null;
        java.lang.String validityUrl = null;
        java.lang.Integer date = null;
        java.lang.Integer expires = null;
        java.util.List<java.lang.String> certificates = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "label":
                    label = input.nextString();
                    break;
                case "signature":
                    signature = input.nextString();
                    break;
                case "integrity":
                    integrity = input.nextString();
                    break;
                case "certUrl":
                    certUrl = input.nextString();
                    break;
                case "certSha256":
                    certSha256 = input.nextString();
                    break;
                case "validityUrl":
                    validityUrl = input.nextString();
                    break;
                case "date":
                    date = input.nextNumber().intValue();
                    break;
                case "expires":
                    expires = input.nextNumber().intValue();
                    break;
                case "certificates":
                    certificates = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SignedExchangeSignature(label, signature, integrity, certUrl, certSha256, validityUrl, date, expires, certificates);
    }
}
