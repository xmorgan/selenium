package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Index of the string in the strings table.
 */
public class StringIndex {

    private final java.lang.Integer stringIndex;

    public StringIndex(java.lang.Integer stringIndex) {
        this.stringIndex = java.util.Objects.requireNonNull(stringIndex, "Missing value for StringIndex");
    }

    private static StringIndex fromJson(JsonInput input) {
        return new StringIndex(input.nextNumber().intValue());
    }

    public String toJson() {
        return stringIndex.toString();
    }

    public String toString() {
        return stringIndex.toString();
    }
}
