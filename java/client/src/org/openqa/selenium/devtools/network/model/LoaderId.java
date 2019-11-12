package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique loader identifier.
 */
public class LoaderId {

    private final java.lang.String loaderId;

    public LoaderId(java.lang.String loaderId) {
        this.loaderId = java.util.Objects.requireNonNull(loaderId, "Missing value for LoaderId");
    }

    private static LoaderId fromJson(JsonInput input) {
        return new LoaderId(input.nextString());
    }

    public String toJson() {
        return loaderId.toString();
    }

    public String toString() {
        return loaderId.toString();
    }
}
