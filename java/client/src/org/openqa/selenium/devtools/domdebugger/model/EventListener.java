package org.openqa.selenium.devtools.domdebugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object event listener.
 */
public class EventListener {

    private final java.lang.String type;

    private final java.lang.Boolean useCapture;

    private final java.lang.Boolean passive;

    private final java.lang.Boolean once;

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.Integer lineNumber;

    private final java.lang.Integer columnNumber;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject handler;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject originalHandler;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

    public EventListener(java.lang.String type, java.lang.Boolean useCapture, java.lang.Boolean passive, java.lang.Boolean once, org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.Integer lineNumber, java.lang.Integer columnNumber, org.openqa.selenium.devtools.runtime.model.RemoteObject handler, org.openqa.selenium.devtools.runtime.model.RemoteObject originalHandler, org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.useCapture = java.util.Objects.requireNonNull(useCapture, "useCapture is required");
        this.passive = java.util.Objects.requireNonNull(passive, "passive is required");
        this.once = java.util.Objects.requireNonNull(once, "once is required");
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.columnNumber = java.util.Objects.requireNonNull(columnNumber, "columnNumber is required");
        this.handler = handler;
        this.originalHandler = originalHandler;
        this.backendNodeId = backendNodeId;
    }

    /**
     * `EventListener`'s type.
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * `EventListener`'s useCapture.
     */
    public java.lang.Boolean getUseCapture() {
        return useCapture;
    }

    /**
     * `EventListener`'s passive flag.
     */
    public java.lang.Boolean getPassive() {
        return passive;
    }

    /**
     * `EventListener`'s once flag.
     */
    public java.lang.Boolean getOnce() {
        return once;
    }

    /**
     * Script id of the handler code.
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

    /**
     * Event handler function value.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getHandler() {
        return handler;
    }

    /**
     * Event original handler function value.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getOriginalHandler() {
        return originalHandler;
    }

    /**
     * Node the listener is added to (if any).
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
        return backendNodeId;
    }

    private static EventListener fromJson(JsonInput input) {
        java.lang.String type = null;
        java.lang.Boolean useCapture = null;
        java.lang.Boolean passive = null;
        java.lang.Boolean once = null;
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.Integer lineNumber = null;
        java.lang.Integer columnNumber = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject handler = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject originalHandler = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = input.nextString();
                    break;
                case "useCapture":
                    useCapture = input.nextBoolean();
                    break;
                case "passive":
                    passive = input.nextBoolean();
                    break;
                case "once":
                    once = input.nextBoolean();
                    break;
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "lineNumber":
                    lineNumber = input.nextNumber().intValue();
                    break;
                case "columnNumber":
                    columnNumber = input.nextNumber().intValue();
                    break;
                case "handler":
                    handler = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "originalHandler":
                    originalHandler = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new EventListener(type, useCapture, passive, once, scriptId, lineNumber, columnNumber, handler, originalHandler, backendNodeId);
    }
}
