package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Security details about a request.
 */
public class SecurityDetails {

    private final java.lang.String protocol;

    private final java.lang.String keyExchange;

    private final java.lang.String keyExchangeGroup;

    private final java.lang.String cipher;

    private final java.lang.String mac;

    private final org.openqa.selenium.devtools.security.model.CertificateId certificateId;

    private final java.lang.String subjectName;

    private final java.util.List<java.lang.String> sanList;

    private final java.lang.String issuer;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch validFrom;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch validTo;

    private final java.util.List<org.openqa.selenium.devtools.network.model.SignedCertificateTimestamp> signedCertificateTimestampList;

    private final org.openqa.selenium.devtools.network.model.CertificateTransparencyCompliance certificateTransparencyCompliance;

    public SecurityDetails(java.lang.String protocol, java.lang.String keyExchange, java.lang.String keyExchangeGroup, java.lang.String cipher, java.lang.String mac, org.openqa.selenium.devtools.security.model.CertificateId certificateId, java.lang.String subjectName, java.util.List<java.lang.String> sanList, java.lang.String issuer, org.openqa.selenium.devtools.network.model.TimeSinceEpoch validFrom, org.openqa.selenium.devtools.network.model.TimeSinceEpoch validTo, java.util.List<org.openqa.selenium.devtools.network.model.SignedCertificateTimestamp> signedCertificateTimestampList, org.openqa.selenium.devtools.network.model.CertificateTransparencyCompliance certificateTransparencyCompliance) {
        this.protocol = java.util.Objects.requireNonNull(protocol, "protocol is required");
        this.keyExchange = java.util.Objects.requireNonNull(keyExchange, "keyExchange is required");
        this.keyExchangeGroup = keyExchangeGroup;
        this.cipher = java.util.Objects.requireNonNull(cipher, "cipher is required");
        this.mac = mac;
        this.certificateId = java.util.Objects.requireNonNull(certificateId, "certificateId is required");
        this.subjectName = java.util.Objects.requireNonNull(subjectName, "subjectName is required");
        this.sanList = java.util.Objects.requireNonNull(sanList, "sanList is required");
        this.issuer = java.util.Objects.requireNonNull(issuer, "issuer is required");
        this.validFrom = java.util.Objects.requireNonNull(validFrom, "validFrom is required");
        this.validTo = java.util.Objects.requireNonNull(validTo, "validTo is required");
        this.signedCertificateTimestampList = java.util.Objects.requireNonNull(signedCertificateTimestampList, "signedCertificateTimestampList is required");
        this.certificateTransparencyCompliance = java.util.Objects.requireNonNull(certificateTransparencyCompliance, "certificateTransparencyCompliance is required");
    }

    /**
     * Protocol name (e.g. "TLS 1.2" or "QUIC").
     */
    public java.lang.String getProtocol() {
        return protocol;
    }

    /**
     * Key Exchange used by the connection, or the empty string if not applicable.
     */
    public java.lang.String getKeyExchange() {
        return keyExchange;
    }

    /**
     * (EC)DH group used by the connection, if applicable.
     */
    public java.lang.String getKeyExchangeGroup() {
        return keyExchangeGroup;
    }

    /**
     * Cipher name.
     */
    public java.lang.String getCipher() {
        return cipher;
    }

    /**
     * TLS MAC. Note that AEAD ciphers do not have separate MACs.
     */
    public java.lang.String getMac() {
        return mac;
    }

    /**
     * Certificate ID value.
     */
    public org.openqa.selenium.devtools.security.model.CertificateId getCertificateId() {
        return certificateId;
    }

    /**
     * Certificate subject name.
     */
    public java.lang.String getSubjectName() {
        return subjectName;
    }

    /**
     * Subject Alternative Name (SAN) DNS names and IP addresses.
     */
    public java.util.List<java.lang.String> getSanList() {
        return sanList;
    }

    /**
     * Name of the issuing CA.
     */
    public java.lang.String getIssuer() {
        return issuer;
    }

    /**
     * Certificate valid from date.
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getValidFrom() {
        return validFrom;
    }

    /**
     * Certificate valid to (expiration) date
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getValidTo() {
        return validTo;
    }

    /**
     * List of signed certificate timestamps (SCTs).
     */
    public java.util.List<org.openqa.selenium.devtools.network.model.SignedCertificateTimestamp> getSignedCertificateTimestampList() {
        return signedCertificateTimestampList;
    }

    /**
     * Whether the request complied with Certificate Transparency policy
     */
    public org.openqa.selenium.devtools.network.model.CertificateTransparencyCompliance getCertificateTransparencyCompliance() {
        return certificateTransparencyCompliance;
    }

    private static SecurityDetails fromJson(JsonInput input) {
        java.lang.String protocol = null;
        java.lang.String keyExchange = null;
        java.lang.String keyExchangeGroup = null;
        java.lang.String cipher = null;
        java.lang.String mac = null;
        org.openqa.selenium.devtools.security.model.CertificateId certificateId = null;
        java.lang.String subjectName = null;
        java.util.List<java.lang.String> sanList = null;
        java.lang.String issuer = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch validFrom = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch validTo = null;
        java.util.List<org.openqa.selenium.devtools.network.model.SignedCertificateTimestamp> signedCertificateTimestampList = null;
        org.openqa.selenium.devtools.network.model.CertificateTransparencyCompliance certificateTransparencyCompliance = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "protocol":
                    protocol = input.nextString();
                    break;
                case "keyExchange":
                    keyExchange = input.nextString();
                    break;
                case "keyExchangeGroup":
                    keyExchangeGroup = input.nextString();
                    break;
                case "cipher":
                    cipher = input.nextString();
                    break;
                case "mac":
                    mac = input.nextString();
                    break;
                case "certificateId":
                    certificateId = input.read(org.openqa.selenium.devtools.security.model.CertificateId.class);
                    break;
                case "subjectName":
                    subjectName = input.nextString();
                    break;
                case "sanList":
                    sanList = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "issuer":
                    issuer = input.nextString();
                    break;
                case "validFrom":
                    validFrom = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "validTo":
                    validTo = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "signedCertificateTimestampList":
                    signedCertificateTimestampList = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.SignedCertificateTimestamp>>() {
                    }.getType());
                    break;
                case "certificateTransparencyCompliance":
                    certificateTransparencyCompliance = input.read(org.openqa.selenium.devtools.network.model.CertificateTransparencyCompliance.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SecurityDetails(protocol, keyExchange, keyExchangeGroup, cipher, mac, certificateId, subjectName, sanList, issuer, validFrom, validTo, signedCertificateTimestampList, certificateTransparencyCompliance);
    }
}
