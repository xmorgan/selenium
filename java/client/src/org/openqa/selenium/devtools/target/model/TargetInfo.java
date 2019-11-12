package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class TargetInfo {

    private final org.openqa.selenium.devtools.target.model.TargetID targetId;

    private final java.lang.String type;

    private final java.lang.String title;

    private final java.lang.String url;

    private final java.lang.Boolean attached;

    private final org.openqa.selenium.devtools.target.model.TargetID openerId;

    private final org.openqa.selenium.devtools.target.model.BrowserContextID browserContextId;

    public TargetInfo(org.openqa.selenium.devtools.target.model.TargetID targetId, java.lang.String type, java.lang.String title, java.lang.String url, java.lang.Boolean attached, org.openqa.selenium.devtools.target.model.TargetID openerId, org.openqa.selenium.devtools.target.model.BrowserContextID browserContextId) {
        this.targetId = java.util.Objects.requireNonNull(targetId, "targetId is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.title = java.util.Objects.requireNonNull(title, "title is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.attached = java.util.Objects.requireNonNull(attached, "attached is required");
        this.openerId = openerId;
        this.browserContextId = browserContextId;
    }

    public org.openqa.selenium.devtools.target.model.TargetID getTargetId() {
        return targetId;
    }

    public java.lang.String getType() {
        return type;
    }

    public java.lang.String getTitle() {
        return title;
    }

    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Whether the target has an attached client.
     */
    public java.lang.Boolean getAttached() {
        return attached;
    }

    /**
     * Opener target Id
     */
    public org.openqa.selenium.devtools.target.model.TargetID getOpenerId() {
        return openerId;
    }

    @Beta()
    public org.openqa.selenium.devtools.target.model.BrowserContextID getBrowserContextId() {
        return browserContextId;
    }

    private static TargetInfo fromJson(JsonInput input) {
        org.openqa.selenium.devtools.target.model.TargetID targetId = null;
        java.lang.String type = null;
        java.lang.String title = null;
        java.lang.String url = null;
        java.lang.Boolean attached = null;
        org.openqa.selenium.devtools.target.model.TargetID openerId = null;
        org.openqa.selenium.devtools.target.model.BrowserContextID browserContextId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "targetId":
                    targetId = input.read(org.openqa.selenium.devtools.target.model.TargetID.class);
                    break;
                case "type":
                    type = input.nextString();
                    break;
                case "title":
                    title = input.nextString();
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "attached":
                    attached = input.nextBoolean();
                    break;
                case "openerId":
                    openerId = input.read(org.openqa.selenium.devtools.target.model.TargetID.class);
                    break;
                case "browserContextId":
                    browserContextId = input.read(org.openqa.selenium.devtools.target.model.BrowserContextID.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TargetInfo(targetId, type, title, url, attached, openerId, browserContextId);
    }
}
