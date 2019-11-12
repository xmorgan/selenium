package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued for every compilation cache generated. Is only available
 * if Page.setGenerateCompilationCache is enabled.
 */
@org.openqa.selenium.Beta()
public class CompilationCacheProduced {

    private final java.lang.String url;

    private final java.lang.String data;

    public CompilationCacheProduced(java.lang.String url, java.lang.String data) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.data = java.util.Objects.requireNonNull(data, "data is required");
    }

    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Base64-encoded data
     */
    public java.lang.String getData() {
        return data;
    }

    private static CompilationCacheProduced fromJson(JsonInput input) {
        java.lang.String url = null;
        java.lang.String data = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "data":
                    data = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CompilationCacheProduced(url, data);
    }
}
