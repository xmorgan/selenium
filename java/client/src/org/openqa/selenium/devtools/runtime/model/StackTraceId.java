package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * If `debuggerId` is set stack trace comes from another debugger and can be resolved there. This
 * allows to track cross-debugger calls. See `Runtime.StackTrace` and `Debugger.paused` for usages.
 */
@org.openqa.selenium.Beta()
public class StackTraceId {

    private final java.lang.String id;

    private final org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId debuggerId;

    public StackTraceId(java.lang.String id, org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId debuggerId) {
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.debuggerId = debuggerId;
    }

    public java.lang.String getId() {
        return id;
    }

    public org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId getDebuggerId() {
        return debuggerId;
    }

    private static StackTraceId fromJson(JsonInput input) {
        java.lang.String id = null;
        org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId debuggerId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "id":
                    id = input.nextString();
                    break;
                case "debuggerId":
                    debuggerId = input.read(org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new StackTraceId(id, debuggerId);
    }
}
