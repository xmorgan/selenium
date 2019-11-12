package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes.
 * DOMNode is a base node mirror type.
 */
public class Node {

    private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

    private final org.openqa.selenium.devtools.dom.model.NodeId parentId;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

    private final java.lang.Integer nodeType;

    private final java.lang.String nodeName;

    private final java.lang.String localName;

    private final java.lang.String nodeValue;

    private final java.lang.Integer childNodeCount;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.Node> children;

    private final java.util.List<java.lang.String> attributes;

    private final java.lang.String documentURL;

    private final java.lang.String baseURL;

    private final java.lang.String publicId;

    private final java.lang.String systemId;

    private final java.lang.String internalSubset;

    private final java.lang.String xmlVersion;

    private final java.lang.String name;

    private final java.lang.String value;

    private final org.openqa.selenium.devtools.dom.model.PseudoType pseudoType;

    private final org.openqa.selenium.devtools.dom.model.ShadowRootType shadowRootType;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.dom.model.Node contentDocument;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.Node> shadowRoots;

    private final org.openqa.selenium.devtools.dom.model.Node templateContent;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.Node> pseudoElements;

    private final org.openqa.selenium.devtools.dom.model.Node importedDocument;

    private final java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> distributedNodes;

    private final java.lang.Boolean isSVG;

    public Node(org.openqa.selenium.devtools.dom.model.NodeId nodeId, org.openqa.selenium.devtools.dom.model.NodeId parentId, org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId, java.lang.Integer nodeType, java.lang.String nodeName, java.lang.String localName, java.lang.String nodeValue, java.lang.Integer childNodeCount, java.util.List<org.openqa.selenium.devtools.dom.model.Node> children, java.util.List<java.lang.String> attributes, java.lang.String documentURL, java.lang.String baseURL, java.lang.String publicId, java.lang.String systemId, java.lang.String internalSubset, java.lang.String xmlVersion, java.lang.String name, java.lang.String value, org.openqa.selenium.devtools.dom.model.PseudoType pseudoType, org.openqa.selenium.devtools.dom.model.ShadowRootType shadowRootType, org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.dom.model.Node contentDocument, java.util.List<org.openqa.selenium.devtools.dom.model.Node> shadowRoots, org.openqa.selenium.devtools.dom.model.Node templateContent, java.util.List<org.openqa.selenium.devtools.dom.model.Node> pseudoElements, org.openqa.selenium.devtools.dom.model.Node importedDocument, java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> distributedNodes, java.lang.Boolean isSVG) {
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.parentId = parentId;
        this.backendNodeId = java.util.Objects.requireNonNull(backendNodeId, "backendNodeId is required");
        this.nodeType = java.util.Objects.requireNonNull(nodeType, "nodeType is required");
        this.nodeName = java.util.Objects.requireNonNull(nodeName, "nodeName is required");
        this.localName = java.util.Objects.requireNonNull(localName, "localName is required");
        this.nodeValue = java.util.Objects.requireNonNull(nodeValue, "nodeValue is required");
        this.childNodeCount = childNodeCount;
        this.children = children;
        this.attributes = attributes;
        this.documentURL = documentURL;
        this.baseURL = baseURL;
        this.publicId = publicId;
        this.systemId = systemId;
        this.internalSubset = internalSubset;
        this.xmlVersion = xmlVersion;
        this.name = name;
        this.value = value;
        this.pseudoType = pseudoType;
        this.shadowRootType = shadowRootType;
        this.frameId = frameId;
        this.contentDocument = contentDocument;
        this.shadowRoots = shadowRoots;
        this.templateContent = templateContent;
        this.pseudoElements = pseudoElements;
        this.importedDocument = importedDocument;
        this.distributedNodes = distributedNodes;
        this.isSVG = isSVG;
    }

    /**
     * Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend
     * will only push node with given `id` once. It is aware of all requested nodes and will only
     * fire DOM events for nodes known to the client.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
        return nodeId;
    }

    /**
     * The id of the parent node if any.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getParentId() {
        return parentId;
    }

    /**
     * The BackendNodeId for this node.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
        return backendNodeId;
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
     * `Node`'s localName.
     */
    public java.lang.String getLocalName() {
        return localName;
    }

    /**
     * `Node`'s nodeValue.
     */
    public java.lang.String getNodeValue() {
        return nodeValue;
    }

    /**
     * Child count for `Container` nodes.
     */
    public java.lang.Integer getChildNodeCount() {
        return childNodeCount;
    }

    /**
     * Child nodes of this node when requested with children.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.Node> getChildren() {
        return children;
    }

    /**
     * Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.
     */
    public java.util.List<java.lang.String> getAttributes() {
        return attributes;
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
     * `DocumentType`'s publicId.
     */
    public java.lang.String getPublicId() {
        return publicId;
    }

    /**
     * `DocumentType`'s systemId.
     */
    public java.lang.String getSystemId() {
        return systemId;
    }

    /**
     * `DocumentType`'s internalSubset.
     */
    public java.lang.String getInternalSubset() {
        return internalSubset;
    }

    /**
     * `Document`'s XML version in case of XML documents.
     */
    public java.lang.String getXmlVersion() {
        return xmlVersion;
    }

    /**
     * `Attr`'s name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * `Attr`'s value.
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Pseudo element type for this node.
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
     * Frame ID for frame owner elements.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Content document for frame owner elements.
     */
    public org.openqa.selenium.devtools.dom.model.Node getContentDocument() {
        return contentDocument;
    }

    /**
     * Shadow root list for given element host.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.Node> getShadowRoots() {
        return shadowRoots;
    }

    /**
     * Content document fragment for template elements.
     */
    public org.openqa.selenium.devtools.dom.model.Node getTemplateContent() {
        return templateContent;
    }

    /**
     * Pseudo elements associated with this node.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.Node> getPseudoElements() {
        return pseudoElements;
    }

    /**
     * Import document for the HTMLImport links.
     */
    public org.openqa.selenium.devtools.dom.model.Node getImportedDocument() {
        return importedDocument;
    }

    /**
     * Distributed nodes for given insertion point.
     */
    public java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> getDistributedNodes() {
        return distributedNodes;
    }

    /**
     * Whether the node is SVG.
     */
    public java.lang.Boolean getIsSVG() {
        return isSVG;
    }

    private static Node fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
        org.openqa.selenium.devtools.dom.model.NodeId parentId = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
        java.lang.Integer nodeType = null;
        java.lang.String nodeName = null;
        java.lang.String localName = null;
        java.lang.String nodeValue = null;
        java.lang.Integer childNodeCount = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.Node> children = null;
        java.util.List<java.lang.String> attributes = null;
        java.lang.String documentURL = null;
        java.lang.String baseURL = null;
        java.lang.String publicId = null;
        java.lang.String systemId = null;
        java.lang.String internalSubset = null;
        java.lang.String xmlVersion = null;
        java.lang.String name = null;
        java.lang.String value = null;
        org.openqa.selenium.devtools.dom.model.PseudoType pseudoType = null;
        org.openqa.selenium.devtools.dom.model.ShadowRootType shadowRootType = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.dom.model.Node contentDocument = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.Node> shadowRoots = null;
        org.openqa.selenium.devtools.dom.model.Node templateContent = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.Node> pseudoElements = null;
        org.openqa.selenium.devtools.dom.model.Node importedDocument = null;
        java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode> distributedNodes = null;
        java.lang.Boolean isSVG = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "parentId":
                    parentId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                case "nodeType":
                    nodeType = input.nextNumber().intValue();
                    break;
                case "nodeName":
                    nodeName = input.nextString();
                    break;
                case "localName":
                    localName = input.nextString();
                    break;
                case "nodeValue":
                    nodeValue = input.nextString();
                    break;
                case "childNodeCount":
                    childNodeCount = input.nextNumber().intValue();
                    break;
                case "children":
                    children = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.Node>>() {
                    }.getType());
                    break;
                case "attributes":
                    attributes = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "documentURL":
                    documentURL = input.nextString();
                    break;
                case "baseURL":
                    baseURL = input.nextString();
                    break;
                case "publicId":
                    publicId = input.nextString();
                    break;
                case "systemId":
                    systemId = input.nextString();
                    break;
                case "internalSubset":
                    internalSubset = input.nextString();
                    break;
                case "xmlVersion":
                    xmlVersion = input.nextString();
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                case "pseudoType":
                    pseudoType = input.read(org.openqa.selenium.devtools.dom.model.PseudoType.class);
                    break;
                case "shadowRootType":
                    shadowRootType = input.read(org.openqa.selenium.devtools.dom.model.ShadowRootType.class);
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "contentDocument":
                    contentDocument = input.read(org.openqa.selenium.devtools.dom.model.Node.class);
                    break;
                case "shadowRoots":
                    shadowRoots = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.Node>>() {
                    }.getType());
                    break;
                case "templateContent":
                    templateContent = input.read(org.openqa.selenium.devtools.dom.model.Node.class);
                    break;
                case "pseudoElements":
                    pseudoElements = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.Node>>() {
                    }.getType());
                    break;
                case "importedDocument":
                    importedDocument = input.read(org.openqa.selenium.devtools.dom.model.Node.class);
                    break;
                case "distributedNodes":
                    distributedNodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.BackendNode>>() {
                    }.getType());
                    break;
                case "isSVG":
                    isSVG = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Node(nodeId, parentId, backendNodeId, nodeType, nodeName, localName, nodeValue, childNodeCount, children, attributes, documentURL, baseURL, publicId, systemId, internalSubset, xmlVersion, name, value, pseudoType, shadowRootType, frameId, contentDocument, shadowRoots, templateContent, pseudoElements, importedDocument, distributedNodes, isSVG);
    }
}
