package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Cookie parameter object
 */
public class CookieParam {

    private final java.lang.String name;

    private final java.lang.String value;

    private final java.lang.String url;

    private final java.lang.String domain;

    private final java.lang.String path;

    private final java.lang.Boolean secure;

    private final java.lang.Boolean httpOnly;

    private final org.openqa.selenium.devtools.network.model.CookieSameSite sameSite;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch expires;

    public CookieParam(java.lang.String name, java.lang.String value, java.lang.String url, java.lang.String domain, java.lang.String path, java.lang.Boolean secure, java.lang.Boolean httpOnly, org.openqa.selenium.devtools.network.model.CookieSameSite sameSite, org.openqa.selenium.devtools.network.model.TimeSinceEpoch expires) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
        this.url = url;
        this.domain = domain;
        this.path = path;
        this.secure = secure;
        this.httpOnly = httpOnly;
        this.sameSite = sameSite;
        this.expires = expires;
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
     * The request-URI to associate with the setting of the cookie. This value can affect the
     * default domain and path values of the created cookie.
     */
    public java.lang.String getUrl() {
        return url;
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
     * True if cookie is secure.
     */
    public java.lang.Boolean getSecure() {
        return secure;
    }

    /**
     * True if cookie is http-only.
     */
    public java.lang.Boolean getHttpOnly() {
        return httpOnly;
    }

    /**
     * Cookie SameSite type.
     */
    public org.openqa.selenium.devtools.network.model.CookieSameSite getSameSite() {
        return sameSite;
    }

    /**
     * Cookie expiration date, session cookie if not set
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getExpires() {
        return expires;
    }

    private static CookieParam fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String value = null;
        java.lang.String url = null;
        java.lang.String domain = null;
        java.lang.String path = null;
        java.lang.Boolean secure = null;
        java.lang.Boolean httpOnly = null;
        org.openqa.selenium.devtools.network.model.CookieSameSite sameSite = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch expires = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "domain":
                    domain = input.nextString();
                    break;
                case "path":
                    path = input.nextString();
                    break;
                case "secure":
                    secure = input.nextBoolean();
                    break;
                case "httpOnly":
                    httpOnly = input.nextBoolean();
                    break;
                case "sameSite":
                    sameSite = input.read(org.openqa.selenium.devtools.network.model.CookieSameSite.class);
                    break;
                case "expires":
                    expires = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CookieParam(name, value, url, domain, path, secure, httpOnly, sameSite, expires);
    }
}
