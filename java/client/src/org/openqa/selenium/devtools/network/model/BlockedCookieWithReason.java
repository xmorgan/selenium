package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A cookie with was not sent with a request with the corresponding reason.
 */
@org.openqa.selenium.Beta()
public class BlockedCookieWithReason {

    private final org.openqa.selenium.devtools.network.model.CookieBlockedReason blockedReason;

    private final org.openqa.selenium.devtools.network.model.Cookie cookie;

    public BlockedCookieWithReason(org.openqa.selenium.devtools.network.model.CookieBlockedReason blockedReason, org.openqa.selenium.devtools.network.model.Cookie cookie) {
        this.blockedReason = java.util.Objects.requireNonNull(blockedReason, "blockedReason is required");
        this.cookie = java.util.Objects.requireNonNull(cookie, "cookie is required");
    }

    /**
     * The reason the cookie was blocked.
     */
    public org.openqa.selenium.devtools.network.model.CookieBlockedReason getBlockedReason() {
        return blockedReason;
    }

    /**
     * The cookie object representing the cookie which was not sent.
     */
    public org.openqa.selenium.devtools.network.model.Cookie getCookie() {
        return cookie;
    }

    private static BlockedCookieWithReason fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.CookieBlockedReason blockedReason = null;
        org.openqa.selenium.devtools.network.model.Cookie cookie = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "blockedReason":
                    blockedReason = input.read(org.openqa.selenium.devtools.network.model.CookieBlockedReason.class);
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
        return new BlockedCookieWithReason(blockedReason, cookie);
    }
}
