package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class Rectangle {

    private final java.util.List<java.lang.Number> rectangle;

    public Rectangle(java.util.List<java.lang.Number> rectangle) {
        this.rectangle = java.util.Objects.requireNonNull(rectangle, "Missing value for Rectangle");
    }

    private static Rectangle fromJson(JsonInput input) {
        return input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Number>>() {
        }.getType());
    }

    public String toString() {
        return rectangle.toString();
    }
}
