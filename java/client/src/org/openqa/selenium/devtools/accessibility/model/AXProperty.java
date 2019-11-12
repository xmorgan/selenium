package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class AXProperty {

    private final org.openqa.selenium.devtools.accessibility.model.AXPropertyName name;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue value;

    public AXProperty(org.openqa.selenium.devtools.accessibility.model.AXPropertyName name, org.openqa.selenium.devtools.accessibility.model.AXValue value) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    /**
     * The name of this property.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXPropertyName getName() {
        return name;
    }

    /**
     * The value of this property.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getValue() {
        return value;
    }

    private static AXProperty fromJson(JsonInput input) {
        org.openqa.selenium.devtools.accessibility.model.AXPropertyName name = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.read(org.openqa.selenium.devtools.accessibility.model.AXPropertyName.class);
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AXProperty(name, value);
    }
}
