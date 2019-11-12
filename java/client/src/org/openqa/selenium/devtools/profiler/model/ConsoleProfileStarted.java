package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Sent when new profile recording is started using console.profile() call.
 */
public class ConsoleProfileStarted {

    private final java.lang.String id;

    private final org.openqa.selenium.devtools.debugger.model.Location location;

    private final java.lang.String title;

    public ConsoleProfileStarted(java.lang.String id, org.openqa.selenium.devtools.debugger.model.Location location, java.lang.String title) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.location = java.util.Objects.requireNonNull(location, "location is required");
        this.title = title;
    }

    public java.lang.String getId() {
        return id;
    }

    /**
     * Location of console.profile().
     */
    public org.openqa.selenium.devtools.debugger.model.Location getLocation() {
        return location;
    }

    /**
     * Profile title passed as an argument to console.profile().
     */
    public java.lang.String getTitle() {
        return title;
    }

    private static ConsoleProfileStarted fromJson(JsonInput input) {
        java.lang.String id = null;
        org.openqa.selenium.devtools.debugger.model.Location location = null;
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
                case "title":
                    title = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ConsoleProfileStarted(id, location, title);
    }
}
