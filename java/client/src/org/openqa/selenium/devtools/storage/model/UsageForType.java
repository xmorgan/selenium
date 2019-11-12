package org.openqa.selenium.devtools.storage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Usage for a storage type.
 */
public class UsageForType {

    private final org.openqa.selenium.devtools.storage.model.StorageType storageType;

    private final java.lang.Number usage;

    public UsageForType(org.openqa.selenium.devtools.storage.model.StorageType storageType, java.lang.Number usage) {
        this.storageType = java.util.Objects.requireNonNull(storageType, "storageType is required");
        this.usage = java.util.Objects.requireNonNull(usage, "usage is required");
    }

    /**
     * Name of storage type.
     */
    public org.openqa.selenium.devtools.storage.model.StorageType getStorageType() {
        return storageType;
    }

    /**
     * Storage usage (bytes).
     */
    public java.lang.Number getUsage() {
        return usage;
    }

    private static UsageForType fromJson(JsonInput input) {
        org.openqa.selenium.devtools.storage.model.StorageType storageType = null;
        java.lang.Number usage = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "storageType":
                    storageType = input.read(org.openqa.selenium.devtools.storage.model.StorageType.class);
                    break;
                case "usage":
                    usage = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new UsageForType(storageType, usage);
    }
}
