package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object store.
 */
public class ObjectStore {

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.indexeddb.model.KeyPath keyPath;

    private final java.lang.Boolean autoIncrement;

    private final java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStoreIndex> indexes;

    public ObjectStore(java.lang.String name, org.openqa.selenium.devtools.indexeddb.model.KeyPath keyPath, java.lang.Boolean autoIncrement, java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStoreIndex> indexes) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.keyPath = java.util.Objects.requireNonNull(keyPath, "keyPath is required");
        this.autoIncrement = java.util.Objects.requireNonNull(autoIncrement, "autoIncrement is required");
        this.indexes = java.util.Objects.requireNonNull(indexes, "indexes is required");
    }

    /**
     * Object store name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Object store key path.
     */
    public org.openqa.selenium.devtools.indexeddb.model.KeyPath getKeyPath() {
        return keyPath;
    }

    /**
     * If true, object store has auto increment flag set.
     */
    public java.lang.Boolean getAutoIncrement() {
        return autoIncrement;
    }

    /**
     * Indexes in this object store.
     */
    public java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStoreIndex> getIndexes() {
        return indexes;
    }

    private static ObjectStore fromJson(JsonInput input) {
        java.lang.String name = null;
        org.openqa.selenium.devtools.indexeddb.model.KeyPath keyPath = null;
        java.lang.Boolean autoIncrement = null;
        java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStoreIndex> indexes = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "keyPath":
                    keyPath = input.read(org.openqa.selenium.devtools.indexeddb.model.KeyPath.class);
                    break;
                case "autoIncrement":
                    autoIncrement = input.nextBoolean();
                    break;
                case "indexes":
                    indexes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStoreIndex>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ObjectStore(name, keyPath, autoIncrement, indexes);
    }
}
