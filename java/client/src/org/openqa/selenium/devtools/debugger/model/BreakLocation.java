package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class BreakLocation {

    public enum Type {

        DEBUGGERSTATEMENT("debuggerStatement"), CALL("call"), RETURN("return");

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

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    private final Type type;

    public BreakLocation(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.Integer lineNumber, java.lang.Integer columnNumber, Type type) {
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = columnNumber;
        this.type = type;
    }

    /**
     * Script identifier as reported in the `Debugger.scriptParsed`.
     */
    public org.openqa.selenium.devtools.runtime.model.ScriptId getScriptId() {
        return scriptId;
    }

    /**
     * Line number in the script (0-based).
     */
    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Column number in the script (0-based).
     */
    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }

    public Type getType() {
        return type;
    }

    private static BreakLocation fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
        Type type = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "lineNumber":
                    lineNumber = input.nextNumber().intValue();
                    break;
                case "columnNumber":
                    columnNumber = input.nextNumber().intValue();
                    break;
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BreakLocation(scriptId, lineNumber, columnNumber, type);
    }
}
