package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about amount of glyphs that were rendered with given font.
 */
public class PlatformFontUsage {

    private final java.lang.String familyName;

    private final java.lang.Boolean isCustomFont;

    private final java.lang.Number glyphCount;

    public PlatformFontUsage(java.lang.String familyName, java.lang.Boolean isCustomFont, java.lang.Number glyphCount) {
        this.familyName = java.util.Objects.requireNonNull(familyName, "familyName is required");
        this.isCustomFont = java.util.Objects.requireNonNull(isCustomFont, "isCustomFont is required");
        this.glyphCount = java.util.Objects.requireNonNull(glyphCount, "glyphCount is required");
    }

    /**
     * Font's family name reported by platform.
     */
    public java.lang.String getFamilyName() {
        return familyName;
    }

    /**
     * Indicates if the font was downloaded or resolved locally.
     */
    public java.lang.Boolean getIsCustomFont() {
        return isCustomFont;
    }

    /**
     * Amount of glyphs that were rendered with this font.
     */
    public java.lang.Number getGlyphCount() {
        return glyphCount;
    }

    private static PlatformFontUsage fromJson(JsonInput input) {
        java.lang.String familyName = null;
        java.lang.Boolean isCustomFont = null;
        java.lang.Number glyphCount = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "familyName":
                    familyName = input.nextString();
                    break;
                case "isCustomFont":
                    isCustomFont = input.nextBoolean();
                    break;
                case "glyphCount":
                    glyphCount = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PlatformFontUsage(familyName, isCustomFont, glyphCount);
    }
}
