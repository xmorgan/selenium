package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Sticky position constraints.
 */
public class StickyPositionConstraint {

    private final org.openqa.selenium.devtools.dom.model.Rect stickyBoxRect;

    private final org.openqa.selenium.devtools.dom.model.Rect containingBlockRect;

    private final org.openqa.selenium.devtools.layertree.model.LayerId nearestLayerShiftingStickyBox;

    private final org.openqa.selenium.devtools.layertree.model.LayerId nearestLayerShiftingContainingBlock;

    public StickyPositionConstraint(org.openqa.selenium.devtools.dom.model.Rect stickyBoxRect, org.openqa.selenium.devtools.dom.model.Rect containingBlockRect, org.openqa.selenium.devtools.layertree.model.LayerId nearestLayerShiftingStickyBox, org.openqa.selenium.devtools.layertree.model.LayerId nearestLayerShiftingContainingBlock) {
        this.stickyBoxRect = java.util.Objects.requireNonNull(stickyBoxRect, "stickyBoxRect is required");
        this.containingBlockRect = java.util.Objects.requireNonNull(containingBlockRect, "containingBlockRect is required");
        this.nearestLayerShiftingStickyBox = nearestLayerShiftingStickyBox;
        this.nearestLayerShiftingContainingBlock = nearestLayerShiftingContainingBlock;
    }

    /**
     * Layout rectangle of the sticky element before being shifted
     */
    public org.openqa.selenium.devtools.dom.model.Rect getStickyBoxRect() {
        return stickyBoxRect;
    }

    /**
     * Layout rectangle of the containing block of the sticky element
     */
    public org.openqa.selenium.devtools.dom.model.Rect getContainingBlockRect() {
        return containingBlockRect;
    }

    /**
     * The nearest sticky layer that shifts the sticky box
     */
    public org.openqa.selenium.devtools.layertree.model.LayerId getNearestLayerShiftingStickyBox() {
        return nearestLayerShiftingStickyBox;
    }

    /**
     * The nearest sticky layer that shifts the containing block
     */
    public org.openqa.selenium.devtools.layertree.model.LayerId getNearestLayerShiftingContainingBlock() {
        return nearestLayerShiftingContainingBlock;
    }

    private static StickyPositionConstraint fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.Rect stickyBoxRect = null;
        org.openqa.selenium.devtools.dom.model.Rect containingBlockRect = null;
        org.openqa.selenium.devtools.layertree.model.LayerId nearestLayerShiftingStickyBox = null;
        org.openqa.selenium.devtools.layertree.model.LayerId nearestLayerShiftingContainingBlock = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "stickyBoxRect":
                    stickyBoxRect = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                    break;
                case "containingBlockRect":
                    containingBlockRect = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                    break;
                case "nearestLayerShiftingStickyBox":
                    nearestLayerShiftingStickyBox = input.read(org.openqa.selenium.devtools.layertree.model.LayerId.class);
                    break;
                case "nearestLayerShiftingContainingBlock":
                    nearestLayerShiftingContainingBlock = input.read(org.openqa.selenium.devtools.layertree.model.LayerId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new StickyPositionConstraint(stickyBoxRect, containingBlockRect, nearestLayerShiftingStickyBox, nearestLayerShiftingContainingBlock);
    }
}
