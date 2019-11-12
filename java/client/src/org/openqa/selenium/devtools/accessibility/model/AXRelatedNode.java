package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class AXRelatedNode {

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendDOMNodeId;

    private final java.lang.String idref;

    private final java.lang.String text;

    public AXRelatedNode(org.openqa.selenium.devtools.dom.model.BackendNodeId backendDOMNodeId, java.lang.String idref, java.lang.String text) {
        this.backendDOMNodeId = java.util.Objects.requireNonNull(backendDOMNodeId, "backendDOMNodeId is required");
        this.idref = idref;
        this.text = text;
    }

    /**
     * The BackendNodeId of the related DOM node.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendDOMNodeId() {
        return backendDOMNodeId;
    }

    /**
     * The IDRef value provided, if any.
     */
    public java.lang.String getIdref() {
        return idref;
    }

    /**
     * The text alternative of this node in the current context.
     */
    public java.lang.String getText() {
        return text;
    }

    private static AXRelatedNode fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendDOMNodeId = null;
        java.lang.String idref = null;
        java.lang.String text = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "backendDOMNodeId":
                    backendDOMNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                case "idref":
                    idref = input.nextString();
                    break;
                case "text":
                    text = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AXRelatedNode(backendDOMNodeId, idref, text);
    }
}
