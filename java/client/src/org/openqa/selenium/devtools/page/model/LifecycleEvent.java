package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired for top level page lifecycle events such as navigation, load, paint, etc.
 */
public class LifecycleEvent {

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.network.model.LoaderId loaderId;

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    public LifecycleEvent(org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.network.model.LoaderId loaderId, java.lang.String name, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.loaderId = java.util.Objects.requireNonNull(loaderId, "loaderId is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
    }

    /**
     * Id of the frame.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    public org.openqa.selenium.devtools.network.model.LoaderId getLoaderId() {
        return loaderId;
    }

    public java.lang.String getName() {
        return name;
    }

    public org.openqa.selenium.devtools.network.model.MonotonicTime getTimestamp() {
        return timestamp;
    }

    private static LifecycleEvent fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.network.model.LoaderId loaderId = null;
        java.lang.String name = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "loaderId":
                    loaderId = input.read(org.openqa.selenium.devtools.network.model.LoaderId.class);
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LifecycleEvent(frameId, loaderId, name, timestamp);
    }
}
