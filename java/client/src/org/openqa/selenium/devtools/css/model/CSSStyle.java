package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS style representation.
 */
public class CSSStyle {

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final java.util.List<org.openqa.selenium.devtools.css.model.CSSProperty> cssProperties;

    private final java.util.List<org.openqa.selenium.devtools.css.model.ShorthandEntry> shorthandEntries;

    private final java.lang.String cssText;

    private final org.openqa.selenium.devtools.css.model.SourceRange range;

    public CSSStyle(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, java.util.List<org.openqa.selenium.devtools.css.model.CSSProperty> cssProperties, java.util.List<org.openqa.selenium.devtools.css.model.ShorthandEntry> shorthandEntries, java.lang.String cssText, org.openqa.selenium.devtools.css.model.SourceRange range) {
        this.styleSheetId = styleSheetId;
        this.cssProperties = java.util.Objects.requireNonNull(cssProperties, "cssProperties is required");
        this.shorthandEntries = java.util.Objects.requireNonNull(shorthandEntries, "shorthandEntries is required");
        this.cssText = cssText;
        this.range = range;
    }

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * CSS properties in the style.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.CSSProperty> getCssProperties() {
        return cssProperties;
    }

    /**
     * Computed values for all shorthands found in the style.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.ShorthandEntry> getShorthandEntries() {
        return shorthandEntries;
    }

    /**
     * Style declaration text (if available).
     */
    public java.lang.String getCssText() {
        return cssText;
    }

    /**
     * Style declaration range in the enclosing stylesheet (if available).
     */
    public org.openqa.selenium.devtools.css.model.SourceRange getRange() {
        return range;
    }

    private static CSSStyle fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        java.util.List<org.openqa.selenium.devtools.css.model.CSSProperty> cssProperties = null;
        java.util.List<org.openqa.selenium.devtools.css.model.ShorthandEntry> shorthandEntries = null;
        java.lang.String cssText = null;
        org.openqa.selenium.devtools.css.model.SourceRange range = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "cssProperties":
                    cssProperties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSProperty>>() {
                    }.getType());
                    break;
                case "shorthandEntries":
                    shorthandEntries = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.ShorthandEntry>>() {
                    }.getType());
                    break;
                case "cssText":
                    cssText = input.nextString();
                    break;
                case "range":
                    range = input.read(org.openqa.selenium.devtools.css.model.SourceRange.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CSSStyle(styleSheetId, cssProperties, shorthandEntries, cssText, range);
    }
}
