package org.openqa.selenium.devtools.cast;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * A domain for interacting with Cast, Presentation API, and Remote Playback API
 * functionalities.
 */
@Beta()
public class Cast {

    /**
     * Starts observing for sinks that can be used for tab mirroring, and if set,
     * sinks compatible with |presentationUrl| as well. When sinks are found, a
     * |sinksUpdated| event is fired.
     * Also starts observing for issue messages. When an issue is added or removed,
     * an |issueUpdated| event is fired.
     */
    public static Command<Void> enable(java.util.Optional<java.lang.String> presentationUrl) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        presentationUrl.ifPresent(p -> params.put("presentationUrl", p));
        return new Command<>("Cast.enable", params.build());
    }

    /**
     * Stops observing for sinks and issues.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Cast.disable", params.build());
    }

    /**
     * Sets a sink to be used when the web page requests the browser to choose a
     * sink via Presentation API, Remote Playback API, or Cast SDK.
     */
    public static Command<Void> setSinkToUse(java.lang.String sinkName) {
        java.util.Objects.requireNonNull(sinkName, "sinkName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("sinkName", sinkName);
        return new Command<>("Cast.setSinkToUse", params.build());
    }

    /**
     * Starts mirroring the tab to the sink.
     */
    public static Command<Void> startTabMirroring(java.lang.String sinkName) {
        java.util.Objects.requireNonNull(sinkName, "sinkName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("sinkName", sinkName);
        return new Command<>("Cast.startTabMirroring", params.build());
    }

    /**
     * Stops the active Cast session on the sink.
     */
    public static Command<Void> stopCasting(java.lang.String sinkName) {
        java.util.Objects.requireNonNull(sinkName, "sinkName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("sinkName", sinkName);
        return new Command<>("Cast.stopCasting", params.build());
    }

    public static Event<java.util.List<org.openqa.selenium.devtools.cast.model.Sink>> sinksUpdated() {
        return new Event<>("Cast.sinksUpdated", ConverterFunctions.map("sinks", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.cast.model.Sink>>() {
        }.getType()));
    }

    public static Event<java.lang.String> issueUpdated() {
        return new Event<>("Cast.issueUpdated", ConverterFunctions.map("issueMessage", java.lang.String.class));
    }
}
