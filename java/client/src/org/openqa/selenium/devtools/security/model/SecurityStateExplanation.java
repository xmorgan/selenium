package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * An explanation of an factor contributing to the security state.
 */
public class SecurityStateExplanation {

    private final org.openqa.selenium.devtools.security.model.SecurityState securityState;

    private final java.lang.String title;

    private final java.lang.String summary;

    private final java.lang.String description;

    private final org.openqa.selenium.devtools.security.model.MixedContentType mixedContentType;

    private final java.util.List<java.lang.String> certificate;

    private final java.util.List<java.lang.String> recommendations;

    public SecurityStateExplanation(org.openqa.selenium.devtools.security.model.SecurityState securityState, java.lang.String title, java.lang.String summary, java.lang.String description, org.openqa.selenium.devtools.security.model.MixedContentType mixedContentType, java.util.List<java.lang.String> certificate, java.util.List<java.lang.String> recommendations) {
        this.securityState = java.util.Objects.requireNonNull(securityState, "securityState is required");
        this.title = java.util.Objects.requireNonNull(title, "title is required");
        this.summary = java.util.Objects.requireNonNull(summary, "summary is required");
        this.description = java.util.Objects.requireNonNull(description, "description is required");
        this.mixedContentType = java.util.Objects.requireNonNull(mixedContentType, "mixedContentType is required");
        this.certificate = java.util.Objects.requireNonNull(certificate, "certificate is required");
        this.recommendations = recommendations;
    }

    /**
     * Security state representing the severity of the factor being explained.
     */
    public org.openqa.selenium.devtools.security.model.SecurityState getSecurityState() {
        return securityState;
    }

    /**
     * Title describing the type of factor.
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Short phrase describing the type of factor.
     */
    public java.lang.String getSummary() {
        return summary;
    }

    /**
     * Full text explanation of the factor.
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * The type of mixed content described by the explanation.
     */
    public org.openqa.selenium.devtools.security.model.MixedContentType getMixedContentType() {
        return mixedContentType;
    }

    /**
     * Page certificate.
     */
    public java.util.List<java.lang.String> getCertificate() {
        return certificate;
    }

    /**
     * Recommendations to fix any issues.
     */
    public java.util.List<java.lang.String> getRecommendations() {
        return recommendations;
    }

    private static SecurityStateExplanation fromJson(JsonInput input) {
        org.openqa.selenium.devtools.security.model.SecurityState securityState = null;
        java.lang.String title = null;
        java.lang.String summary = null;
        java.lang.String description = null;
        org.openqa.selenium.devtools.security.model.MixedContentType mixedContentType = null;
        java.util.List<java.lang.String> certificate = null;
        java.util.List<java.lang.String> recommendations = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "securityState":
                    securityState = input.read(org.openqa.selenium.devtools.security.model.SecurityState.class);
                    break;
                case "title":
                    title = input.nextString();
                    break;
                case "summary":
                    summary = input.nextString();
                    break;
                case "description":
                    description = input.nextString();
                    break;
                case "mixedContentType":
                    mixedContentType = input.read(org.openqa.selenium.devtools.security.model.MixedContentType.class);
                    break;
                case "certificate":
                    certificate = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "recommendations":
                    recommendations = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SecurityStateExplanation(securityState, title, summary, description, mixedContentType, certificate, recommendations);
    }
}
