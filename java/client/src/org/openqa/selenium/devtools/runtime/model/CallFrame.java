package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Stack entry for runtime errors and assertions.
 */
public class CallFrame {

    private final java.lang.String functionName;

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.String url;

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    public CallFrame(java.lang.String functionName, org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String url, java.lang.Integer lineNumber, java.lang.Integer columnNumber) {
        this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = java.util.Objects.requireNonNull(columnNumber, "columnNumber is required");
    }

    /**
     * JavaScript function name.
     */
    public java.lang.String getFunctionName() {
        return functionName;
    }

    /**
     * JavaScript script id.
     */
    public org.openqa.selenium.devtools.runtime.model.ScriptId getScriptId() {
        return scriptId;
    }

    /**
     * JavaScript script name or url.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * JavaScript script line number (0-based).
     */
    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * JavaScript script column number (0-based).
     */
    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }

    private static CallFrame fromJson(JsonInput input) {
        java.lang.String functionName = null;
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.String url = null;
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "functionName":
                    functionName = input.nextString();
                    break;
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "url":
                    url = input.nextString();
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
        return new CallFrame(functionName, scriptId, url, lineNumber, columnNumber);
    }
}
