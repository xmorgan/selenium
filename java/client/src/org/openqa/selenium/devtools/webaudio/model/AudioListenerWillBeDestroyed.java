package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Notifies that a new AudioListener has been created.
 */
public class AudioListenerWillBeDestroyed {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId listenerId;

    public AudioListenerWillBeDestroyed(org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId listenerId) {
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.listenerId = java.util.Objects.requireNonNull(listenerId, "listenerId is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getListenerId() {
        return listenerId;
    }

    private static AudioListenerWillBeDestroyed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId listenerId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "listenerId":
                    listenerId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AudioListenerWillBeDestroyed(contextId, listenerId);
    }
}
