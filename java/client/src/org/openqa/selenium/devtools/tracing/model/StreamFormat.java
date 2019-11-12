package org.openqa.selenium.devtools.tracing.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Data format of a trace. Can be either the legacy JSON format or the
 * protocol buffer format. Note that the JSON format will be deprecated soon.
 */
public enum StreamFormat {

    JSON("json"), PROTO("proto");

    private String value;

    StreamFormat(String value) {
        this.value = value;
    }

    public static StreamFormat fromString(String s) {
        return java.util.Arrays.stream(StreamFormat.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within StreamFormat "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static StreamFormat fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
