package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Visual viewport position, dimensions, and scale.
 */
public class VisualViewport {

    private final java.lang.Number offsetX;

    private final java.lang.Number offsetY;

    private final java.lang.Number pageX;

    private final java.lang.Number pageY;

    private final java.lang.Number clientWidth;

    private final java.lang.Number clientHeight;

    private final java.lang.Number scale;

    private final java.lang.Number zoom;

    public VisualViewport(java.lang.Number offsetX, java.lang.Number offsetY, java.lang.Number pageX, java.lang.Number pageY, java.lang.Number clientWidth, java.lang.Number clientHeight, java.lang.Number scale, java.lang.Number zoom) {
        this.offsetX = java.util.Objects.requireNonNull(offsetX, "offsetX is required");
        this.offsetY = java.util.Objects.requireNonNull(offsetY, "offsetY is required");
        this.pageX = java.util.Objects.requireNonNull(pageX, "pageX is required");
        this.pageY = java.util.Objects.requireNonNull(pageY, "pageY is required");
        this.clientWidth = java.util.Objects.requireNonNull(clientWidth, "clientWidth is required");
        this.clientHeight = java.util.Objects.requireNonNull(clientHeight, "clientHeight is required");
        this.scale = java.util.Objects.requireNonNull(scale, "scale is required");
        this.zoom = zoom;
    }

    /**
     * Horizontal offset relative to the layout viewport (CSS pixels).
     */
    public java.lang.Number getOffsetX() {
        return offsetX;
    }

    /**
     * Vertical offset relative to the layout viewport (CSS pixels).
     */
    public java.lang.Number getOffsetY() {
        return offsetY;
    }

    /**
     * Horizontal offset relative to the document (CSS pixels).
     */
    public java.lang.Number getPageX() {
        return pageX;
    }

    /**
     * Vertical offset relative to the document (CSS pixels).
     */
    public java.lang.Number getPageY() {
        return pageY;
    }

    /**
     * Width (CSS pixels), excludes scrollbar if present.
     */
    public java.lang.Number getClientWidth() {
        return clientWidth;
    }

    /**
     * Height (CSS pixels), excludes scrollbar if present.
     */
    public java.lang.Number getClientHeight() {
        return clientHeight;
    }

    /**
     * Scale relative to the ideal viewport (size at width=device-width).
     */
    public java.lang.Number getScale() {
        return scale;
    }

    /**
     * Page zoom factor (CSS to device independent pixels ratio).
     */
    public java.lang.Number getZoom() {
        return zoom;
    }

    private static VisualViewport fromJson(JsonInput input) {
        java.lang.Number offsetX = null;
        java.lang.Number offsetY = null;
        java.lang.Number pageX = null;
        java.lang.Number pageY = null;
        java.lang.Number clientWidth = null;
        java.lang.Number clientHeight = null;
        java.lang.Number scale = null;
        java.lang.Number zoom = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "offsetX":
                    offsetX = input.nextNumber();
                    break;
                case "offsetY":
                    offsetY = input.nextNumber();
                    break;
                case "pageX":
                    pageX = input.nextNumber();
                    break;
                case "pageY":
                    pageY = input.nextNumber();
                    break;
                case "clientWidth":
                    clientWidth = input.nextNumber();
                    break;
                case "clientHeight":
                    clientHeight = input.nextNumber();
                    break;
                case "scale":
                    scale = input.nextNumber();
                    break;
                case "zoom":
                    zoom = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new VisualViewport(offsetX, offsetY, pageX, pageY, clientWidth, clientHeight, scale, zoom);
    }
}
