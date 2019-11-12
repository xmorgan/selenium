package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Browser window bounds information
 */
@org.openqa.selenium.Beta()
public class Bounds {

    private final java.lang.Integer left;

    private final java.lang.Integer top;

    private final java.lang.Integer width;

    private final java.lang.Integer height;

    private final org.openqa.selenium.devtools.browser.model.WindowState windowState;

    public Bounds(java.lang.Integer left, java.lang.Integer top, java.lang.Integer width, java.lang.Integer height, org.openqa.selenium.devtools.browser.model.WindowState windowState) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.windowState = windowState;
    }

    /**
     * The offset from the left edge of the screen to the window in pixels.
     */
    public java.lang.Integer getLeft() {
        return left;
    }

    /**
     * The offset from the top edge of the screen to the window in pixels.
     */
    public java.lang.Integer getTop() {
        return top;
    }

    /**
     * The window width in pixels.
     */
    public java.lang.Integer getWidth() {
        return width;
    }

    /**
     * The window height in pixels.
     */
    public java.lang.Integer getHeight() {
        return height;
    }

    /**
     * The window state. Default to normal.
     */
    public org.openqa.selenium.devtools.browser.model.WindowState getWindowState() {
        return windowState;
    }

    private static Bounds fromJson(JsonInput input) {
        java.lang.Integer left = null;
        java.lang.Integer top = null;
        java.lang.Integer width = null;
        java.lang.Integer height = null;
        org.openqa.selenium.devtools.browser.model.WindowState windowState = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "left":
                    left = input.nextNumber().intValue();
                    break;
                case "top":
                    top = input.nextNumber().intValue();
                    break;
                case "width":
                    width = input.nextNumber().intValue();
                    break;
                case "height":
                    height = input.nextNumber().intValue();
                    break;
                case "windowState":
                    windowState = input.read(org.openqa.selenium.devtools.browser.model.WindowState.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Bounds(left, top, width, height, windowState);
    }
}
