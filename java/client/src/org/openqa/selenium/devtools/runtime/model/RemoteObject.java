package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Mirror object referencing original JavaScript object.
 */
public class RemoteObject {

    public enum Type {

        OBJECT("object"),
        FUNCTION("function"),
        UNDEFINED("undefined"),
        STRING("string"),
        NUMBER("number"),
        BOOLEAN("boolean"),
        SYMBOL("symbol"),
        BIGINT("bigint");

        private String value;

        Type(String value) {
            this.value = value;
        }

        public static Type fromString(String s) {
            return java.util.Arrays.stream(Type.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Type "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Type fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    public enum Subtype {

        ARRAY("array"),
        NULL("null"),
        NODE("node"),
        REGEXP("regexp"),
        DATE("date"),
        MAP("map"),
        SET("set"),
        WEAKMAP("weakmap"),
        WEAKSET("weakset"),
        ITERATOR("iterator"),
        GENERATOR("generator"),
        ERROR("error"),
        PROXY("proxy"),
        PROMISE("promise"),
        TYPEDARRAY("typedarray"),
        ARRAYBUFFER("arraybuffer"),
        DATAVIEW("dataview");

        private String value;

        Subtype(String value) {
            this.value = value;
        }

        public static Subtype fromString(String s) {
            return java.util.Arrays.stream(Subtype.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Subtype "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Subtype fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final Type type;

    private final Subtype subtype;

    private final java.lang.String className;

    private final java.util.Map<String, Object> value;

    private final org.openqa.selenium.devtools.runtime.model.UnserializableValue unserializableValue;

    private final java.lang.String description;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId;

    private final org.openqa.selenium.devtools.runtime.model.ObjectPreview preview;

    private final org.openqa.selenium.devtools.runtime.model.CustomPreview customPreview;

    public RemoteObject(Type type, Subtype subtype, java.lang.String className, java.util.Map<String, Object> value, org.openqa.selenium.devtools.runtime.model.UnserializableValue unserializableValue, java.lang.String description, org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId, org.openqa.selenium.devtools.runtime.model.ObjectPreview preview, org.openqa.selenium.devtools.runtime.model.CustomPreview customPreview) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.subtype = subtype;
        this.className = className;
        this.value = value;
        this.unserializableValue = unserializableValue;
        this.description = description;
        this.objectId = objectId;
        this.preview = preview;
        this.customPreview = customPreview;
    }

    /**
     * Object type.
     */
    public Type getType() {
        return type;
    }

    /**
     * Object subtype hint. Specified for `object` type values only.
     */
    public Subtype getSubtype() {
        return subtype;
    }

    /**
     * Object class (constructor) name. Specified for `object` type values only.
     */
    public java.lang.String getClassName() {
        return className;
    }

    /**
     * Remote object value in case of primitive values or JSON values (if it was requested).
     */
    public java.util.Map<String, Object> getValue() {
        return value;
    }

    /**
     * Primitive value which can not be JSON-stringified does not have `value`, but gets this
     * property.
     */
    public org.openqa.selenium.devtools.runtime.model.UnserializableValue getUnserializableValue() {
        return unserializableValue;
    }

    /**
     * String representation of the object.
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * Unique object identifier (for non-primitive values).
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObjectId getObjectId() {
        return objectId;
    }

    /**
     * Preview containing abbreviated property values. Specified for `object` type values only.
     */
    @Beta()
    public org.openqa.selenium.devtools.runtime.model.ObjectPreview getPreview() {
        return preview;
    }

    @Beta()
    public org.openqa.selenium.devtools.runtime.model.CustomPreview getCustomPreview() {
        return customPreview;
    }

    private static RemoteObject fromJson(JsonInput input) {
        Type type = null;
        Subtype subtype = null;
        java.lang.String className = null;
        java.util.Map<String, Object> value = null;
        org.openqa.selenium.devtools.runtime.model.UnserializableValue unserializableValue = null;
        java.lang.String description = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId = null;
        org.openqa.selenium.devtools.runtime.model.ObjectPreview preview = null;
        org.openqa.selenium.devtools.runtime.model.CustomPreview customPreview = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "subtype":
                    subtype = Subtype.fromString(input.nextString());
                    break;
                case "className":
                    className = input.nextString();
                    break;
                case "value":
                    value = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "unserializableValue":
                    unserializableValue = input.read(org.openqa.selenium.devtools.runtime.model.UnserializableValue.class);
                    break;
                case "description":
                    description = input.nextString();
                    break;
                case "objectId":
                    objectId = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObjectId.class);
                    break;
                case "preview":
                    preview = input.read(org.openqa.selenium.devtools.runtime.model.ObjectPreview.class);
                    break;
                case "customPreview":
                    customPreview = input.read(org.openqa.selenium.devtools.runtime.model.CustomPreview.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RemoteObject(type, subtype, className, value, unserializableValue, description, objectId, preview, customPreview);
    }
}
