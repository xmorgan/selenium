package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Protocol object for AudioNode
 */
public class AudioNode {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.NodeType nodeType;

    private final java.lang.Number numberOfInputs;

    private final java.lang.Number numberOfOutputs;

    private final java.lang.Number channelCount;

    private final org.openqa.selenium.devtools.webaudio.model.ChannelCountMode channelCountMode;

    private final org.openqa.selenium.devtools.webaudio.model.ChannelInterpretation channelInterpretation;

    public AudioNode(org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.NodeType nodeType, java.lang.Number numberOfInputs, java.lang.Number numberOfOutputs, java.lang.Number channelCount, org.openqa.selenium.devtools.webaudio.model.ChannelCountMode channelCountMode, org.openqa.selenium.devtools.webaudio.model.ChannelInterpretation channelInterpretation) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.nodeType = java.util.Objects.requireNonNull(nodeType, "nodeType is required");
        this.numberOfInputs = java.util.Objects.requireNonNull(numberOfInputs, "numberOfInputs is required");
        this.numberOfOutputs = java.util.Objects.requireNonNull(numberOfOutputs, "numberOfOutputs is required");
        this.channelCount = java.util.Objects.requireNonNull(channelCount, "channelCount is required");
        this.channelCountMode = java.util.Objects.requireNonNull(channelCountMode, "channelCountMode is required");
        this.channelInterpretation = java.util.Objects.requireNonNull(channelInterpretation, "channelInterpretation is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getNodeId() {
        return nodeId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.NodeType getNodeType() {
        return nodeType;
    }

    public java.lang.Number getNumberOfInputs() {
        return numberOfInputs;
    }

    public java.lang.Number getNumberOfOutputs() {
        return numberOfOutputs;
    }

    public java.lang.Number getChannelCount() {
        return channelCount;
    }

    public org.openqa.selenium.devtools.webaudio.model.ChannelCountMode getChannelCountMode() {
        return channelCountMode;
    }

    public org.openqa.selenium.devtools.webaudio.model.ChannelInterpretation getChannelInterpretation() {
        return channelInterpretation;
    }

    private static AudioNode fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.NodeType nodeType = null;
        java.lang.Number numberOfInputs = null;
        java.lang.Number numberOfOutputs = null;
        java.lang.Number channelCount = null;
        org.openqa.selenium.devtools.webaudio.model.ChannelCountMode channelCountMode = null;
        org.openqa.selenium.devtools.webaudio.model.ChannelInterpretation channelInterpretation = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "nodeType":
                    nodeType = input.read(org.openqa.selenium.devtools.webaudio.model.NodeType.class);
                    break;
                case "numberOfInputs":
                    numberOfInputs = input.nextNumber();
                    break;
                case "numberOfOutputs":
                    numberOfOutputs = input.nextNumber();
                    break;
                case "channelCount":
                    channelCount = input.nextNumber();
                    break;
                case "channelCountMode":
                    channelCountMode = input.read(org.openqa.selenium.devtools.webaudio.model.ChannelCountMode.class);
                    break;
                case "channelInterpretation":
                    channelInterpretation = input.read(org.openqa.selenium.devtools.webaudio.model.ChannelInterpretation.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AudioNode(nodeId, contextId, nodeType, numberOfInputs, numberOfOutputs, channelCount, channelCountMode, channelInterpretation);
    }
}
