package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object private field descriptor.
 */
@org.openqa.selenium.Beta()
public class PrivatePropertyDescriptor {

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject value;

    public PrivatePropertyDescriptor(java.lang.String name, org.openqa.selenium.devtools.runtime.model.RemoteObject value) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    /**
     * Private property name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * The value associated with the private property.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getValue() {
        return value;
    }

    private static PrivatePropertyDescriptor fromJson(JsonInput input) {
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
        return new PrivatePropertyDescriptor(name, value);
    }
}
