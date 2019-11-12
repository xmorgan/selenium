package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 */
public class Paused {

    public enum Reason {

        AMBIGUOUS("ambiguous"),
        ASSERT("assert"),
        DEBUGCOMMAND("debugCommand"),
        DOM("DOM"),
        EVENTLISTENER("EventListener"),
        EXCEPTION("exception"),
        INSTRUMENTATION("instrumentation"),
        OOM("OOM"),
        OTHER("other"),
        PROMISEREJECTION("promiseRejection"),
        XHR("XHR");

        private String value;

        Reason(String value) {
            this.value = value;
        }

        public static Reason fromString(String s) {
            return java.util.Arrays.stream(Reason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Reason "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Reason fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames;

    private final Reason reason;

    private final java.util.Map<String, Object> data;

    private final java.util.List<java.lang.String> hitBreakpoints;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace;

    private final org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId;

    private final org.openqa.selenium.devtools.runtime.model.StackTraceId asyncCallStackTraceId;

    public Paused(java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames, Reason reason, java.util.Map<String, Object> data, java.util.List<java.lang.String> hitBreakpoints, org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace, org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId, org.openqa.selenium.devtools.runtime.model.StackTraceId asyncCallStackTraceId) {
        this.callFrames = java.util.Objects.requireNonNull(callFrames, "callFrames is required");
        this.reason = java.util.Objects.requireNonNull(reason, "reason is required");
        this.data = data;
        this.hitBreakpoints = hitBreakpoints;
        this.asyncStackTrace = asyncStackTrace;
        this.asyncStackTraceId = asyncStackTraceId;
        this.asyncCallStackTraceId = asyncCallStackTraceId;
    }

    /**
     * Call stack the virtual machine stopped on.
     */
    public java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> getCallFrames() {
        return callFrames;
    }

    /**
     * Pause reason.
     */
    public Reason getReason() {
        return reason;
    }

    /**
     * Object containing break-specific auxiliary properties.
     */
    public java.util.Map<String, Object> getData() {
        return data;
    }

    /**
     * Hit breakpoints IDs
     */
    public java.util.List<java.lang.String> getHitBreakpoints() {
        return hitBreakpoints;
    }

    /**
     * Async stack trace, if any.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getAsyncStackTrace() {
        return asyncStackTrace;
    }

    /**
     * Async stack trace, if any.
     */
    @Beta()
    public org.openqa.selenium.devtools.runtime.model.StackTraceId getAsyncStackTraceId() {
        return asyncStackTraceId;
    }

    /**
     * Just scheduled async call will have this stack trace as parent stack during async execution.
     * This field is available only after `Debugger.stepInto` call with `breakOnAsynCall` flag.
     */
    @Beta()
    public org.openqa.selenium.devtools.runtime.model.StackTraceId getAsyncCallStackTraceId() {
        return asyncCallStackTraceId;
    }

    private static Paused fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames = null;
        Reason reason = null;
        java.util.Map<String, Object> data = null;
        java.util.List<java.lang.String> hitBreakpoints = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace = null;
        org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId = null;
        org.openqa.selenium.devtools.runtime.model.StackTraceId asyncCallStackTraceId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "callFrames":
                    callFrames = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame>>() {
                    }.getType());
                    break;
                case "reason":
                    reason = Reason.fromString(input.nextString());
                    break;
                case "data":
                    data = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "hitBreakpoints":
                    hitBreakpoints = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "asyncStackTrace":
                    asyncStackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                case "asyncStackTraceId":
                    asyncStackTraceId = input.read(org.openqa.selenium.devtools.runtime.model.StackTraceId.class);
                    break;
                case "asyncCallStackTraceId":
                    asyncCallStackTraceId = input.read(org.openqa.selenium.devtools.runtime.model.StackTraceId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Paused(callFrames, reason, data, hitBreakpoints, asyncStackTrace, asyncStackTraceId, asyncCallStackTraceId);
    }
}
