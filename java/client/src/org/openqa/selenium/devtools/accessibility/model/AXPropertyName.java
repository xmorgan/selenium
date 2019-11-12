package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Values of AXProperty name:
 * - from 'busy' to 'roledescription': states which apply to every AX node
 * - from 'live' to 'root': attributes which apply to nodes in live regions
 * - from 'autocomplete' to 'valuetext': attributes which apply to widgets
 * - from 'checked' to 'selected': states which apply to widgets
 * - from 'activedescendant' to 'owns' - relationships between elements other than parent/child/sibling.
 */
public enum AXPropertyName {

    BUSY("busy"),
    DISABLED("disabled"),
    EDITABLE("editable"),
    FOCUSABLE("focusable"),
    FOCUSED("focused"),
    HIDDEN("hidden"),
    HIDDENROOT("hiddenRoot"),
    INVALID("invalid"),
    KEYSHORTCUTS("keyshortcuts"),
    SETTABLE("settable"),
    ROLEDESCRIPTION("roledescription"),
    LIVE("live"),
    ATOMIC("atomic"),
    RELEVANT("relevant"),
    ROOT("root"),
    AUTOCOMPLETE("autocomplete"),
    HASPOPUP("hasPopup"),
    LEVEL("level"),
    MULTISELECTABLE("multiselectable"),
    ORIENTATION("orientation"),
    MULTILINE("multiline"),
    READONLY("readonly"),
    REQUIRED("required"),
    VALUEMIN("valuemin"),
    VALUEMAX("valuemax"),
    VALUETEXT("valuetext"),
    CHECKED("checked"),
    EXPANDED("expanded"),
    MODAL("modal"),
    PRESSED("pressed"),
    SELECTED("selected"),
    ACTIVEDESCENDANT("activedescendant"),
    CONTROLS("controls"),
    DESCRIBEDBY("describedby"),
    DETAILS("details"),
    ERRORMESSAGE("errormessage"),
    FLOWTO("flowto"),
    LABELLEDBY("labelledby"),
    OWNS("owns");

    private String value;

    AXPropertyName(String value) {
        this.value = value;
    }

    public static AXPropertyName fromString(String s) {
        return java.util.Arrays.stream(AXPropertyName.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AXPropertyName "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AXPropertyName fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
