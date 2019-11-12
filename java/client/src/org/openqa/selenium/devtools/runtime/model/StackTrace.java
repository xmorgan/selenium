package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Call frames for assertions or error messages.
 */
public class StackTrace {

    private final java.lang.String description;

    private final java.util.List<org.openqa.selenium.devtools.runtime.model.CallFrame> callFrames;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace parent;

    private final org.openqa.selenium.devtools.runtime.model.StackTraceId parentId;

    public StackTrace(java.lang.String description, java.util.List<org.openqa.selenium.devtools.runtime.model.CallFrame> callFrames, org.openqa.selenium.devtools.runtime.model.StackTrace parent, org.openqa.selenium.devtools.runtime.model.StackTraceId parentId) {
        this.description = description;
        this.callFrames = java.util.Objects.requireNonNull(callFrames, "callFrames is required");
        this.parent = parent;
        this.parentId = parentId;
    }

    /**
     * String label of this stack trace. For async traces this may be a name of the function that
     * initiated the async call.
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * JavaScript function name.
     */
    public java.util.List<org.openqa.selenium.devtools.runtime.model.CallFrame> getCallFrames() {
        return callFrames;
    }

    /**
     * Asynchronous JavaScript stack trace that preceded this stack, if available.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getParent() {
        return parent;
    }

    /**
     * Asynchronous JavaScript stack trace that preceded this stack, if available.
     */
    @Beta()
    public org.openqa.selenium.devtools.runtime.model.StackTraceId getParentId() {
        return parentId;
    }

    private static StackTrace fromJson(JsonInput input) {
        java.lang.String description = null;
        java.util.List<org.openqa.selenium.devtools.runtime.model.CallFrame> callFrames = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace parent = null;
        org.openqa.selenium.devtools.runtime.model.StackTraceId parentId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "description":
                    description = input.nextString();
                    break;
                case "callFrames":
                    callFrames = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.CallFrame>>() {
                    }.getType());
                    break;
                case "parent":
                    parent = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                case "parentId":
                    parentId = input.read(org.openqa.selenium.devtools.runtime.model.StackTraceId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new StackTrace(description, callFrames, parent, parentId);
    }
}
