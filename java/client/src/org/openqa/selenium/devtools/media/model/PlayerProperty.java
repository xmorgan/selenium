package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Player Property type
 */
public class PlayerProperty {

    private final java.lang.String name;

    private final java.lang.String value;

    public PlayerProperty(java.lang.String name, java.lang.String value) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = value;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getValue() {
        return value;
    }

    private static PlayerProperty fromJson(JsonInput input) {
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
        return new PlayerProperty(name, value);
    }
}
