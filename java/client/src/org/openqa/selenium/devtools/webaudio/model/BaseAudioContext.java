package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Protocol object for BaseAudioContext
 */
public class BaseAudioContext {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.ContextType contextType;

    private final org.openqa.selenium.devtools.webaudio.model.ContextState contextState;

    private final org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData realtimeData;

    private final java.lang.Number callbackBufferSize;

    private final java.lang.Number maxOutputChannelCount;

    private final java.lang.Number sampleRate;

    public BaseAudioContext(org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.ContextType contextType, org.openqa.selenium.devtools.webaudio.model.ContextState contextState, org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData realtimeData, java.lang.Number callbackBufferSize, java.lang.Number maxOutputChannelCount, java.lang.Number sampleRate) {
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.contextType = java.util.Objects.requireNonNull(contextType, "contextType is required");
        this.contextState = java.util.Objects.requireNonNull(contextState, "contextState is required");
        this.realtimeData = realtimeData;
        this.callbackBufferSize = java.util.Objects.requireNonNull(callbackBufferSize, "callbackBufferSize is required");
        this.maxOutputChannelCount = java.util.Objects.requireNonNull(maxOutputChannelCount, "maxOutputChannelCount is required");
        this.sampleRate = java.util.Objects.requireNonNull(sampleRate, "sampleRate is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.ContextType getContextType() {
        return contextType;
    }

    public org.openqa.selenium.devtools.webaudio.model.ContextState getContextState() {
        return contextState;
    }

    public org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData getRealtimeData() {
        return realtimeData;
    }

    /**
     * Platform-dependent callback buffer size.
     */
    public java.lang.Number getCallbackBufferSize() {
        return callbackBufferSize;
    }

    /**
     * Number of output channels supported by audio hardware in use.
     */
    public java.lang.Number getMaxOutputChannelCount() {
        return maxOutputChannelCount;
    }

    /**
     * Context sample rate.
     */
    public java.lang.Number getSampleRate() {
        return sampleRate;
    }

    private static BaseAudioContext fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.ContextType contextType = null;
        org.openqa.selenium.devtools.webaudio.model.ContextState contextState = null;
        org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData realtimeData = null;
        java.lang.Number callbackBufferSize = null;
        java.lang.Number maxOutputChannelCount = null;
        java.lang.Number sampleRate = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "contextType":
                    contextType = input.read(org.openqa.selenium.devtools.webaudio.model.ContextType.class);
                    break;
                case "contextState":
                    contextState = input.read(org.openqa.selenium.devtools.webaudio.model.ContextState.class);
                    break;
                case "realtimeData":
                    realtimeData = input.read(org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData.class);
                    break;
                case "callbackBufferSize":
                    callbackBufferSize = input.nextNumber();
                    break;
                case "maxOutputChannelCount":
                    maxOutputChannelCount = input.nextNumber();
                    break;
                case "sampleRate":
                    sampleRate = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BaseAudioContext(contextId, contextType, contextState, realtimeData, callbackBufferSize, maxOutputChannelCount, sampleRate);
    }
}
