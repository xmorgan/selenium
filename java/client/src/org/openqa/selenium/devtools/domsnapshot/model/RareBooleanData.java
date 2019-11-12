package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class RareBooleanData {

    private final java.util.List<java.lang.Integer> index;

    public RareBooleanData(java.util.List<java.lang.Integer> index) {
        this.index = java.util.Objects.requireNonNull(index, "index is required");
    }

    public java.util.List<java.lang.Integer> getIndex() {
        return index;
    }

    private static RareBooleanData fromJson(JsonInput input) {
        java.util.List<java.lang.Integer> index = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "index":
                    index = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RareBooleanData(index);
    }
}
