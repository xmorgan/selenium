package org.openqa.selenium.devtools.heapprofiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Heap snapshot object id.
 */
public class HeapSnapshotObjectId {

    private final java.lang.String heapSnapshotObjectId;

    public HeapSnapshotObjectId(java.lang.String heapSnapshotObjectId) {
        this.heapSnapshotObjectId = java.util.Objects.requireNonNull(heapSnapshotObjectId, "Missing value for HeapSnapshotObjectId");
    }

    private static HeapSnapshotObjectId fromJson(JsonInput input) {
        return new HeapSnapshotObjectId(input.nextString());
    }

    public String toJson() {
        return heapSnapshotObjectId.toString();
    }

    public String toString() {
        return heapSnapshotObjectId.toString();
    }
}
