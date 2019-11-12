package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Document snapshot.
 */
public class DocumentSnapshot {

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex documentURL;

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex baseURL;

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex contentLanguage;

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex encodingName;

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex publicId;

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex systemId;

    private final org.openqa.selenium.devtools.domsnapshot.model.StringIndex frameId;

    private final org.openqa.selenium.devtools.domsnapshot.model.NodeTreeSnapshot nodes;

    private final org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeSnapshot layout;

    private final org.openqa.selenium.devtools.domsnapshot.model.TextBoxSnapshot textBoxes;

    private final java.lang.Number scrollOffsetX;

    private final java.lang.Number scrollOffsetY;

    public DocumentSnapshot(org.openqa.selenium.devtools.domsnapshot.model.StringIndex documentURL, org.openqa.selenium.devtools.domsnapshot.model.StringIndex baseURL, org.openqa.selenium.devtools.domsnapshot.model.StringIndex contentLanguage, org.openqa.selenium.devtools.domsnapshot.model.StringIndex encodingName, org.openqa.selenium.devtools.domsnapshot.model.StringIndex publicId, org.openqa.selenium.devtools.domsnapshot.model.StringIndex systemId, org.openqa.selenium.devtools.domsnapshot.model.StringIndex frameId, org.openqa.selenium.devtools.domsnapshot.model.NodeTreeSnapshot nodes, org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeSnapshot layout, org.openqa.selenium.devtools.domsnapshot.model.TextBoxSnapshot textBoxes, java.lang.Number scrollOffsetX, java.lang.Number scrollOffsetY) {
        this.documentURL = java.util.Objects.requireNonNull(documentURL, "documentURL is required");
        this.baseURL = java.util.Objects.requireNonNull(baseURL, "baseURL is required");
        this.contentLanguage = java.util.Objects.requireNonNull(contentLanguage, "contentLanguage is required");
        this.encodingName = java.util.Objects.requireNonNull(encodingName, "encodingName is required");
        this.publicId = java.util.Objects.requireNonNull(publicId, "publicId is required");
        this.systemId = java.util.Objects.requireNonNull(systemId, "systemId is required");
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.nodes = java.util.Objects.requireNonNull(nodes, "nodes is required");
        this.layout = java.util.Objects.requireNonNull(layout, "layout is required");
        this.textBoxes = java.util.Objects.requireNonNull(textBoxes, "textBoxes is required");
        this.scrollOffsetX = scrollOffsetX;
        this.scrollOffsetY = scrollOffsetY;
    }

    /**
     * Document URL that `Document` or `FrameOwner` node points to.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getDocumentURL() {
        return documentURL;
    }

    /**
     * Base URL that `Document` or `FrameOwner` node uses for URL completion.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getBaseURL() {
        return baseURL;
    }

    /**
     * Contains the document's content language.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Contains the document's character set encoding.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getEncodingName() {
        return encodingName;
    }

    /**
     * `DocumentType` node's publicId.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getPublicId() {
        return publicId;
    }

    /**
     * `DocumentType` node's systemId.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getSystemId() {
        return systemId;
    }

    /**
     * Frame ID for frame owner elements and also for the document node.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.StringIndex getFrameId() {
        return frameId;
    }

    /**
     * A table with dom nodes.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.NodeTreeSnapshot getNodes() {
        return nodes;
    }

    /**
     * The nodes in the layout tree.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeSnapshot getLayout() {
        return layout;
    }

    /**
     * The post-layout inline text nodes.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.TextBoxSnapshot getTextBoxes() {
        return textBoxes;
    }

    /**
     * Horizontal scroll offset.
     */
    public java.lang.Number getScrollOffsetX() {
        return scrollOffsetX;
    }

    /**
     * Vertical scroll offset.
     */
    public java.lang.Number getScrollOffsetY() {
        return scrollOffsetY;
    }

    private static DocumentSnapshot fromJson(JsonInput input) {
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex documentURL = null;
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex baseURL = null;
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex contentLanguage = null;
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex encodingName = null;
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex publicId = null;
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex systemId = null;
        org.openqa.selenium.devtools.domsnapshot.model.StringIndex frameId = null;
        org.openqa.selenium.devtools.domsnapshot.model.NodeTreeSnapshot nodes = null;
        org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeSnapshot layout = null;
        org.openqa.selenium.devtools.domsnapshot.model.TextBoxSnapshot textBoxes = null;
        java.lang.Number scrollOffsetX = null;
        java.lang.Number scrollOffsetY = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "documentURL":
                    documentURL = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "baseURL":
                    baseURL = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "contentLanguage":
                    contentLanguage = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "encodingName":
                    encodingName = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "publicId":
                    publicId = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "systemId":
                    systemId = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.domsnapshot.model.StringIndex.class);
                    break;
                case "nodes":
                    nodes = input.read(org.openqa.selenium.devtools.domsnapshot.model.NodeTreeSnapshot.class);
                    break;
                case "layout":
                    layout = input.read(org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeSnapshot.class);
                    break;
                case "textBoxes":
                    textBoxes = input.read(org.openqa.selenium.devtools.domsnapshot.model.TextBoxSnapshot.class);
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
        return new DocumentSnapshot(documentURL, baseURL, contentLanguage, encodingName, publicId, systemId, frameId, nodes, layout, textBoxes, scrollOffsetX, scrollOffsetY);
    }
}
