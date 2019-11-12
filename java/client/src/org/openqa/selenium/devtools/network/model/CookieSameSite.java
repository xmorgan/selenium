package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Represents the cookie's 'SameSite' status:
 * https://tools.ietf.org/html/draft-west-first-party-cookies
 */
public enum CookieSameSite {

    STRICT("Strict"), LAX("Lax"), EXTENDED("Extended"), NONE("None");

    private String value;

    CookieSameSite(String value) {
        this.value = value;
    }

    public static CookieSameSite fromString(String s) {
        return java.util.Arrays.stream(CookieSameSite.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CookieSameSite "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static CookieSameSite fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
