package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of AudioParam types
 */
public class ParamType {

    private final java.lang.String paramType;

    public ParamType(java.lang.String paramType) {
        this.paramType = java.util.Objects.requireNonNull(paramType, "Missing value for ParamType");
    }

    private static ParamType fromJson(JsonInput input) {
        return new ParamType(input.nextString());
    }

    public String toJson() {
        return paramType.toString();
    }

    public String toString() {
        return paramType.toString();
    }
}
