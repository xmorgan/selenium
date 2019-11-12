package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when resource loading priority is changed
 */
@org.openqa.selenium.Beta()
public class ResourceChangedPriority {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.ResourcePriority newPriority;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    public ResourceChangedPriority(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.ResourcePriority newPriority, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.newPriority = java.util.Objects.requireNonNull(newPriority, "newPriority is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
    }

    /**
     * Request identifier.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * New priority
     */
    public org.openqa.selenium.devtools.network.model.ResourcePriority getNewPriority() {
        return newPriority;
    }

    /**
     * Timestamp.
     */
    public org.openqa.selenium.devtools.network.model.MonotonicTime getTimestamp() {
        return timestamp;
    }

    private static ResourceChangedPriority fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.ResourcePriority newPriority = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "newPriority":
                    newPriority = input.read(org.openqa.selenium.devtools.network.model.ResourcePriority.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ResourceChangedPriority(requestId, newPriority, timestamp);
    }
}
