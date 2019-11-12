package org.openqa.selenium.devtools.overlay.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public enum InspectMode {

    SEARCHFORNODE("searchForNode"), SEARCHFORUASHADOWDOM("searchForUAShadowDOM"), CAPTUREAREASCREENSHOT("captureAreaScreenshot"), SHOWDISTANCES("showDistances"), NONE("none");

    private String value;

    InspectMode(String value) {
        this.value = value;
    }

    public static InspectMode fromString(String s) {
        return java.util.Arrays.stream(InspectMode.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within InspectMode "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static InspectMode fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
