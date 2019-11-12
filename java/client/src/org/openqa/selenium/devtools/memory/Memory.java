package org.openqa.selenium.devtools.memory;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Memory {

    public static class GetDOMCountersResponse {

        private final java.lang.Integer documents;

        private final java.lang.Integer nodes;

        private final java.lang.Integer jsEventListeners;

        public GetDOMCountersResponse(java.lang.Integer documents, java.lang.Integer nodes, java.lang.Integer jsEventListeners) {
            this.documents = java.util.Objects.requireNonNull(documents, "documents is required");
            this.nodes = java.util.Objects.requireNonNull(nodes, "nodes is required");
            this.jsEventListeners = java.util.Objects.requireNonNull(jsEventListeners, "jsEventListeners is required");
        }

        public java.lang.Integer getDocuments() {
            return documents;
        }

        public java.lang.Integer getNodes() {
            return nodes;
        }

        public java.lang.Integer getJsEventListeners() {
            return jsEventListeners;
        }

        private static GetDOMCountersResponse fromJson(JsonInput input) {
            java.lang.Integer documents = null;
            java.lang.Integer nodes = null;
            java.lang.Integer jsEventListeners = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "documents":
                        documents = input.nextNumber().intValue();
                        break;
                    case "nodes":
                        nodes = input.nextNumber().intValue();
                        break;
                    case "jsEventListeners":
                        jsEventListeners = input.nextNumber().intValue();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetDOMCountersResponse(documents, nodes, jsEventListeners);
        }
    }

    public static Command<org.openqa.selenium.devtools.memory.Memory.GetDOMCountersResponse> getDOMCounters() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.getDOMCounters", params.build(), input -> input.read(org.openqa.selenium.devtools.memory.Memory.GetDOMCountersResponse.class));
    }

    public static Command<Void> prepareForLeakDetection() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.prepareForLeakDetection", params.build());
    }

    /**
     * Simulate OomIntervention by purging V8 memory.
     */
    public static Command<Void> forciblyPurgeJavaScriptMemory() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.forciblyPurgeJavaScriptMemory", params.build());
    }

    /**
     * Enable/disable suppressing memory pressure notifications in all processes.
     */
    public static Command<Void> setPressureNotificationsSuppressed(java.lang.Boolean suppressed) {
        java.util.Objects.requireNonNull(suppressed, "suppressed is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("suppressed", suppressed);
        return new Command<>("Memory.setPressureNotificationsSuppressed", params.build());
    }

    /**
     * Simulate a memory pressure notification in all processes.
     */
    public static Command<Void> simulatePressureNotification(org.openqa.selenium.devtools.memory.model.PressureLevel level) {
        java.util.Objects.requireNonNull(level, "level is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("level", level);
        return new Command<>("Memory.simulatePressureNotification", params.build());
    }

    /**
     * Start collecting native memory profile.
     */
    public static Command<Void> startSampling(java.util.Optional<java.lang.Integer> samplingInterval, java.util.Optional<java.lang.Boolean> suppressRandomness) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        samplingInterval.ifPresent(p -> params.put("samplingInterval", p));
        suppressRandomness.ifPresent(p -> params.put("suppressRandomness", p));
        return new Command<>("Memory.startSampling", params.build());
    }

    /**
     * Stop collecting native memory profile.
     */
    public static Command<Void> stopSampling() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.stopSampling", params.build());
    }

    /**
     * Retrieve native memory allocations profile
     * collected since renderer process startup.
     */
    public static Command<org.openqa.selenium.devtools.memory.model.SamplingProfile> getAllTimeSamplingProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.getAllTimeSamplingProfile", params.build(), ConverterFunctions.map("profile", org.openqa.selenium.devtools.memory.model.SamplingProfile.class));
    }

    /**
     * Retrieve native memory allocations profile
     * collected since browser process startup.
     */
    public static Command<org.openqa.selenium.devtools.memory.model.SamplingProfile> getBrowserSamplingProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.getBrowserSamplingProfile", params.build(), ConverterFunctions.map("profile", org.openqa.selenium.devtools.memory.model.SamplingProfile.class));
    }

    /**
     * Retrieve native memory allocations profile collected since last
     * `startSampling` call.
     */
    public static Command<org.openqa.selenium.devtools.memory.model.SamplingProfile> getSamplingProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Memory.getSamplingProfile", params.build(), ConverterFunctions.map("profile", org.openqa.selenium.devtools.memory.model.SamplingProfile.class));
    }
}
