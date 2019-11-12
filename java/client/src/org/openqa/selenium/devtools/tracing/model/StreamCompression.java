package org.openqa.selenium.devtools.tracing.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Compression type to use for traces returned via streams.
 */
public enum StreamCompression {

    NONE("none"), GZIP("gzip");

    private String value;

    StreamCompression(String value) {
        this.value = value;
    }

    public static StreamCompression fromString(String s) {
        return java.util.Arrays.stream(StreamCompression.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within StreamCompression "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static StreamCompression fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
