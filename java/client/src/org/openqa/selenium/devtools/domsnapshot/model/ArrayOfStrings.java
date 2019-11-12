package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Index of the string in the strings table.
 */
public class ArrayOfStrings {

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> arrayOfStrings;

    public ArrayOfStrings(java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> arrayOfStrings) {
        this.arrayOfStrings = java.util.Objects.requireNonNull(arrayOfStrings, "Missing value for ArrayOfStrings");
    }

    private static ArrayOfStrings fromJson(JsonInput input) {
        return input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex>>() {
        }.getType());
    }

    public String toString() {
        return arrayOfStrings.toString();
    }
}
