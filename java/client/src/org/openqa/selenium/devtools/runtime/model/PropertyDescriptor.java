package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object property descriptor.
 */
public class PropertyDescriptor {

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject value;

    private final java.lang.Boolean writable;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject get;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject set;

    private final java.lang.Boolean configurable;

    private final java.lang.Boolean enumerable;

    private final java.lang.Boolean wasThrown;

    private final java.lang.Boolean isOwn;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject symbol;

    public PropertyDescriptor(java.lang.String name, org.openqa.selenium.devtools.runtime.model.RemoteObject value, java.lang.Boolean writable, org.openqa.selenium.devtools.runtime.model.RemoteObject get, org.openqa.selenium.devtools.runtime.model.RemoteObject set, java.lang.Boolean configurable, java.lang.Boolean enumerable, java.lang.Boolean wasThrown, java.lang.Boolean isOwn, org.openqa.selenium.devtools.runtime.model.RemoteObject symbol) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = value;
        this.writable = writable;
        this.get = get;
        this.set = set;
        this.configurable = java.util.Objects.requireNonNull(configurable, "configurable is required");
        this.enumerable = java.util.Objects.requireNonNull(enumerable, "enumerable is required");
        this.wasThrown = wasThrown;
        this.isOwn = isOwn;
        this.symbol = symbol;
    }

    /**
     * Property name or symbol description.
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

    /**
     * True if the value associated with the property may be changed (data descriptors only).
     */
    public java.lang.Boolean getWritable() {
        return writable;
    }

    /**
     * A function which serves as a getter for the property, or `undefined` if there is no getter
     * (accessor descriptors only).
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getGet() {
        return get;
    }

    /**
     * A function which serves as a setter for the property, or `undefined` if there is no setter
     * (accessor descriptors only).
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getSet() {
        return set;
    }

    /**
     * True if the type of this property descriptor may be changed and if the property may be
     * deleted from the corresponding object.
     */
    public java.lang.Boolean getConfigurable() {
        return configurable;
    }

    /**
     * True if this property shows up during enumeration of the properties on the corresponding
     * object.
     */
    public java.lang.Boolean getEnumerable() {
        return enumerable;
    }

    /**
     * True if the result was thrown during the evaluation.
     */
    public java.lang.Boolean getWasThrown() {
        return wasThrown;
    }

    /**
     * True if the property is owned for the object.
     */
    public java.lang.Boolean getIsOwn() {
        return isOwn;
    }

    /**
     * Property symbol object, if the property is of the `symbol` type.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getSymbol() {
        return symbol;
    }

    private static PropertyDescriptor fromJson(JsonInput input) {
        java.lang.String name = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject value = null;
        java.lang.Boolean writable = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject get = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject set = null;
        java.lang.Boolean configurable = null;
        java.lang.Boolean enumerable = null;
        java.lang.Boolean wasThrown = null;
        java.lang.Boolean isOwn = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject symbol = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "writable":
                    writable = input.nextBoolean();
                    break;
                case "get":
                    get = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "set":
                    set = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "configurable":
                    configurable = input.nextBoolean();
                    break;
                case "enumerable":
                    enumerable = input.nextBoolean();
                    break;
                case "wasThrown":
                    wasThrown = input.nextBoolean();
                    break;
                case "isOwn":
                    isOwn = input.nextBoolean();
                    break;
                case "symbol":
                    symbol = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PropertyDescriptor(name, value, writable, get, set, configurable, enumerable, wasThrown, isOwn, symbol);
    }
}
