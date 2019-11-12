package org.openqa.selenium.devtools.cachestorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * type of HTTP response cached
 */
public enum CachedResponseType {

    BASIC("basic"),
    CORS("cors"),
    DEFAULT("default"),
    ERROR("error"),
    OPAQUERESPONSE("opaqueResponse"),
    OPAQUEREDIRECT("opaqueRedirect");

    private String value;

    CachedResponseType(String value) {
        this.value = value;
    }

    public static CachedResponseType fromString(String s) {
        return java.util.Arrays.stream(CachedResponseType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CachedResponseType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static CachedResponseType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
