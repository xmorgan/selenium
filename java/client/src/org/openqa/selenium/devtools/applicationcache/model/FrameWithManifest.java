package org.openqa.selenium.devtools.applicationcache.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Frame identifier - manifest URL pair.
 */
public class FrameWithManifest {

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.String manifestURL;

    private final java.lang.Integer status;

    public FrameWithManifest(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String manifestURL, java.lang.Integer status) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.manifestURL = java.util.Objects.requireNonNull(manifestURL, "manifestURL is required");
        this.status = java.util.Objects.requireNonNull(status, "status is required");
    }

    /**
     * Frame identifier.
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
     * Application cache status.
     */
    public java.lang.Integer getStatus() {
        return status;
    }

    private static FrameWithManifest fromJson(JsonInput input) {
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
        return new FrameWithManifest(frameId, manifestURL, status);
    }
}
