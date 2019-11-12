package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Call frame identifier.
 */
public class CallFrameId {

    private final java.lang.String callFrameId;

    public CallFrameId(java.lang.String callFrameId) {
        this.callFrameId = java.util.Objects.requireNonNull(callFrameId, "Missing value for CallFrameId");
    }

    private static CallFrameId fromJson(JsonInput input) {
        return new CallFrameId(input.nextString());
    }

    public String toJson() {
        return callFrameId.toString();
    }

    public String toString() {
        return callFrameId.toString();
    }
}
