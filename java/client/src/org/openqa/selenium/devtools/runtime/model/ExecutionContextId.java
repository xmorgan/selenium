package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Id of an execution context.
 */
public class ExecutionContextId {

    private final java.lang.Integer executionContextId;

    public ExecutionContextId(java.lang.Integer executionContextId) {
        this.executionContextId = java.util.Objects.requireNonNull(executionContextId, "Missing value for ExecutionContextId");
    }

    private static ExecutionContextId fromJson(JsonInput input) {
        return new ExecutionContextId(input.nextNumber().intValue());
    }

    public String toJson() {
        return executionContextId.toString();
    }

    public String toString() {
        return executionContextId.toString();
    }
}
