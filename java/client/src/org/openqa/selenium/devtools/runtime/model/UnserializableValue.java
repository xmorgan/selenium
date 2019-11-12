package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Primitive value which cannot be JSON-stringified. Includes values `-0`, `NaN`, `Infinity`,
 * `-Infinity`, and bigint literals.
 */
public class UnserializableValue {

    private final java.lang.String unserializableValue;

    public UnserializableValue(java.lang.String unserializableValue) {
        this.unserializableValue = java.util.Objects.requireNonNull(unserializableValue, "Missing value for UnserializableValue");
    }

    private static UnserializableValue fromJson(JsonInput input) {
        return new UnserializableValue(input.nextString());
    }

    public String toJson() {
        return unserializableValue.toString();
    }

    public String toString() {
        return unserializableValue.toString();
    }
}
