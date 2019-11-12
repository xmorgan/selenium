package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Issued when object should be inspected (for example, as a result of inspect() command line API
 * call).
 */
public class InspectRequested {

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject object;

    private final java.util.Map<String, Object> hints;

    public InspectRequested(org.openqa.selenium.devtools.runtime.model.RemoteObject object, java.util.Map<String, Object> hints) {
        this.object = java.util.Objects.requireNonNull(object, "object is required");
        this.hints = java.util.Objects.requireNonNull(hints, "hints is required");
    }

    public org.openqa.selenium.devtools.runtime.model.RemoteObject getObject() {
        return object;
    }

    public java.util.Map<String, Object> getHints() {
        return hints;
    }

    private static InspectRequested fromJson(JsonInput input) {
        org.openqa.selenium.devtools.runtime.model.RemoteObject object = null;
        java.util.Map<String, Object> hints = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "object":
                    object = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "hints":
                    hints = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new InspectRequested(object, hints);
    }
}
