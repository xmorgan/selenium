package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Location in the source code.
 */
public class Location {

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    public Location(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.Integer lineNumber, java.lang.Integer columnNumber) {
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = columnNumber;
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

    private static Location fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
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
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Location(scriptId, lineNumber, columnNumber);
    }
}
