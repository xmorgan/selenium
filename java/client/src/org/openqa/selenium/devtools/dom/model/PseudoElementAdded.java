package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Called when a pseudo element is added to an element.
 */
@org.openqa.selenium.Beta()
public class PseudoElementAdded {

    private final org.openqa.selenium.devtools.dom.model.NodeId parentId;

    private final org.openqa.selenium.devtools.dom.model.Node pseudoElement;

    public PseudoElementAdded(org.openqa.selenium.devtools.dom.model.NodeId parentId, org.openqa.selenium.devtools.dom.model.Node pseudoElement) {
        this.parentId = java.util.Objects.requireNonNull(parentId, "parentId is required");
        this.pseudoElement = java.util.Objects.requireNonNull(pseudoElement, "pseudoElement is required");
    }

    /**
     * Pseudo element's parent element id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getParentId() {
        return parentId;
    }

    /**
     * The added pseudo element.
     */
    public org.openqa.selenium.devtools.dom.model.Node getPseudoElement() {
        return pseudoElement;
    }

    private static PseudoElementAdded fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId parentId = null;
        org.openqa.selenium.devtools.dom.model.Node pseudoElement = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "parentId":
                    parentId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "pseudoElement":
                    pseudoElement = input.read(org.openqa.selenium.devtools.dom.model.Node.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PseudoElementAdded(parentId, pseudoElement);
    }
}
