package org.openqa.selenium.devtools.media;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain allows detailed inspection of media elements
 */
@Beta()
public class Media {

    /**
     * Enables the Media domain
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Media.enable", params.build());
    }

    /**
     * Disables the Media domain.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Media.disable", params.build());
    }

    public static Event<org.openqa.selenium.devtools.media.model.PlayerPropertiesChanged> playerPropertiesChanged() {
        return new Event<>("Media.playerPropertiesChanged", input -> input.read(org.openqa.selenium.devtools.media.model.PlayerPropertiesChanged.class));
    }

    public static Event<org.openqa.selenium.devtools.media.model.PlayerEventsAdded> playerEventsAdded() {
        return new Event<>("Media.playerEventsAdded", input -> input.read(org.openqa.selenium.devtools.media.model.PlayerEventsAdded.class));
    }

    public static Event<java.util.List<org.openqa.selenium.devtools.media.model.PlayerId>> playersCreated() {
        return new Event<>("Media.playersCreated", ConverterFunctions.map("players", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.media.model.PlayerId>>() {
        }.getType()));
    }
}
