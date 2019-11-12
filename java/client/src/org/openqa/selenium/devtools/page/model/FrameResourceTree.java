package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about the Frame hierarchy along with their cached resources.
 */
@org.openqa.selenium.Beta()
public class FrameResourceTree {

    private final org.openqa.selenium.devtools.page.model.Frame frame;

    private final java.util.List<org.openqa.selenium.devtools.page.model.FrameResourceTree> childFrames;

    private final java.util.List<org.openqa.selenium.devtools.page.model.FrameResource> resources;

    public FrameResourceTree(org.openqa.selenium.devtools.page.model.Frame frame, java.util.List<org.openqa.selenium.devtools.page.model.FrameResourceTree> childFrames, java.util.List<org.openqa.selenium.devtools.page.model.FrameResource> resources) {
        this.frame = java.util.Objects.requireNonNull(frame, "frame is required");
        this.childFrames = childFrames;
        this.resources = java.util.Objects.requireNonNull(resources, "resources is required");
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
    public java.util.List<org.openqa.selenium.devtools.page.model.FrameResourceTree> getChildFrames() {
        return childFrames;
    }

    /**
     * Information about frame resources.
     */
    public java.util.List<org.openqa.selenium.devtools.page.model.FrameResource> getResources() {
        return resources;
    }

    private static FrameResourceTree fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.Frame frame = null;
        java.util.List<org.openqa.selenium.devtools.page.model.FrameResourceTree> childFrames = null;
        java.util.List<org.openqa.selenium.devtools.page.model.FrameResource> resources = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frame":
                    frame = input.read(org.openqa.selenium.devtools.page.model.Frame.class);
                    break;
                case "childFrames":
                    childFrames = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.page.model.FrameResourceTree>>() {
                    }.getType());
                    break;
                case "resources":
                    resources = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.page.model.FrameResource>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FrameResourceTree(frame, childFrames, resources);
    }
}
