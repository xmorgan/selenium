package org.openqa.selenium.devtools.console;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain is deprecated - use Runtime or Log instead.
 */
@Deprecated()
public class Console {

    /**
     * Does nothing.
     */
    public static Command<Void> clearMessages() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Console.clearMessages", params.build());
    }

    /**
     * Disables console domain, prevents further console messages from being reported to the client.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Console.disable", params.build());
    }

    /**
     * Enables console domain, sends the messages collected so far to the client by means of the
     * `messageAdded` notification.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Console.enable", params.build());
    }

    public static Event<org.openqa.selenium.devtools.console.model.ConsoleMessage> messageAdded() {
        return new Event<>("Console.messageAdded", ConverterFunctions.map("message", org.openqa.selenium.devtools.console.model.ConsoleMessage.class));
    }
}
