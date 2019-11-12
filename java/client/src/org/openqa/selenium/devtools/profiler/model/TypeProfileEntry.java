package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Source offset and types for a parameter or return value.
 */
@org.openqa.selenium.Beta()
public class TypeProfileEntry {

    private final java.lang.Integer offset;

    private final java.util.List<org.openqa.selenium.devtools.profiler.model.TypeObject> types;

    public TypeProfileEntry(java.lang.Integer offset, java.util.List<org.openqa.selenium.devtools.profiler.model.TypeObject> types) {
        this.offset = java.util.Objects.requireNonNull(offset, "offset is required");
        this.types = java.util.Objects.requireNonNull(types, "types is required");
    }

    /**
     * Source offset of the parameter or end of function for return values.
     */
    public java.lang.Integer getOffset() {
        return offset;
    }

    /**
     * The types for this parameter or return value.
     */
    public java.util.List<org.openqa.selenium.devtools.profiler.model.TypeObject> getTypes() {
        return types;
    }

    private static TypeProfileEntry fromJson(JsonInput input) {
        java.lang.Integer offset = null;
        java.util.List<org.openqa.selenium.devtools.profiler.model.TypeObject> types = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "offset":
                    offset = input.nextNumber().intValue();
                    break;
                case "types":
                    types = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.TypeObject>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TypeProfileEntry(offset, types);
    }
}
