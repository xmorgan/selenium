package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when attached to target because of auto-attach or `attachToTarget` command.
 */
@org.openqa.selenium.Beta()
public class AttachedToTarget {

    private final org.openqa.selenium.devtools.target.model.SessionID sessionId;

    private final org.openqa.selenium.devtools.target.model.TargetInfo targetInfo;

    private final java.lang.Boolean waitingForDebugger;

    public AttachedToTarget(org.openqa.selenium.devtools.target.model.SessionID sessionId, org.openqa.selenium.devtools.target.model.TargetInfo targetInfo, java.lang.Boolean waitingForDebugger) {
        this.sessionId = java.util.Objects.requireNonNull(sessionId, "sessionId is required");
        this.targetInfo = java.util.Objects.requireNonNull(targetInfo, "targetInfo is required");
        this.waitingForDebugger = java.util.Objects.requireNonNull(waitingForDebugger, "waitingForDebugger is required");
    }

    /**
     * Identifier assigned to the session used to send/receive messages.
     */
    public org.openqa.selenium.devtools.target.model.SessionID getSessionId() {
        return sessionId;
    }

    public org.openqa.selenium.devtools.target.model.TargetInfo getTargetInfo() {
        return targetInfo;
    }

    public java.lang.Boolean getWaitingForDebugger() {
        return waitingForDebugger;
    }

    private static AttachedToTarget fromJson(JsonInput input) {
        org.openqa.selenium.devtools.target.model.SessionID sessionId = null;
        org.openqa.selenium.devtools.target.model.TargetInfo targetInfo = null;
        java.lang.Boolean waitingForDebugger = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "sessionId":
                    sessionId = input.read(org.openqa.selenium.devtools.target.model.SessionID.class);
                    break;
                case "targetInfo":
                    targetInfo = input.read(org.openqa.selenium.devtools.target.model.TargetInfo.class);
                    break;
                case "waitingForDebugger":
                    waitingForDebugger = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AttachedToTarget(sessionId, targetInfo, waitingForDebugger);
    }
}
