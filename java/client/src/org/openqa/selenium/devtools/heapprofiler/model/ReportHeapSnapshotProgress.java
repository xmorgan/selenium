package org.openqa.selenium.devtools.heapprofiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class ReportHeapSnapshotProgress {

    private final java.lang.Integer done;

    private final java.lang.Integer total;

    private final java.lang.Boolean finished;

    public ReportHeapSnapshotProgress(java.lang.Integer done, java.lang.Integer total, java.lang.Boolean finished) {
        this.done = java.util.Objects.requireNonNull(done, "done is required");
        this.total = java.util.Objects.requireNonNull(total, "total is required");
        this.finished = finished;
    }

    public java.lang.Integer getDone() {
        return done;
    }

    public java.lang.Integer getTotal() {
        return total;
    }

    public java.lang.Boolean getFinished() {
        return finished;
    }

    private static ReportHeapSnapshotProgress fromJson(JsonInput input) {
        java.lang.Integer done = null;
        java.lang.Integer total = null;
        java.lang.Boolean finished = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "done":
                    done = input.nextNumber().intValue();
                    break;
                case "total":
                    total = input.nextNumber().intValue();
                    break;
                case "finished":
                    finished = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ReportHeapSnapshotProgress(done, total, finished);
    }
}
