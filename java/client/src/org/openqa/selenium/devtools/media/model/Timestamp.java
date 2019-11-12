package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class Timestamp {

    private final java.lang.Number timestamp;

    public Timestamp(java.lang.Number timestamp) {
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "Missing value for Timestamp");
    }

    private static Timestamp fromJson(JsonInput input) {
        return new Timestamp(input.nextNumber());
    }

    public String toJson() {
        return timestamp.toString();
    }

    public String toString() {
        return timestamp.toString();
    }
}
