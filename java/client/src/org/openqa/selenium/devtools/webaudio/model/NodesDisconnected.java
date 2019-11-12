package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the outgoing connections from the source are disconnected.
 */
public class NodesDisconnected {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId sourceId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId destinationId;

    private final java.lang.Number sourceOutputIndex;

    private final java.lang.Number destinationInputIndex;

    public NodesDisconnected(org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId sourceId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId destinationId, java.lang.Number sourceOutputIndex, java.lang.Number destinationInputIndex) {
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.sourceId = java.util.Objects.requireNonNull(sourceId, "sourceId is required");
        this.destinationId = java.util.Objects.requireNonNull(destinationId, "destinationId is required");
        this.sourceOutputIndex = sourceOutputIndex;
        this.destinationInputIndex = destinationInputIndex;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getSourceId() {
        return sourceId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getDestinationId() {
        return destinationId;
    }

    public java.lang.Number getSourceOutputIndex() {
        return sourceOutputIndex;
    }

    public java.lang.Number getDestinationInputIndex() {
        return destinationInputIndex;
    }

    private static NodesDisconnected fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId sourceId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId destinationId = null;
        java.lang.Number sourceOutputIndex = null;
        java.lang.Number destinationInputIndex = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "sourceId":
                    sourceId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "destinationId":
                    destinationId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "sourceOutputIndex":
                    sourceOutputIndex = input.nextNumber();
                    break;
                case "destinationInputIndex":
                    destinationInputIndex = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new NodesDisconnected(contextId, sourceId, destinationId, sourceOutputIndex, destinationInputIndex);
    }
}
