package org.openqa.selenium.devtools.cachestorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Cache identifier.
 */
public class Cache {

    private final org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId;

    private final java.lang.String securityOrigin;

    private final java.lang.String cacheName;

    public Cache(org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId, java.lang.String securityOrigin, java.lang.String cacheName) {
        this.cacheId = java.util.Objects.requireNonNull(cacheId, "cacheId is required");
        this.securityOrigin = java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        this.cacheName = java.util.Objects.requireNonNull(cacheName, "cacheName is required");
    }

    /**
     * An opaque unique id of the cache.
     */
    public org.openqa.selenium.devtools.cachestorage.model.CacheId getCacheId() {
        return cacheId;
    }

    /**
     * Security origin of the cache.
     */
    public java.lang.String getSecurityOrigin() {
        return securityOrigin;
    }

    /**
     * The name of the cache.
     */
    public java.lang.String getCacheName() {
        return cacheName;
    }

    private static Cache fromJson(JsonInput input) {
        org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId = null;
        java.lang.String securityOrigin = null;
        java.lang.String cacheName = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "cacheId":
                    cacheId = input.read(org.openqa.selenium.devtools.cachestorage.model.CacheId.class);
                    break;
                case "securityOrigin":
                    securityOrigin = input.nextString();
                    break;
                case "cacheName":
                    cacheName = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Cache(cacheId, securityOrigin, cacheName);
    }
}
