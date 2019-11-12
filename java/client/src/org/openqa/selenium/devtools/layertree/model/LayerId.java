package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique Layer identifier.
 */
public class LayerId {

    private final java.lang.String layerId;

    public LayerId(java.lang.String layerId) {
        this.layerId = java.util.Objects.requireNonNull(layerId, "Missing value for LayerId");
    }

    private static LayerId fromJson(JsonInput input) {
        return new LayerId(input.nextString());
    }

    public String toJson() {
        return layerId.toString();
    }

    public String toString() {
        return layerId.toString();
    }
}
