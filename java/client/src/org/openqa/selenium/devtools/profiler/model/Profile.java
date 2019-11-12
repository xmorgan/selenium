package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Profile.
 */
public class Profile {

    private final java.util.List<org.openqa.selenium.devtools.profiler.model.ProfileNode> nodes;

    private final java.lang.Number startTime;

    private final java.lang.Number endTime;

    private final java.util.List<java.lang.Integer> samples;

    private final java.util.List<java.lang.Integer> timeDeltas;

    public Profile(java.util.List<org.openqa.selenium.devtools.profiler.model.ProfileNode> nodes, java.lang.Number startTime, java.lang.Number endTime, java.util.List<java.lang.Integer> samples, java.util.List<java.lang.Integer> timeDeltas) {
        this.nodes = java.util.Objects.requireNonNull(nodes, "nodes is required");
        this.startTime = java.util.Objects.requireNonNull(startTime, "startTime is required");
        this.endTime = java.util.Objects.requireNonNull(endTime, "endTime is required");
        this.samples = samples;
        this.timeDeltas = timeDeltas;
    }

    /**
     * The list of profile nodes. First item is the root node.
     */
    public java.util.List<org.openqa.selenium.devtools.profiler.model.ProfileNode> getNodes() {
        return nodes;
    }

    /**
     * Profiling start timestamp in microseconds.
     */
    public java.lang.Number getStartTime() {
        return startTime;
    }

    /**
     * Profiling end timestamp in microseconds.
     */
    public java.lang.Number getEndTime() {
        return endTime;
    }

    /**
     * Ids of samples top nodes.
     */
    public java.util.List<java.lang.Integer> getSamples() {
        return samples;
    }

    /**
     * Time intervals between adjacent samples in microseconds. The first delta is relative to the
     * profile startTime.
     */
    public java.util.List<java.lang.Integer> getTimeDeltas() {
        return timeDeltas;
    }

    private static Profile fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.profiler.model.ProfileNode> nodes = null;
        java.lang.Number startTime = null;
        java.lang.Number endTime = null;
        java.util.List<java.lang.Integer> samples = null;
        java.util.List<java.lang.Integer> timeDeltas = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodes":
                    nodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.ProfileNode>>() {
                    }.getType());
                    break;
                case "startTime":
                    startTime = input.nextNumber();
                    break;
                case "endTime":
                    endTime = input.nextNumber();
                    break;
                case "samples":
                    samples = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "timeDeltas":
                    timeDeltas = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Profile(nodes, startTime, endTime, samples, timeDeltas);
    }
}
