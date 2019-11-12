package org.openqa.selenium.devtools.storage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The origin's IndexedDB object store has been modified.
 */
public class IndexedDBContentUpdated {

    private final java.lang.String origin;

    private final java.lang.String databaseName;

    private final java.lang.String objectStoreName;

    public IndexedDBContentUpdated(java.lang.String origin, java.lang.String databaseName, java.lang.String objectStoreName) {
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.databaseName = java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        this.objectStoreName = java.util.Objects.requireNonNull(objectStoreName, "objectStoreName is required");
    }

    /**
     * Origin to update.
     */
    public java.lang.String getOrigin() {
        return origin;
    }

    /**
     * Database to update.
     */
    public java.lang.String getDatabaseName() {
        return databaseName;
    }

    /**
     * ObjectStore to update.
     */
    public java.lang.String getObjectStoreName() {
        return objectStoreName;
    }

    private static IndexedDBContentUpdated fromJson(JsonInput input) {
        java.lang.String origin = null;
        java.lang.String databaseName = null;
        java.lang.String objectStoreName = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "origin":
                    origin = input.nextString();
                    break;
                case "databaseName":
                    databaseName = input.nextString();
                    break;
                case "objectStoreName":
                    objectStoreName = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new IndexedDBContentUpdated(origin, databaseName, objectStoreName);
    }
}
