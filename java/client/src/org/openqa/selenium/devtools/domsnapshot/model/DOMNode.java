package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A Node in the DOM tree.
 */
public class DOMNode {

    private final java.lang.Integer nodeType;

    private final java.lang.String nodeName;

    private final java.lang.String nodeValue;

    private final java.lang.String textValue;

    private final java.lang.String inputValue;

    private final java.lang.Boolean inputChecked;

    private final java.lang.Boolean optionSelected;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

    private final java.util.List<java.lang.Integer> childNodeIndexes;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> attributes;

    private final java.util.List<java.lang.Integer> pseudoElementIndexes;

    private final java.lang.Integer layoutNodeIndex;

    private final java.lang.String documentURL;

    private final java.lang.String baseURL;

    private final java.lang.String contentLanguage;

    private final java.lang.String documentEncoding;

    private final java.lang.String publicId;

    private final java.lang.String systemId;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.Integer contentDocumentIndex;

    private final org.openqa.selenium.devtools.dom.model.PseudoType pseudoType;

    private final org.openqa.selenium.devtools.dom.model.ShadowRootType shadowRootType;

    private final java.lang.Boolean isClickable;

    private final java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener> eventListeners;

    private final java.lang.String currentSourceURL;

    private final java.lang.String originURL;

    private final java.lang.Number scrollOffsetX;

    private final java.lang.Number scrollOffsetY;

    public DOMNode(java.lang.Integer nodeType, java.lang.String nodeName, java.lang.String nodeValue, java.lang.String textValue, java.lang.String inputValue, java.lang.Boolean inputChecked, java.lang.Boolean optionSelected, org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId, java.util.List<java.lang.Integer> childNodeIndexes, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> attributes, java.util.List<java.lang.Integer> pseudoElementIndexes, java.lang.Integer layoutNodeIndex, java.lang.String documentURL, java.lang.String baseURL, java.lang.String contentLanguage, java.lang.String documentEncoding, java.lang.String publicId, java.lang.String systemId, org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.Integer contentDocumentIndex, org.openqa.selenium.devtools.dom.model.PseudoType pseudoType, org.openqa.selenium.devtools.dom.model.ShadowRootType shadowRootType, java.lang.Boolean isClickable, java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener> eventListeners, java.lang.String currentSourceURL, java.lang.String originURL, java.lang.Number scrollOffsetX, java.lang.Number scrollOffsetY) {
        this.nodeType = java.util.Objects.requireNonNull(nodeType, "nodeType is required");
        this.nodeName = java.util.Objects.requireNonNull(nodeName, "nodeName is required");
        this.nodeValue = java.util.Objects.requireNonNull(nodeValue, "nodeValue is required");
        this.textValue = textValue;
        this.inputValue = inputValue;
        this.inputChecked = inputChecked;
        this.optionSelected = optionSelected;
        this.backendNodeId = java.util.Objects.requireNonNull(backendNodeId, "backendNodeId is required");
        this.childNodeIndexes = childNodeIndexes;
        this.attributes = attributes;
        this.pseudoElementIndexes = pseudoElementIndexes;
        this.layoutNodeIndex = layoutNodeIndex;
        this.documentURL = documentURL;
        this.baseURL = baseURL;
        this.contentLanguage = contentLanguage;
        this.documentEncoding = documentEncoding;
        this.publicId = publicId;
        this.systemId = systemId;
        this.frameId = frameId;
        this.contentDocumentIndex = contentDocumentIndex;
        this.pseudoType = pseudoType;
        this.shadowRootType = shadowRootType;
        this.isClickable = isClickable;
        this.eventListeners = eventListeners;
        this.currentSourceURL = currentSourceURL;
        this.originURL = originURL;
        this.scrollOffsetX = scrollOffsetX;
        this.scrollOffsetY = scrollOffsetY;
    }

    /**
     * `Node`'s nodeType.
     */
    public java.lang.Integer getNodeType() {
        return nodeType;
    }

    /**
     * `Node`'s nodeName.
     */
    public java.lang.String getNodeName() {
        return nodeName;
    }

    /**
     * `Node`'s nodeValue.
     */
    public java.lang.String getNodeValue() {
        return nodeValue;
    }

    /**
     * Only set for textarea elements, contains the text value.
     */
    public java.lang.String getTextValue() {
        return textValue;
    }

    /**
     * Only set for input elements, contains the input's associated text value.
     */
    public java.lang.String getInputValue() {
        return inputValue;
    }

    /**
     * Only set for radio and checkbox input elements, indicates if the element has been checked
     */
    public java.lang.Boolean getInputChecked() {
        return inputChecked;
    }

    /**
     * Only set for option elements, indicates if the element has been selected
     */
    public java.lang.Boolean getOptionSelected() {
        return optionSelected;
    }

    /**
     * `Node`'s id, corresponds to DOM.Node.backendNodeId.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
        return backendNodeId;
    }

    /**
     * The indexes of the node's child nodes in the `domNodes` array returned by `getSnapshot`, if
     * any.
     */
    public java.util.List<java.lang.Integer> getChildNodeIndexes() {
        return childNodeIndexes;
    }

    /**
     * Attributes of an `Element` node.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> getAttributes() {
        return attributes;
    }

    /**
     * Indexes of pseudo elements associated with this node in the `domNodes` array returned by
     * `getSnapshot`, if any.
     */
    public java.util.List<java.lang.Integer> getPseudoElementIndexes() {
        return pseudoElementIndexes;
    }

    /**
     * The index of the node's related layout tree node in the `layoutTreeNodes` array returned by
     * `getSnapshot`, if any.
     */
    public java.lang.Integer getLayoutNodeIndex() {
        return layoutNodeIndex;
    }

    /**
     * Document URL that `Document` or `FrameOwner` node points to.
     */
    public java.lang.String getDocumentURL() {
        return documentURL;
    }

    /**
     * Base URL that `Document` or `FrameOwner` node uses for URL completion.
     */
    public java.lang.String getBaseURL() {
        return baseURL;
    }

    /**
     * Only set for documents, contains the document's content language.
     */
    public java.lang.String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Only set for documents, contains the document's character set encoding.
     */
    public java.lang.String getDocumentEncoding() {
        return documentEncoding;
    }

    /**
     * `DocumentType` node's publicId.
     */
    public java.lang.String getPublicId() {
        return publicId;
    }

    /**
     * `DocumentType` node's systemId.
     */
    public java.lang.String getSystemId() {
        return systemId;
    }

    /**
     * Frame ID for frame owner elements and also for the document node.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * The index of a frame owner element's content document in the `domNodes` array returned by
     * `getSnapshot`, if any.
     */
    public java.lang.Integer getContentDocumentIndex() {
        return contentDocumentIndex;
    }

    /**
     * Type of a pseudo element node.
     */
    public org.openqa.selenium.devtools.dom.model.PseudoType getPseudoType() {
        return pseudoType;
    }

    /**
     * Shadow root type.
     */
    public org.openqa.selenium.devtools.dom.model.ShadowRootType getShadowRootType() {
        return shadowRootType;
    }

    /**
     * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
     * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
     * clicked.
     */
    public java.lang.Boolean getIsClickable() {
        return isClickable;
    }

    /**
     * Details of the node's event listeners, if any.
     */
    public java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener> getEventListeners() {
        return eventListeners;
    }

    /**
     * The selected url for nodes with a srcset attribute.
     */
    public java.lang.String getCurrentSourceURL() {
        return currentSourceURL;
    }

    /**
     * The url of the script (if any) that generates this node.
     */
    public java.lang.String getOriginURL() {
        return originURL;
    }

    /**
     * Scroll offsets, set when this node is a Document.
     */
    public java.lang.Number getScrollOffsetX() {
        return scrollOffsetX;
    }

    public java.lang.Number getScrollOffsetY() {
        return scrollOffsetY;
    }

    private static DOMNode fromJson(JsonInput input) {
        java.lang.Integer nodeType = null;
        java.lang.String nodeName = null;
        java.lang.String nodeValue = null;
        java.lang.String textValue = null;
        java.lang.String inputValue = null;
        java.lang.Boolean inputChecked = null;
        java.lang.Boolean optionSelected = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
        java.util.List<java.lang.Integer> childNodeIndexes = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue> attributes = null;
        java.util.List<java.lang.Integer> pseudoElementIndexes = null;
        java.lang.Integer layoutNodeIndex = null;
        java.lang.String documentURL = null;
        java.lang.String baseURL = null;
        java.lang.String contentLanguage = null;
        java.lang.String documentEncoding = null;
        java.lang.String publicId = null;
        java.lang.String systemId = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        java.lang.Integer contentDocumentIndex = null;
        org.openqa.selenium.devtools.dom.model.PseudoType pseudoType = null;
        org.openqa.selenium.devtools.dom.model.ShadowRootType shadowRootType = null;
        java.lang.Boolean isClickable = null;
        java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener> eventListeners = null;
        java.lang.String currentSourceURL = null;
        java.lang.String originURL = null;
        java.lang.Number scrollOffsetX = null;
        java.lang.Number scrollOffsetY = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeType":
                    nodeType = input.nextNumber().intValue();
                    break;
                case "nodeName":
                    nodeName = input.nextString();
                    break;
                case "nodeValue":
                    nodeValue = input.nextString();
                    break;
                case "textValue":
                    textValue = input.nextString();
                    break;
                case "inputValue":
                    inputValue = input.nextString();
                    break;
                case "inputChecked":
                    inputChecked = input.nextBoolean();
                    break;
                case "optionSelected":
                    optionSelected = input.nextBoolean();
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                case "childNodeIndexes":
                    childNodeIndexes = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "attributes":
                    attributes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.NameValue>>() {
                    }.getType());
                    break;
                case "pseudoElementIndexes":
                    pseudoElementIndexes = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "layoutNodeIndex":
                    layoutNodeIndex = input.nextNumber().intValue();
                    break;
                case "documentURL":
                    documentURL = input.nextString();
                    break;
                case "baseURL":
                    baseURL = input.nextString();
                    break;
                case "contentLanguage":
                    contentLanguage = input.nextString();
                    break;
                case "documentEncoding":
                    documentEncoding = input.nextString();
                    break;
                case "publicId":
                    publicId = input.nextString();
                    break;
                case "systemId":
                    systemId = input.nextString();
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "contentDocumentIndex":
                    contentDocumentIndex = input.nextNumber().intValue();
                    break;
                case "pseudoType":
                    pseudoType = input.read(org.openqa.selenium.devtools.dom.model.PseudoType.class);
                    break;
                case "shadowRootType":
                    shadowRootType = input.read(org.openqa.selenium.devtools.dom.model.ShadowRootType.class);
                    break;
                case "isClickable":
                    isClickable = input.nextBoolean();
                    break;
                case "eventListeners":
                    eventListeners = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener>>() {
                    }.getType());
                    break;
                case "currentSourceURL":
                    currentSourceURL = input.nextString();
                    break;
                case "originURL":
                    originURL = input.nextString();
                    break;
                case "scrollOffsetX":
                    scrollOffsetX = input.nextNumber();
                    break;
                case "scrollOffsetY":
                    scrollOffsetY = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DOMNode(nodeType, nodeName, nodeValue, textValue, inputValue, inputChecked, optionSelected, backendNodeId, childNodeIndexes, attributes, pseudoElementIndexes, layoutNodeIndex, documentURL, baseURL, contentLanguage, documentEncoding, publicId, systemId, frameId, contentDocumentIndex, pseudoType, shadowRootType, isClickable, eventListeners, currentSourceURL, originURL, scrollOffsetX, scrollOffsetY);
    }
}
