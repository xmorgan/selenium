package org.openqa.selenium.devtools.log;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Provides access to log entries.
 */
public class Log {

    /**
     * Clears the log.
     */
    public static Command<Void> clear() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Log.clear", params.build());
    }

    /**
     * Disables log domain, prevents further log entries from being reported to the client.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Log.disable", params.build());
    }

    /**
     * Enables log domain, sends the entries collected so far to the client by means of the
     * `entryAdded` notification.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Log.enable", params.build());
    }

    /**
     * start violation reporting.
     */
    public static Command<Void> startViolationsReport(java.util.List<org.openqa.selenium.devtools.log.model.ViolationSetting> config) {
        java.util.Objects.requireNonNull(config, "config is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("config", config);
        return new Command<>("Log.startViolationsReport", params.build());
    }

    /**
     * Stop violation reporting.
     */
    public static Command<Void> stopViolationsReport() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Log.stopViolationsReport", params.build());
    }

    public static Event<org.openqa.selenium.devtools.log.model.LogEntry> entryAdded() {
        return new Event<>("Log.entryAdded", ConverterFunctions.map("entry", org.openqa.selenium.devtools.log.model.LogEntry.class));
    }
}
