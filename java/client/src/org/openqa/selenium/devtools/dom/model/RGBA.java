package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A structure holding an RGBA color.
 */
public class RGBA {

    private final java.lang.Integer r;

    private final java.lang.Integer g;

    private final java.lang.Integer b;

    private final java.lang.Number a;

    public RGBA(java.lang.Integer r, java.lang.Integer g, java.lang.Integer b, java.lang.Number a) {
        this.r = java.util.Objects.requireNonNull(r, "r is required");
        this.g = java.util.Objects.requireNonNull(g, "g is required");
        this.b = java.util.Objects.requireNonNull(b, "b is required");
        this.a = a;
    }

    /**
     * The red component, in the [0-255] range.
     */
    public java.lang.Integer getR() {
        return r;
    }

    /**
     * The green component, in the [0-255] range.
     */
    public java.lang.Integer getG() {
        return g;
    }

    /**
     * The blue component, in the [0-255] range.
     */
    public java.lang.Integer getB() {
        return b;
    }

    /**
     * The alpha component, in the [0-1] range (default: 1).
     */
    public java.lang.Number getA() {
        return a;
    }

    private static RGBA fromJson(JsonInput input) {
        java.lang.Integer r = null;
        java.lang.Integer g = null;
        java.lang.Integer b = null;
        java.lang.Number a = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "r":
                    r = input.nextNumber().intValue();
                    break;
                case "g":
                    g = input.nextNumber().intValue();
                    break;
                case "b":
                    b = input.nextNumber().intValue();
                    break;
                case "a":
                    a = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RGBA(r, g, b, a);
    }
}
