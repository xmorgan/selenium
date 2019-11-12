package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Data entry.
 */
public class DataEntry {

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject key;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject primaryKey;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject value;

    public DataEntry(org.openqa.selenium.devtools.runtime.model.RemoteObject key, org.openqa.selenium.devtools.runtime.model.RemoteObject primaryKey, org.openqa.selenium.devtools.runtime.model.RemoteObject value) {
        this.key = java.util.Objects.requireNonNull(key, "key is required");
        this.primaryKey = java.util.Objects.requireNonNull(primaryKey, "primaryKey is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
    }

    /**
     * Key object.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getKey() {
        return key;
    }

    /**
     * Primary key object.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getPrimaryKey() {
        return primaryKey;
    }

    /**
     * Value object.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getValue() {
        return value;
    }

    private static DataEntry fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.RemoteObject key = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject primaryKey = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "key":
                    key = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "primaryKey":
                    primaryKey = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DataEntry(key, primaryKey, value);
    }
}
