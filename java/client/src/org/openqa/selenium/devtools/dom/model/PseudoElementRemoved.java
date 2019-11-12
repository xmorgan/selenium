package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Called when a pseudo element is removed from an element.
 */
@org.openqa.selenium.Beta()
public class PseudoElementRemoved {

    private final org.openqa.selenium.devtools.dom.model.NodeId parentId;

    private final org.openqa.selenium.devtools.dom.model.NodeId pseudoElementId;

    public PseudoElementRemoved(org.openqa.selenium.devtools.dom.model.NodeId parentId, org.openqa.selenium.devtools.dom.model.NodeId pseudoElementId) {
        this.parentId = java.util.Objects.requireNonNull(parentId, "parentId is required");
        this.pseudoElementId = java.util.Objects.requireNonNull(pseudoElementId, "pseudoElementId is required");
    }

    /**
     * Pseudo element's parent element id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getParentId() {
        return parentId;
    }

    /**
     * The removed pseudo element id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getPseudoElementId() {
        return pseudoElementId;
    }

    private static PseudoElementRemoved fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId parentId = null;
        org.openqa.selenium.devtools.dom.model.NodeId pseudoElementId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "parentId":
                    parentId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "pseudoElementId":
                    pseudoElementId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PseudoElementRemoved(parentId, pseudoElementId);
    }
}
