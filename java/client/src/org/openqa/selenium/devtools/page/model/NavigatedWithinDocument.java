package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
 */
@org.openqa.selenium.Beta()
public class NavigatedWithinDocument {

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.String url;

    public NavigatedWithinDocument(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String url) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
    }

    /**
     * Id of the frame.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Frame's new url.
     */
    public java.lang.String getUrl() {
        return url;
    }

    private static NavigatedWithinDocument fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        java.lang.String url = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
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
        return new NavigatedWithinDocument(frameId, url);
    }
}
