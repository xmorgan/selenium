package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The reason why request was blocked.
 */
public enum BlockedReason {

    OTHER("other"),
    CSP("csp"),
    MIXED_CONTENT("mixed-content"),
    ORIGIN("origin"),
    INSPECTOR("inspector"),
    SUBRESOURCE_FILTER("subresource-filter"),
    CONTENT_TYPE("content-type"),
    COLLAPSED_BY_CLIENT("collapsed-by-client");

    private String value;

    BlockedReason(String value) {
        this.value = value;
    }

    public static BlockedReason fromString(String s) {
        return java.util.Arrays.stream(BlockedReason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within BlockedReason "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static BlockedReason fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
