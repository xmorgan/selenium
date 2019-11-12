package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS keyframe rule representation.
 */
public class CSSKeyframeRule {

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin;

    private final org.openqa.selenium.devtools.css.model.Value keyText;

    private final org.openqa.selenium.devtools.css.model.CSSStyle style;

    public CSSKeyframeRule(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin, org.openqa.selenium.devtools.css.model.Value keyText, org.openqa.selenium.devtools.css.model.CSSStyle style) {
        this.styleSheetId = styleSheetId;
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.keyText = java.util.Objects.requireNonNull(keyText, "keyText is required");
        this.style = java.util.Objects.requireNonNull(style, "style is required");
    }

    /**
     * The css style sheet identifier (absent for user agent stylesheet and user-specified
     * stylesheet rules) this rule came from.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * Parent stylesheet's origin.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetOrigin getOrigin() {
        return origin;
    }

    /**
     * Associated key text.
     */
    public org.openqa.selenium.devtools.css.model.Value getKeyText() {
        return keyText;
    }

    /**
     * Associated style declaration.
     */
    public org.openqa.selenium.devtools.css.model.CSSStyle getStyle() {
        return style;
    }

    private static CSSKeyframeRule fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin = null;
        org.openqa.selenium.devtools.css.model.Value keyText = null;
        org.openqa.selenium.devtools.css.model.CSSStyle style = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "origin":
                    origin = input.read(org.openqa.selenium.devtools.css.model.StyleSheetOrigin.class);
                    break;
                case "keyText":
                    keyText = input.read(org.openqa.selenium.devtools.css.model.Value.class);
                    break;
                case "style":
                    style = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CSSKeyframeRule(styleSheetId, origin, keyText, style);
    }
}
