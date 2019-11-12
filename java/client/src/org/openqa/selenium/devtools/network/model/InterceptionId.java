package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique intercepted request identifier.
 */
public class InterceptionId {

    private final java.lang.String interceptionId;

    public InterceptionId(java.lang.String interceptionId) {
        this.interceptionId = java.util.Objects.requireNonNull(interceptionId, "Missing value for InterceptionId");
    }

    private static InterceptionId fromJson(JsonInput input) {
        return new InterceptionId(input.nextString());
    }

    public String toJson() {
        return interceptionId.toString();
    }

    public String toString() {
        return interceptionId.toString();
    }
}
