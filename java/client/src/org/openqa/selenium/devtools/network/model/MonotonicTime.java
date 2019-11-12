package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Monotonically increasing time in seconds since an arbitrary point in the past.
 */
public class MonotonicTime {

    private final java.lang.Number monotonicTime;

    public MonotonicTime(java.lang.Number monotonicTime) {
        this.monotonicTime = java.util.Objects.requireNonNull(monotonicTime, "Missing value for MonotonicTime");
    }

    private static MonotonicTime fromJson(JsonInput input) {
        return new MonotonicTime(input.nextNumber());
    }

    public String toJson() {
        return monotonicTime.toString();
    }

    public String toString() {
        return monotonicTime.toString();
    }
}
