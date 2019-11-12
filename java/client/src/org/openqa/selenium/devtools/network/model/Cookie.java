package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Cookie object
 */
public class Cookie {

    private final java.lang.String name;

    private final java.lang.String value;

    private final java.lang.String domain;

    private final java.lang.String path;

    private final java.lang.Number expires;

    private final java.lang.Integer size;

    private final java.lang.Boolean httpOnly;

    private final java.lang.Boolean secure;

    private final java.lang.Boolean session;

    private final org.openqa.selenium.devtools.network.model.CookieSameSite sameSite;

    public Cookie(java.lang.String name, java.lang.String value, java.lang.String domain, java.lang.String path, java.lang.Number expires, java.lang.Integer size, java.lang.Boolean httpOnly, java.lang.Boolean secure, java.lang.Boolean session, org.openqa.selenium.devtools.network.model.CookieSameSite sameSite) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
        this.domain = java.util.Objects.requireNonNull(domain, "domain is required");
        this.path = java.util.Objects.requireNonNull(path, "path is required");
        this.expires = java.util.Objects.requireNonNull(expires, "expires is required");
        this.size = java.util.Objects.requireNonNull(size, "size is required");
        this.httpOnly = java.util.Objects.requireNonNull(httpOnly, "httpOnly is required");
        this.secure = java.util.Objects.requireNonNull(secure, "secure is required");
        this.session = java.util.Objects.requireNonNull(session, "session is required");
        this.sameSite = sameSite;
    }

    /**
     * Cookie name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Cookie value.
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Cookie domain.
     */
    public java.lang.String getDomain() {
        return domain;
    }

    /**
     * Cookie path.
     */
    public java.lang.String getPath() {
        return path;
    }

    /**
     * Cookie expiration date as the number of seconds since the UNIX epoch.
     */
    public java.lang.Number getExpires() {
        return expires;
    }

    /**
     * Cookie size.
     */
    public java.lang.Integer getSize() {
        return size;
    }

    /**
     * True if cookie is http-only.
     */
    public java.lang.Boolean getHttpOnly() {
        return httpOnly;
    }

    /**
     * True if cookie is secure.
     */
    public java.lang.Boolean getSecure() {
        return secure;
    }

    /**
     * True in case of session cookie.
     */
    public java.lang.Boolean getSession() {
        return session;
    }

    /**
     * Cookie SameSite type.
     */
    public org.openqa.selenium.devtools.network.model.CookieSameSite getSameSite() {
        return sameSite;
    }

    private static Cookie fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String value = null;
        java.lang.String domain = null;
        java.lang.String path = null;
        java.lang.Number expires = null;
        java.lang.Integer size = null;
        java.lang.Boolean httpOnly = null;
        java.lang.Boolean secure = null;
        java.lang.Boolean session = null;
        org.openqa.selenium.devtools.network.model.CookieSameSite sameSite = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                case "domain":
                    domain = input.nextString();
                    break;
                case "path":
                    path = input.nextString();
                    break;
                case "expires":
                    expires = input.nextNumber();
                    break;
                case "size":
                    size = input.nextNumber().intValue();
                    break;
                case "httpOnly":
                    httpOnly = input.nextBoolean();
                    break;
                case "secure":
                    secure = input.nextBoolean();
                    break;
                case "session":
                    session = input.nextBoolean();
                    break;
                case "sameSite":
                    sameSite = input.read(org.openqa.selenium.devtools.network.model.CookieSameSite.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Cookie(name, value, domain, path, expires, size, httpOnly, secure, session, sameSite);
    }
}
