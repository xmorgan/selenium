package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Database with an array of object stores.
 */
public class DatabaseWithObjectStores {

    private final java.lang.String name;

    private final java.lang.Number version;

    private final java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStore> objectStores;

    public DatabaseWithObjectStores(java.lang.String name, java.lang.Number version, java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStore> objectStores) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.version = java.util.Objects.requireNonNull(version, "version is required");
        this.objectStores = java.util.Objects.requireNonNull(objectStores, "objectStores is required");
    }

    /**
     * Database name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Database version (type is not 'integer', as the standard
     * requires the version number to be 'unsigned long long')
     */
    public java.lang.Number getVersion() {
        return version;
    }

    /**
     * Object stores in this database.
     */
    public java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStore> getObjectStores() {
        return objectStores;
    }

    private static DatabaseWithObjectStores fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.Number version = null;
        java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStore> objectStores = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "version":
                    version = input.nextNumber();
                    break;
                case "objectStores":
                    objectStores = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.indexeddb.model.ObjectStore>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DatabaseWithObjectStores(name, version, objectStores);
    }
}
