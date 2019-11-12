package org.openqa.selenium.devtools.headlessexperimental.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Encoding options for a screenshot.
 */
public class ScreenshotParams {

    public enum Format {

        JPEG("jpeg"), PNG("png");

        private String value;

        Format(String value) {
            this.value = value;
        }

        public static Format fromString(String s) {
            return java.util.Arrays.stream(Format.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Format "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Format fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final Format format;

    private final java.lang.Integer quality;

    public ScreenshotParams(Format format, java.lang.Integer quality) {
        this.format = format;
        this.quality = quality;
    }

    /**
     * Image compression format (defaults to png).
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Compression quality from range [0..100] (jpeg only).
     */
    public java.lang.Integer getQuality() {
        return quality;
    }

    private static ScreenshotParams fromJson(JsonInput input) {
        Format format = null;
        java.lang.Integer quality = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "format":
                    format = Format.fromString(input.nextString());
                    break;
                case "quality":
                    quality = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScreenshotParams(format, quality);
    }
}
