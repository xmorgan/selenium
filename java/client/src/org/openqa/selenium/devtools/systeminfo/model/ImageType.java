package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Image format of a given image.
 */
public enum ImageType {

    JPEG("jpeg"), WEBP("webp"), UNKNOWN("unknown");

    private String value;

    ImageType(String value) {
        this.value = value;
    }

    public static ImageType fromString(String s) {
        return java.util.Arrays.stream(ImageType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ImageType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ImageType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
