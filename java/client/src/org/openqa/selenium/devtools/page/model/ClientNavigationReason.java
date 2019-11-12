package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public enum ClientNavigationReason {

    FORMSUBMISSIONGET("formSubmissionGet"),
    FORMSUBMISSIONPOST("formSubmissionPost"),
    HTTPHEADERREFRESH("httpHeaderRefresh"),
    SCRIPTINITIATED("scriptInitiated"),
    METATAGREFRESH("metaTagRefresh"),
    PAGEBLOCKINTERSTITIAL("pageBlockInterstitial"),
    RELOAD("reload");

    private String value;

    ClientNavigationReason(String value) {
        this.value = value;
    }

    public static ClientNavigationReason fromString(String s) {
        return java.util.Arrays.stream(ClientNavigationReason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ClientNavigationReason "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ClientNavigationReason fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
