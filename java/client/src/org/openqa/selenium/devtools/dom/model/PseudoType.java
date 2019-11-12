package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Pseudo element type.
 */
public enum PseudoType {

    FIRST_LINE("first-line"),
    FIRST_LETTER("first-letter"),
    BEFORE("before"),
    AFTER("after"),
    BACKDROP("backdrop"),
    SELECTION("selection"),
    FIRST_LINE_INHERITED("first-line-inherited"),
    SCROLLBAR("scrollbar"),
    SCROLLBAR_THUMB("scrollbar-thumb"),
    SCROLLBAR_BUTTON("scrollbar-button"),
    SCROLLBAR_TRACK("scrollbar-track"),
    SCROLLBAR_TRACK_PIECE("scrollbar-track-piece"),
    SCROLLBAR_CORNER("scrollbar-corner"),
    RESIZER("resizer"),
    INPUT_LIST_BUTTON("input-list-button");

    private String value;

    PseudoType(String value) {
        this.value = value;
    }

    public static PseudoType fromString(String s) {
        return java.util.Arrays.stream(PseudoType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within PseudoType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static PseudoType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
