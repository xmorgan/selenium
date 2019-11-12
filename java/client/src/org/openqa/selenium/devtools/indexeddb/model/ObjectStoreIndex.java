package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Object store index.
 */
public class ObjectStoreIndex {

    private final java.lang.String name;

    private final org.openqa.selenium.devtools.indexeddb.model.KeyPath keyPath;

    private final java.lang.Boolean unique;

    private final java.lang.Boolean multiEntry;

    public ObjectStoreIndex(java.lang.String name, org.openqa.selenium.devtools.indexeddb.model.KeyPath keyPath, java.lang.Boolean unique, java.lang.Boolean multiEntry) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.keyPath = java.util.Objects.requireNonNull(keyPath, "keyPath is required");
        this.unique = java.util.Objects.requireNonNull(unique, "unique is required");
        this.multiEntry = java.util.Objects.requireNonNull(multiEntry, "multiEntry is required");
    }

    /**
     * Index name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Index key path.
     */
    public org.openqa.selenium.devtools.indexeddb.model.KeyPath getKeyPath() {
        return keyPath;
    }

    /**
     * If true, index is unique.
     */
    public java.lang.Boolean getUnique() {
        return unique;
    }

    /**
     * If true, index allows multiple entries for a key.
     */
    public java.lang.Boolean getMultiEntry() {
        return multiEntry;
    }

    private static ObjectStoreIndex fromJson(JsonInput input) {
        java.lang.String name = null;
        org.openqa.selenium.devtools.indexeddb.model.KeyPath keyPath = null;
        java.lang.Boolean unique = null;
        java.lang.Boolean multiEntry = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "keyPath":
                    keyPath = input.read(org.openqa.selenium.devtools.indexeddb.model.KeyPath.class);
                    break;
                case "unique":
                    unique = input.nextBoolean();
                    break;
                case "multiEntry":
                    multiEntry = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ObjectStoreIndex(name, keyPath, unique, multiEntry);
    }
}
