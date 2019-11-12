package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A cookie which was not stored from a response with the corresponding reason.
 */
@org.openqa.selenium.Beta()
public class BlockedSetCookieWithReason {

    private final org.openqa.selenium.devtools.network.model.SetCookieBlockedReason blockedReason;

    private final java.lang.String cookieLine;

    private final org.openqa.selenium.devtools.network.model.Cookie cookie;

    public BlockedSetCookieWithReason(org.openqa.selenium.devtools.network.model.SetCookieBlockedReason blockedReason, java.lang.String cookieLine, org.openqa.selenium.devtools.network.model.Cookie cookie) {
        this.blockedReason = java.util.Objects.requireNonNull(blockedReason, "blockedReason is required");
        this.cookieLine = java.util.Objects.requireNonNull(cookieLine, "cookieLine is required");
        this.cookie = cookie;
    }

    /**
     * The reason this cookie was blocked.
     */
    public org.openqa.selenium.devtools.network.model.SetCookieBlockedReason getBlockedReason() {
        return blockedReason;
    }

    /**
     * The string representing this individual cookie as it would appear in the header.
     * This is not the entire "cookie" or "set-cookie" header which could have multiple cookies.
     */
    public java.lang.String getCookieLine() {
        return cookieLine;
    }

    /**
     * The cookie object which represents the cookie which was not stored. It is optional because
     * sometimes complete cookie information is not available, such as in the case of parsing
     * errors.
     */
    public org.openqa.selenium.devtools.network.model.Cookie getCookie() {
        return cookie;
    }

    private static BlockedSetCookieWithReason fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.SetCookieBlockedReason blockedReason = null;
        java.lang.String cookieLine = null;
        org.openqa.selenium.devtools.network.model.Cookie cookie = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "blockedReason":
                    blockedReason = input.read(org.openqa.selenium.devtools.network.model.SetCookieBlockedReason.class);
                    break;
                case "cookieLine":
                    cookieLine = input.nextString();
                    break;
                case "cookie":
                    cookie = input.read(org.openqa.selenium.devtools.network.model.Cookie.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BlockedSetCookieWithReason(blockedReason, cookieLine, cookie);
    }
}
