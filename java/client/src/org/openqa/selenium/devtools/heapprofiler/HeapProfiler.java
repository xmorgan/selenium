package org.openqa.selenium.devtools.heapprofiler;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class HeapProfiler {

    /**
     * Enables console to refer to the node with given id via $x (see Command Line API for more details
     * $x functions).
     */
    public static Command<Void> addInspectedHeapObject(org.openqa.selenium.devtools.heapprofiler.model.HeapSnapshotObjectId heapObjectId) {
        java.util.Objects.requireNonNull(heapObjectId, "heapObjectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("heapObjectId", heapObjectId);
        return new Command<>("HeapProfiler.addInspectedHeapObject", params.build());
    }

    public static Command<Void> collectGarbage() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeapProfiler.collectGarbage", params.build());
    }

    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeapProfiler.disable", params.build());
    }

    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeapProfiler.enable", params.build());
    }

    public static Command<org.openqa.selenium.devtools.heapprofiler.model.HeapSnapshotObjectId> getHeapObjectId(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        return new Command<>("HeapProfiler.getHeapObjectId", params.build(), ConverterFunctions.map("heapSnapshotObjectId", org.openqa.selenium.devtools.heapprofiler.model.HeapSnapshotObjectId.class));
    }

    public static Command<org.openqa.selenium.devtools.runtime.model.RemoteObject> getObjectByHeapObjectId(org.openqa.selenium.devtools.heapprofiler.model.HeapSnapshotObjectId objectId, java.util.Optional<java.lang.String> objectGroup) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        return new Command<>("HeapProfiler.getObjectByHeapObjectId", params.build(), ConverterFunctions.map("result", org.openqa.selenium.devtools.runtime.model.RemoteObject.class));
    }

    public static Command<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfile> getSamplingProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeapProfiler.getSamplingProfile", params.build(), ConverterFunctions.map("profile", org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfile.class));
    }

    public static Command<Void> startSampling(java.util.Optional<java.lang.Number> samplingInterval) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        samplingInterval.ifPresent(p -> params.put("samplingInterval", p));
        return new Command<>("HeapProfiler.startSampling", params.build());
    }

    public static Command<Void> startTrackingHeapObjects(java.util.Optional<java.lang.Boolean> trackAllocations) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        trackAllocations.ifPresent(p -> params.put("trackAllocations", p));
        return new Command<>("HeapProfiler.startTrackingHeapObjects", params.build());
    }

    public static Command<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfile> stopSampling() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeapProfiler.stopSampling", params.build(), ConverterFunctions.map("profile", org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfile.class));
    }

    public static Command<Void> stopTrackingHeapObjects(java.util.Optional<java.lang.Boolean> reportProgress) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        reportProgress.ifPresent(p -> params.put("reportProgress", p));
        return new Command<>("HeapProfiler.stopTrackingHeapObjects", params.build());
    }

    public static Command<Void> takeHeapSnapshot(java.util.Optional<java.lang.Boolean> reportProgress) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        reportProgress.ifPresent(p -> params.put("reportProgress", p));
        return new Command<>("HeapProfiler.takeHeapSnapshot", params.build());
    }

    public static Event<java.lang.String> addHeapSnapshotChunk() {
        return new Event<>("HeapProfiler.addHeapSnapshotChunk", ConverterFunctions.map("chunk", java.lang.String.class));
    }

    public static Event<java.util.List<java.lang.Integer>> heapStatsUpdate() {
        return new Event<>("HeapProfiler.heapStatsUpdate", ConverterFunctions.map("statsUpdate", new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.heapprofiler.model.LastSeenObjectId> lastSeenObjectId() {
        return new Event<>("HeapProfiler.lastSeenObjectId", input -> input.read(org.openqa.selenium.devtools.heapprofiler.model.LastSeenObjectId.class));
    }

    public static Event<org.openqa.selenium.devtools.heapprofiler.model.ReportHeapSnapshotProgress> reportHeapSnapshotProgress() {
        return new Event<>("HeapProfiler.reportHeapSnapshotProgress", input -> input.read(org.openqa.selenium.devtools.heapprofiler.model.ReportHeapSnapshotProgress.class));
    }

    public static Event<Void> resetProfiles() {
        return new Event<>("HeapProfiler.resetProfiles", input -> null);
    }
}
