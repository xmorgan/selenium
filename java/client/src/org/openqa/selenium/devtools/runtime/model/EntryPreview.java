package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class EntryPreview {

    private final org.openqa.selenium.devtools.runtime.model.ObjectPreview key;

    private final org.openqa.selenium.devtools.runtime.model.ObjectPreview value;

    public EntryPreview(org.openqa.selenium.devtools.runtime.model.ObjectPreview key, org.openqa.selenium.devtools.runtime.model.ObjectPreview value) {
        this.key = key;
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    /**
     * Preview of the key. Specified for map-like collection entries.
     */
    public org.openqa.selenium.devtools.runtime.model.ObjectPreview getKey() {
        return key;
    }

    /**
     * Preview of the value.
     */
    public org.openqa.selenium.devtools.runtime.model.ObjectPreview getValue() {
        return value;
    }

    private static EntryPreview fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ObjectPreview key = null;
        org.openqa.selenium.devtools.runtime.model.ObjectPreview value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "key":
                    key = input.read(org.openqa.selenium.devtools.runtime.model.ObjectPreview.class);
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.runtime.model.ObjectPreview.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new EntryPreview(key, value);
    }
}
