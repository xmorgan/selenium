package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of possible property types.
 */
public enum AXValueType {

    BOOLEAN("boolean"),
    TRISTATE("tristate"),
    BOOLEANORUNDEFINED("booleanOrUndefined"),
    IDREF("idref"),
    IDREFLIST("idrefList"),
    INTEGER("integer"),
    NODE("node"),
    NODELIST("nodeList"),
    NUMBER("number"),
    STRING("string"),
    COMPUTEDSTRING("computedString"),
    TOKEN("token"),
    TOKENLIST("tokenList"),
    DOMRELATION("domRelation"),
    ROLE("role"),
    INTERNALROLE("internalRole"),
    VALUEUNDEFINED("valueUndefined");

    private String value;

    AXValueType(String value) {
        this.value = value;
    }

    public static AXValueType fromString(String s) {
        return java.util.Arrays.stream(AXValueType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within AXValueType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static AXValueType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
