package org.openqa.selenium.devtools.schema.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Description of the protocol domain.
 */
public class Domain {

    private final java.lang.String name;

    private final java.lang.String version;

    public Domain(java.lang.String name, java.lang.String version) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.version = java.util.Objects.requireNonNull(version, "version is required");
    }

    /**
     * Domain name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Domain version.
     */
    public java.lang.String getVersion() {
        return version;
    }

    private static Domain fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String version = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
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
        return new Domain(name, version);
    }
}
