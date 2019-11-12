package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique request identifier.
 */
public class RequestId {

    private final java.lang.String requestId;

    public RequestId(java.lang.String requestId) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "Missing value for RequestId");
    }

    private static RequestId fromJson(JsonInput input) {
        return new RequestId(input.nextString());
    }

    public String toJson() {
        return requestId.toString();
    }

    public String toString() {
        return requestId.toString();
    }
}
