package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about a compositing layer.
 */
public class Layer {

    private final org.openqa.selenium.devtools.layertree.model.LayerId layerId;

    private final org.openqa.selenium.devtools.layertree.model.LayerId parentLayerId;

    private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

    private final java.lang.Number offsetX;

    private final java.lang.Number offsetY;

    private final java.lang.Number width;

    private final java.lang.Number height;

    private final java.util.List<java.lang.Number> transform;

    private final java.lang.Number anchorX;

    private final java.lang.Number anchorY;

    private final java.lang.Number anchorZ;

    private final java.lang.Integer paintCount;

    private final java.lang.Boolean drawsContent;

    private final java.lang.Boolean invisible;

    private final java.util.List<org.openqa.selenium.devtools.layertree.model.ScrollRect> scrollRects;

    private final org.openqa.selenium.devtools.layertree.model.StickyPositionConstraint stickyPositionConstraint;

    public Layer(org.openqa.selenium.devtools.layertree.model.LayerId layerId, org.openqa.selenium.devtools.layertree.model.LayerId parentLayerId, org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId, java.lang.Number offsetX, java.lang.Number offsetY, java.lang.Number width, java.lang.Number height, java.util.List<java.lang.Number> transform, java.lang.Number anchorX, java.lang.Number anchorY, java.lang.Number anchorZ, java.lang.Integer paintCount, java.lang.Boolean drawsContent, java.lang.Boolean invisible, java.util.List<org.openqa.selenium.devtools.layertree.model.ScrollRect> scrollRects, org.openqa.selenium.devtools.layertree.model.StickyPositionConstraint stickyPositionConstraint) {
        this.layerId = java.util.Objects.requireNonNull(layerId, "layerId is required");
        this.parentLayerId = parentLayerId;
        this.backendNodeId = backendNodeId;
        this.offsetX = java.util.Objects.requireNonNull(offsetX, "offsetX is required");
        this.offsetY = java.util.Objects.requireNonNull(offsetY, "offsetY is required");
        this.width = java.util.Objects.requireNonNull(width, "width is required");
        this.height = java.util.Objects.requireNonNull(height, "height is required");
        this.transform = transform;
        this.anchorX = anchorX;
        this.anchorY = anchorY;
        this.anchorZ = anchorZ;
        this.paintCount = java.util.Objects.requireNonNull(paintCount, "paintCount is required");
        this.drawsContent = java.util.Objects.requireNonNull(drawsContent, "drawsContent is required");
        this.invisible = invisible;
        this.scrollRects = scrollRects;
        this.stickyPositionConstraint = stickyPositionConstraint;
    }

    /**
     * The unique id for this layer.
     */
    public org.openqa.selenium.devtools.layertree.model.LayerId getLayerId() {
        return layerId;
    }

    /**
     * The id of parent (not present for root).
     */
    public org.openqa.selenium.devtools.layertree.model.LayerId getParentLayerId() {
        return parentLayerId;
    }

    /**
     * The backend id for the node associated with this layer.
     */
    public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
        return backendNodeId;
    }

    /**
     * Offset from parent layer, X coordinate.
     */
    public java.lang.Number getOffsetX() {
        return offsetX;
    }

    /**
     * Offset from parent layer, Y coordinate.
     */
    public java.lang.Number getOffsetY() {
        return offsetY;
    }

    /**
     * Layer width.
     */
    public java.lang.Number getWidth() {
        return width;
    }

    /**
     * Layer height.
     */
    public java.lang.Number getHeight() {
        return height;
    }

    /**
     * Transformation matrix for layer, default is identity matrix
     */
    public java.util.List<java.lang.Number> getTransform() {
        return transform;
    }

    /**
     * Transform anchor point X, absent if no transform specified
     */
    public java.lang.Number getAnchorX() {
        return anchorX;
    }

    /**
     * Transform anchor point Y, absent if no transform specified
     */
    public java.lang.Number getAnchorY() {
        return anchorY;
    }

    /**
     * Transform anchor point Z, absent if no transform specified
     */
    public java.lang.Number getAnchorZ() {
        return anchorZ;
    }

    /**
     * Indicates how many time this layer has painted.
     */
    public java.lang.Integer getPaintCount() {
        return paintCount;
    }

    /**
     * Indicates whether this layer hosts any content, rather than being used for
     * transform/scrolling purposes only.
     */
    public java.lang.Boolean getDrawsContent() {
        return drawsContent;
    }

    /**
     * Set if layer is not visible.
     */
    public java.lang.Boolean getInvisible() {
        return invisible;
    }

    /**
     * Rectangles scrolling on main thread only.
     */
    public java.util.List<org.openqa.selenium.devtools.layertree.model.ScrollRect> getScrollRects() {
        return scrollRects;
    }

    /**
     * Sticky position constraint information
     */
    public org.openqa.selenium.devtools.layertree.model.StickyPositionConstraint getStickyPositionConstraint() {
        return stickyPositionConstraint;
    }

    private static Layer fromJson(JsonInput input) {
        org.openqa.selenium.devtools.layertree.model.LayerId layerId = null;
        org.openqa.selenium.devtools.layertree.model.LayerId parentLayerId = null;
        org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
        java.lang.Number offsetX = null;
        java.lang.Number offsetY = null;
        java.lang.Number width = null;
        java.lang.Number height = null;
        java.util.List<java.lang.Number> transform = null;
        java.lang.Number anchorX = null;
        java.lang.Number anchorY = null;
        java.lang.Number anchorZ = null;
        java.lang.Integer paintCount = null;
        java.lang.Boolean drawsContent = null;
        java.lang.Boolean invisible = null;
        java.util.List<org.openqa.selenium.devtools.layertree.model.ScrollRect> scrollRects = null;
        org.openqa.selenium.devtools.layertree.model.StickyPositionConstraint stickyPositionConstraint = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "layerId":
                    layerId = input.read(org.openqa.selenium.devtools.layertree.model.LayerId.class);
                    break;
                case "parentLayerId":
                    parentLayerId = input.read(org.openqa.selenium.devtools.layertree.model.LayerId.class);
                    break;
                case "backendNodeId":
                    backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                    break;
                case "offsetX":
                    offsetX = input.nextNumber();
                    break;
                case "offsetY":
                    offsetY = input.nextNumber();
                    break;
                case "width":
                    width = input.nextNumber();
                    break;
                case "height":
                    height = input.nextNumber();
                    break;
                case "transform":
                    transform = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Number>>() {
                    }.getType());
                    break;
                case "anchorX":
                    anchorX = input.nextNumber();
                    break;
                case "anchorY":
                    anchorY = input.nextNumber();
                    break;
                case "anchorZ":
                    anchorZ = input.nextNumber();
                    break;
                case "paintCount":
                    paintCount = input.nextNumber().intValue();
                    break;
                case "drawsContent":
                    drawsContent = input.nextBoolean();
                    break;
                case "invisible":
                    invisible = input.nextBoolean();
                    break;
                case "scrollRects":
                    scrollRects = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.layertree.model.ScrollRect>>() {
                    }.getType());
                    break;
                case "stickyPositionConstraint":
                    stickyPositionConstraint = input.read(org.openqa.selenium.devtools.layertree.model.StickyPositionConstraint.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Layer(layerId, parentLayerId, backendNodeId, offsetX, offsetY, width, height, transform, anchorX, anchorY, anchorZ, paintCount, drawsContent, invisible, scrollRects, stickyPositionConstraint);
    }
}
