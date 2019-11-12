package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Information about the Frame on the page.
 */
public class Frame {

    private final org.openqa.selenium.devtools.page.model.FrameId id;

    private final java.lang.String parentId;

    private final org.openqa.selenium.devtools.network.model.LoaderId loaderId;

    private final java.lang.String name;

    private final java.lang.String url;

    private final java.lang.String urlFragment;

    private final java.lang.String securityOrigin;

    private final java.lang.String mimeType;

    private final java.lang.String unreachableUrl;

    public Frame(org.openqa.selenium.devtools.page.model.FrameId id, java.lang.String parentId, org.openqa.selenium.devtools.network.model.LoaderId loaderId, java.lang.String name, java.lang.String url, java.lang.String urlFragment, java.lang.String securityOrigin, java.lang.String mimeType, java.lang.String unreachableUrl) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.parentId = parentId;
        this.loaderId = java.util.Objects.requireNonNull(loaderId, "loaderId is required");
        this.name = name;
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.urlFragment = urlFragment;
        this.securityOrigin = java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        this.mimeType = java.util.Objects.requireNonNull(mimeType, "mimeType is required");
        this.unreachableUrl = unreachableUrl;
    }

    /**
     * Frame unique identifier.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getId() {
        return id;
    }

    /**
     * Parent frame identifier.
     */
    public java.lang.String getParentId() {
        return parentId;
    }

    /**
     * Identifier of the loader associated with this frame.
     */
    public org.openqa.selenium.devtools.network.model.LoaderId getLoaderId() {
        return loaderId;
    }

    /**
     * Frame's name as specified in the tag.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Frame document's URL without fragment.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Frame document's URL fragment including the '#'.
     */
    @Beta()
    public java.lang.String getUrlFragment() {
        return urlFragment;
    }

    /**
     * Frame document's security origin.
     */
    public java.lang.String getSecurityOrigin() {
        return securityOrigin;
    }

    /**
     * Frame document's mimeType as determined by the browser.
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }

    /**
     * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike url above, this URL may contain a fragment.
     */
    @Beta()
    public java.lang.String getUnreachableUrl() {
        return unreachableUrl;
    }

    private static Frame fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId id = null;
        java.lang.String parentId = null;
        org.openqa.selenium.devtools.network.model.LoaderId loaderId = null;
        java.lang.String name = null;
        java.lang.String url = null;
        java.lang.String urlFragment = null;
        java.lang.String securityOrigin = null;
        java.lang.String mimeType = null;
        java.lang.String unreachableUrl = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "parentId":
                    parentId = input.nextString();
                    break;
                case "loaderId":
                    loaderId = input.read(org.openqa.selenium.devtools.network.model.LoaderId.class);
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "urlFragment":
                    urlFragment = input.nextString();
                    break;
                case "securityOrigin":
                    securityOrigin = input.nextString();
                    break;
                case "mimeType":
                    mimeType = input.nextString();
                    break;
                case "unreachableUrl":
                    unreachableUrl = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Frame(id, parentId, loaderId, name, url, urlFragment, securityOrigin, mimeType, unreachableUrl);
    }
}
