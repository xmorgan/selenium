package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Description of an isolated world.
 */
public class ExecutionContextDescription {

    private final org.openqa.selenium.devtools.runtime.model.ExecutionContextId id;

    private final java.lang.String origin;

    private final java.lang.String name;

    private final java.util.Map<String, Object> auxData;

    public ExecutionContextDescription(org.openqa.selenium.devtools.runtime.model.ExecutionContextId id, java.lang.String origin, java.lang.String name, java.util.Map<String, Object> auxData) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.auxData = auxData;
    }

    /**
     * Unique id of the execution context. It can be used to specify in which execution context
     * script evaluation should be performed.
     */
    public org.openqa.selenium.devtools.runtime.model.ExecutionContextId getId() {
        return id;
    }

    /**
     * Execution context origin.
     */
    public java.lang.String getOrigin() {
        return origin;
    }

    /**
     * Human readable name describing given context.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Embedder-specific auxiliary data.
     */
    public java.util.Map<String, Object> getAuxData() {
        return auxData;
    }

    private static ExecutionContextDescription fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.ExecutionContextId id = null;
        java.lang.String origin = null;
        java.lang.String name = null;
        java.util.Map<String, Object> auxData = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.read(org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class);
                    break;
                case "origin":
                    origin = input.nextString();
                    break;
                case "name":
                    name = input.nextString();
                    break;
                case "auxData":
                    auxData = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ExecutionContextDescription(id, origin, name, auxData);
    }
}
