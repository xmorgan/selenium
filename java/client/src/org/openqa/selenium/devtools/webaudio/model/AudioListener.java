package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Protocol object for AudioListner
 */
public class AudioListener {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId listenerId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    public AudioListener(org.openqa.selenium.devtools.webaudio.model.GraphObjectId listenerId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId) {
        this.listenerId = java.util.Objects.requireNonNull(listenerId, "listenerId is required");
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getListenerId() {
        return listenerId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    private static AudioListener fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId listenerId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "listenerId":
                    listenerId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AudioListener(listenerId, contextId);
    }
}
