package org.openqa.selenium.devtools.cachestorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique identifier of the Cache object.
 */
public class CacheId {

    private final java.lang.String cacheId;

    public CacheId(java.lang.String cacheId) {
        this.cacheId = java.util.Objects.requireNonNull(cacheId, "Missing value for CacheId");
    }

    private static CacheId fromJson(JsonInput input) {
        return new CacheId(input.nextString());
    }

    public String toJson() {
        return cacheId.toString();
    }

    public String toString() {
        return cacheId.toString();
    }
}
