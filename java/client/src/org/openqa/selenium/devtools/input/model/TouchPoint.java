package org.openqa.selenium.devtools.input.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class TouchPoint {

    private final java.lang.Number x;

    private final java.lang.Number y;

    private final java.lang.Number radiusX;

    private final java.lang.Number radiusY;

    private final java.lang.Number rotationAngle;

    private final java.lang.Number force;

    private final java.lang.Number id;

    public TouchPoint(java.lang.Number x, java.lang.Number y, java.lang.Number radiusX, java.lang.Number radiusY, java.lang.Number rotationAngle, java.lang.Number force, java.lang.Number id) {
        this.x = java.util.Objects.requireNonNull(x, "x is required");
        this.y = java.util.Objects.requireNonNull(y, "y is required");
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.rotationAngle = rotationAngle;
        this.force = force;
        this.id = id;
    }

    /**
     * X coordinate of the event relative to the main frame's viewport in CSS pixels.
     */
    public java.lang.Number getX() {
        return x;
    }

    /**
     * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
     * the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
     */
    public java.lang.Number getY() {
        return y;
    }

    /**
     * X radius of the touch area (default: 1.0).
     */
    public java.lang.Number getRadiusX() {
        return radiusX;
    }

    /**
     * Y radius of the touch area (default: 1.0).
     */
    public java.lang.Number getRadiusY() {
        return radiusY;
    }

    /**
     * Rotation angle (default: 0.0).
     */
    public java.lang.Number getRotationAngle() {
        return rotationAngle;
    }

    /**
     * Force (default: 1.0).
     */
    public java.lang.Number getForce() {
        return force;
    }

    /**
     * Identifier used to track touch sources between events, must be unique within an event.
     */
    public java.lang.Number getId() {
        return id;
    }

    private static TouchPoint fromJson(JsonInput input) {
        java.lang.Number x = null;
        java.lang.Number y = null;
        java.lang.Number radiusX = null;
        java.lang.Number radiusY = null;
        java.lang.Number rotationAngle = null;
        java.lang.Number force = null;
        java.lang.Number id = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "x":
                    x = input.nextNumber();
                    break;
                case "y":
                    y = input.nextNumber();
                    break;
                case "radiusX":
                    radiusX = input.nextNumber();
                    break;
                case "radiusY":
                    radiusY = input.nextNumber();
                    break;
                case "rotationAngle":
                    rotationAngle = input.nextNumber();
                    break;
                case "force":
                    force = input.nextNumber();
                    break;
                case "id":
                    id = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TouchPoint(x, y, radiusX, radiusY, rotationAngle, force, id);
    }
}
