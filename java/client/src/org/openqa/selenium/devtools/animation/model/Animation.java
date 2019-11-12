package org.openqa.selenium.devtools.animation.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Animation instance.
 */
public class Animation {

    public enum Type {

        CSSTRANSITION("CSSTransition"), CSSANIMATION("CSSAnimation"), WEBANIMATION("WebAnimation");

        private String value;

        Type(String value) {
            this.value = value;
        }

        public static Type fromString(String s) {
            return java.util.Arrays.stream(Type.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Type "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Type fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final java.lang.String id;

    private final java.lang.String name;

    private final java.lang.Boolean pausedState;

    private final java.lang.String playState;

    private final java.lang.Number playbackRate;

    private final java.lang.Number startTime;

    private final java.lang.Number currentTime;

    private final Type type;

    private final org.openqa.selenium.devtools.animation.model.AnimationEffect source;

    private final java.lang.String cssId;

    public Animation(java.lang.String id, java.lang.String name, java.lang.Boolean pausedState, java.lang.String playState, java.lang.Number playbackRate, java.lang.Number startTime, java.lang.Number currentTime, Type type, org.openqa.selenium.devtools.animation.model.AnimationEffect source, java.lang.String cssId) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.pausedState = java.util.Objects.requireNonNull(pausedState, "pausedState is required");
        this.playState = java.util.Objects.requireNonNull(playState, "playState is required");
        this.playbackRate = java.util.Objects.requireNonNull(playbackRate, "playbackRate is required");
        this.startTime = java.util.Objects.requireNonNull(startTime, "startTime is required");
        this.currentTime = java.util.Objects.requireNonNull(currentTime, "currentTime is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.source = source;
        this.cssId = cssId;
    }

    /**
     * `Animation`'s id.
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * `Animation`'s name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * `Animation`'s internal paused state.
     */
    public java.lang.Boolean getPausedState() {
        return pausedState;
    }

    /**
     * `Animation`'s play state.
     */
    public java.lang.String getPlayState() {
        return playState;
    }

    /**
     * `Animation`'s playback rate.
     */
    public java.lang.Number getPlaybackRate() {
        return playbackRate;
    }

    /**
     * `Animation`'s start time.
     */
    public java.lang.Number getStartTime() {
        return startTime;
    }

    /**
     * `Animation`'s current time.
     */
    public java.lang.Number getCurrentTime() {
        return currentTime;
    }

    /**
     * Animation type of `Animation`.
     */
    public Type getType() {
        return type;
    }

    /**
     * `Animation`'s source animation node.
     */
    public org.openqa.selenium.devtools.animation.model.AnimationEffect getSource() {
        return source;
    }

    /**
     * A unique ID for `Animation` representing the sources that triggered this CSS
     * animation/transition.
     */
    public java.lang.String getCssId() {
        return cssId;
    }

    private static Animation fromJson(JsonInput input) {
        java.lang.String id = null;
        java.lang.String name = null;
        java.lang.Boolean pausedState = null;
        java.lang.String playState = null;
        java.lang.Number playbackRate = null;
        java.lang.Number startTime = null;
        java.lang.Number currentTime = null;
        Type type = null;
        org.openqa.selenium.devtools.animation.model.AnimationEffect source = null;
        java.lang.String cssId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.nextString();
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "pausedState":
                    pausedState = input.nextBoolean();
                    break;
                case "playState":
                    playState = input.nextString();
                    break;
                case "playbackRate":
                    playbackRate = input.nextNumber();
                    break;
                case "startTime":
                    startTime = input.nextNumber();
                    break;
                case "currentTime":
                    currentTime = input.nextNumber();
                    break;
                case "type":
                    type = Type.fromString(input.nextString());
                    break;
                case "source":
                    source = input.read(org.openqa.selenium.devtools.animation.model.AnimationEffect.class);
                    break;
                case "cssId":
                    cssId = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Animation(id, name, pausedState, playState, playbackRate, startTime, currentTime, type, source, cssId);
    }
}
