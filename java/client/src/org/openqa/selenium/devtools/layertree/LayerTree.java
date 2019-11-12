package org.openqa.selenium.devtools.layertree;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class LayerTree {

    /**
     * Provides the reasons why the given layer was composited.
     */
    public static Command<java.util.List<java.lang.String>> compositingReasons(org.openqa.selenium.devtools.layertree.model.LayerId layerId) {
        java.util.Objects.requireNonNull(layerId, "layerId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("layerId", layerId);
        return new Command<>("LayerTree.compositingReasons", params.build(), ConverterFunctions.map("compositingReasons", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Disables compositing tree inspection.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("LayerTree.disable", params.build());
    }

    /**
     * Enables compositing tree inspection.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("LayerTree.enable", params.build());
    }

    /**
     * Returns the snapshot identifier.
     */
    public static Command<org.openqa.selenium.devtools.layertree.model.SnapshotId> loadSnapshot(java.util.List<org.openqa.selenium.devtools.layertree.model.PictureTile> tiles) {
        java.util.Objects.requireNonNull(tiles, "tiles is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("tiles", tiles);
        return new Command<>("LayerTree.loadSnapshot", params.build(), ConverterFunctions.map("snapshotId", org.openqa.selenium.devtools.layertree.model.SnapshotId.class));
    }

    /**
     * Returns the layer snapshot identifier.
     */
    public static Command<org.openqa.selenium.devtools.layertree.model.SnapshotId> makeSnapshot(org.openqa.selenium.devtools.layertree.model.LayerId layerId) {
        java.util.Objects.requireNonNull(layerId, "layerId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("layerId", layerId);
        return new Command<>("LayerTree.makeSnapshot", params.build(), ConverterFunctions.map("snapshotId", org.openqa.selenium.devtools.layertree.model.SnapshotId.class));
    }

    public static Command<java.util.List<org.openqa.selenium.devtools.layertree.model.PaintProfile>> profileSnapshot(org.openqa.selenium.devtools.layertree.model.SnapshotId snapshotId, java.util.Optional<java.lang.Integer> minRepeatCount, java.util.Optional<java.lang.Number> minDuration, java.util.Optional<org.openqa.selenium.devtools.dom.model.Rect> clipRect) {
        java.util.Objects.requireNonNull(snapshotId, "snapshotId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("snapshotId", snapshotId);
        minRepeatCount.ifPresent(p -> params.put("minRepeatCount", p));
        minDuration.ifPresent(p -> params.put("minDuration", p));
        clipRect.ifPresent(p -> params.put("clipRect", p));
        return new Command<>("LayerTree.profileSnapshot", params.build(), ConverterFunctions.map("timings", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.layertree.model.PaintProfile>>() {
        }.getType()));
    }

    /**
     * Releases layer snapshot captured by the back-end.
     */
    public static Command<Void> releaseSnapshot(org.openqa.selenium.devtools.layertree.model.SnapshotId snapshotId) {
        java.util.Objects.requireNonNull(snapshotId, "snapshotId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("snapshotId", snapshotId);
        return new Command<>("LayerTree.releaseSnapshot", params.build());
    }

    /**
     * Replays the layer snapshot and returns the resulting bitmap.
     */
    public static Command<java.lang.String> replaySnapshot(org.openqa.selenium.devtools.layertree.model.SnapshotId snapshotId, java.util.Optional<java.lang.Integer> fromStep, java.util.Optional<java.lang.Integer> toStep, java.util.Optional<java.lang.Number> scale) {
        java.util.Objects.requireNonNull(snapshotId, "snapshotId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("snapshotId", snapshotId);
        fromStep.ifPresent(p -> params.put("fromStep", p));
        toStep.ifPresent(p -> params.put("toStep", p));
        scale.ifPresent(p -> params.put("scale", p));
        return new Command<>("LayerTree.replaySnapshot", params.build(), ConverterFunctions.map("dataURL", java.lang.String.class));
    }

    /**
     * Replays the layer snapshot and returns canvas log.
     */
    public static Command<java.util.List<java.util.Map<String, Object>>> snapshotCommandLog(org.openqa.selenium.devtools.layertree.model.SnapshotId snapshotId) {
        java.util.Objects.requireNonNull(snapshotId, "snapshotId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("snapshotId", snapshotId);
        return new Command<>("LayerTree.snapshotCommandLog", params.build(), ConverterFunctions.map("commandLog", new com.google.common.reflect.TypeToken<java.util.List<java.util.Map<String, Object>>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.layertree.model.LayerPainted> layerPainted() {
        return new Event<>("LayerTree.layerPainted", input -> input.read(org.openqa.selenium.devtools.layertree.model.LayerPainted.class));
    }

    public static Event<java.util.List<org.openqa.selenium.devtools.layertree.model.Layer>> layerTreeDidChange() {
        return new Event<>("LayerTree.layerTreeDidChange", ConverterFunctions.map("layers", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.layertree.model.Layer>>() {
        }.getType()));
    }
}
