package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when virtual machine parses script. This event is also fired for all known and uncollected
 * scripts upon enabling debugger.
 */
public class ScriptParsed {

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.String url;

    private final java.lang.Integer startLine;

    private final java.lang.Integer startColumn;

    private final java.lang.Integer endLine;

    private final java.lang.Integer endColumn;

    private final org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId;

    private final java.lang.String hash;

    private final java.util.Map<String, Object> executionContextAuxData;

    private final java.lang.Boolean isLiveEdit;

    private final java.lang.String sourceMapURL;

    private final java.lang.Boolean hasSourceURL;

    private final java.lang.Boolean isModule;

    private final java.lang.Integer length;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace;

    public ScriptParsed(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String url, java.lang.Integer startLine, java.lang.Integer startColumn, java.lang.Integer endLine, java.lang.Integer endColumn, org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId, java.lang.String hash, java.util.Map<String, Object> executionContextAuxData, java.lang.Boolean isLiveEdit, java.lang.String sourceMapURL, java.lang.Boolean hasSourceURL, java.lang.Boolean isModule, java.lang.Integer length, org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace) {
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.startLine = java.util.Objects.requireNonNull(startLine, "startLine is required");
        this.startColumn = java.util.Objects.requireNonNull(startColumn, "startColumn is required");
        this.endLine = java.util.Objects.requireNonNull(endLine, "endLine is required");
        this.endColumn = java.util.Objects.requireNonNull(endColumn, "endColumn is required");
        this.executionContextId = java.util.Objects.requireNonNull(executionContextId, "executionContextId is required");
        this.hash = java.util.Objects.requireNonNull(hash, "hash is required");
        this.executionContextAuxData = executionContextAuxData;
        this.isLiveEdit = isLiveEdit;
        this.sourceMapURL = sourceMapURL;
        this.hasSourceURL = hasSourceURL;
        this.isModule = isModule;
        this.length = length;
        this.stackTrace = stackTrace;
    }

    /**
     * Identifier of the script parsed.
     */
    public org.openqa.selenium.devtools.runtime.model.ScriptId getScriptId() {
        return scriptId;
    }

    /**
     * URL or name of the script parsed (if any).
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Line offset of the script within the resource with given URL (for script tags).
     */
    public java.lang.Integer getStartLine() {
        return startLine;
    }

    /**
     * Column offset of the script within the resource with given URL.
     */
    public java.lang.Integer getStartColumn() {
        return startColumn;
    }

    /**
     * Last line of the script.
     */
    public java.lang.Integer getEndLine() {
        return endLine;
    }

    /**
     * Length of the last line of the script.
     */
    public java.lang.Integer getEndColumn() {
        return endColumn;
    }

    /**
     * Specifies script creation context.
     */
    public org.openqa.selenium.devtools.runtime.model.ExecutionContextId getExecutionContextId() {
        return executionContextId;
    }

    /**
     * Content hash of the script.
     */
    public java.lang.String getHash() {
        return hash;
    }

    /**
     * Embedder-specific auxiliary data.
     */
    public java.util.Map<String, Object> getExecutionContextAuxData() {
        return executionContextAuxData;
    }

    /**
     * True, if this script is generated as a result of the live edit operation.
     */
    @Beta()
    public java.lang.Boolean getIsLiveEdit() {
        return isLiveEdit;
    }

    /**
     * URL of source map associated with script (if any).
     */
    public java.lang.String getSourceMapURL() {
        return sourceMapURL;
    }

    /**
     * True, if this script has sourceURL.
     */
    public java.lang.Boolean getHasSourceURL() {
        return hasSourceURL;
    }

    /**
     * True, if this script is ES6 module.
     */
    public java.lang.Boolean getIsModule() {
        return isModule;
    }

    /**
     * This script length.
     */
    public java.lang.Integer getLength() {
        return length;
    }

    /**
     * JavaScript top stack frame of where the script parsed event was triggered if available.
     */
    @Beta()
    public org.openqa.selenium.devtools.runtime.model.StackTrace getStackTrace() {
        return stackTrace;
    }

    private static ScriptParsed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.String url = null;
        java.lang.Integer startLine = null;
        java.lang.Integer startColumn = null;
        java.lang.Integer endLine = null;
        java.lang.Integer endColumn = null;
        org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId = null;
        java.lang.String hash = null;
        java.util.Map<String, Object> executionContextAuxData = null;
        java.lang.Boolean isLiveEdit = null;
        java.lang.String sourceMapURL = null;
        java.lang.Boolean hasSourceURL = null;
        java.lang.Boolean isModule = null;
        java.lang.Integer length = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "startLine":
                    startLine = input.nextNumber().intValue();
                    break;
                case "startColumn":
                    startColumn = input.nextNumber().intValue();
                    break;
                case "endLine":
                    endLine = input.nextNumber().intValue();
                    break;
                case "endColumn":
                    endColumn = input.nextNumber().intValue();
                    break;
                case "executionContextId":
                    executionContextId = input.read(org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class);
                    break;
                case "hash":
                    hash = input.nextString();
                    break;
                case "executionContextAuxData":
                    executionContextAuxData = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "isLiveEdit":
                    isLiveEdit = input.nextBoolean();
                    break;
                case "sourceMapURL":
                    sourceMapURL = input.nextString();
                    break;
                case "hasSourceURL":
                    hasSourceURL = input.nextBoolean();
                    break;
                case "isModule":
                    isModule = input.nextBoolean();
                    break;
                case "length":
                    length = input.nextNumber().intValue();
                    break;
                case "stackTrace":
                    stackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScriptParsed(scriptId, url, startLine, startColumn, endLine, endColumn, executionContextId, hash, executionContextAuxData, isLiveEdit, sourceMapURL, hasSourceURL, isModule, length, stackTrace);
    }
}
