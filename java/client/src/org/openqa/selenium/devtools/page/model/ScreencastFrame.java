package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Compressed image data requested by the `startScreencast`.
 */
@org.openqa.selenium.Beta()
public class ScreencastFrame {

    private final java.lang.String data;

    private final org.openqa.selenium.devtools.page.model.ScreencastFrameMetadata metadata;

    private final java.lang.Integer sessionId;

    public ScreencastFrame(java.lang.String data, org.openqa.selenium.devtools.page.model.ScreencastFrameMetadata metadata, java.lang.Integer sessionId) {
        this.data = java.util.Objects.requireNonNull(data, "data is required");
        this.metadata = java.util.Objects.requireNonNull(metadata, "metadata is required");
        this.sessionId = java.util.Objects.requireNonNull(sessionId, "sessionId is required");
    }

    /**
     * Base64-encoded compressed image.
     */
    public java.lang.String getData() {
        return data;
    }

    /**
     * Screencast frame metadata.
     */
    public org.openqa.selenium.devtools.page.model.ScreencastFrameMetadata getMetadata() {
        return metadata;
    }

    /**
     * Frame number.
     */
    public java.lang.Integer getSessionId() {
        return sessionId;
    }

    private static ScreencastFrame fromJson(JsonInput input) {
        java.lang.String data = null;
        org.openqa.selenium.devtools.page.model.ScreencastFrameMetadata metadata = null;
        java.lang.Integer sessionId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "data":
                    data = input.nextString();
                    break;
                case "metadata":
                    metadata = input.read(org.openqa.selenium.devtools.page.model.ScreencastFrameMetadata.class);
                    break;
                case "sessionId":
                    sessionId = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScreencastFrame(data, metadata, sessionId);
    }
}
