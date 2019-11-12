package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about insecure content on the page.
 */
@java.lang.Deprecated()
public class InsecureContentStatus {

    private final java.lang.Boolean ranMixedContent;

    private final java.lang.Boolean displayedMixedContent;

    private final java.lang.Boolean containedMixedForm;

    private final java.lang.Boolean ranContentWithCertErrors;

    private final java.lang.Boolean displayedContentWithCertErrors;

    private final org.openqa.selenium.devtools.security.model.SecurityState ranInsecureContentStyle;

    private final org.openqa.selenium.devtools.security.model.SecurityState displayedInsecureContentStyle;

    public InsecureContentStatus(java.lang.Boolean ranMixedContent, java.lang.Boolean displayedMixedContent, java.lang.Boolean containedMixedForm, java.lang.Boolean ranContentWithCertErrors, java.lang.Boolean displayedContentWithCertErrors, org.openqa.selenium.devtools.security.model.SecurityState ranInsecureContentStyle, org.openqa.selenium.devtools.security.model.SecurityState displayedInsecureContentStyle) {
        this.ranMixedContent = java.util.Objects.requireNonNull(ranMixedContent, "ranMixedContent is required");
        this.displayedMixedContent = java.util.Objects.requireNonNull(displayedMixedContent, "displayedMixedContent is required");
        this.containedMixedForm = java.util.Objects.requireNonNull(containedMixedForm, "containedMixedForm is required");
        this.ranContentWithCertErrors = java.util.Objects.requireNonNull(ranContentWithCertErrors, "ranContentWithCertErrors is required");
        this.displayedContentWithCertErrors = java.util.Objects.requireNonNull(displayedContentWithCertErrors, "displayedContentWithCertErrors is required");
        this.ranInsecureContentStyle = java.util.Objects.requireNonNull(ranInsecureContentStyle, "ranInsecureContentStyle is required");
        this.displayedInsecureContentStyle = java.util.Objects.requireNonNull(displayedInsecureContentStyle, "displayedInsecureContentStyle is required");
    }

    /**
     * Always false.
     */
    public java.lang.Boolean getRanMixedContent() {
        return ranMixedContent;
    }

    /**
     * Always false.
     */
    public java.lang.Boolean getDisplayedMixedContent() {
        return displayedMixedContent;
    }

    /**
     * Always false.
     */
    public java.lang.Boolean getContainedMixedForm() {
        return containedMixedForm;
    }

    /**
     * Always false.
     */
    public java.lang.Boolean getRanContentWithCertErrors() {
        return ranContentWithCertErrors;
    }

    /**
     * Always false.
     */
    public java.lang.Boolean getDisplayedContentWithCertErrors() {
        return displayedContentWithCertErrors;
    }

    /**
     * Always set to unknown.
     */
    public org.openqa.selenium.devtools.security.model.SecurityState getRanInsecureContentStyle() {
        return ranInsecureContentStyle;
    }

    /**
     * Always set to unknown.
     */
    public org.openqa.selenium.devtools.security.model.SecurityState getDisplayedInsecureContentStyle() {
        return displayedInsecureContentStyle;
    }

    private static InsecureContentStatus fromJson(JsonInput input) {
        java.lang.Boolean ranMixedContent = null;
        java.lang.Boolean displayedMixedContent = null;
        java.lang.Boolean containedMixedForm = null;
        java.lang.Boolean ranContentWithCertErrors = null;
        java.lang.Boolean displayedContentWithCertErrors = null;
        org.openqa.selenium.devtools.security.model.SecurityState ranInsecureContentStyle = null;
        org.openqa.selenium.devtools.security.model.SecurityState displayedInsecureContentStyle = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "ranMixedContent":
                    ranMixedContent = input.nextBoolean();
                    break;
                case "displayedMixedContent":
                    displayedMixedContent = input.nextBoolean();
                    break;
                case "containedMixedForm":
                    containedMixedForm = input.nextBoolean();
                    break;
                case "ranContentWithCertErrors":
                    ranContentWithCertErrors = input.nextBoolean();
                    break;
                case "displayedContentWithCertErrors":
                    displayedContentWithCertErrors = input.nextBoolean();
                    break;
                case "ranInsecureContentStyle":
                    ranInsecureContentStyle = input.read(org.openqa.selenium.devtools.security.model.SecurityState.class);
                    break;
                case "displayedInsecureContentStyle":
                    displayedInsecureContentStyle = input.read(org.openqa.selenium.devtools.security.model.SecurityState.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new InsecureContentStatus(ranMixedContent, displayedMixedContent, containedMixedForm, ranContentWithCertErrors, displayedContentWithCertErrors, ranInsecureContentStyle, displayedInsecureContentStyle);
    }
}
