package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Table containing nodes.
 */
public class NodeTreeSnapshot {

    private final java.util.List<java.lang.Integer> parentIndex;

    private final java.util.List<java.lang.Integer> nodeType;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> nodeName;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> nodeValue;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> attributes;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareStringData textValue;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareStringData inputValue;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData inputChecked;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData optionSelected;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareIntegerData contentDocumentIndex;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareStringData pseudoType;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData isClickable;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareStringData currentSourceURL;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareStringData originURL;

    public NodeTreeSnapshot(java.util.List<java.lang.Integer> parentIndex, java.util.List<java.lang.Integer> nodeType, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> nodeName, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> nodeValue, java.util.List<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> attributes, org.openqa.selenium.devtools.domsnapshot.model.RareStringData textValue, org.openqa.selenium.devtools.domsnapshot.model.RareStringData inputValue, org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData inputChecked, org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData optionSelected, org.openqa.selenium.devtools.domsnapshot.model.RareIntegerData contentDocumentIndex, org.openqa.selenium.devtools.domsnapshot.model.RareStringData pseudoType, org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData isClickable, org.openqa.selenium.devtools.domsnapshot.model.RareStringData currentSourceURL, org.openqa.selenium.devtools.domsnapshot.model.RareStringData originURL) {
        this.parentIndex = parentIndex;
        this.nodeType = nodeType;
        this.nodeName = nodeName;
        this.nodeValue = nodeValue;
        this.backendNodeId = backendNodeId;
        this.attributes = attributes;
        this.textValue = textValue;
        this.inputValue = inputValue;
        this.inputChecked = inputChecked;
        this.optionSelected = optionSelected;
        this.contentDocumentIndex = contentDocumentIndex;
        this.pseudoType = pseudoType;
        this.isClickable = isClickable;
        this.currentSourceURL = currentSourceURL;
        this.originURL = originURL;
    }

    /**
     * Parent node index.
     */
    public java.util.List<java.lang.Integer> getParentIndex() {
        return parentIndex;
    }

    /**
     * `Node`'s nodeType.
     */
    public java.util.List<java.lang.Integer> getNodeType() {
        return nodeType;
    }

    /**
     * `Node`'s nodeName.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> getNodeName() {
        return nodeName;
    }

    /**
     * `Node`'s nodeValue.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> getNodeValue() {
        return nodeValue;
    }

    /**
     * `Node`'s id, corresponds to DOM.Node.backendNodeId.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.BackendNodeId> getBackendNodeId() {
        return backendNodeId;
    }

    /**
     * Attributes of an `Element` node. Flatten name, value pairs.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> getAttributes() {
        return attributes;
    }

    /**
     * Only set for textarea elements, contains the text value.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareStringData getTextValue() {
        return textValue;
    }

    /**
     * Only set for input elements, contains the input's associated text value.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareStringData getInputValue() {
        return inputValue;
    }

    /**
     * Only set for radio and checkbox input elements, indicates if the element has been checked
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData getInputChecked() {
        return inputChecked;
    }

    /**
     * Only set for option elements, indicates if the element has been selected
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData getOptionSelected() {
        return optionSelected;
    }

    /**
     * The index of the document in the list of the snapshot documents.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareIntegerData getContentDocumentIndex() {
        return contentDocumentIndex;
    }

    /**
     * Type of a pseudo element node.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareStringData getPseudoType() {
        return pseudoType;
    }

    /**
     * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
     * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
     * clicked.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData getIsClickable() {
        return isClickable;
    }

    /**
     * The selected url for nodes with a srcset attribute.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareStringData getCurrentSourceURL() {
        return currentSourceURL;
    }

    /**
     * The url of the script (if any) that generates this node.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareStringData getOriginURL() {
        return originURL;
    }

    private static NodeTreeSnapshot fromJson(JsonInput input) {
        java.util.List<java.lang.Integer> parentIndex = null;
        java.util.List<java.lang.Integer> nodeType = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> nodeName = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> nodeValue = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> attributes = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareStringData textValue = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareStringData inputValue = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData inputChecked = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData optionSelected = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareIntegerData contentDocumentIndex = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareStringData pseudoType = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData isClickable = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareStringData currentSourceURL = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareStringData originURL = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "parentIndex":
                    parentIndex = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "nodeType":
                    nodeType = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "nodeName":
                    nodeName = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex>>() {
                    }.getType());
                    break;
                case "nodeValue":
                    nodeValue = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex>>() {
                    }.getType());
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.BackendNodeId>>() {
                    }.getType());
                    break;
                case "attributes":
                    attributes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings>>() {
                    }.getType());
                    break;
                case "textValue":
                    textValue = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareStringData.class);
                    break;
                case "inputValue":
                    inputValue = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareStringData.class);
                    break;
                case "inputChecked":
                    inputChecked = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData.class);
                    break;
                case "optionSelected":
                    optionSelected = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData.class);
                    break;
                case "contentDocumentIndex":
                    contentDocumentIndex = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareIntegerData.class);
                    break;
                case "pseudoType":
                    pseudoType = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareStringData.class);
                    break;
                case "isClickable":
                    isClickable = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData.class);
                    break;
                case "currentSourceURL":
                    currentSourceURL = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareStringData.class);
                    break;
                case "originURL":
                    originURL = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareStringData.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new NodeTreeSnapshot(parentIndex, nodeType, nodeName, nodeValue, backendNodeId, attributes, textValue, inputValue, inputChecked, optionSelected, contentDocumentIndex, pseudoType, isClickable, currentSourceURL, originURL);
    }
}
