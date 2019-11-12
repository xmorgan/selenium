package org.openqa.selenium.devtools.applicationcache.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Detailed application cache resource information.
 */
public class ApplicationCacheResource {

    private final java.lang.String url;

    private final java.lang.Integer size;

    private final java.lang.String type;

    public ApplicationCacheResource(java.lang.String url, java.lang.Integer size, java.lang.String type) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.size = java.util.Objects.requireNonNull(size, "size is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
    }

    /**
     * Resource url.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Resource size.
     */
    public java.lang.Integer getSize() {
        return size;
    }

    /**
     * Resource type.
     */
    public java.lang.String getType() {
        return type;
    }

    private static ApplicationCacheResource fromJson(JsonInput input) {
        java.lang.String url = null;
        java.lang.Integer size = null;
        java.lang.String type = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "size":
                    size = input.nextNumber().intValue();
                    break;
                case "type":
                    type = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ApplicationCacheResource(url, size, type);
    }
}
