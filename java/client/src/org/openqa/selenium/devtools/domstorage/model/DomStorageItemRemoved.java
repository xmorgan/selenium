package org.openqa.selenium.devtools.domstorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class DomStorageItemRemoved {

    private final org.openqa.selenium.devtools.domstorage.model.StorageId storageId;

    private final java.lang.String key;

    public DomStorageItemRemoved(org.openqa.selenium.devtools.domstorage.model.StorageId storageId, java.lang.String key) {
        this.storageId = java.util.Objects.requireNonNull(storageId, "storageId is required");
        this.key = java.util.Objects.requireNonNull(key, "key is required");
    }

    public org.openqa.selenium.devtools.domstorage.model.StorageId getStorageId() {
        return storageId;
    }

    public java.lang.String getKey() {
        return key;
    }

    private static DomStorageItemRemoved fromJson(JsonInput input) {
        org.openqa.selenium.devtools.domstorage.model.StorageId storageId = null;
        java.lang.String key = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "storageId":
                    storageId = input.read(org.openqa.selenium.devtools.domstorage.model.StorageId.class);
                    break;
                case "key":
                    key = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DomStorageItemRemoved(storageId, key);
    }
}
