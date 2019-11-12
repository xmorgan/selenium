package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS stylesheet metainformation.
 */
public class CSSStyleSheetHeader {

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.String sourceURL;

    private final java.lang.String sourceMapURL;

    private final org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin;

    private final java.lang.String title;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId ownerNode;

    private final java.lang.Boolean disabled;

    private final java.lang.Boolean hasSourceURL;

    private final java.lang.Boolean isInline;

    private final java.lang.Number startLine;

    private final java.lang.Number startColumn;

    private final java.lang.Number length;

    public CSSStyleSheetHeader(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String sourceURL, java.lang.String sourceMapURL, org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin, java.lang.String title, org.openqa.selenium.devtools.dom.model.BackendNodeId ownerNode, java.lang.Boolean disabled, java.lang.Boolean hasSourceURL, java.lang.Boolean isInline, java.lang.Number startLine, java.lang.Number startColumn, java.lang.Number length) {
        this.styleSheetId = java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.sourceURL = java.util.Objects.requireNonNull(sourceURL, "sourceURL is required");
        this.sourceMapURL = sourceMapURL;
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.title = java.util.Objects.requireNonNull(title, "title is required");
        this.ownerNode = ownerNode;
        this.disabled = java.util.Objects.requireNonNull(disabled, "disabled is required");
        this.hasSourceURL = hasSourceURL;
        this.isInline = java.util.Objects.requireNonNull(isInline, "isInline is required");
        this.startLine = java.util.Objects.requireNonNull(startLine, "startLine is required");
        this.startColumn = java.util.Objects.requireNonNull(startColumn, "startColumn is required");
        this.length = java.util.Objects.requireNonNull(length, "length is required");
    }

    /**
     * The stylesheet identifier.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * Owner frame identifier.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Stylesheet resource URL.
     */
    public java.lang.String getSourceURL() {
        return sourceURL;
    }

    /**
     * URL of source map associated with the stylesheet (if any).
     */
    public java.lang.String getSourceMapURL() {
        return sourceMapURL;
    }

    /**
     * Stylesheet origin.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetOrigin getOrigin() {
        return origin;
    }

    /**
     * Stylesheet title.
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * The backend id for the owner node of the stylesheet.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getOwnerNode() {
        return ownerNode;
    }

    /**
     * Denotes whether the stylesheet is disabled.
     */
    public java.lang.Boolean getDisabled() {
        return disabled;
    }

    /**
     * Whether the sourceURL field value comes from the sourceURL comment.
     */
    public java.lang.Boolean getHasSourceURL() {
        return hasSourceURL;
    }

    /**
     * Whether this stylesheet is created for STYLE tag by parser. This flag is not set for
     * document.written STYLE tags.
     */
    public java.lang.Boolean getIsInline() {
        return isInline;
    }

    /**
     * Line offset of the stylesheet within the resource (zero based).
     */
    public java.lang.Number getStartLine() {
        return startLine;
    }

    /**
     * Column offset of the stylesheet within the resource (zero based).
     */
    public java.lang.Number getStartColumn() {
        return startColumn;
    }

    /**
     * Size of the content (in characters).
     */
    public java.lang.Number getLength() {
        return length;
    }

    private static CSSStyleSheetHeader fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        java.lang.String sourceURL = null;
        java.lang.String sourceMapURL = null;
        org.openqa.selenium.devtools.css.model.StyleSheetOrigin origin = null;
        java.lang.String title = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId ownerNode = null;
        java.lang.Boolean disabled = null;
        java.lang.Boolean hasSourceURL = null;
        java.lang.Boolean isInline = null;
        java.lang.Number startLine = null;
        java.lang.Number startColumn = null;
        java.lang.Number length = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "sourceURL":
                    sourceURL = input.nextString();
                    break;
                case "sourceMapURL":
                    sourceMapURL = input.nextString();
                    break;
                case "origin":
                    origin = input.read(org.openqa.selenium.devtools.css.model.StyleSheetOrigin.class);
                    break;
                case "title":
                    title = input.nextString();
                    break;
                case "ownerNode":
                    ownerNode = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                case "disabled":
                    disabled = input.nextBoolean();
                    break;
                case "hasSourceURL":
                    hasSourceURL = input.nextBoolean();
                    break;
                case "isInline":
                    isInline = input.nextBoolean();
                    break;
                case "startLine":
                    startLine = input.nextNumber();
                    break;
                case "startColumn":
                    startColumn = input.nextNumber();
                    break;
                case "length":
                    length = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CSSStyleSheetHeader(styleSheetId, frameId, sourceURL, sourceMapURL, origin, title, ownerNode, disabled, hasSourceURL, isInline, startLine, startColumn, length);
    }
}
