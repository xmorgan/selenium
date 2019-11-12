package org.openqa.selenium.devtools.tracing.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class TraceConfig {

    public enum RecordMode {

        RECORDUNTILFULL("recordUntilFull"), RECORDCONTINUOUSLY("recordContinuously"), RECORDASMUCHASPOSSIBLE("recordAsMuchAsPossible"), ECHOTOCONSOLE("echoToConsole");

        private String value;

        RecordMode(String value) {
            this.value = value;
        }

        public static RecordMode fromString(String s) {
            return java.util.Arrays.stream(RecordMode.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within RecordMode "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static RecordMode fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final RecordMode recordMode;

    private final java.lang.Boolean enableSampling;

    private final java.lang.Boolean enableSystrace;

    private final java.lang.Boolean enableArgumentFilter;

    private final java.util.List<java.lang.String> includedCategories;

    private final java.util.List<java.lang.String> excludedCategories;

    private final java.util.List<java.lang.String> syntheticDelays;

    private final org.openqa.selenium.devtools.tracing.model.MemoryDumpConfig memoryDumpConfig;

    public TraceConfig(RecordMode recordMode, java.lang.Boolean enableSampling, java.lang.Boolean enableSystrace, java.lang.Boolean enableArgumentFilter, java.util.List<java.lang.String> includedCategories, java.util.List<java.lang.String> excludedCategories, java.util.List<java.lang.String> syntheticDelays, org.openqa.selenium.devtools.tracing.model.MemoryDumpConfig memoryDumpConfig) {
        this.recordMode = recordMode;
        this.enableSampling = enableSampling;
        this.enableSystrace = enableSystrace;
        this.enableArgumentFilter = enableArgumentFilter;
        this.includedCategories = includedCategories;
        this.excludedCategories = excludedCategories;
        this.syntheticDelays = syntheticDelays;
        this.memoryDumpConfig = memoryDumpConfig;
    }

    /**
     * Controls how the trace buffer stores data.
     */
    public RecordMode getRecordMode() {
        return recordMode;
    }

    /**
     * Turns on JavaScript stack sampling.
     */
    public java.lang.Boolean getEnableSampling() {
        return enableSampling;
    }

    /**
     * Turns on system tracing.
     */
    public java.lang.Boolean getEnableSystrace() {
        return enableSystrace;
    }

    /**
     * Turns on argument filter.
     */
    public java.lang.Boolean getEnableArgumentFilter() {
        return enableArgumentFilter;
    }

    /**
     * Included category filters.
     */
    public java.util.List<java.lang.String> getIncludedCategories() {
        return includedCategories;
    }

    /**
     * Excluded category filters.
     */
    public java.util.List<java.lang.String> getExcludedCategories() {
        return excludedCategories;
    }

    /**
     * Configuration to synthesize the delays in tracing.
     */
    public java.util.List<java.lang.String> getSyntheticDelays() {
        return syntheticDelays;
    }

    /**
     * Configuration for memory dump triggers. Used only when "memory-infra" category is enabled.
     */
    public org.openqa.selenium.devtools.tracing.model.MemoryDumpConfig getMemoryDumpConfig() {
        return memoryDumpConfig;
    }

    private static TraceConfig fromJson(JsonInput input) {
        RecordMode recordMode = null;
        java.lang.Boolean enableSampling = null;
        java.lang.Boolean enableSystrace = null;
        java.lang.Boolean enableArgumentFilter = null;
        java.util.List<java.lang.String> includedCategories = null;
        java.util.List<java.lang.String> excludedCategories = null;
        java.util.List<java.lang.String> syntheticDelays = null;
        org.openqa.selenium.devtools.tracing.model.MemoryDumpConfig memoryDumpConfig = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "recordMode":
                    recordMode = RecordMode.fromString(input.nextString());
                    break;
                case "enableSampling":
                    enableSampling = input.nextBoolean();
                    break;
                case "enableSystrace":
                    enableSystrace = input.nextBoolean();
                    break;
                case "enableArgumentFilter":
                    enableArgumentFilter = input.nextBoolean();
                    break;
                case "includedCategories":
                    includedCategories = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "excludedCategories":
                    excludedCategories = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "syntheticDelays":
                    syntheticDelays = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "memoryDumpConfig":
                    memoryDumpConfig = input.read(org.openqa.selenium.devtools.tracing.model.MemoryDumpConfig.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TraceConfig(recordMode, enableSampling, enableSystrace, enableArgumentFilter, includedCategories, excludedCategories, syntheticDelays, memoryDumpConfig);
    }
}
