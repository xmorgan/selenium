package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Rectangle where scrolling happens on the main thread.
 */
public class ScrollRect {

    public enum Type {

        REPAINTSONSCROLL("RepaintsOnScroll"), TOUCHEVENTHANDLER("TouchEventHandler"), WHEELEVENTHANDLER("WheelEventHandler");

        private String value;

        Type(String value) {
            this.value = value;
        }

        public static Type fromString(String s) {
            return java.util.Arrays.stream(Type.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Type "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Type fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final org.openqa.selenium.devtools.dom.model.Rect rect;

    private final Type type;

    public ScrollRect(org.openqa.selenium.devtools.dom.model.Rect rect, Type type) {
        this.rect = java.util.Objects.requireNonNull(rect, "rect is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
    }

    /**
     * Rectangle itself.
     */
    public org.openqa.selenium.devtools.dom.model.Rect getRect() {
        return rect;
    }

    /**
     * Reason for rectangle to force scrolling on the main thread
     */
    public Type getType() {
        return type;
    }

    private static ScrollRect fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.Rect rect = null;
        Type type = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "rect":
                    rect = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                    break;
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScrollRect(rect, type);
    }
}
