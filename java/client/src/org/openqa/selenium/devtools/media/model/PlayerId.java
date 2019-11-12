package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Players will get an ID that is unique within the agent context.
 */
public class PlayerId {

    private final java.lang.String playerId;

    public PlayerId(java.lang.String playerId) {
        this.playerId = java.util.Objects.requireNonNull(playerId, "Missing value for PlayerId");
    }

    private static PlayerId fromJson(JsonInput input) {
        return new PlayerId(input.nextString());
    }

    public String toJson() {
        return playerId.toString();
    }

    public String toString() {
        return playerId.toString();
    }
}
