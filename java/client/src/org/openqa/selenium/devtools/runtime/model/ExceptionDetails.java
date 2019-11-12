package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Detailed information about exception (or error) that was thrown during script compilation or
 * execution.
 */
public class ExceptionDetails {

    private final java.lang.Integer exceptionId;

    private final java.lang.String text;

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.String url;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject exception;

    private final org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId;

    public ExceptionDetails(java.lang.Integer exceptionId, java.lang.String text, java.lang.Integer lineNumber, java.lang.Integer columnNumber, org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String url, org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace, org.openqa.selenium.devtools.runtime.model.RemoteObject exception, org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId) {
        this.exceptionId = java.util.Objects.requireNonNull(exceptionId, "exceptionId is required");
        this.text = java.util.Objects.requireNonNull(text, "text is required");
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = java.util.Objects.requireNonNull(columnNumber, "columnNumber is required");
        this.scriptId = scriptId;
        this.url = url;
        this.stackTrace = stackTrace;
        this.exception = exception;
        this.executionContextId = executionContextId;
    }

    /**
     * Exception id.
     */
    public java.lang.Integer getExceptionId() {
        return exceptionId;
    }

    /**
     * Exception text, which should be used together with exception object when available.
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Line number of the exception location (0-based).
     */
    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Column number of the exception location (0-based).
     */
    public java.lang.Integer getColumnNumber() {
        return columnNumber;
    }

    /**
     * Script ID of the exception location.
     */
    public org.openqa.selenium.devtools.runtime.model.ScriptId getScriptId() {
        return scriptId;
    }

    /**
     * URL of the exception location, to be used when the script was not reported.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * JavaScript stack trace if available.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getStackTrace() {
        return stackTrace;
    }

    /**
     * Exception object if available.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getException() {
        return exception;
    }

    /**
     * Identifier of the context where exception happened.
     */
    public org.openqa.selenium.devtools.runtime.model.ExecutionContextId getExecutionContextId() {
        return executionContextId;
    }

    private static ExceptionDetails fromJson(JsonInput input) {
        java.lang.Integer exceptionId = null;
        java.lang.String text = null;
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.String url = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject exception = null;
        org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "exceptionId":
                    exceptionId = input.nextNumber().intValue();
                    break;
                case "text":
                    text = input.nextString();
                    break;
                case "lineNumber":
                    lineNumber = input.nextNumber().intValue();
                    break;
                case "columnNumber":
                    columnNumber = input.nextNumber().intValue();
                    break;
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "stackTrace":
                    stackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                case "exception":
                    exception = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "executionContextId":
                    executionContextId = input.read(org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ExceptionDetails(exceptionId, text, lineNumber, columnNumber, scriptId, url, stackTrace, exception, executionContextId);
    }
}
