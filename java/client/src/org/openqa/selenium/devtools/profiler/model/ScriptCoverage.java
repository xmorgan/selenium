package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Coverage data for a JavaScript script.
 */
public class ScriptCoverage {

    private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

    private final java.lang.String url;

    private final java.util.List<org.openqa.selenium.devtools.profiler.model.FunctionCoverage> functions;

    public ScriptCoverage(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String url, java.util.List<org.openqa.selenium.devtools.profiler.model.FunctionCoverage> functions) {
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.functions = java.util.Objects.requireNonNull(functions, "functions is required");
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
     * Functions contained in the script that has coverage data.
     */
    public java.util.List<org.openqa.selenium.devtools.profiler.model.FunctionCoverage> getFunctions() {
        return functions;
    }

    private static ScriptCoverage fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
        java.lang.String url = null;
        java.util.List<org.openqa.selenium.devtools.profiler.model.FunctionCoverage> functions = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "scriptId":
                    scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "functions":
                    functions = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.FunctionCoverage>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScriptCoverage(scriptId, url, functions);
    }
}
