package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when a new window is going to be opened, via window.open(), link click, form submission,
 * etc.
 */
public class WindowOpen {

    private final java.lang.String url;

    private final java.lang.String windowName;

    private final java.util.List<java.lang.String> windowFeatures;

    private final java.lang.Boolean userGesture;

    public WindowOpen(java.lang.String url, java.lang.String windowName, java.util.List<java.lang.String> windowFeatures, java.lang.Boolean userGesture) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.windowName = java.util.Objects.requireNonNull(windowName, "windowName is required");
        this.windowFeatures = java.util.Objects.requireNonNull(windowFeatures, "windowFeatures is required");
        this.userGesture = java.util.Objects.requireNonNull(userGesture, "userGesture is required");
    }

    /**
     * The URL for the new window.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Window name.
     */
    public java.lang.String getWindowName() {
        return windowName;
    }

    /**
     * An array of enabled window features.
     */
    public java.util.List<java.lang.String> getWindowFeatures() {
        return windowFeatures;
    }

    /**
     * Whether or not it was triggered by user gesture.
     */
    public java.lang.Boolean getUserGesture() {
        return userGesture;
    }

    private static WindowOpen fromJson(JsonInput input) {
        java.lang.String url = null;
        java.lang.String windowName = null;
        java.util.List<java.lang.String> windowFeatures = null;
        java.lang.Boolean userGesture = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "windowName":
                    windowName = input.nextString();
                    break;
                case "windowFeatures":
                    windowFeatures = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "userGesture":
                    userGesture = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WindowOpen(url, windowName, windowFeatures, userGesture);
    }
}
