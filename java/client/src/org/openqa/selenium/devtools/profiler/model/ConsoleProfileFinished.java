package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class ConsoleProfileFinished {

    private final java.lang.String id;

    private final org.openqa.selenium.devtools.debugger.model.Location location;

    private final org.openqa.selenium.devtools.profiler.model.Profile profile;

    private final java.lang.String title;

    public ConsoleProfileFinished(java.lang.String id, org.openqa.selenium.devtools.debugger.model.Location location, org.openqa.selenium.devtools.profiler.model.Profile profile, java.lang.String title) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.location = java.util.Objects.requireNonNull(location, "location is required");
        this.profile = java.util.Objects.requireNonNull(profile, "profile is required");
        this.title = title;
    }

    public java.lang.String getId() {
        return id;
    }

    /**
     * Location of console.profileEnd().
     */
    public org.openqa.selenium.devtools.debugger.model.Location getLocation() {
        return location;
    }

    public org.openqa.selenium.devtools.profiler.model.Profile getProfile() {
        return profile;
    }

    /**
     * Profile title passed as an argument to console.profile().
     */
    public java.lang.String getTitle() {
        return title;
    }

    private static ConsoleProfileFinished fromJson(JsonInput input) {
        java.lang.String id = null;
        org.openqa.selenium.devtools.debugger.model.Location location = null;
        org.openqa.selenium.devtools.profiler.model.Profile profile = null;
        java.lang.String title = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.nextString();
                    break;
                case "location":
                    location = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                    break;
                case "profile":
                    profile = input.read(org.openqa.selenium.devtools.profiler.model.Profile.class);
                    break;
                case "title":
                    title = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ConsoleProfileFinished(id, location, profile, title);
    }
}
