package org.openqa.selenium.devtools.cachestorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Cached response
 */
public class CachedResponse {

    private final java.lang.String body;

    public CachedResponse(java.lang.String body) {
        this.body = java.util.Objects.requireNonNull(body, "body is required");
    }

    /**
     * Entry content, base64-encoded.
     */
    public java.lang.String getBody() {
        return body;
    }

    private static CachedResponse fromJson(JsonInput input) {
        java.lang.String body = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "body":
                    body = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CachedResponse(body);
    }
}
