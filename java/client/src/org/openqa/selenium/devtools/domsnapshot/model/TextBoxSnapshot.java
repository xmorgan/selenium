package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Table of details of the post layout rendered text positions. The exact layout should not be regarded as
 * stable and may change between versions.
 */
public class TextBoxSnapshot {

    private final java.util.List<java.lang.Integer> layoutIndex;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> bounds;

    private final java.util.List<java.lang.Integer> start;

    private final java.util.List<java.lang.Integer> length;

    public TextBoxSnapshot(java.util.List<java.lang.Integer> layoutIndex, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> bounds, java.util.List<java.lang.Integer> start, java.util.List<java.lang.Integer> length) {
        this.layoutIndex = java.util.Objects.requireNonNull(layoutIndex, "layoutIndex is required");
        this.bounds = java.util.Objects.requireNonNull(bounds, "bounds is required");
        this.start = java.util.Objects.requireNonNull(start, "start is required");
        this.length = java.util.Objects.requireNonNull(length, "length is required");
    }

    /**
     * Index of the layout tree node that owns this box collection.
     */
    public java.util.List<java.lang.Integer> getLayoutIndex() {
        return layoutIndex;
    }

    /**
     * The absolute position bounding box.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> getBounds() {
        return bounds;
    }

    /**
     * The starting index in characters, for this post layout textbox substring. Characters that
     * would be represented as a surrogate pair in UTF-16 have length 2.
     */
    public java.util.List<java.lang.Integer> getStart() {
        return start;
    }

    /**
     * The number of characters in this post layout textbox substring. Characters that would be
     * represented as a surrogate pair in UTF-16 have length 2.
     */
    public java.util.List<java.lang.Integer> getLength() {
        return length;
    }

    private static TextBoxSnapshot fromJson(JsonInput input) {
        java.util.List<java.lang.Integer> layoutIndex = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> bounds = null;
        java.util.List<java.lang.Integer> start = null;
        java.util.List<java.lang.Integer> length = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "layoutIndex":
                    layoutIndex = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "bounds":
                    bounds = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle>>() {
                    }.getType());
                    break;
                case "start":
                    start = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "length":
                    length = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TextBoxSnapshot(layoutIndex, bounds, start, length);
    }
}
