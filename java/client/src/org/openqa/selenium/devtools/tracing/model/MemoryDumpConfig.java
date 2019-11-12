package org.openqa.selenium.devtools.tracing.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Configuration for memory dump. Used only when "memory-infra" category is enabled.
 */
public class MemoryDumpConfig extends com.google.common.collect.ForwardingMap<String, Object> {

    private final java.util.Map<String, Object> memoryDumpConfig;

    public MemoryDumpConfig(java.util.Map<String, Object> memoryDumpConfig) {
        this.memoryDumpConfig = java.util.Objects.requireNonNull(memoryDumpConfig, "Missing value for MemoryDumpConfig");
    }

    protected java.util.Map<String, Object> delegate() {
        return memoryDumpConfig;
    }

    private static MemoryDumpConfig fromJson(JsonInput input) {
        return new MemoryDumpConfig(input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
        }.getType()));
    }

    public java.util.Map<String, Object> toJson() {
        return memoryDumpConfig;
    }

    public String toString() {
        return memoryDumpConfig.toString();
    }
}
