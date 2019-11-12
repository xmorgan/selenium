package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Location in the source code.
 */
@org.openqa.selenium.Beta()
public class ScriptPosition {

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    public ScriptPosition(java.lang.Integer lineNumber, java.lang.Integer columnNumber) {
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = java.util.Objects.requireNonNull(columnNumber, "columnNumber is required");
    }

    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }

    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }

    private static ScriptPosition fromJson(JsonInput input) {
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
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
        return new ScriptPosition(lineNumber, columnNumber);
    }
}
