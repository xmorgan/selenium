package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class WindowID {

    private final java.lang.Integer windowID;

    public WindowID(java.lang.Integer windowID) {
        this.windowID = java.util.Objects.requireNonNull(windowID, "Missing value for WindowID");
    }

    private static WindowID fromJson(JsonInput input) {
        return new WindowID(input.nextNumber().intValue());
    }

    public String toJson() {
        return windowID.toString();
    }

    public String toString() {
        return windowID.toString();
    }
}
