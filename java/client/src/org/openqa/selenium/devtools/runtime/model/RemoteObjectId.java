package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique object identifier.
 */
public class RemoteObjectId {

    private final java.lang.String remoteObjectId;

    public RemoteObjectId(java.lang.String remoteObjectId) {
        this.remoteObjectId = java.util.Objects.requireNonNull(remoteObjectId, "Missing value for RemoteObjectId");
    }

    private static RemoteObjectId fromJson(JsonInput input) {
        return new RemoteObjectId(input.nextString());
    }

    public String toJson() {
        return remoteObjectId.toString();
    }

    public String toString() {
        return remoteObjectId.toString();
    }
}
