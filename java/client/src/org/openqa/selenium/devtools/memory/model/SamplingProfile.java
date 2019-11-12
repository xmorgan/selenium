package org.openqa.selenium.devtools.memory.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Array of heap profile samples.
 */
public class SamplingProfile {

    private final java.util.List<org.openqa.selenium.devtools.memory.model.SamplingProfileNode> samples;

    private final java.util.List<org.openqa.selenium.devtools.memory.model.Module> modules;

    public SamplingProfile(java.util.List<org.openqa.selenium.devtools.memory.model.SamplingProfileNode> samples, java.util.List<org.openqa.selenium.devtools.memory.model.Module> modules) {
        this.samples = java.util.Objects.requireNonNull(samples, "samples is required");
        this.modules = java.util.Objects.requireNonNull(modules, "modules is required");
    }

    public java.util.List<org.openqa.selenium.devtools.memory.model.SamplingProfileNode> getSamples() {
        return samples;
    }

    public java.util.List<org.openqa.selenium.devtools.memory.model.Module> getModules() {
        return modules;
    }

    private static SamplingProfile fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.memory.model.SamplingProfileNode> samples = null;
        java.util.List<org.openqa.selenium.devtools.memory.model.Module> modules = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "samples":
                    samples = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.memory.model.SamplingProfileNode>>() {
                    }.getType());
                    break;
                case "modules":
                    modules = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.memory.model.Module>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SamplingProfile(samples, modules);
    }
}
