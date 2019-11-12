package org.openqa.selenium.devtools.backgroundservice;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Defines events for background web platform features.
 */
@Beta()
public class BackgroundService {

    /**
     * Enables event updates for the service.
     */
    public static Command<Void> startObserving(org.openqa.selenium.devtools.backgroundservice.model.ServiceName service) {
        java.util.Objects.requireNonNull(service, "service is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("service", service);
        return new Command<>("BackgroundService.startObserving", params.build());
    }

    /**
     * Disables event updates for the service.
     */
    public static Command<Void> stopObserving(org.openqa.selenium.devtools.backgroundservice.model.ServiceName service) {
        java.util.Objects.requireNonNull(service, "service is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("service", service);
        return new Command<>("BackgroundService.stopObserving", params.build());
    }

    /**
     * Set the recording state for the service.
     */
    public static Command<Void> setRecording(java.lang.Boolean shouldRecord, org.openqa.selenium.devtools.backgroundservice.model.ServiceName service) {
        java.util.Objects.requireNonNull(shouldRecord, "shouldRecord is required");
        java.util.Objects.requireNonNull(service, "service is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("shouldRecord", shouldRecord);
        params.put("service", service);
        return new Command<>("BackgroundService.setRecording", params.build());
    }

    /**
     * Clears all stored data for the service.
     */
    public static Command<Void> clearEvents(org.openqa.selenium.devtools.backgroundservice.model.ServiceName service) {
        java.util.Objects.requireNonNull(service, "service is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("service", service);
        return new Command<>("BackgroundService.clearEvents", params.build());
    }

    public static Event<org.openqa.selenium.devtools.backgroundservice.model.RecordingStateChanged> recordingStateChanged() {
        return new Event<>("BackgroundService.recordingStateChanged", input -> input.read(org.openqa.selenium.devtools.backgroundservice.model.RecordingStateChanged.class));
    }

    public static Event<org.openqa.selenium.devtools.backgroundservice.model.BackgroundServiceEvent> backgroundServiceEventReceived() {
        return new Event<>("BackgroundService.backgroundServiceEventReceived", ConverterFunctions.map("backgroundServiceEvent", org.openqa.selenium.devtools.backgroundservice.model.BackgroundServiceEvent.class));
    }
}
