package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Type profile data collected during runtime for a JavaScript script.
 */
@org.openqa.selenium.Beta()
public class ScriptTypeProfile {

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.String url;

    private final java.util.List<org.openqa.selenium.devtools.profiler.model.TypeProfileEntry> entries;

    public ScriptTypeProfile(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String url, java.util.List<org.openqa.selenium.devtools.profiler.model.TypeProfileEntry> entries) {
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.entries = java.util.Objects.requireNonNull(entries, "entries is required");
    }

    /**
     * JavaScript script id.
     */
    public org.openqa.selenium.devtools.runtime.model.ScriptId getScriptId() {
        return scriptId;
    }

    /**
     * JavaScript script name or url.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Type profile entries for parameters and return values of the functions in the script.
     */
    public java.util.List<org.openqa.selenium.devtools.profiler.model.TypeProfileEntry> getEntries() {
        return entries;
    }

    private static ScriptTypeProfile fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.String url = null;
        java.util.List<org.openqa.selenium.devtools.profiler.model.TypeProfileEntry> entries = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "entries":
                    entries = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.TypeProfileEntry>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScriptTypeProfile(scriptId, url, entries);
    }
}
