package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A subset of the full ComputedStyle as defined by the request whitelist.
 */
public class ComputedStyle {

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> properties;

    public ComputedStyle(java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> properties) {
        this.properties = java.util.Objects.requireNonNull(properties, "properties is required");
    }

    /**
     * Name/value pairs of computed style properties.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> getProperties() {
        return properties;
    }

    private static ComputedStyle fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> properties = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "properties":
                    properties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ComputedStyle(properties);
    }
}
