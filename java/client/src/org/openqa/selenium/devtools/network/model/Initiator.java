package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about the request initiator.
 */
public class Initiator {

    public enum Type {

        PARSER("parser"), SCRIPT("script"), PRELOAD("preload"), SIGNEDEXCHANGE("SignedExchange"), OTHER("other");

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

    private final org.openqa.selenium.devtools.runtime.model.StackTrace stack;

    private final java.lang.String url;

    private final java.lang.Number lineNumber;

    public Initiator(Type type, org.openqa.selenium.devtools.runtime.model.StackTrace stack, java.lang.String url, java.lang.Number lineNumber) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.stack = stack;
        this.url = url;
        this.lineNumber = lineNumber;
    }

    /**
     * Type of this initiator.
     */
    public Type getType() {
        return type;
    }

    /**
     * Initiator JavaScript stack trace, set for Script only.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getStack() {
        return stack;
    }

    /**
     * Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Initiator line number, set for Parser type or for Script type (when script is importing
     * module) (0-based).
     */
    public java.lang.Number getLineNumber() {
        return lineNumber;
    }

    private static Initiator fromJson(JsonInput input) {
        Type type = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace stack = null;
        java.lang.String url = null;
        java.lang.Number lineNumber = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "stack":
                    stack = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "lineNumber":
                    lineNumber = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Initiator(type, stack, url, lineNumber);
    }
}
