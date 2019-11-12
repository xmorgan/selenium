package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Notifies that an existing AudioNode has been destroyed.
 */
public class AudioNodeWillBeDestroyed {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId;

    public AudioNodeWillBeDestroyed(org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId) {
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getNodeId() {
        return nodeId;
    }

    private static AudioNodeWillBeDestroyed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AudioNodeWillBeDestroyed(contextId, nodeId);
    }
}
