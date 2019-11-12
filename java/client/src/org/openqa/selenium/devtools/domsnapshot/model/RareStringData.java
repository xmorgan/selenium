package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Data that is only present on rare nodes.
 */
public class RareStringData {

    private final java.util.List<java.lang.Integer> index;

    private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> value;

    public RareStringData(java.util.List<java.lang.Integer> index, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> value) {
        this.index = java.util.Objects.requireNonNull(index, "index is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    public java.util.List<java.lang.Integer> getIndex() {
        return index;
    }

    public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> getValue() {
        return value;
    }

    private static RareStringData fromJson(JsonInput input) {
        java.util.List<java.lang.Integer> index = null;
        java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex> value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "index":
                    index = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                case "value":
                    value = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.StringIndex>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RareStringData(index, value);
    }
}
