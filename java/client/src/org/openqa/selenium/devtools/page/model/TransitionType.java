package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Transition type.
 */
public enum TransitionType {

    LINK("link"),
    TYPED("typed"),
    ADDRESS_BAR("address_bar"),
    AUTO_BOOKMARK("auto_bookmark"),
    AUTO_SUBFRAME("auto_subframe"),
    MANUAL_SUBFRAME("manual_subframe"),
    GENERATED("generated"),
    AUTO_TOPLEVEL("auto_toplevel"),
    FORM_SUBMIT("form_submit"),
    RELOAD("reload"),
    KEYWORD("keyword"),
    KEYWORD_GENERATED("keyword_generated"),
    OTHER("other");

    private String value;

    TransitionType(String value) {
        this.value = value;
    }

    public static TransitionType fromString(String s) {
        return java.util.Arrays.stream(TransitionType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within TransitionType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static TransitionType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
