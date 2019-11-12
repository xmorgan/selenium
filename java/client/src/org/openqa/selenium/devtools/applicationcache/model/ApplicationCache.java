package org.openqa.selenium.devtools.applicationcache.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Detailed application cache information.
 */
public class ApplicationCache {

    private final java.lang.String manifestURL;

    private final java.lang.Number size;

    private final java.lang.Number creationTime;

    private final java.lang.Number updateTime;

    private final java.util.List<org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheResource> resources;

    public ApplicationCache(java.lang.String manifestURL, java.lang.Number size, java.lang.Number creationTime, java.lang.Number updateTime, java.util.List<org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheResource> resources) {
        this.manifestURL = java.util.Objects.requireNonNull(manifestURL, "manifestURL is required");
        this.size = java.util.Objects.requireNonNull(size, "size is required");
        this.creationTime = java.util.Objects.requireNonNull(creationTime, "creationTime is required");
        this.updateTime = java.util.Objects.requireNonNull(updateTime, "updateTime is required");
        this.resources = java.util.Objects.requireNonNull(resources, "resources is required");
    }

    /**
     * Manifest URL.
     */
    public java.lang.String getManifestURL() {
        return manifestURL;
    }

    /**
     * Application cache size.
     */
    public java.lang.Number getSize() {
        return size;
    }

    /**
     * Application cache creation time.
     */
    public java.lang.Number getCreationTime() {
        return creationTime;
    }

    /**
     * Application cache update time.
     */
    public java.lang.Number getUpdateTime() {
        return updateTime;
    }

    /**
     * Application cache resources.
     */
    public java.util.List<org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheResource> getResources() {
        return resources;
    }

    private static ApplicationCache fromJson(JsonInput input) {
        java.lang.String manifestURL = null;
        java.lang.Number size = null;
        java.lang.Number creationTime = null;
        java.lang.Number updateTime = null;
        java.util.List<org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheResource> resources = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "manifestURL":
                    manifestURL = input.nextString();
                    break;
                case "size":
                    size = input.nextNumber();
                    break;
                case "creationTime":
                    creationTime = input.nextNumber();
                    break;
                case "updateTime":
                    updateTime = input.nextNumber();
                    break;
                case "resources":
                    resources = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheResource>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ApplicationCache(manifestURL, size, creationTime, updateTime, resources);
    }
}
