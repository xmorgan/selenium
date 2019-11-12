package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object containing abbreviated remote object value.
 */
@org.openqa.selenium.Beta()
public class ObjectPreview {

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
        ERROR("error");

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

    private final java.lang.String description;

    private final java.lang.Boolean overflow;

    private final java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyPreview> properties;

    private final java.util.List<org.openqa.selenium.devtools.runtime.model.EntryPreview> entries;

    public ObjectPreview(Type type, Subtype subtype, java.lang.String description, java.lang.Boolean overflow, java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyPreview> properties, java.util.List<org.openqa.selenium.devtools.runtime.model.EntryPreview> entries) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.subtype = subtype;
        this.description = description;
        this.overflow = java.util.Objects.requireNonNull(overflow, "overflow is required");
        this.properties = java.util.Objects.requireNonNull(properties, "properties is required");
        this.entries = entries;
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
     * String representation of the object.
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * True iff some of the properties or entries of the original object did not fit.
     */
    public java.lang.Boolean getOverflow() {
        return overflow;
    }

    /**
     * List of the properties.
     */
    public java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyPreview> getProperties() {
        return properties;
    }

    /**
     * List of the entries. Specified for `map` and `set` subtype values only.
     */
    public java.util.List<org.openqa.selenium.devtools.runtime.model.EntryPreview> getEntries() {
        return entries;
    }

    private static ObjectPreview fromJson(JsonInput input) {
        Type type = null;
        Subtype subtype = null;
        java.lang.String description = null;
        java.lang.Boolean overflow = null;
        java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyPreview> properties = null;
        java.util.List<org.openqa.selenium.devtools.runtime.model.EntryPreview> entries = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "subtype":
                    subtype = Subtype.fromString(input.nextString());
                    break;
                case "description":
                    description = input.nextString();
                    break;
                case "overflow":
                    overflow = input.nextBoolean();
                    break;
                case "properties":
                    properties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyPreview>>() {
                    }.getType());
                    break;
                case "entries":
                    entries = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.EntryPreview>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ObjectPreview(type, subtype, description, overflow, properties, entries);
    }
}
