package org.openqa.selenium.devtools.overlay.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Configuration data for the highlighting of page elements.
 */
public class HighlightConfig {

    private final java.lang.Boolean showInfo;

    private final java.lang.Boolean showStyles;

    private final java.lang.Boolean showRulers;

    private final java.lang.Boolean showExtensionLines;

    private final org.openqa.selenium.devtools.dom.model.RGBA contentColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA paddingColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA borderColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA marginColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA eventTargetColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA shapeColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA shapeMarginColor;

    private final org.openqa.selenium.devtools.dom.model.RGBA cssGridColor;

    public HighlightConfig(java.lang.Boolean showInfo, java.lang.Boolean showStyles, java.lang.Boolean showRulers, java.lang.Boolean showExtensionLines, org.openqa.selenium.devtools.dom.model.RGBA contentColor, org.openqa.selenium.devtools.dom.model.RGBA paddingColor, org.openqa.selenium.devtools.dom.model.RGBA borderColor, org.openqa.selenium.devtools.dom.model.RGBA marginColor, org.openqa.selenium.devtools.dom.model.RGBA eventTargetColor, org.openqa.selenium.devtools.dom.model.RGBA shapeColor, org.openqa.selenium.devtools.dom.model.RGBA shapeMarginColor, org.openqa.selenium.devtools.dom.model.RGBA cssGridColor) {
        this.showInfo = showInfo;
        this.showStyles = showStyles;
        this.showRulers = showRulers;
        this.showExtensionLines = showExtensionLines;
        this.contentColor = contentColor;
        this.paddingColor = paddingColor;
        this.borderColor = borderColor;
        this.marginColor = marginColor;
        this.eventTargetColor = eventTargetColor;
        this.shapeColor = shapeColor;
        this.shapeMarginColor = shapeMarginColor;
        this.cssGridColor = cssGridColor;
    }

    /**
     * Whether the node info tooltip should be shown (default: false).
     */
    public java.lang.Boolean getShowInfo() {
        return showInfo;
    }

    /**
     * Whether the node styles in the tooltip (default: false).
     */
    public java.lang.Boolean getShowStyles() {
        return showStyles;
    }

    /**
     * Whether the rulers should be shown (default: false).
     */
    public java.lang.Boolean getShowRulers() {
        return showRulers;
    }

    /**
     * Whether the extension lines from node to the rulers should be shown (default: false).
     */
    public java.lang.Boolean getShowExtensionLines() {
        return showExtensionLines;
    }

    /**
     * The content box highlight fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getContentColor() {
        return contentColor;
    }

    /**
     * The padding highlight fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getPaddingColor() {
        return paddingColor;
    }

    /**
     * The border highlight fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getBorderColor() {
        return borderColor;
    }

    /**
     * The margin highlight fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getMarginColor() {
        return marginColor;
    }

    /**
     * The event target element highlight fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getEventTargetColor() {
        return eventTargetColor;
    }

    /**
     * The shape outside fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getShapeColor() {
        return shapeColor;
    }

    /**
     * The shape margin fill color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getShapeMarginColor() {
        return shapeMarginColor;
    }

    /**
     * The grid layout color (default: transparent).
     */
    public org.openqa.selenium.devtools.dom.model.RGBA getCssGridColor() {
        return cssGridColor;
    }

    private static HighlightConfig fromJson(JsonInput input) {
        java.lang.Boolean showInfo = null;
        java.lang.Boolean showStyles = null;
        java.lang.Boolean showRulers = null;
        java.lang.Boolean showExtensionLines = null;
        org.openqa.selenium.devtools.dom.model.RGBA contentColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA paddingColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA borderColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA marginColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA eventTargetColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA shapeColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA shapeMarginColor = null;
        org.openqa.selenium.devtools.dom.model.RGBA cssGridColor = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "showInfo":
                    showInfo = input.nextBoolean();
                    break;
                case "showStyles":
                    showStyles = input.nextBoolean();
                    break;
                case "showRulers":
                    showRulers = input.nextBoolean();
                    break;
                case "showExtensionLines":
                    showExtensionLines = input.nextBoolean();
                    break;
                case "contentColor":
                    contentColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "paddingColor":
                    paddingColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "borderColor":
                    borderColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "marginColor":
                    marginColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "eventTargetColor":
                    eventTargetColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "shapeColor":
                    shapeColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "shapeMarginColor":
                    shapeMarginColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                case "cssGridColor":
                    cssGridColor = input.read(org.openqa.selenium.devtools.dom.model.RGBA.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new HighlightConfig(showInfo, showStyles, showRulers, showExtensionLines, contentColor, paddingColor, borderColor, marginColor, eventTargetColor, shapeColor, shapeMarginColor, cssGridColor);
    }
}
