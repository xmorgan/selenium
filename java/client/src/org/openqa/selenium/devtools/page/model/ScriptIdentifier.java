package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique script identifier.
 */
public class ScriptIdentifier {

    private final java.lang.String scriptIdentifier;

    public ScriptIdentifier(java.lang.String scriptIdentifier) {
        this.scriptIdentifier = java.util.Objects.requireNonNull(scriptIdentifier, "Missing value for ScriptIdentifier");
    }

    private static ScriptIdentifier fromJson(JsonInput input) {
        return new ScriptIdentifier(input.nextString());
    }

    public String toJson() {
        return scriptIdentifier.toString();
    }

    public String toString() {
        return scriptIdentifier.toString();
    }
}
