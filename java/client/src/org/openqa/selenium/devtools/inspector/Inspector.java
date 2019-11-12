package org.openqa.selenium.devtools.inspector;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Inspector {

    /**
     * Disables inspector domain notifications.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Inspector.disable", params.build());
    }

    /**
     * Enables inspector domain notifications.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Inspector.enable", params.build());
    }

    public static Event<java.lang.String> detached() {
        return new Event<>("Inspector.detached", ConverterFunctions.map("reason", java.lang.String.class));
    }

    public static Event<Void> targetCrashed() {
        return new Event<>("Inspector.targetCrashed", input -> null);
    }

    public static Event<Void> targetReloadedAfterCrash() {
        return new Event<>("Inspector.targetReloadedAfterCrash", input -> null);
    }
}
