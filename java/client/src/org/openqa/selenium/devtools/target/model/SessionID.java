package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique identifier of attached debugging session.
 */
public class SessionID {

    private final java.lang.String sessionID;

    public SessionID(java.lang.String sessionID) {
        this.sessionID = java.util.Objects.requireNonNull(sessionID, "Missing value for SessionID");
    }

    private static SessionID fromJson(JsonInput input) {
        return new SessionID(input.nextString());
    }

    public String toJson() {
        return sessionID.toString();
    }

    public String toString() {
        return sessionID.toString();
    }
}
