package org.openqa.selenium.devtools.animation.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * AnimationEffect instance
 */
public class AnimationEffect {

    private final java.lang.Number delay;

    private final java.lang.Number endDelay;

    private final java.lang.Number iterationStart;

    private final java.lang.Number iterations;

    private final java.lang.Number duration;

    private final java.lang.String direction;

    private final java.lang.String fill;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

    private final org.openqa.selenium.devtools.animation.model.KeyframesRule keyframesRule;

    private final java.lang.String easing;

    public AnimationEffect(java.lang.Number delay, java.lang.Number endDelay, java.lang.Number iterationStart, java.lang.Number iterations, java.lang.Number duration, java.lang.String direction, java.lang.String fill, org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId, org.openqa.selenium.devtools.animation.model.KeyframesRule keyframesRule, java.lang.String easing) {
        this.delay = java.util.Objects.requireNonNull(delay, "delay is required");
        this.endDelay = java.util.Objects.requireNonNull(endDelay, "endDelay is required");
        this.iterationStart = java.util.Objects.requireNonNull(iterationStart, "iterationStart is required");
        this.iterations = java.util.Objects.requireNonNull(iterations, "iterations is required");
        this.duration = java.util.Objects.requireNonNull(duration, "duration is required");
        this.direction = java.util.Objects.requireNonNull(direction, "direction is required");
        this.fill = java.util.Objects.requireNonNull(fill, "fill is required");
        this.backendNodeId = backendNodeId;
        this.keyframesRule = keyframesRule;
        this.easing = java.util.Objects.requireNonNull(easing, "easing is required");
    }

    /**
     * `AnimationEffect`'s delay.
     */
    public java.lang.Number getDelay() {
        return delay;
    }

    /**
     * `AnimationEffect`'s end delay.
     */
    public java.lang.Number getEndDelay() {
        return endDelay;
    }

    /**
     * `AnimationEffect`'s iteration start.
     */
    public java.lang.Number getIterationStart() {
        return iterationStart;
    }

    /**
     * `AnimationEffect`'s iterations.
     */
    public java.lang.Number getIterations() {
        return iterations;
    }

    /**
     * `AnimationEffect`'s iteration duration.
     */
    public java.lang.Number getDuration() {
        return duration;
    }

    /**
     * `AnimationEffect`'s playback direction.
     */
    public java.lang.String getDirection() {
        return direction;
    }

    /**
     * `AnimationEffect`'s fill mode.
     */
    public java.lang.String getFill() {
        return fill;
    }

    /**
     * `AnimationEffect`'s target node.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
        return backendNodeId;
    }

    /**
     * `AnimationEffect`'s keyframes.
     */
    public org.openqa.selenium.devtools.animation.model.KeyframesRule getKeyframesRule() {
        return keyframesRule;
    }

    /**
     * `AnimationEffect`'s timing function.
     */
    public java.lang.String getEasing() {
        return easing;
    }

    private static AnimationEffect fromJson(JsonInput input) {
        java.lang.Number delay = null;
        java.lang.Number endDelay = null;
        java.lang.Number iterationStart = null;
        java.lang.Number iterations = null;
        java.lang.Number duration = null;
        java.lang.String direction = null;
        java.lang.String fill = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
        org.openqa.selenium.devtools.animation.model.KeyframesRule keyframesRule = null;
        java.lang.String easing = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "delay":
                    delay = input.nextNumber();
                    break;
                case "endDelay":
                    endDelay = input.nextNumber();
                    break;
                case "iterationStart":
                    iterationStart = input.nextNumber();
                    break;
                case "iterations":
                    iterations = input.nextNumber();
                    break;
                case "duration":
                    duration = input.nextNumber();
                    break;
                case "direction":
                    direction = input.nextString();
                    break;
                case "fill":
                    fill = input.nextString();
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                case "keyframesRule":
                    keyframesRule = input.read(org.openqa.selenium.devtools.animation.model.KeyframesRule.class);
                    break;
                case "easing":
                    easing = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AnimationEffect(delay, endDelay, iterationStart, iterations, duration, direction, fill, backendNodeId, keyframesRule, easing);
    }
}
