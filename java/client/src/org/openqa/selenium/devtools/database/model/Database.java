package org.openqa.selenium.devtools.database.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Database object.
 */
public class Database {

    private final org.openqa.selenium.devtools.database.model.DatabaseId id;

    private final java.lang.String domain;

    private final java.lang.String name;

    private final java.lang.String version;

    public Database(org.openqa.selenium.devtools.database.model.DatabaseId id, java.lang.String domain, java.lang.String name, java.lang.String version) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.domain = java.util.Objects.requireNonNull(domain, "domain is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.version = java.util.Objects.requireNonNull(version, "version is required");
    }

    /**
     * Database ID.
     */
    public org.openqa.selenium.devtools.database.model.DatabaseId getId() {
        return id;
    }

    /**
     * Database domain.
     */
    public java.lang.String getDomain() {
        return domain;
    }

    /**
     * Database name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Database version.
     */
    public java.lang.String getVersion() {
        return version;
    }

    private static Database fromJson(JsonInput input) {
        org.openqa.selenium.devtools.database.model.DatabaseId id = null;
        java.lang.String domain = null;
        java.lang.String name = null;
        java.lang.String version = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.read(org.openqa.selenium.devtools.database.model.DatabaseId.class);
                    break;
                case "domain":
                    domain = input.nextString();
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "version":
                    version = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Database(id, domain, name, version);
    }
}
