package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about the Frame hierarchy.
 */
public class FrameTree {

    private final org.openqa.selenium.devtools.page.model.Frame frame;

    private final java.util.List<org.openqa.selenium.devtools.page.model.FrameTree> childFrames;

    public FrameTree(org.openqa.selenium.devtools.page.model.Frame frame, java.util.List<org.openqa.selenium.devtools.page.model.FrameTree> childFrames) {
        this.frame = java.util.Objects.requireNonNull(frame, "frame is required");
        this.childFrames = childFrames;
    }

    /**
     * Frame information for this tree item.
     */
    public org.openqa.selenium.devtools.page.model.Frame getFrame() {
        return frame;
    }

    /**
     * Child frames.
     */
    public java.util.List<org.openqa.selenium.devtools.page.model.FrameTree> getChildFrames() {
        return childFrames;
    }

    private static FrameTree fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.Frame frame = null;
        java.util.List<org.openqa.selenium.devtools.page.model.FrameTree> childFrames = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frame":
                    frame = input.read(org.openqa.selenium.devtools.page.model.Frame.class);
                    break;
                case "childFrames":
                    childFrames = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.page.model.FrameTree>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FrameTree(frame, childFrames);
    }
}
