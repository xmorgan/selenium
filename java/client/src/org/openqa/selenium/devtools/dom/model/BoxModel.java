package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Box model.
 */
public class BoxModel {

    private final org.openqa.selenium.devtools.dom.model.Quad content;

    private final org.openqa.selenium.devtools.dom.model.Quad padding;

    private final org.openqa.selenium.devtools.dom.model.Quad border;

    private final org.openqa.selenium.devtools.dom.model.Quad margin;

    private final java.lang.Integer width;

    private final java.lang.Integer height;

    private final org.openqa.selenium.devtools.dom.model.ShapeOutsideInfo shapeOutside;

    public BoxModel(org.openqa.selenium.devtools.dom.model.Quad content, org.openqa.selenium.devtools.dom.model.Quad padding, org.openqa.selenium.devtools.dom.model.Quad border, org.openqa.selenium.devtools.dom.model.Quad margin, java.lang.Integer width, java.lang.Integer height, org.openqa.selenium.devtools.dom.model.ShapeOutsideInfo shapeOutside) {
        this.content = java.util.Objects.requireNonNull(content, "content is required");
        this.padding = java.util.Objects.requireNonNull(padding, "padding is required");
        this.border = java.util.Objects.requireNonNull(border, "border is required");
        this.margin = java.util.Objects.requireNonNull(margin, "margin is required");
        this.width = java.util.Objects.requireNonNull(width, "width is required");
        this.height = java.util.Objects.requireNonNull(height, "height is required");
        this.shapeOutside = shapeOutside;
    }

    /**
     * Content box
     */
    public org.openqa.selenium.devtools.dom.model.Quad getContent() {
        return content;
    }

    /**
     * Padding box
     */
    public org.openqa.selenium.devtools.dom.model.Quad getPadding() {
        return padding;
    }

    /**
     * Border box
     */
    public org.openqa.selenium.devtools.dom.model.Quad getBorder() {
        return border;
    }

    /**
     * Margin box
     */
    public org.openqa.selenium.devtools.dom.model.Quad getMargin() {
        return margin;
    }

    /**
     * Node width
     */
    public java.lang.Integer getWidth() {
        return width;
    }

    /**
     * Node height
     */
    public java.lang.Integer getHeight() {
        return height;
    }

    /**
     * Shape outside coordinates
     */
    public org.openqa.selenium.devtools.dom.model.ShapeOutsideInfo getShapeOutside() {
        return shapeOutside;
    }

    private static BoxModel fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.Quad content = null;
        org.openqa.selenium.devtools.dom.model.Quad padding = null;
        org.openqa.selenium.devtools.dom.model.Quad border = null;
        org.openqa.selenium.devtools.dom.model.Quad margin = null;
        java.lang.Integer width = null;
        java.lang.Integer height = null;
        org.openqa.selenium.devtools.dom.model.ShapeOutsideInfo shapeOutside = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "content":
                    content = input.read(org.openqa.selenium.devtools.dom.model.Quad.class);
                    break;
                case "padding":
                    padding = input.read(org.openqa.selenium.devtools.dom.model.Quad.class);
                    break;
                case "border":
                    border = input.read(org.openqa.selenium.devtools.dom.model.Quad.class);
                    break;
                case "margin":
                    margin = input.read(org.openqa.selenium.devtools.dom.model.Quad.class);
                    break;
                case "width":
                    width = input.nextNumber().intValue();
                    break;
                case "height":
                    height = input.nextNumber().intValue();
                    break;
                case "shapeOutside":
                    shapeOutside = input.read(org.openqa.selenium.devtools.dom.model.ShapeOutsideInfo.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BoxModel(content, padding, border, margin, width, height, shapeOutside);
    }
}
