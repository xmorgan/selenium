package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * An array of quad vertices, x immediately followed by y for each point, points clock-wise.
 */
public class Quad {

    private final java.util.List<java.lang.Number> quad;

    public Quad(java.util.List<java.lang.Number> quad) {
        this.quad = java.util.Objects.requireNonNull(quad, "Missing value for Quad");
    }

    private static Quad fromJson(JsonInput input) {
        return input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Number>>() {
        }.getType());
    }

    public String toString() {
        return quad.toString();
    }
}
