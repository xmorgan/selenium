package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * An internal certificate ID value.
 */
public class CertificateId {

    private final java.lang.Integer certificateId;

    public CertificateId(java.lang.Integer certificateId) {
        this.certificateId = java.util.Objects.requireNonNull(certificateId, "Missing value for CertificateId");
    }

    private static CertificateId fromJson(JsonInput input) {
        return new CertificateId(input.nextNumber().intValue());
    }

    public String toJson() {
        return certificateId.toString();
    }

    public String toString() {
        return certificateId.toString();
    }
}
