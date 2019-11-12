package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class PlayerEvent {

    private final org.openqa.selenium.devtools.media.model.PlayerEventType type;

    private final org.openqa.selenium.devtools.media.model.Timestamp timestamp;

    private final java.lang.String name;

    private final java.lang.String value;

    public PlayerEvent(org.openqa.selenium.devtools.media.model.PlayerEventType type, org.openqa.selenium.devtools.media.model.Timestamp timestamp, java.lang.String name, java.lang.String value) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    public org.openqa.selenium.devtools.media.model.PlayerEventType getType() {
        return type;
    }

    /**
     * Events are timestamped relative to the start of the player creation
     * not relative to the start of playback.
     */
    public org.openqa.selenium.devtools.media.model.Timestamp getTimestamp() {
        return timestamp;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getValue() {
        return value;
    }

    private static PlayerEvent fromJson(JsonInput input) {
        org.openqa.selenium.devtools.media.model.PlayerEventType type = null;
        org.openqa.selenium.devtools.media.model.Timestamp timestamp = null;
        java.lang.String name = null;
        java.lang.String value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = input.read(org.openqa.selenium.devtools.media.model.PlayerEventType.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.media.model.Timestamp.class);
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PlayerEvent(type, timestamp, name, value);
    }
}
