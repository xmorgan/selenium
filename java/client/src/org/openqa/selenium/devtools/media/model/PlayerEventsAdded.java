package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Send events as a list, allowing them to be batched on the browser for less
 * congestion. If batched, events must ALWAYS be in chronological order.
 */
public class PlayerEventsAdded {

    private final org.openqa.selenium.devtools.media.model.PlayerId playerId;

    private final java.util.List<org.openqa.selenium.devtools.media.model.PlayerEvent> events;

    public PlayerEventsAdded(org.openqa.selenium.devtools.media.model.PlayerId playerId, java.util.List<org.openqa.selenium.devtools.media.model.PlayerEvent> events) {
        this.playerId = java.util.Objects.requireNonNull(playerId, "playerId is required");
        this.events = java.util.Objects.requireNonNull(events, "events is required");
    }

    public org.openqa.selenium.devtools.media.model.PlayerId getPlayerId() {
        return playerId;
    }

    public java.util.List<org.openqa.selenium.devtools.media.model.PlayerEvent> getEvents() {
        return events;
    }

    private static PlayerEventsAdded fromJson(JsonInput input) {
        org.openqa.selenium.devtools.media.model.PlayerId playerId = null;
        java.util.List<org.openqa.selenium.devtools.media.model.PlayerEvent> events = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "playerId":
                    playerId = input.read(org.openqa.selenium.devtools.media.model.PlayerId.class);
                    break;
                case "events":
                    events = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.media.model.PlayerEvent>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PlayerEventsAdded(playerId, events);
    }
}
