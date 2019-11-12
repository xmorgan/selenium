package org.openqa.selenium.devtools.domstorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class DomStorageItemAdded {

    private final org.openqa.selenium.devtools.domstorage.model.StorageId storageId;

    private final java.lang.String key;

    private final java.lang.String newValue;

    public DomStorageItemAdded(org.openqa.selenium.devtools.domstorage.model.StorageId storageId, java.lang.String key, java.lang.String newValue) {
        this.storageId = java.util.Objects.requireNonNull(storageId, "storageId is required");
        this.key = java.util.Objects.requireNonNull(key, "key is required");
        this.newValue = java.util.Objects.requireNonNull(newValue, "newValue is required");
    }

    public org.openqa.selenium.devtools.domstorage.model.StorageId getStorageId() {
        return storageId;
    }

    public java.lang.String getKey() {
        return key;
    }

    public java.lang.String getNewValue() {
        return newValue;
    }

    private static DomStorageItemAdded fromJson(JsonInput input) {
        org.openqa.selenium.devtools.domstorage.model.StorageId storageId = null;
        java.lang.String key = null;
        java.lang.String newValue = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "storageId":
                    storageId = input.read(org.openqa.selenium.devtools.domstorage.model.StorageId.class);
                    break;
                case "key":
                    key = input.nextString();
                    break;
                case "newValue":
                    newValue = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DomStorageItemAdded(storageId, key, newValue);
    }
}
