package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when frame has been attached to its parent.
 */
public class FrameAttached {

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.page.model.FrameId parentFrameId;

    private final org.openqa.selenium.devtools.runtime.model.StackTrace stack;

    public FrameAttached(org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.page.model.FrameId parentFrameId, org.openqa.selenium.devtools.runtime.model.StackTrace stack) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.parentFrameId = java.util.Objects.requireNonNull(parentFrameId, "parentFrameId is required");
        this.stack = stack;
    }

    /**
     * Id of the frame that has been attached.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Parent frame identifier.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getParentFrameId() {
        return parentFrameId;
    }

    /**
     * JavaScript stack trace of when frame was attached, only set if frame initiated from script.
     */
    public org.openqa.selenium.devtools.runtime.model.StackTrace getStack() {
        return stack;
    }

    private static FrameAttached fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.page.model.FrameId parentFrameId = null;
        org.openqa.selenium.devtools.runtime.model.StackTrace stack = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "parentFrameId":
                    parentFrameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "stack":
                    stack = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FrameAttached(frameId, parentFrameId, stack);
    }
}
