package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Details of a signed certificate timestamp (SCT).
 */
public class SignedCertificateTimestamp {

    private final java.lang.String status;

    private final java.lang.String origin;

    private final java.lang.String logDescription;

    private final java.lang.String logId;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp;

    private final java.lang.String hashAlgorithm;

    private final java.lang.String signatureAlgorithm;

    private final java.lang.String signatureData;

    public SignedCertificateTimestamp(java.lang.String status, java.lang.String origin, java.lang.String logDescription, java.lang.String logId, org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp, java.lang.String hashAlgorithm, java.lang.String signatureAlgorithm, java.lang.String signatureData) {
        this.status = java.util.Objects.requireNonNull(status, "status is required");
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.logDescription = java.util.Objects.requireNonNull(logDescription, "logDescription is required");
        this.logId = java.util.Objects.requireNonNull(logId, "logId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.hashAlgorithm = java.util.Objects.requireNonNull(hashAlgorithm, "hashAlgorithm is required");
        this.signatureAlgorithm = java.util.Objects.requireNonNull(signatureAlgorithm, "signatureAlgorithm is required");
        this.signatureData = java.util.Objects.requireNonNull(signatureData, "signatureData is required");
    }

    /**
     * Validation status.
     */
    public java.lang.String getStatus() {
        return status;
    }

    /**
     * Origin.
     */
    public java.lang.String getOrigin() {
        return origin;
    }

    /**
     * Log name / description.
     */
    public java.lang.String getLogDescription() {
        return logDescription;
    }

    /**
     * Log ID.
     */
    public java.lang.String getLogId() {
        return logId;
    }

    /**
     * Issuance date.
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getTimestamp() {
        return timestamp;
    }

    /**
     * Hash algorithm.
     */
    public java.lang.String getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Signature algorithm.
     */
    public java.lang.String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Signature data.
     */
    public java.lang.String getSignatureData() {
        return signatureData;
    }

    private static SignedCertificateTimestamp fromJson(JsonInput input) {
        java.lang.String status = null;
        java.lang.String origin = null;
        java.lang.String logDescription = null;
        java.lang.String logId = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp = null;
        java.lang.String hashAlgorithm = null;
        java.lang.String signatureAlgorithm = null;
        java.lang.String signatureData = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "status":
                    status = input.nextString();
                    break;
                case "origin":
                    origin = input.nextString();
                    break;
                case "logDescription":
                    logDescription = input.nextString();
                    break;
                case "logId":
                    logId = input.nextString();
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "hashAlgorithm":
                    hashAlgorithm = input.nextString();
                    break;
                case "signatureAlgorithm":
                    signatureAlgorithm = input.nextString();
                    break;
                case "signatureData":
                    signatureData = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SignedCertificateTimestamp(status, origin, logDescription, logId, timestamp, hashAlgorithm, signatureAlgorithm, signatureData);
    }
}
