package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Describes the width and height dimensions of an entity.
 */
public class Size {

    private final java.lang.Integer width;

    private final java.lang.Integer height;

    public Size(java.lang.Integer width, java.lang.Integer height) {
        this.width = java.util.Objects.requireNonNull(width, "width is required");
        this.height = java.util.Objects.requireNonNull(height, "height is required");
    }

    /**
     * Width in pixels.
     */
    public java.lang.Integer getWidth() {
        return width;
    }

    /**
     * Height in pixels.
     */
    public java.lang.Integer getHeight() {
        return height;
    }

    private static Size fromJson(JsonInput input) {
        java.lang.Integer width = null;
        java.lang.Integer height = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "width":
                    width = input.nextNumber().intValue();
                    break;
                case "height":
                    height = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Size(width, height);
    }
}
