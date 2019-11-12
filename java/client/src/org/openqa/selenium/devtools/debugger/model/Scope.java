package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Scope description.
 */
public class Scope {

    public enum Type {

        GLOBAL("global"),
        LOCAL("local"),
        WITH("with"),
        CLOSURE("closure"),
        CATCH("catch"),
        BLOCK("block"),
        SCRIPT("script"),
        EVAL("eval"),
        MODULE("module");

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

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject object;

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.debugger.model.Location startLocation;

    private final org.openqa.selenium.devtools.debugger.model.Location endLocation;

    public Scope(Type type, org.openqa.selenium.devtools.runtime.model.RemoteObject object, java.lang.String name, org.openqa.selenium.devtools.debugger.model.Location startLocation, org.openqa.selenium.devtools.debugger.model.Location endLocation) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.object = java.util.Objects.requireNonNull(object, "object is required");
        this.name = name;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    /**
     * Scope type.
     */
    public Type getType() {
        return type;
    }

    /**
     * Object representing the scope. For `global` and `with` scopes it represents the actual
     * object; for the rest of the scopes, it is artificial transient object enumerating scope
     * variables as its properties.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getObject() {
        return object;
    }

    public java.lang.String getName() {
        return name;
    }

    /**
     * Location in the source code where scope starts
     */
    public org.openqa.selenium.devtools.debugger.model.Location getStartLocation() {
        return startLocation;
    }

    /**
     * Location in the source code where scope ends
     */
    public org.openqa.selenium.devtools.debugger.model.Location getEndLocation() {
        return endLocation;
    }

    private static Scope fromJson(JsonInput input) {
        Type type = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject object = null;
        java.lang.String name = null;
        org.openqa.selenium.devtools.debugger.model.Location startLocation = null;
        org.openqa.selenium.devtools.debugger.model.Location endLocation = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "object":
                    object = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "startLocation":
                    startLocation = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                    break;
                case "endLocation":
                    endLocation = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Scope(type, object, name, startLocation, endLocation);
    }
}
