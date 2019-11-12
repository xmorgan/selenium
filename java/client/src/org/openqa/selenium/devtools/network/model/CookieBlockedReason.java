package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Types of reasons why a cookie may not be sent with a request.
 */
@org.openqa.selenium.Beta()
public enum CookieBlockedReason {

    SECUREONLY("SecureOnly"),
    NOTONPATH("NotOnPath"),
    DOMAINMISMATCH("DomainMismatch"),
    SAMESITESTRICT("SameSiteStrict"),
    SAMESITELAX("SameSiteLax"),
    SAMESITEEXTENDED("SameSiteExtended"),
    SAMESITEUNSPECIFIEDTREATEDASLAX("SameSiteUnspecifiedTreatedAsLax"),
    SAMESITENONEINSECURE("SameSiteNoneInsecure"),
    USERPREFERENCES("UserPreferences"),
    UNKNOWNERROR("UnknownError");

    private String value;

    CookieBlockedReason(String value) {
        this.value = value;
    }

    public static CookieBlockedReason fromString(String s) {
        return java.util.Arrays.stream(CookieBlockedReason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CookieBlockedReason "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static CookieBlockedReason fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
