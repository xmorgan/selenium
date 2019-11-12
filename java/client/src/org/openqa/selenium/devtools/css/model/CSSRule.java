package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS rule representation.
 */
public class CSSRule {

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final org.openqa.selenium.devtools.css.model.SelectorList selectorList;

    private final org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin;

    private final org.openqa.selenium.devtools.css.model.CSSStyle style;

    private final java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia> media;

    public CSSRule(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.css.model.SelectorList selectorList, org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin, org.openqa.selenium.devtools.css.model.CSSStyle style, java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia> media) {
        this.styleSheetId = styleSheetId;
        this.selectorList = java.util.Objects.requireNonNull(selectorList, "selectorList is required");
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.style = java.util.Objects.requireNonNull(style, "style is required");
        this.media = media;
    }

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * Rule selector data.
     */
    public org.openqa.selenium.devtools.css.model.SelectorList getSelectorList() {
        return selectorList;
    }

    /**
     * Parent stylesheet's origin.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetOrigin getOrigin() {
        return origin;
    }

    /**
     * Associated style declaration.
     */
    public org.openqa.selenium.devtools.css.model.CSSStyle getStyle() {
        return style;
    }

    /**
     * Media list array (for rules involving media queries). The array enumerates media queries
     * starting with the innermost one, going outwards.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia> getMedia() {
        return media;
    }

    private static CSSRule fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        org.openqa.selenium.devtools.css.model.SelectorList selectorList = null;
        org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin = null;
        org.openqa.selenium.devtools.css.model.CSSStyle style = null;
        java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia> media = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "selectorList":
                    selectorList = input.read(org.openqa.selenium.devtools.css.model.SelectorList.class);
                    break;
                case "origin":
                    origin = input.read(org.openqa.selenium.devtools.css.model.StyleSheetOrigin.class);
                    break;
                case "style":
                    style = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                    break;
                case "media":
                    media = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CSSRule(styleSheetId, selectorList, origin, style, media);
    }
}
