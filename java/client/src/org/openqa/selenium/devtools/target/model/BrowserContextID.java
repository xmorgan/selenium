package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class BrowserContextID {

    private final java.lang.String browserContextID;

    public BrowserContextID(java.lang.String browserContextID) {
        this.browserContextID = java.util.Objects.requireNonNull(browserContextID, "Missing value for BrowserContextID");
    }

    private static BrowserContextID fromJson(JsonInput input) {
        return new BrowserContextID(input.nextString());
    }

    public String toJson() {
        return browserContextID.toString();
    }

    public String toString() {
        return browserContextID.toString();
    }
}
