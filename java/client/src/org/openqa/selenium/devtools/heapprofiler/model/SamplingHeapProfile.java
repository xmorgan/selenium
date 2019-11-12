package org.openqa.selenium.devtools.heapprofiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Sampling profile.
 */
public class SamplingHeapProfile {

    private final org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode head;

    private final java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileSample> samples;

    public SamplingHeapProfile(org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode head, java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileSample> samples) {
        this.head = java.util.Objects.requireNonNull(head, "head is required");
        this.samples = java.util.Objects.requireNonNull(samples, "samples is required");
    }

    public org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode getHead() {
        return head;
    }

    public java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileSample> getSamples() {
        return samples;
    }

    private static SamplingHeapProfile fromJson(JsonInput input) {
        org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode head = null;
        java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileSample> samples = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "head":
                    head = input.read(org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode.class);
                    break;
                case "samples":
                    samples = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileSample>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SamplingHeapProfile(head, samples);
    }
}
