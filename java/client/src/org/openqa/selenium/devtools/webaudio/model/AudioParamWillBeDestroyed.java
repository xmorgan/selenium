package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Notifies that an existing AudioParam has been destroyed.
 */
public class AudioParamWillBeDestroyed {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId paramId;

    public AudioParamWillBeDestroyed(org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId paramId) {
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.paramId = java.util.Objects.requireNonNull(paramId, "paramId is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getNodeId() {
        return nodeId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getParamId() {
        return paramId;
    }

    private static AudioParamWillBeDestroyed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId paramId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "paramId":
                    paramId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AudioParamWillBeDestroyed(contextId, nodeId, paramId);
    }
}
