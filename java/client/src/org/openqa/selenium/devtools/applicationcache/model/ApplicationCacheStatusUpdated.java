package org.openqa.selenium.devtools.applicationcache.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class ApplicationCacheStatusUpdated {

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.String manifestURL;

    private final java.lang.Integer status;

    public ApplicationCacheStatusUpdated(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String manifestURL, java.lang.Integer status) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.manifestURL = java.util.Objects.requireNonNull(manifestURL, "manifestURL is required");
        this.status = java.util.Objects.requireNonNull(status, "status is required");
    }

    /**
     * Identifier of the frame containing document whose application cache updated status.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Manifest URL.
     */
    public java.lang.String getManifestURL() {
        return manifestURL;
    }

    /**
     * Updated application cache status.
     */
    public java.lang.Integer getStatus() {
        return status;
    }

    private static ApplicationCacheStatusUpdated fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        java.lang.String manifestURL = null;
        java.lang.Integer status = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "manifestURL":
                    manifestURL = input.nextString();
                    break;
                case "status":
                    status = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ApplicationCacheStatusUpdated(frameId, manifestURL, status);
    }
}
