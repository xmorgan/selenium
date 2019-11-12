package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique frame identifier.
 */
public class FrameId {

    private final java.lang.String frameId;

    public FrameId(java.lang.String frameId) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "Missing value for FrameId");
    }

    private static FrameId fromJson(JsonInput input) {
        return new FrameId(input.nextString());
    }

    public String toJson() {
        return frameId.toString();
    }

    public String toString() {
        return frameId.toString();
    }
}
