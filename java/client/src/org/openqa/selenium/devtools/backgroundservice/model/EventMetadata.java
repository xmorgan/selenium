package org.openqa.selenium.devtools.backgroundservice.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A key-value pair for additional event information to pass along.
 */
public class EventMetadata {

    private final java.lang.String key;

    private final java.lang.String value;

    public EventMetadata(java.lang.String key, java.lang.String value) {
        this.key = java.util.Objects.requireNonNull(key, "key is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    public java.lang.String getKey() {
        return key;
    }

    public java.lang.String getValue() {
        return value;
    }

    private static EventMetadata fromJson(JsonInput input) {
        java.lang.String key = null;
        java.lang.String value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "key":
                    key = input.nextString();
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
        return new EventMetadata(key, value);
    }
}
