package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Represents function call argument. Either remote object id `objectId`, primitive `value`,
 * unserializable primitive value or neither of (for undefined) them should be specified.
 */
public class CallArgument {

    private final java.util.Map<String, Object> value;

    private final org.openqa.selenium.devtools.runtime.model.UnserializableValue unserializableValue;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId;

    public CallArgument(java.util.Map<String, Object> value, org.openqa.selenium.devtools.runtime.model.UnserializableValue unserializableValue, org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId) {
        this.value = value;
        this.unserializableValue = unserializableValue;
        this.objectId = objectId;
    }

    /**
     * Primitive value or serializable javascript object.
     */
    public java.util.Map<String, Object> getValue() {
        return value;
    }

    /**
     * Primitive value which can not be JSON-stringified.
     */
    public org.openqa.selenium.devtools.runtime.model.UnserializableValue getUnserializableValue() {
        return unserializableValue;
    }

    /**
     * Remote object handle.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObjectId getObjectId() {
        return objectId;
    }

    private static CallArgument fromJson(JsonInput input) {
        java.util.Map<String, Object> value = null;
        org.openqa.selenium.devtools.runtime.model.UnserializableValue unserializableValue = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "value":
                    value = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "unserializableValue":
                    unserializableValue = input.read(org.openqa.selenium.devtools.runtime.model.UnserializableValue.class);
                    break;
                case "objectId":
                    objectId = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObjectId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CallArgument(value, unserializableValue, objectId);
    }
}
