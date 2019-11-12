package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Navigation history entry.
 */
public class NavigationEntry {

    private final java.lang.Integer id;

    private final java.lang.String url;

    private final java.lang.String userTypedURL;

    private final java.lang.String title;

    private final org.openqa.selenium.devtools.page.model.TransitionType transitionType;

    public NavigationEntry(java.lang.Integer id, java.lang.String url, java.lang.String userTypedURL, java.lang.String title, org.openqa.selenium.devtools.page.model.TransitionType transitionType) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.userTypedURL = java.util.Objects.requireNonNull(userTypedURL, "userTypedURL is required");
        this.title = java.util.Objects.requireNonNull(title, "title is required");
        this.transitionType = java.util.Objects.requireNonNull(transitionType, "transitionType is required");
    }

    /**
     * Unique id of the navigation history entry.
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * URL of the navigation history entry.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * URL that the user typed in the url bar.
     */
    public java.lang.String getUserTypedURL() {
        return userTypedURL;
    }

    /**
     * Title of the navigation history entry.
     */
    public java.lang.String getTitle() {
        return title;
    }

    /**
     * Transition type.
     */
    public org.openqa.selenium.devtools.page.model.TransitionType getTransitionType() {
        return transitionType;
    }

    private static NavigationEntry fromJson(JsonInput input) {
        java.lang.Integer id = null;
        java.lang.String url = null;
        java.lang.String userTypedURL = null;
        java.lang.String title = null;
        org.openqa.selenium.devtools.page.model.TransitionType transitionType = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.nextNumber().intValue();
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "userTypedURL":
                    userTypedURL = input.nextString();
                    break;
                case "title":
                    title = input.nextString();
                    break;
                case "transitionType":
                    transitionType = input.read(org.openqa.selenium.devtools.page.model.TransitionType.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new NavigationEntry(id, url, userTypedURL, title, transitionType);
    }
}
