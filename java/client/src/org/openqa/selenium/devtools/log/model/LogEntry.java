package org.openqa.selenium.devtools.log.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Log entry.
 */
public class LogEntry {

    public enum Source {

        XML("xml"),
        JAVASCRIPT("javascript"),
        NETWORK("network"),
        STORAGE("storage"),
        APPCACHE("appcache"),
        RENDERING("rendering"),
        SECURITY("security"),
        DEPRECATION("deprecation"),
        WORKER("worker"),
        VIOLATION("violation"),
        INTERVENTION("intervention"),
        RECOMMENDATION("recommendation"),
        OTHER("other");

        private String value;

        Source(String value) {
            this.value = value;
        }

        public static Source fromString(String s) {
            return java.util.Arrays.stream(Source.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Source "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Source fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    public enum Level {

        VERBOSE("verbose"), INFO("info"), WARNING("warning"), ERROR("error");

        private String value;

        Level(String value) {
            this.value = value;
        }

        public static Level fromString(String s) {
            return java.util.Arrays.stream(Level.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Level "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Level fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final Source source;

    private final Level level;

    private final java.lang.String text;

    private final org.openqa.selenium.devtools.runtime.model.Timestamp timestamp;

    private final java.lang.String url;

    private final java.lang.Integer lineNumber;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace;

    private final org.openqa.selenium.devtools.network.model.RequestId networkRequestId;

    private final java.lang.String workerId;

    private final java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> args;

    public LogEntry(Source source, Level level, java.lang.String text, org.openqa.selenium.devtools.runtime.model.Timestamp timestamp, java.lang.String url, java.lang.Integer lineNumber, org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace, org.openqa.selenium.devtools.network.model.RequestId networkRequestId, java.lang.String workerId, java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> args) {
        this.source = java.util.Objects.requireNonNull(source, "source is required");
        this.level = java.util.Objects.requireNonNull(level, "level is required");
        this.text = java.util.Objects.requireNonNull(text, "text is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.url = url;
        this.lineNumber = lineNumber;
        this.stackTrace = stackTrace;
        this.networkRequestId = networkRequestId;
        this.workerId = workerId;
        this.args = args;
    }

    /**
     * Log entry source.
     */
    public Source getSource() {
        return source;
    }

    /**
     * Log entry severity.
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Logged text.
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Timestamp when this entry was added.
     */
    public org.openqa.selenium.devtools.runtime.model.Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * URL of the resource if known.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Line number in the resource.
     */
    public java.lang.Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * JavaScript stack trace.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getStackTrace() {
        return stackTrace;
    }

    /**
     * Identifier of the network request associated with this entry.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getNetworkRequestId() {
        return networkRequestId;
    }

    /**
     * Identifier of the worker associated with this entry.
     */
    public java.lang.String getWorkerId() {
        return workerId;
    }

    /**
     * Call arguments.
     */
    public java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> getArgs() {
        return args;
    }

    private static LogEntry fromJson(JsonInput input) {
        Source source = null;
        Level level = null;
        java.lang.String text = null;
        org.openqa.selenium.devtools.runtime.model.Timestamp timestamp = null;
        java.lang.String url = null;
        java.lang.Integer lineNumber = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace stackTrace = null;
        org.openqa.selenium.devtools.network.model.RequestId networkRequestId = null;
        java.lang.String workerId = null;
        java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject> args = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "source":
                    source = Source.fromString(input.nextString());
                    break;
                case "level":
                    level = Level.fromString(input.nextString());
                    break;
                case "text":
                    text = input.nextString();
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.runtime.model.Timestamp.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "lineNumber":
                    lineNumber = input.nextNumber().intValue();
                    break;
                case "stackTrace":
                    stackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                case "networkRequestId":
                    networkRequestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "workerId":
                    workerId = input.nextString();
                    break;
                case "args":
                    args = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.RemoteObject>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LogEntry(source, level, text, timestamp, url, lineNumber, stackTrace, networkRequestId, workerId, args);
    }
}
