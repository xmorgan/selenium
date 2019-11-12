package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Key path.
 */
public class KeyPath {

    public enum Type {

        NULL("null"), STRING("string"), ARRAY("array");

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

    private final java.lang.String string;

    private final java.util.List<java.lang.String> array;

    public KeyPath(Type type, java.lang.String string, java.util.List<java.lang.String> array) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.string = string;
        this.array = array;
    }

    /**
     * Key path type.
     */
    public Type getType() {
        return type;
    }

    /**
     * String value.
     */
    public java.lang.String getString() {
        return string;
    }

    /**
     * Array value.
     */
    public java.util.List<java.lang.String> getArray() {
        return array;
    }

    private static KeyPath fromJson(JsonInput input) {
        Type type = null;
        java.lang.String string = null;
        java.util.List<java.lang.String> array = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "string":
                    string = input.nextString();
                    break;
                case "array":
                    array = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new KeyPath(type, string, array);
    }
}
