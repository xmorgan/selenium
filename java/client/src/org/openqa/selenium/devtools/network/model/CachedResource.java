package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about the cached resource.
 */
public class CachedResource {

    private final java.lang.String url;

    private final org.openqa.selenium.devtools.network.model.ResourceType type;

    private final org.openqa.selenium.devtools.network.model.Response response;

    private final java.lang.Number bodySize;

    public CachedResource(java.lang.String url, org.openqa.selenium.devtools.network.model.ResourceType type, org.openqa.selenium.devtools.network.model.Response response, java.lang.Number bodySize) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.response = response;
        this.bodySize = java.util.Objects.requireNonNull(bodySize, "bodySize is required");
    }

    /**
     * Resource URL. This is the url of the original network request.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Type of this resource.
     */
    public org.openqa.selenium.devtools.network.model.ResourceType getType() {
        return type;
    }

    /**
     * Cached response data.
     */
    public org.openqa.selenium.devtools.network.model.Response getResponse() {
        return response;
    }

    /**
     * Cached response body size.
     */
    public java.lang.Number getBodySize() {
        return bodySize;
    }

    private static CachedResource fromJson(JsonInput input) {
        java.lang.String url = null;
        org.openqa.selenium.devtools.network.model.ResourceType type = null;
        org.openqa.selenium.devtools.network.model.Response response = null;
        java.lang.Number bodySize = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "type":
                    type = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "response":
                    response = input.read(org.openqa.selenium.devtools.network.model.Response.class);
                    break;
                case "bodySize":
                    bodySize = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CachedResource(url, type, response, bodySize);
    }
}
