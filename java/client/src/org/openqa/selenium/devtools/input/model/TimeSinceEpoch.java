package org.openqa.selenium.devtools.input.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * UTC time in seconds, counted from January 1, 1970.
 */
public class TimeSinceEpoch {

    private final java.lang.Number timeSinceEpoch;

    public TimeSinceEpoch(java.lang.Number timeSinceEpoch) {
        this.timeSinceEpoch = java.util.Objects.requireNonNull(timeSinceEpoch, "Missing value for TimeSinceEpoch");
    }

    private static TimeSinceEpoch fromJson(JsonInput input) {
        return new TimeSinceEpoch(input.nextNumber());
    }

    public String toJson() {
        return timeSinceEpoch.toString();
    }

    public String toString() {
        return timeSinceEpoch.toString();
    }
}
