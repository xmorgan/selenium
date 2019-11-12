package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object internal property descriptor. This property isn't normally visible in JavaScript code.
 */
public class InternalPropertyDescriptor {

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject value;

    public InternalPropertyDescriptor(java.lang.String name, org.openqa.selenium.devtools.runtime.model.RemoteObject value) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = value;
    }

    /**
     * Conventional property name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * The value associated with the property.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getValue() {
        return value;
    }

    private static InternalPropertyDescriptor fromJson(JsonInput input) {
        java.lang.String name = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new InternalPropertyDescriptor(name, value);
    }
}
