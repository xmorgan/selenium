package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Number of milliseconds.
 */
public class TimeDelta {

    private final java.lang.Number timeDelta;

    public TimeDelta(java.lang.Number timeDelta) {
        this.timeDelta = java.util.Objects.requireNonNull(timeDelta, "Missing value for TimeDelta");
    }

    private static TimeDelta fromJson(JsonInput input) {
        return new TimeDelta(input.nextNumber());
    }

    public String toJson() {
        return timeDelta.toString();
    }

    public String toString() {
        return timeDelta.toString();
    }
}
