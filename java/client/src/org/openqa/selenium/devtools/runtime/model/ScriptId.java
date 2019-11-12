package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique script identifier.
 */
public class ScriptId {

    private final java.lang.String scriptId;

    public ScriptId(java.lang.String scriptId) {
        this.scriptId = java.util.Objects.requireNonNull(scriptId, "Missing value for ScriptId");
    }

    private static ScriptId fromJson(JsonInput input) {
        return new ScriptId(input.nextString());
    }

    public String toJson() {
        return scriptId.toString();
    }

    public String toString() {
        return scriptId.toString();
    }
}
