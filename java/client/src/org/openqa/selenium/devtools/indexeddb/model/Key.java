package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Key.
 */
public class Key {

    public enum Type {

        NUMBER("number"), STRING("string"), DATE("date"), ARRAY("array");

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

    private final Type type;

    private final java.lang.Number number;

    private final java.lang.String string;

    private final java.lang.Number date;

    private final java.util.List<org.openqa.selenium.devtools.indexeddb.model.Key> array;

    public Key(Type type, java.lang.Number number, java.lang.String string, java.lang.Number date, java.util.List<org.openqa.selenium.devtools.indexeddb.model.Key> array) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.number = number;
        this.string = string;
        this.date = date;
        this.array = array;
    }

    /**
     * Key type.
     */
    public Type getType() {
        return type;
    }

    /**
     * Number value.
     */
    public java.lang.Number getNumber() {
        return number;
    }

    /**
     * String value.
     */
    public java.lang.String getString() {
        return string;
    }

    /**
     * Date value.
     */
    public java.lang.Number getDate() {
        return date;
    }

    /**
     * Array value.
     */
    public java.util.List<org.openqa.selenium.devtools.indexeddb.model.Key> getArray() {
        return array;
    }

    private static Key fromJson(JsonInput input) {
        Type type = null;
        java.lang.Number number = null;
        java.lang.String string = null;
        java.lang.Number date = null;
        java.util.List<org.openqa.selenium.devtools.indexeddb.model.Key> array = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "number":
                    number = input.nextNumber();
                    break;
                case "string":
                    string = input.nextString();
                    break;
                case "date":
                    date = input.nextNumber();
                    break;
                case "array":
                    array = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.indexeddb.model.Key>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Key(type, number, string, date, array);
    }
}
