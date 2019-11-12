package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Profile node. Holds callsite information, execution statistics and child nodes.
 */
public class ProfileNode {

    private final java.lang.Integer id;

    private final org.openqa.selenium.devtools.runtime.model.CallFrame callFrame;

    private final java.lang.Integer hitCount;

    private final java.util.List<java.lang.Integer> children;

    private final java.lang.String deoptReason;

    private final java.util.List<org.openqa.selenium.devtools.profiler.model.PositionTickInfo> positionTicks;

    public ProfileNode(java.lang.Integer id, org.openqa.selenium.devtools.runtime.model.CallFrame callFrame, java.lang.Integer hitCount, java.util.List<java.lang.Integer> children, java.lang.String deoptReason, java.util.List<org.openqa.selenium.devtools.profiler.model.PositionTickInfo> positionTicks) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.callFrame = java.util.Objects.requireNonNull(callFrame, "callFrame is required");
        this.hitCount = hitCount;
        this.children = children;
        this.deoptReason = deoptReason;
        this.positionTicks = positionTicks;
    }

    /**
     * Unique id of the node.
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * Function location.
     */
    public org.openqa.selenium.devtools.runtime.model.CallFrame getCallFrame() {
        return callFrame;
    }

    /**
     * Number of samples where this node was on top of the call stack.
     */
    public java.lang.Integer getHitCount() {
        return hitCount;
    }

    /**
     * Child node ids.
     */
    public java.util.List<java.lang.Integer> getChildren() {
        return children;
    }

    /**
     * The reason of being not optimized. The function may be deoptimized or marked as don't
     * optimize.
     */
    public java.lang.String getDeoptReason() {
        return deoptReason;
    }

    /**
     * An array of source position ticks.
     */
    public java.util.List<org.openqa.selenium.devtools.profiler.model.PositionTickInfo> getPositionTicks() {
        return positionTicks;
    }

    private static ProfileNode fromJson(JsonInput input) {
        java.lang.Integer id = null;
        org.openqa.selenium.devtools.runtime.model.CallFrame callFrame = null;
        java.lang.Integer hitCount = null;
        java.util.List<java.lang.Integer> children = null;
        java.lang.String deoptReason = null;
        java.util.List<org.openqa.selenium.devtools.profiler.model.PositionTickInfo> positionTicks = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.nextNumber().intValue();
                    break;
                case "callFrame":
                    callFrame = input.read(org.openqa.selenium.devtools.runtime.model.CallFrame.class);
                    break;
                case "hitCount":
                    hitCount = input.nextNumber().intValue();
                    break;
                case "children":
                    children = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "deoptReason":
                    deoptReason = input.nextString();
                    break;
                case "positionTicks":
                    positionTicks = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.PositionTickInfo>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ProfileNode(id, callFrame, hitCount, children, deoptReason, positionTicks);
    }
}
