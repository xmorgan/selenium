package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Details of an element in the DOM tree with a LayoutObject.
 */
public class LayoutTreeNode {

    private final java.lang.Integer domNodeIndex;

    private final org.openqa.selenium.devtools.dom.model.Rect boundingBox;

    private final java.lang.String layoutText;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.InlineTextBox> inlineTextNodes;

    private final java.lang.Integer styleIndex;

    private final java.lang.Integer paintOrder;

    private final java.lang.Boolean isStackingContext;

    public LayoutTreeNode(java.lang.Integer domNodeIndex, org.openqa.selenium.devtools.dom.model.Rect boundingBox, java.lang.String layoutText, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.InlineTextBox> inlineTextNodes, java.lang.Integer styleIndex, java.lang.Integer paintOrder, java.lang.Boolean isStackingContext) {
        this.domNodeIndex = java.util.Objects.requireNonNull(domNodeIndex, "domNodeIndex is required");
        this.boundingBox = java.util.Objects.requireNonNull(boundingBox, "boundingBox is required");
        this.layoutText = layoutText;
        this.inlineTextNodes = inlineTextNodes;
        this.styleIndex = styleIndex;
        this.paintOrder = paintOrder;
        this.isStackingContext = isStackingContext;
    }

    /**
     * The index of the related DOM node in the `domNodes` array returned by `getSnapshot`.
     */
    public java.lang.Integer getDomNodeIndex() {
        return domNodeIndex;
    }

    /**
     * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
     */
    public org.openqa.selenium.devtools.dom.model.Rect getBoundingBox() {
        return boundingBox;
    }

    /**
     * Contents of the LayoutText, if any.
     */
    public java.lang.String getLayoutText() {
        return layoutText;
    }

    /**
     * The post-layout inline text nodes, if any.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.InlineTextBox> getInlineTextNodes() {
        return inlineTextNodes;
    }

    /**
     * Index into the `computedStyles` array returned by `getSnapshot`.
     */
    public java.lang.Integer getStyleIndex() {
        return styleIndex;
    }

    /**
     * Global paint order index, which is determined by the stacking order of the nodes. Nodes
     * that are painted together will have the same index. Only provided if includePaintOrder in
     * getSnapshot was true.
     */
    public java.lang.Integer getPaintOrder() {
        return paintOrder;
    }

    /**
     * Set to true to indicate the element begins a new stacking context.
     */
    public java.lang.Boolean getIsStackingContext() {
        return isStackingContext;
    }

    private static LayoutTreeNode fromJson(JsonInput input) {
        java.lang.Integer domNodeIndex = null;
        org.openqa.selenium.devtools.dom.model.Rect boundingBox = null;
        java.lang.String layoutText = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.InlineTextBox> inlineTextNodes = null;
        java.lang.Integer styleIndex = null;
        java.lang.Integer paintOrder = null;
        java.lang.Boolean isStackingContext = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "domNodeIndex":
                    domNodeIndex = input.nextNumber().intValue();
                    break;
                case "boundingBox":
                    boundingBox = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                    break;
                case "layoutText":
                    layoutText = input.nextString();
                    break;
                case "inlineTextNodes":
                    inlineTextNodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.InlineTextBox>>() {
                    }.getType());
                    break;
                case "styleIndex":
                    styleIndex = input.nextNumber().intValue();
                    break;
                case "paintOrder":
                    paintOrder = input.nextNumber().intValue();
                    break;
                case "isStackingContext":
                    isStackingContext = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LayoutTreeNode(domNodeIndex, boundingBox, layoutText, inlineTextNodes, styleIndex, paintOrder, isStackingContext);
    }
}
