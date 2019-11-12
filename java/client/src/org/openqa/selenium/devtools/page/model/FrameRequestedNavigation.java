package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when a renderer-initiated navigation is requested.
 * Navigation may still be cancelled after the event is issued.
 */
@org.openqa.selenium.Beta()
public class FrameRequestedNavigation {

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final org.openqa.selenium.devtools.page.model.ClientNavigationReason reason;

    private final java.lang.String url;

    public FrameRequestedNavigation(org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.page.model.ClientNavigationReason reason, java.lang.String url) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.reason = java.util.Objects.requireNonNull(reason, "reason is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
    }

    /**
     * Id of the frame that is being navigated.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * The reason for the navigation.
     */
    public org.openqa.selenium.devtools.page.model.ClientNavigationReason getReason() {
        return reason;
    }

    /**
     * The destination URL for the requested navigation.
     */
    public java.lang.String getUrl() {
        return url;
    }

    private static FrameRequestedNavigation fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        org.openqa.selenium.devtools.page.model.ClientNavigationReason reason = null;
        java.lang.String url = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "reason":
                    reason = input.read(org.openqa.selenium.devtools.page.model.ClientNavigationReason.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FrameRequestedNavigation(frameId, reason, url);
    }
}
