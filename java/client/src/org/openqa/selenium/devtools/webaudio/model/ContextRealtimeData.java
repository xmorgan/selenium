package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fields in AudioContext that change in real-time.
 */
public class ContextRealtimeData {

    private final java.lang.Number currentTime;

    private final java.lang.Number renderCapacity;

    private final java.lang.Number callbackIntervalMean;

    private final java.lang.Number callbackIntervalVariance;

    public ContextRealtimeData(java.lang.Number currentTime, java.lang.Number renderCapacity, java.lang.Number callbackIntervalMean, java.lang.Number callbackIntervalVariance) {
        this.currentTime = java.util.Objects.requireNonNull(currentTime, "currentTime is required");
        this.renderCapacity = java.util.Objects.requireNonNull(renderCapacity, "renderCapacity is required");
        this.callbackIntervalMean = java.util.Objects.requireNonNull(callbackIntervalMean, "callbackIntervalMean is required");
        this.callbackIntervalVariance = java.util.Objects.requireNonNull(callbackIntervalVariance, "callbackIntervalVariance is required");
    }

    /**
     * The current context time in second in BaseAudioContext.
     */
    public java.lang.Number getCurrentTime() {
        return currentTime;
    }

    /**
     * The time spent on rendering graph divided by render qunatum duration,
     * and multiplied by 100. 100 means the audio renderer reached the full
     * capacity and glitch may occur.
     */
    public java.lang.Number getRenderCapacity() {
        return renderCapacity;
    }

    /**
     * A running mean of callback interval.
     */
    public java.lang.Number getCallbackIntervalMean() {
        return callbackIntervalMean;
    }

    /**
     * A running variance of callback interval.
     */
    public java.lang.Number getCallbackIntervalVariance() {
        return callbackIntervalVariance;
    }

    private static ContextRealtimeData fromJson(JsonInput input) {
        java.lang.Number currentTime = null;
        java.lang.Number renderCapacity = null;
        java.lang.Number callbackIntervalMean = null;
        java.lang.Number callbackIntervalVariance = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "currentTime":
                    currentTime = input.nextNumber();
                    break;
                case "renderCapacity":
                    renderCapacity = input.nextNumber();
                    break;
                case "callbackIntervalMean":
                    callbackIntervalMean = input.nextNumber();
                    break;
                case "callbackIntervalVariance":
                    callbackIntervalVariance = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ContextRealtimeData(currentTime, renderCapacity, callbackIntervalMean, callbackIntervalVariance);
    }
}
