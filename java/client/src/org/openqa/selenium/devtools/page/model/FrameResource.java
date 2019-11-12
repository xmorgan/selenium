package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about the Resource on the page.
 */
@org.openqa.selenium.Beta()
public class FrameResource {

    private final java.lang.String url;

    private final org.openqa.selenium.devtools.network.model.ResourceType type;

    private final java.lang.String mimeType;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch lastModified;

    private final java.lang.Number contentSize;

    private final java.lang.Boolean failed;

    private final java.lang.Boolean canceled;

    public FrameResource(java.lang.String url, org.openqa.selenium.devtools.network.model.ResourceType type, java.lang.String mimeType, org.openqa.selenium.devtools.network.model.TimeSinceEpoch lastModified, java.lang.Number contentSize, java.lang.Boolean failed, java.lang.Boolean canceled) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.mimeType = java.util.Objects.requireNonNull(mimeType, "mimeType is required");
        this.lastModified = lastModified;
        this.contentSize = contentSize;
        this.failed = failed;
        this.canceled = canceled;
    }

    /**
     * Resource URL.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Type of this resource.
     */
    public org.openqa.selenium.devtools.network.model.ResourceType getType() {
        return type;
    }

    /**
     * Resource mimeType as determined by the browser.
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }

    /**
     * last-modified timestamp as reported by server.
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getLastModified() {
        return lastModified;
    }

    /**
     * Resource content size.
     */
    public java.lang.Number getContentSize() {
        return contentSize;
    }

    /**
     * True if the resource failed to load.
     */
    public java.lang.Boolean getFailed() {
        return failed;
    }

    /**
     * True if the resource was canceled during loading.
     */
    public java.lang.Boolean getCanceled() {
        return canceled;
    }

    private static FrameResource fromJson(JsonInput input) {
        java.lang.String url = null;
        org.openqa.selenium.devtools.network.model.ResourceType type = null;
        java.lang.String mimeType = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch lastModified = null;
        java.lang.Number contentSize = null;
        java.lang.Boolean failed = null;
        java.lang.Boolean canceled = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "type":
                    type = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "mimeType":
                    mimeType = input.nextString();
                    break;
                case "lastModified":
                    lastModified = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "contentSize":
                    contentSize = input.nextNumber();
                    break;
                case "failed":
                    failed = input.nextBoolean();
                    break;
                case "canceled":
                    canceled = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FrameResource(url, type, mimeType, lastModified, contentSize, failed, canceled);
    }
}
