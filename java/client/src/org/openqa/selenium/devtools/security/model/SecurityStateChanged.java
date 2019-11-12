package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The security state of the page changed.
 */
public class SecurityStateChanged {

    private final org.openqa.selenium.devtools.security.model.SecurityState securityState;

    private final java.lang.Boolean schemeIsCryptographic;

    private final java.util.List<org.openqa.selenium.devtools.security.model.SecurityStateExplanation> explanations;

    private final org.openqa.selenium.devtools.security.model.InsecureContentStatus insecureContentStatus;

    private final java.lang.String summary;

    public SecurityStateChanged(org.openqa.selenium.devtools.security.model.SecurityState securityState, java.lang.Boolean schemeIsCryptographic, java.util.List<org.openqa.selenium.devtools.security.model.SecurityStateExplanation> explanations, org.openqa.selenium.devtools.security.model.InsecureContentStatus insecureContentStatus, java.lang.String summary) {
        this.securityState = java.util.Objects.requireNonNull(securityState, "securityState is required");
        this.schemeIsCryptographic = java.util.Objects.requireNonNull(schemeIsCryptographic, "schemeIsCryptographic is required");
        this.explanations = java.util.Objects.requireNonNull(explanations, "explanations is required");
        this.insecureContentStatus = java.util.Objects.requireNonNull(insecureContentStatus, "insecureContentStatus is required");
        this.summary = summary;
    }

    /**
     * Security state.
     */
    public org.openqa.selenium.devtools.security.model.SecurityState getSecurityState() {
        return securityState;
    }

    /**
     * True if the page was loaded over cryptographic transport such as HTTPS.
     */
    @Deprecated()
    public java.lang.Boolean getSchemeIsCryptographic() {
        return schemeIsCryptographic;
    }

    /**
     * List of explanations for the security state. If the overall security state is `insecure` or
     * `warning`, at least one corresponding explanation should be included.
     */
    public java.util.List<org.openqa.selenium.devtools.security.model.SecurityStateExplanation> getExplanations() {
        return explanations;
    }

    /**
     * Information about insecure content on the page.
     */
    @Deprecated()
    public org.openqa.selenium.devtools.security.model.InsecureContentStatus getInsecureContentStatus() {
        return insecureContentStatus;
    }

    /**
     * Overrides user-visible description of the state.
     */
    public java.lang.String getSummary() {
        return summary;
    }

    private static SecurityStateChanged fromJson(JsonInput input) {
        org.openqa.selenium.devtools.security.model.SecurityState securityState = null;
        java.lang.Boolean schemeIsCryptographic = null;
        java.util.List<org.openqa.selenium.devtools.security.model.SecurityStateExplanation> explanations = null;
        org.openqa.selenium.devtools.security.model.InsecureContentStatus insecureContentStatus = null;
        java.lang.String summary = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "securityState":
                    securityState = input.read(org.openqa.selenium.devtools.security.model.SecurityState.class);
                    break;
                case "schemeIsCryptographic":
                    schemeIsCryptographic = input.nextBoolean();
                    break;
                case "explanations":
                    explanations = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.security.model.SecurityStateExplanation>>() {
                    }.getType());
                    break;
                case "insecureContentStatus":
                    insecureContentStatus = input.read(org.openqa.selenium.devtools.security.model.InsecureContentStatus.class);
                    break;
                case "summary":
                    summary = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SecurityStateChanged(securityState, schemeIsCryptographic, explanations, insecureContentStatus, summary);
    }
}
