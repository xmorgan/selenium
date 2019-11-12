package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when console API was called.
 */
public class ConsoleAPICalled {

    public enum Type {

        LOG("log"),
        DEBUG("debug"),
        INFO("info"),
        ERROR("error"),
        WARNING("warning"),
        DIR("dir"),
        DIRXML("dirxml"),
        TABLE("table"),
        TRACE("trace"),
        CLEAR("clear"),
        STARTGROUP("startGroup"),
        STARTGROUPCOLLAPSED("startGroupCollapsed"),
        ENDGROUP("endGroup"),
        ASSERT("assert"),
        PROFILE("profile"),
        PROFILEEND("profileEnd"),
        COUNT("count"),
        TIMEEND("timeEnd");

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

    private final java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> args;

    private final org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId;

    private final org.openqa.selenium.devtools.runtime.model.Timestamp timestamp;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace;

    private final java.lang.String context;

    public ConsoleAPICalled(Type type, java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> args, org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId, org.openqa.selenium.devtools.runtime.model.Timestamp timestamp, org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace, java.lang.String context) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.args = java.util.Objects.requireNonNull(args, "args is required");
        this.executionContextId = java.util.Objects.requireNonNull(executionContextId, "executionContextId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.stackTrace = stackTrace;
        this.context = context;
    }

    /**
     * Type of the call.
     */
    public Type getType() {
        return type;
    }

    /**
     * Call arguments.
     */
    public java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> getArgs() {
        return args;
    }

    /**
     * Identifier of the context where the call was made.
     */
    public org.openqa.selenium.devtools.runtime.model.ExecutionContextId getExecutionContextId() {
        return executionContextId;
    }

    /**
     * Call timestamp.
     */
    public org.openqa.selenium.devtools.runtime.model.Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Stack trace captured when the call was made. The async stack chain is automatically reported for
     * the following call types: `assert`, `error`, `trace`, `warning`. For other types the async call
     * chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getStackTrace() {
        return stackTrace;
    }

    /**
     * Console context descriptor for calls on non-default console context (not console.*):
     * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call
     * on named context.
     */
    @Beta()
    public java.lang.String getContext() {
        return context;
    }

    private static ConsoleAPICalled fromJson(JsonInput input) {
        Type type = null;
        java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> args = null;
        org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId = null;
        org.openqa.selenium.devtools.runtime.model.Timestamp timestamp = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace = null;
        java.lang.String context = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "args":
                    args = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject>>() {
                    }.getType());
                    break;
                case "executionContextId":
                    executionContextId = input.read(org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.runtime.model.Timestamp.class);
                    break;
                case "stackTrace":
                    stackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                case "context":
                    context = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ConsoleAPICalled(type, args, executionContextId, timestamp, stackTrace, context);
    }
}
