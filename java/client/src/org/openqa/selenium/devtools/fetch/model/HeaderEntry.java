package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Response HTTP header entry
 */
public class HeaderEntry {

    private final java.lang.String name;

    private final java.lang.String value;

    public HeaderEntry(java.lang.String name, java.lang.String value) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getValue() {
        return value;
    }

    private static HeaderEntry fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new HeaderEntry(name, value);
    }
}
