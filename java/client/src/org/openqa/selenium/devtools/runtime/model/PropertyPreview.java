package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class PropertyPreview {

    public enum Type {

        OBJECT("object"),
        FUNCTION("function"),
        UNDEFINED("undefined"),
        STRING("string"),
        NUMBER("number"),
        BOOLEAN("boolean"),
        SYMBOL("symbol"),
        ACCESSOR("accessor"),
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

    private final java.lang.String name;

    private final Type type;

    private final java.lang.String value;

    private final org.openqa.selenium.devtools.runtime.model.ObjectPreview valuePreview;

    private final Subtype subtype;

    public PropertyPreview(java.lang.String name, Type type, java.lang.String value, org.openqa.selenium.devtools.runtime.model.ObjectPreview valuePreview, Subtype subtype) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.value = value;
        this.valuePreview = valuePreview;
        this.subtype = subtype;
    }

    /**
     * Property name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Object type. Accessor means that the property itself is an accessor property.
     */
    public Type getType() {
        return type;
    }

    /**
     * User-friendly property value string.
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Nested value preview.
     */
    public org.openqa.selenium.devtools.runtime.model.ObjectPreview getValuePreview() {
        return valuePreview;
    }

    /**
     * Object subtype hint. Specified for `object` type values only.
     */
    public Subtype getSubtype() {
        return subtype;
    }

    private static PropertyPreview fromJson(JsonInput input) {
        java.lang.String name = null;
        Type type = null;
        java.lang.String value = null;
        org.openqa.selenium.devtools.runtime.model.ObjectPreview valuePreview = null;
        Subtype subtype = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "value":
                    value = input.nextString();
                    break;
                case "valuePreview":
                    valuePreview = input.read(org.openqa.selenium.devtools.runtime.model.ObjectPreview.class);
                    break;
                case "subtype":
                    subtype = Subtype.fromString(input.nextString());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PropertyPreview(name, type, value, valuePreview, subtype);
    }
}
