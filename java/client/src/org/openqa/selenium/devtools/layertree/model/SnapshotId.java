package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Unique snapshot identifier.
 */
public class SnapshotId {

    private final java.lang.String snapshotId;

    public SnapshotId(java.lang.String snapshotId) {
        this.snapshotId = java.util.Objects.requireNonNull(snapshotId, "Missing value for SnapshotId");
    }

    private static SnapshotId fromJson(JsonInput input) {
        return new SnapshotId(input.nextString());
    }

    public String toJson() {
        return snapshotId.toString();
    }

    public String toString() {
        return snapshotId.toString();
    }
}
