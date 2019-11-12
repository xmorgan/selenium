package org.openqa.selenium.devtools.heapprofiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.
 */
public class SamplingHeapProfileNode {

    private final org.openqa.selenium.devtools.runtime.model.CallFrame callFrame;

    private final java.lang.Number selfSize;

    private final java.lang.Integer id;

    private final java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode> children;

    public SamplingHeapProfileNode(org.openqa.selenium.devtools.runtime.model.CallFrame callFrame, java.lang.Number selfSize, java.lang.Integer id, java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode> children) {
        this.callFrame = java.util.Objects.requireNonNull(callFrame, "callFrame is required");
        this.selfSize = java.util.Objects.requireNonNull(selfSize, "selfSize is required");
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.children = java.util.Objects.requireNonNull(children, "children is required");
    }

    /**
     * Function location.
     */
    public org.openqa.selenium.devtools.runtime.model.CallFrame getCallFrame() {
        return callFrame;
    }

    /**
     * Allocations size in bytes for the node excluding children.
     */
    public java.lang.Number getSelfSize() {
        return selfSize;
    }

    /**
     * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * Child nodes.
     */
    public java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode> getChildren() {
        return children;
    }

    private static SamplingHeapProfileNode fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.CallFrame callFrame = null;
        java.lang.Number selfSize = null;
        java.lang.Integer id = null;
        java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode> children = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "callFrame":
                    callFrame = input.read(org.openqa.selenium.devtools.runtime.model.CallFrame.class);
                    break;
                case "selfSize":
                    selfSize = input.nextNumber();
                    break;
                case "id":
                    id = input.nextNumber().intValue();
                    break;
                case "children":
                    children = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.heapprofiler.model.SamplingHeapProfileNode>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SamplingHeapProfileNode(callFrame, selfSize, id, children);
    }
}
