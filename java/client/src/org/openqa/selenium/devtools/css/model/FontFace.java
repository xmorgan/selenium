package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Properties of a web font: https://www.w3.org/TR/2008/REC-CSS2-20080411/fonts.html#font-descriptions
 */
public class FontFace {

    private final java.lang.String fontFamily;

    private final java.lang.String fontStyle;

    private final java.lang.String fontVariant;

    private final java.lang.String fontWeight;

    private final java.lang.String fontStretch;

    private final java.lang.String unicodeRange;

    private final java.lang.String src;

    private final java.lang.String platformFontFamily;

    public FontFace(java.lang.String fontFamily, java.lang.String fontStyle, java.lang.String fontVariant, java.lang.String fontWeight, java.lang.String fontStretch, java.lang.String unicodeRange, java.lang.String src, java.lang.String platformFontFamily) {
        this.fontFamily = java.util.Objects.requireNonNull(fontFamily, "fontFamily is required");
        this.fontStyle = java.util.Objects.requireNonNull(fontStyle, "fontStyle is required");
        this.fontVariant = java.util.Objects.requireNonNull(fontVariant, "fontVariant is required");
        this.fontWeight = java.util.Objects.requireNonNull(fontWeight, "fontWeight is required");
        this.fontStretch = java.util.Objects.requireNonNull(fontStretch, "fontStretch is required");
        this.unicodeRange = java.util.Objects.requireNonNull(unicodeRange, "unicodeRange is required");
        this.src = java.util.Objects.requireNonNull(src, "src is required");
        this.platformFontFamily = java.util.Objects.requireNonNull(platformFontFamily, "platformFontFamily is required");
    }

    /**
     * The font-family.
     */
    public java.lang.String getFontFamily() {
        return fontFamily;
    }

    /**
     * The font-style.
     */
    public java.lang.String getFontStyle() {
        return fontStyle;
    }

    /**
     * The font-variant.
     */
    public java.lang.String getFontVariant() {
        return fontVariant;
    }

    /**
     * The font-weight.
     */
    public java.lang.String getFontWeight() {
        return fontWeight;
    }

    /**
     * The font-stretch.
     */
    public java.lang.String getFontStretch() {
        return fontStretch;
    }

    /**
     * The unicode-range.
     */
    public java.lang.String getUnicodeRange() {
        return unicodeRange;
    }

    /**
     * The src.
     */
    public java.lang.String getSrc() {
        return src;
    }

    /**
     * The resolved platform font family
     */
    public java.lang.String getPlatformFontFamily() {
        return platformFontFamily;
    }

    private static FontFace fromJson(JsonInput input) {
        java.lang.String fontFamily = null;
        java.lang.String fontStyle = null;
        java.lang.String fontVariant = null;
        java.lang.String fontWeight = null;
        java.lang.String fontStretch = null;
        java.lang.String unicodeRange = null;
        java.lang.String src = null;
        java.lang.String platformFontFamily = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "fontFamily":
                    fontFamily = input.nextString();
                    break;
                case "fontStyle":
                    fontStyle = input.nextString();
                    break;
                case "fontVariant":
                    fontVariant = input.nextString();
                    break;
                case "fontWeight":
                    fontWeight = input.nextString();
                    break;
                case "fontStretch":
                    fontStretch = input.nextString();
                    break;
                case "unicodeRange":
                    unicodeRange = input.nextString();
                    break;
                case "src":
                    src = input.nextString();
                    break;
                case "platformFontFamily":
                    platformFontFamily = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FontFace(fontFamily, fontStyle, fontVariant, fontWeight, fontStretch, unicodeRange, src, platformFontFamily);
    }
}
