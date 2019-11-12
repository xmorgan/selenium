package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Notification is issued every time when binding is called.
 */
@org.openqa.selenium.Beta()
public class BindingCalled {

    private final java.lang.String name;

    private final java.lang.String payload;

    private final org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId;

    public BindingCalled(java.lang.String name, java.lang.String payload, org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.payload = java.util.Objects.requireNonNull(payload, "payload is required");
        this.executionContextId = java.util.Objects.requireNonNull(executionContextId, "executionContextId is required");
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getPayload() {
        return payload;
    }

    /**
     * Identifier of the context where the call was made.
     */
    public org.openqa.selenium.devtools.runtime.model.ExecutionContextId getExecutionContextId() {
        return executionContextId;
    }

    private static BindingCalled fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String payload = null;
        org.openqa.selenium.devtools.runtime.model.ExecutionContextId executionContextId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "payload":
                    payload = input.nextString();
                    break;
                case "executionContextId":
                    executionContextId = input.read(org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BindingCalled(name, payload, executionContextId);
    }
}
