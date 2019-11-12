package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class ShorthandEntry {

    private final java.lang.String name;

    private final java.lang.String value;

    private final java.lang.Boolean important;

    public ShorthandEntry(java.lang.String name, java.lang.String value, java.lang.Boolean important) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
        this.important = important;
    }

    /**
     * Shorthand name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Shorthand value.
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Whether the property has "!important" annotation (implies `false` if absent).
     */
    public java.lang.Boolean getImportant() {
        return important;
    }

    private static ShorthandEntry fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String value = null;
        java.lang.Boolean important = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                case "important":
                    important = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ShorthandEntry(name, value, important);
    }
}
