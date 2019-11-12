package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS coverage information.
 */
public class RuleUsage {

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final java.lang.Number startOffset;

    private final java.lang.Number endOffset;

    private final java.lang.Boolean used;

    public RuleUsage(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, java.lang.Number startOffset, java.lang.Number endOffset, java.lang.Boolean used) {
        this.styleSheetId = java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        this.startOffset = java.util.Objects.requireNonNull(startOffset, "startOffset is required");
        this.endOffset = java.util.Objects.requireNonNull(endOffset, "endOffset is required");
        this.used = java.util.Objects.requireNonNull(used, "used is required");
    }

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * Offset of the start of the rule (including selector) from the beginning of the stylesheet.
     */
    public java.lang.Number getStartOffset() {
        return startOffset;
    }

    /**
     * Offset of the end of the rule body from the beginning of the stylesheet.
     */
    public java.lang.Number getEndOffset() {
        return endOffset;
    }

    /**
     * Indicates whether the rule was actually used by some element in the page.
     */
    public java.lang.Boolean getUsed() {
        return used;
    }

    private static RuleUsage fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        java.lang.Number startOffset = null;
        java.lang.Number endOffset = null;
        java.lang.Boolean used = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "startOffset":
                    startOffset = input.nextNumber();
                    break;
                case "endOffset":
                    endOffset = input.nextNumber();
                    break;
                case "used":
                    used = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RuleUsage(styleSheetId, startOffset, endOffset, used);
    }
}
