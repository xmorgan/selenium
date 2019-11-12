package org.openqa.selenium.devtools.tracing;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Tracing {

    /**
     * Stop trace events collection.
     */
    public static Command<Void> end() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Tracing.end", params.build());
    }

    /**
     * Gets supported tracing categories.
     */
    public static Command<java.util.List<java.lang.String>> getCategories() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Tracing.getCategories", params.build(), ConverterFunctions.map("categories", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Record a clock sync marker in the trace.
     */
    public static Command<Void> recordClockSyncMarker(java.lang.String syncId) {
        java.util.Objects.requireNonNull(syncId, "syncId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("syncId", syncId);
        return new Command<>("Tracing.recordClockSyncMarker", params.build());
    }

    public static class RequestMemoryDumpResponse {

        private final java.lang.String dumpGuid;

        private final java.lang.Boolean success;

        public RequestMemoryDumpResponse(java.lang.String dumpGuid, java.lang.Boolean success) {
            this.dumpGuid = java.util.Objects.requireNonNull(dumpGuid, "dumpGuid is required");
            this.success = java.util.Objects.requireNonNull(success, "success is required");
        }

        /**
         * GUID of the resulting global memory dump.
         */
        public java.lang.String getDumpGuid() {
            return dumpGuid;
        }

        /**
         * True iff the global memory dump succeeded.
         */
        public java.lang.Boolean getSuccess() {
            return success;
        }

        private static RequestMemoryDumpResponse fromJson(JsonInput input) {
            java.lang.String dumpGuid = null;
            java.lang.Boolean success = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "dumpGuid":
                        dumpGuid = input.nextString();
                        break;
                    case "success":
                        success = input.nextBoolean();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new RequestMemoryDumpResponse(dumpGuid, success);
        }
    }

    /**
     * Request a global memory dump.
     */
    public static Command<org.openqa.selenium.devtools.tracing.Tracing.RequestMemoryDumpResponse> requestMemoryDump() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Tracing.requestMemoryDump", params.build(), input -> input.read(org.openqa.selenium.devtools.tracing.Tracing.RequestMemoryDumpResponse.class));
    }

    public enum StartTransferMode {

        REPORTEVENTS("ReportEvents"), RETURNASSTREAM("ReturnAsStream");

        private String value;

        StartTransferMode(String value) {
            this.value = value;
        }

        public static StartTransferMode fromString(String s) {
            return java.util.Arrays.stream(StartTransferMode.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within StartTransferMode "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static StartTransferMode fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Start trace events collection.
     */
    public static Command<Void> start(java.util.Optional<java.lang.String> categories, java.util.Optional<java.lang.String> options, java.util.Optional<java.lang.Number> bufferUsageReportingInterval, java.util.Optional<StartTransferMode> transferMode, java.util.Optional<org.openqa.selenium.devtools.tracing.model.StreamFormat> streamFormat, java.util.Optional<org.openqa.selenium.devtools.tracing.model.StreamCompression> streamCompression, java.util.Optional<org.openqa.selenium.devtools.tracing.model.TraceConfig> traceConfig) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        categories.ifPresent(p -> params.put("categories", p));
        options.ifPresent(p -> params.put("options", p));
        bufferUsageReportingInterval.ifPresent(p -> params.put("bufferUsageReportingInterval", p));
        transferMode.ifPresent(p -> params.put("transferMode", p));
        streamFormat.ifPresent(p -> params.put("streamFormat", p));
        streamCompression.ifPresent(p -> params.put("streamCompression", p));
        traceConfig.ifPresent(p -> params.put("traceConfig", p));
        return new Command<>("Tracing.start", params.build());
    }

    public static Event<org.openqa.selenium.devtools.tracing.model.BufferUsage> bufferUsage() {
        return new Event<>("Tracing.bufferUsage", input -> input.read(org.openqa.selenium.devtools.tracing.model.BufferUsage.class));
    }

    public static Event<java.util.List<java.util.Map<String, Object>>> dataCollected() {
        return new Event<>("Tracing.dataCollected", ConverterFunctions.map("value", new com.google.common.reflect.TypeToken<java.util.List<java.util.Map<String, Object>>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.tracing.model.TracingComplete> tracingComplete() {
        return new Event<>("Tracing.tracingComplete", input -> input.read(org.openqa.selenium.devtools.tracing.model.TracingComplete.class));
    }
}
