package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
 * issued multiple times per target if multiple sessions have been attached to it.
 */
@org.openqa.selenium.Beta()
public class DetachedFromTarget {

    private final org.openqa.selenium.devtools.target.model.SessionID sessionId;

    private final org.openqa.selenium.devtools.target.model.TargetID targetId;

    public DetachedFromTarget(org.openqa.selenium.devtools.target.model.SessionID sessionId, org.openqa.selenium.devtools.target.model.TargetID targetId) {
        this.sessionId = java.util.Objects.requireNonNull(sessionId, "sessionId is required");
        this.targetId = targetId;
    }

    /**
     * Detached session identifier.
     */
    public org.openqa.selenium.devtools.target.model.SessionID getSessionId() {
        return sessionId;
    }

    /**
     * Deprecated.
     */
    @Deprecated()
    public org.openqa.selenium.devtools.target.model.TargetID getTargetId() {
        return targetId;
    }

    private static DetachedFromTarget fromJson(JsonInput input) {
        org.openqa.selenium.devtools.target.model.SessionID sessionId = null;
        org.openqa.selenium.devtools.target.model.TargetID targetId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "sessionId":
                    sessionId = input.read(org.openqa.selenium.devtools.target.model.SessionID.class);
                    break;
                case "targetId":
                    targetId = input.read(org.openqa.selenium.devtools.target.model.TargetID.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DetachedFromTarget(sessionId, targetId);
    }
}
