package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Array of timings, one per paint step.
 */
public class PaintProfile {

    private final java.util.List<java.lang.Number> paintProfile;

    public PaintProfile(java.util.List<java.lang.Number> paintProfile) {
        this.paintProfile = java.util.Objects.requireNonNull(paintProfile, "Missing value for PaintProfile");
    }

    private static PaintProfile fromJson(JsonInput input) {
        return input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Number>>() {
        }.getType());
    }

    public String toString() {
        return paintProfile.toString();
    }
}
