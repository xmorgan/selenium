package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Table of details of an element in the DOM tree with a LayoutObject.
 */
public class LayoutTreeSnapshot {

    private final java.util.List<java.lang.Integer> nodeIndex;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> styles;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> bounds;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> text;

    private final org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData stackingContexts;

    private final java.util.List<java.lang.Integer> paintOrders;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> offsetRects;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> scrollRects;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> clientRects;

    public LayoutTreeSnapshot(java.util.List<java.lang.Integer> nodeIndex, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> styles, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> bounds, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> text, org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData stackingContexts, java.util.List<java.lang.Integer> paintOrders, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> offsetRects, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> scrollRects, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> clientRects) {
        this.nodeIndex = java.util.Objects.requireNonNull(nodeIndex, "nodeIndex is required");
        this.styles = java.util.Objects.requireNonNull(styles, "styles is required");
        this.bounds = java.util.Objects.requireNonNull(bounds, "bounds is required");
        this.text = java.util.Objects.requireNonNull(text, "text is required");
        this.stackingContexts = java.util.Objects.requireNonNull(stackingContexts, "stackingContexts is required");
        this.paintOrders = paintOrders;
        this.offsetRects = offsetRects;
        this.scrollRects = scrollRects;
        this.clientRects = clientRects;
    }

    /**
     * Index of the corresponding node in the `NodeTreeSnapshot` array returned by `captureSnapshot`.
     */
    public java.util.List<java.lang.Integer> getNodeIndex() {
        return nodeIndex;
    }

    /**
     * Array of indexes specifying computed style strings, filtered according to the `computedStyles` parameter passed to `captureSnapshot`.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> getStyles() {
        return styles;
    }

    /**
     * The absolute position bounding box.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> getBounds() {
        return bounds;
    }

    /**
     * Contents of the LayoutText, if any.
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> getText() {
        return text;
    }

    /**
     * Stacking context information.
     */
    public org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData getStackingContexts() {
        return stackingContexts;
    }

    /**
     * Global paint order index, which is determined by the stacking order of the nodes. Nodes
     * that are painted together will have the same index. Only provided if includePaintOrder in
     * captureSnapshot was true.
     */
    public java.util.List<java.lang.Integer> getPaintOrders() {
        return paintOrders;
    }

    /**
     * The offset rect of nodes. Only available when includeDOMRects is set to true
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> getOffsetRects() {
        return offsetRects;
    }

    /**
     * The scroll rect of nodes. Only available when includeDOMRects is set to true
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> getScrollRects() {
        return scrollRects;
    }

    /**
     * The client rect of nodes. Only available when includeDOMRects is set to true
     */
    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> getClientRects() {
        return clientRects;
    }

    private static LayoutTreeSnapshot fromJson(JsonInput input) {
        java.util.List<java.lang.Integer> nodeIndex = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings> styles = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> bounds = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> text = null;
        org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData stackingContexts = null;
        java.util.List<java.lang.Integer> paintOrders = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> offsetRects = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> scrollRects = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle> clientRects = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "nodeIndex":
                    nodeIndex = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "styles":
                    styles = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ArrayOfStrings>>() {
                    }.getType());
                    break;
                case "bounds":
                    bounds = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle>>() {
                    }.getType());
                    break;
                case "text":
                    text = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex>>() {
                    }.getType());
                    break;
                case "stackingContexts":
                    stackingContexts = input.read(org.openqa.selenium.devtools.domsnapshot.model.RareBooleanData.class);
                    break;
                case "paintOrders":
                    paintOrders = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "offsetRects":
                    offsetRects = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle>>() {
                    }.getType());
                    break;
                case "scrollRects":
                    scrollRects = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle>>() {
                    }.getType());
                    break;
                case "clientRects":
                    clientRects = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.Rectangle>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LayoutTreeSnapshot(nodeIndex, styles, bounds, text, stackingContexts, paintOrders, offsetRects, scrollRects, clientRects);
    }
}
