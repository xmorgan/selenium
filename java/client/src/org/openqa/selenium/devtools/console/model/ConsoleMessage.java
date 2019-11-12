package org.openqa.selenium.devtools.console.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Console message.
 */
public class ConsoleMessage {

    public enum Source {

        XML("xml"),
        JAVASCRIPT("javascript"),
        NETWORK("network"),
        CONSOLE_API("console-api"),
        STORAGE("storage"),
        APPCACHE("appcache"),
        RENDERING("rendering"),
        SECURITY("security"),
        OTHER("other"),
        DEPRECATION("deprecation"),
        WORKER("worker");

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

        LOG("log"), WARNING("warning"), ERROR("error"), DEBUG("debug"), INFO("info");

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

    private final java.lang.String url;

    private final java.lang.Integer line;

    private final java.lang.Integer column;

    public ConsoleMessage(Source source, Level level, java.lang.String text, java.lang.String url, java.lang.Integer line, java.lang.Integer column) {
        this.source = java.util.Objects.requireNonNull(source, "source is required");
        this.level = java.util.Objects.requireNonNull(level, "level is required");
        this.text = java.util.Objects.requireNonNull(text, "text is required");
        this.url = url;
        this.line = line;
        this.column = column;
    }

    /**
     * Message source.
     */
    public Source getSource() {
        return source;
    }

    /**
     * Message severity.
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Message text.
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * URL of the message origin.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Line number in the resource that generated this message (1-based).
     */
    public java.lang.Integer getLine() {
        return line;
    }

    /**
     * Column number in the resource that generated this message (1-based).
     */
    public java.lang.Integer getColumn() {
        return column;
    }

    private static ConsoleMessage fromJson(JsonInput input) {
        Source source = null;
        Level level = null;
        java.lang.String text = null;
        java.lang.String url = null;
        java.lang.Integer line = null;
        java.lang.Integer column = null;
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
                case "url":
                    url = input.nextString();
                    break;
                case "line":
                    line = input.nextNumber().intValue();
                    break;
                case "column":
                    column = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ConsoleMessage(source, level, text, url, line, column);
    }
}
