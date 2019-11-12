package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Viewport for capturing screenshot.
 */
public class Viewport {

    private final java.lang.Number x;

    private final java.lang.Number y;

    private final java.lang.Number width;

    private final java.lang.Number height;

    private final java.lang.Number scale;

    public Viewport(java.lang.Number x, java.lang.Number y, java.lang.Number width, java.lang.Number height, java.lang.Number scale) {
        this.x = java.util.Objects.requireNonNull(x, "x is required");
        this.y = java.util.Objects.requireNonNull(y, "y is required");
        this.width = java.util.Objects.requireNonNull(width, "width is required");
        this.height = java.util.Objects.requireNonNull(height, "height is required");
        this.scale = java.util.Objects.requireNonNull(scale, "scale is required");
    }

    /**
     * X offset in device independent pixels (dip).
     */
    public java.lang.Number getX() {
        return x;
    }

    /**
     * Y offset in device independent pixels (dip).
     */
    public java.lang.Number getY() {
        return y;
    }

    /**
     * Rectangle width in device independent pixels (dip).
     */
    public java.lang.Number getWidth() {
        return width;
    }

    /**
     * Rectangle height in device independent pixels (dip).
     */
    public java.lang.Number getHeight() {
        return height;
    }

    /**
     * Page scale factor.
     */
    public java.lang.Number getScale() {
        return scale;
    }

    private static Viewport fromJson(JsonInput input) {
        java.lang.Number x = null;
        java.lang.Number y = null;
        java.lang.Number width = null;
        java.lang.Number height = null;
        java.lang.Number scale = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "x":
                    x = input.nextNumber();
                    break;
                case "y":
                    y = input.nextNumber();
                    break;
                case "width":
                    width = input.nextNumber();
                    break;
                case "height":
                    height = input.nextNumber();
                    break;
                case "scale":
                    scale = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Viewport(x, y, width, height, scale);
    }
}
