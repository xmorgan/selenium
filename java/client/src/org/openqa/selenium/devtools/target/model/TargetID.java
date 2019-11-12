package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class TargetID {

    private final java.lang.String targetID;

    public TargetID(java.lang.String targetID) {
        this.targetID = java.util.Objects.requireNonNull(targetID, "Missing value for TargetID");
    }

    private static TargetID fromJson(JsonInput input) {
        return new TargetID(input.nextString());
    }

    public String toJson() {
        return targetID.toString();
    }

    public String toString() {
        return targetID.toString();
    }
}
