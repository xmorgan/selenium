package org.openqa.selenium.devtools.animation;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Animation {

    /**
     * Disables animation domain notifications.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Animation.disable", params.build());
    }

    /**
     * Enables animation domain notifications.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Animation.enable", params.build());
    }

    /**
     * Returns the current time of the an animation.
     */
    public static Command<java.lang.Number> getCurrentTime(java.lang.String id) {
        java.util.Objects.requireNonNull(id, "id is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("id", id);
        return new Command<>("Animation.getCurrentTime", params.build(), ConverterFunctions.map("currentTime", java.lang.Number.class));
    }

    /**
     * Gets the playback rate of the document timeline.
     */
    public static Command<java.lang.Number> getPlaybackRate() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Animation.getPlaybackRate", params.build(), ConverterFunctions.map("playbackRate", java.lang.Number.class));
    }

    /**
     * Releases a set of animations to no longer be manipulated.
     */
    public static Command<Void> releaseAnimations(java.util.List<java.lang.String> animations) {
        java.util.Objects.requireNonNull(animations, "animations is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("animations", animations);
        return new Command<>("Animation.releaseAnimations", params.build());
    }

    /**
     * Gets the remote object of the Animation.
     */
    public static Command<org.openqa.selenium.devtools.runtime.model.RemoteObject> resolveAnimation(java.lang.String animationId) {
        java.util.Objects.requireNonNull(animationId, "animationId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("animationId", animationId);
        return new Command<>("Animation.resolveAnimation", params.build(), ConverterFunctions.map("remoteObject", org.openqa.selenium.devtools.runtime.model.RemoteObject.class));
    }

    /**
     * Seek a set of animations to a particular time within each animation.
     */
    public static Command<Void> seekAnimations(java.util.List<java.lang.String> animations, java.lang.Number currentTime) {
        java.util.Objects.requireNonNull(animations, "animations is required");
        java.util.Objects.requireNonNull(currentTime, "currentTime is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("animations", animations);
        params.put("currentTime", currentTime);
        return new Command<>("Animation.seekAnimations", params.build());
    }

    /**
     * Sets the paused state of a set of animations.
     */
    public static Command<Void> setPaused(java.util.List<java.lang.String> animations, java.lang.Boolean paused) {
        java.util.Objects.requireNonNull(animations, "animations is required");
        java.util.Objects.requireNonNull(paused, "paused is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("animations", animations);
        params.put("paused", paused);
        return new Command<>("Animation.setPaused", params.build());
    }

    /**
     * Sets the playback rate of the document timeline.
     */
    public static Command<Void> setPlaybackRate(java.lang.Number playbackRate) {
        java.util.Objects.requireNonNull(playbackRate, "playbackRate is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("playbackRate", playbackRate);
        return new Command<>("Animation.setPlaybackRate", params.build());
    }

    /**
     * Sets the timing of an animation node.
     */
    public static Command<Void> setTiming(java.lang.String animationId, java.lang.Number duration, java.lang.Number delay) {
        java.util.Objects.requireNonNull(animationId, "animationId is required");
        java.util.Objects.requireNonNull(duration, "duration is required");
        java.util.Objects.requireNonNull(delay, "delay is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("animationId", animationId);
        params.put("duration", duration);
        params.put("delay", delay);
        return new Command<>("Animation.setTiming", params.build());
    }

    public static Event<java.lang.String> animationCanceled() {
        return new Event<>("Animation.animationCanceled", ConverterFunctions.map("id", java.lang.String.class));
    }

    public static Event<java.lang.String> animationCreated() {
        return new Event<>("Animation.animationCreated", ConverterFunctions.map("id", java.lang.String.class));
    }

    public static Event<org.openqa.selenium.devtools.animation.model.Animation> animationStarted() {
        return new Event<>("Animation.animationStarted", ConverterFunctions.map("animation", org.openqa.selenium.devtools.animation.model.Animation.class));
    }
}
