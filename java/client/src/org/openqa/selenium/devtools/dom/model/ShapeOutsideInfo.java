package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS Shape Outside details.
 */
public class ShapeOutsideInfo {

    private final org.openqa.selenium.devtools.dom.model.Quad bounds;

    private final java.util.List<java.util.Map<String, Object>> shape;

    private final java.util.List<java.util.Map<String, Object>> marginShape;

    public ShapeOutsideInfo(org.openqa.selenium.devtools.dom.model.Quad bounds, java.util.List<java.util.Map<String, Object>> shape, java.util.List<java.util.Map<String, Object>> marginShape) {
        this.bounds = java.util.Objects.requireNonNull(bounds, "bounds is required");
        this.shape = java.util.Objects.requireNonNull(shape, "shape is required");
        this.marginShape = java.util.Objects.requireNonNull(marginShape, "marginShape is required");
    }

    /**
     * Shape bounds
     */
    public org.openqa.selenium.devtools.dom.model.Quad getBounds() {
        return bounds;
    }

    /**
     * Shape coordinate details
     */
    public java.util.List<java.util.Map<String, Object>> getShape() {
        return shape;
    }

    /**
     * Margin shape bounds
     */
    public java.util.List<java.util.Map<String, Object>> getMarginShape() {
        return marginShape;
    }

    private static ShapeOutsideInfo fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.Quad bounds = null;
        java.util.List<java.util.Map<String, Object>> shape = null;
        java.util.List<java.util.Map<String, Object>> marginShape = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "bounds":
                    bounds = input.read(org.openqa.selenium.devtools.dom.model.Quad.class);
                    break;
                case "shape":
                    shape = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.util.Map<String, Object>>>() {
                    }.getType());
                    break;
                case "marginShape":
                    marginShape = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.util.Map<String, Object>>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ShapeOutsideInfo(bounds, shape, marginShape);
    }
}
