package org.openqa.selenium.devtools.emulation.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Screen orientation.
 */
public class ScreenOrientation {

    public enum Type {

        PORTRAITPRIMARY("portraitPrimary"), PORTRAITSECONDARY("portraitSecondary"), LANDSCAPEPRIMARY("landscapePrimary"), LANDSCAPESECONDARY("landscapeSecondary");

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

    private final Type type;

    private final java.lang.Integer angle;

    public ScreenOrientation(Type type, java.lang.Integer angle) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.angle = java.util.Objects.requireNonNull(angle, "angle is required");
    }

    /**
     * Orientation type.
     */
    public Type getType() {
        return type;
    }

    /**
     * Orientation angle.
     */
    public java.lang.Integer getAngle() {
        return angle;
    }

    private static ScreenOrientation fromJson(JsonInput input) {
        Type type = null;
        java.lang.Integer angle = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "angle":
                    angle = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScreenOrientation(type, angle);
    }
}
