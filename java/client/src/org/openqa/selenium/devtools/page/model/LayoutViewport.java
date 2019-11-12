package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Layout viewport position and dimensions.
 */
public class LayoutViewport {

    private final java.lang.Integer pageX;

    private final java.lang.Integer pageY;

    private final java.lang.Integer clientWidth;

    private final java.lang.Integer clientHeight;

    public LayoutViewport(java.lang.Integer pageX, java.lang.Integer pageY, java.lang.Integer clientWidth, java.lang.Integer clientHeight) {
        this.pageX = java.util.Objects.requireNonNull(pageX, "pageX is required");
        this.pageY = java.util.Objects.requireNonNull(pageY, "pageY is required");
        this.clientWidth = java.util.Objects.requireNonNull(clientWidth, "clientWidth is required");
        this.clientHeight = java.util.Objects.requireNonNull(clientHeight, "clientHeight is required");
    }

    /**
     * Horizontal offset relative to the document (CSS pixels).
     */
    public java.lang.Integer getPageX() {
        return pageX;
    }

    /**
     * Vertical offset relative to the document (CSS pixels).
     */
    public java.lang.Integer getPageY() {
        return pageY;
    }

    /**
     * Width (CSS pixels), excludes scrollbar if present.
     */
    public java.lang.Integer getClientWidth() {
        return clientWidth;
    }

    /**
     * Height (CSS pixels), excludes scrollbar if present.
     */
    public java.lang.Integer getClientHeight() {
        return clientHeight;
    }

    private static LayoutViewport fromJson(JsonInput input) {
        java.lang.Integer pageX = null;
        java.lang.Integer pageY = null;
        java.lang.Integer clientWidth = null;
        java.lang.Integer clientHeight = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "pageX":
                    pageX = input.nextNumber().intValue();
                    break;
                case "pageY":
                    pageY = input.nextNumber().intValue();
                    break;
                case "clientWidth":
                    clientWidth = input.nextNumber().intValue();
                    break;
                case "clientHeight":
                    clientHeight = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LayoutViewport(pageX, pageY, clientWidth, clientHeight);
    }
}
