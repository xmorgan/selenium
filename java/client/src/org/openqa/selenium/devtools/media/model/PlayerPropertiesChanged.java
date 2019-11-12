package org.openqa.selenium.devtools.media.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * This can be called multiple times, and can be used to set / override /
 * remove player properties. A null propValue indicates removal.
 */
public class PlayerPropertiesChanged {

    private final org.openqa.selenium.devtools.media.model.PlayerId playerId;

    private final java.util.List<org.openqa.selenium.devtools.media.model.PlayerProperty> properties;

    public PlayerPropertiesChanged(org.openqa.selenium.devtools.media.model.PlayerId playerId, java.util.List<org.openqa.selenium.devtools.media.model.PlayerProperty> properties) {
        this.playerId = java.util.Objects.requireNonNull(playerId, "playerId is required");
        this.properties = java.util.Objects.requireNonNull(properties, "properties is required");
    }

    public org.openqa.selenium.devtools.media.model.PlayerId getPlayerId() {
        return playerId;
    }

    public java.util.List<org.openqa.selenium.devtools.media.model.PlayerProperty> getProperties() {
        return properties;
    }

    private static PlayerPropertiesChanged fromJson(JsonInput input) {
        org.openqa.selenium.devtools.media.model.PlayerId playerId = null;
        java.util.List<org.openqa.selenium.devtools.media.model.PlayerProperty> properties = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "playerId":
                    playerId = input.read(org.openqa.selenium.devtools.media.model.PlayerId.class);
                    break;
                case "properties":
                    properties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.media.model.PlayerProperty>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PlayerPropertiesChanged(playerId, properties);
    }
}
