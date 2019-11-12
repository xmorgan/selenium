package org.openqa.selenium.devtools.security.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A description of mixed content (HTTP resources on HTTPS pages), as defined by
 * https://www.w3.org/TR/mixed-content/#categories
 */
public enum MixedContentType {

    BLOCKABLE("blockable"), OPTIONALLY_BLOCKABLE("optionally-blockable"), NONE("none");

    private String value;

    MixedContentType(String value) {
        this.value = value;
    }

    public static MixedContentType fromString(String s) {
        return java.util.Arrays.stream(MixedContentType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within MixedContentType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static MixedContentType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
