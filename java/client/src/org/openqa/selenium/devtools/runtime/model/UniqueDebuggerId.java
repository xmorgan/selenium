package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique identifier of current debugger.
 */
@org.openqa.selenium.Beta()
public class UniqueDebuggerId {

    private final java.lang.String uniqueDebuggerId;

    public UniqueDebuggerId(java.lang.String uniqueDebuggerId) {
        this.uniqueDebuggerId = java.util.Objects.requireNonNull(uniqueDebuggerId, "Missing value for UniqueDebuggerId");
    }

    private static UniqueDebuggerId fromJson(JsonInput input) {
        return new UniqueDebuggerId(input.nextString());
    }

    public String toJson() {
        return uniqueDebuggerId.toString();
    }

    public String toString() {
        return uniqueDebuggerId.toString();
    }
}
