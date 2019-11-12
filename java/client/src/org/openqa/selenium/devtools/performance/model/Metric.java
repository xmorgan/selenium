package org.openqa.selenium.devtools.performance.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Run-time execution metric.
 */
public class Metric {

    private final java.lang.String name;

    private final java.lang.Number value;

    public Metric(java.lang.String name, java.lang.Number value) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    /**
     * Metric name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Metric value.
     */
    public java.lang.Number getValue() {
        return value;
    }

    private static Metric fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.Number value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Metric(name, value);
    }
}
