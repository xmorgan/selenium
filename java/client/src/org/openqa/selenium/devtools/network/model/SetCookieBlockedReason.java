package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Types of reasons why a cookie may not be stored from a response.
 */
@org.openqa.selenium.Beta()
public enum SetCookieBlockedReason {

    SECUREONLY("SecureOnly"),
    SAMESITESTRICT("SameSiteStrict"),
    SAMESITELAX("SameSiteLax"),
    SAMESITEEXTENDED("SameSiteExtended"),
    SAMESITEUNSPECIFIEDTREATEDASLAX("SameSiteUnspecifiedTreatedAsLax"),
    SAMESITENONEINSECURE("SameSiteNoneInsecure"),
    USERPREFERENCES("UserPreferences"),
    SYNTAXERROR("SyntaxError"),
    SCHEMENOTSUPPORTED("SchemeNotSupported"),
    OVERWRITESECURE("OverwriteSecure"),
    INVALIDDOMAIN("InvalidDomain"),
    INVALIDPREFIX("InvalidPrefix"),
    UNKNOWNERROR("UnknownError");

    private String value;

    SetCookieBlockedReason(String value) {
        this.value = value;
    }

    public static SetCookieBlockedReason fromString(String s) {
        return java.util.Arrays.stream(SetCookieBlockedReason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetCookieBlockedReason "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static SetCookieBlockedReason fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
