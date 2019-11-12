package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class RareIntegerData {

    private final java.util.List<java.lang.Integer> index;

    private final java.util.List<java.lang.Integer> value;

    public RareIntegerData(java.util.List<java.lang.Integer> index, java.util.List<java.lang.Integer> value) {
        this.index = java.util.Objects.requireNonNull(index, "index is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    public java.util.List<java.lang.Integer> getIndex() {
        return index;
    }

    public java.util.List<java.lang.Integer> getValue() {
        return value;
    }

    private static RareIntegerData fromJson(JsonInput input) {
        java.util.List<java.lang.Integer> index = null;
        java.util.List<java.lang.Integer> value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "index":
                    index = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "value":
                    value = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RareIntegerData(index, value);
    }
}
