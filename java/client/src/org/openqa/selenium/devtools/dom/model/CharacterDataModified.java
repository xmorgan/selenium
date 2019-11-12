package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Mirrors `DOMCharacterDataModified` event.
 */
public class CharacterDataModified {

    private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

    private final java.lang.String characterData;

    public CharacterDataModified(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String characterData) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.characterData = java.util.Objects.requireNonNull(characterData, "characterData is required");
    }

    /**
     * Id of the node that has changed.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
        return nodeId;
    }

    /**
     * New text value.
     */
    public java.lang.String getCharacterData() {
        return characterData;
    }

    private static CharacterDataModified fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
        java.lang.String characterData = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "characterData":
                    characterData = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CharacterDataModified(nodeId, characterData);
    }
}
