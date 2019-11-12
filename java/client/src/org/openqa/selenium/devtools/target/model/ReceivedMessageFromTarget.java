package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Notifies about a new protocol message received from the session (as reported in
 * `attachedToTarget` event).
 */
public class ReceivedMessageFromTarget {

    private final org.openqa.selenium.devtools.target.model.SessionID sessionId;

    private final java.lang.String message;

    private final org.openqa.selenium.devtools.target.model.TargetID targetId;

    public ReceivedMessageFromTarget(org.openqa.selenium.devtools.target.model.SessionID sessionId, java.lang.String message, org.openqa.selenium.devtools.target.model.TargetID targetId) {
        this.sessionId = java.util.Objects.requireNonNull(sessionId, "sessionId is required");
        this.message = java.util.Objects.requireNonNull(message, "message is required");
        this.targetId = targetId;
    }

    /**
     * Identifier of a session which sends a message.
     */
    public org.openqa.selenium.devtools.target.model.SessionID getSessionId() {
        return sessionId;
    }

    public java.lang.String getMessage() {
        return message;
    }

    /**
     * Deprecated.
     */
    @Deprecated()
    public org.openqa.selenium.devtools.target.model.TargetID getTargetId() {
        return targetId;
    }

    private static ReceivedMessageFromTarget fromJson(JsonInput input) {
        org.openqa.selenium.devtools.target.model.SessionID sessionId = null;
        java.lang.String message = null;
        org.openqa.selenium.devtools.target.model.TargetID targetId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "sessionId":
                    sessionId = input.read(org.openqa.selenium.devtools.target.model.SessionID.class);
                    break;
                case "message":
                    message = input.nextString();
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
        return new ReceivedMessageFromTarget(sessionId, message, targetId);
    }
}
