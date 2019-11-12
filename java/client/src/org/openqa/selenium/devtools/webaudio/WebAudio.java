package org.openqa.selenium.devtools.webaudio;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain allows inspection of Web Audio API.
 * https://webaudio.github.io/web-audio-api/
 */
@Beta()
public class WebAudio {

    /**
     * Enables the WebAudio domain and starts sending context lifetime events.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("WebAudio.enable", params.build());
    }

    /**
     * Disables the WebAudio domain.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("WebAudio.disable", params.build());
    }

    /**
     * Fetch the realtime data from the registered contexts.
     */
    public static Command<org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData> getRealtimeData(org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId) {
        java.util.Objects.requireNonNull(contextId, "contextId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("contextId", contextId);
        return new Command<>("WebAudio.getRealtimeData", params.build(), ConverterFunctions.map("realtimeData", org.openqa.selenium.devtools.webaudio.model.ContextRealtimeData.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.BaseAudioContext> contextCreated() {
        return new Event<>("WebAudio.contextCreated", ConverterFunctions.map("context", org.openqa.selenium.devtools.webaudio.model.BaseAudioContext.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.GraphObjectId> contextWillBeDestroyed() {
        return new Event<>("WebAudio.contextWillBeDestroyed", ConverterFunctions.map("contextId", org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.BaseAudioContext> contextChanged() {
        return new Event<>("WebAudio.contextChanged", ConverterFunctions.map("context", org.openqa.selenium.devtools.webaudio.model.BaseAudioContext.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.AudioListener> audioListenerCreated() {
        return new Event<>("WebAudio.audioListenerCreated", ConverterFunctions.map("listener", org.openqa.selenium.devtools.webaudio.model.AudioListener.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.AudioListenerWillBeDestroyed> audioListenerWillBeDestroyed() {
        return new Event<>("WebAudio.audioListenerWillBeDestroyed", input -> input.read(org.openqa.selenium.devtools.webaudio.model.AudioListenerWillBeDestroyed.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.AudioNode> audioNodeCreated() {
        return new Event<>("WebAudio.audioNodeCreated", ConverterFunctions.map("node", org.openqa.selenium.devtools.webaudio.model.AudioNode.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.AudioNodeWillBeDestroyed> audioNodeWillBeDestroyed() {
        return new Event<>("WebAudio.audioNodeWillBeDestroyed", input -> input.read(org.openqa.selenium.devtools.webaudio.model.AudioNodeWillBeDestroyed.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.AudioParam> audioParamCreated() {
        return new Event<>("WebAudio.audioParamCreated", ConverterFunctions.map("param", org.openqa.selenium.devtools.webaudio.model.AudioParam.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.AudioParamWillBeDestroyed> audioParamWillBeDestroyed() {
        return new Event<>("WebAudio.audioParamWillBeDestroyed", input -> input.read(org.openqa.selenium.devtools.webaudio.model.AudioParamWillBeDestroyed.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.NodesConnected> nodesConnected() {
        return new Event<>("WebAudio.nodesConnected", input -> input.read(org.openqa.selenium.devtools.webaudio.model.NodesConnected.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.NodesDisconnected> nodesDisconnected() {
        return new Event<>("WebAudio.nodesDisconnected", input -> input.read(org.openqa.selenium.devtools.webaudio.model.NodesDisconnected.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.NodeParamConnected> nodeParamConnected() {
        return new Event<>("WebAudio.nodeParamConnected", input -> input.read(org.openqa.selenium.devtools.webaudio.model.NodeParamConnected.class));
    }

    public static Event<org.openqa.selenium.devtools.webaudio.model.NodeParamDisconnected> nodeParamDisconnected() {
        return new Event<>("WebAudio.nodeParamDisconnected", input -> input.read(org.openqa.selenium.devtools.webaudio.model.NodeParamDisconnected.class));
    }
}
