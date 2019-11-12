package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Rectangle.
 */
public class Rect {

    private final java.lang.Number x;

    private final java.lang.Number y;

    private final java.lang.Number width;

    private final java.lang.Number height;

    public Rect(java.lang.Number x, java.lang.Number y, java.lang.Number width, java.lang.Number height) {
        this.x = java.util.Objects.requireNonNull(x, "x is required");
        this.y = java.util.Objects.requireNonNull(y, "y is required");
        this.width = java.util.Objects.requireNonNull(width, "width is required");
        this.height = java.util.Objects.requireNonNull(height, "height is required");
    }

    /**
     * X coordinate
     */
    public java.lang.Number getX() {
        return x;
    }

    /**
     * Y coordinate
     */
    public java.lang.Number getY() {
        return y;
    }

    /**
     * Rectangle width
     */
    public java.lang.Number getWidth() {
        return width;
    }

    /**
     * Rectangle height
     */
    public java.lang.Number getHeight() {
        return height;
    }

    private static Rect fromJson(JsonInput input) {
        java.lang.Number x = null;
        java.lang.Number y = null;
        java.lang.Number width = null;
        java.lang.Number height = null;
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
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Rect(x, y, width, height);
    }
}
