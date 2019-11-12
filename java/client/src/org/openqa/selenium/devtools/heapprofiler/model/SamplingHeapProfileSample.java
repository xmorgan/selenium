package org.openqa.selenium.devtools.heapprofiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A single sample from a sampling profile.
 */
public class SamplingHeapProfileSample {

    private final java.lang.Number size;

    private final java.lang.Integer nodeId;

    private final java.lang.Number ordinal;

    public SamplingHeapProfileSample(java.lang.Number size, java.lang.Integer nodeId, java.lang.Number ordinal) {
        this.size = java.util.Objects.requireNonNull(size, "size is required");
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.ordinal = java.util.Objects.requireNonNull(ordinal, "ordinal is required");
    }

    /**
     * Allocation size in bytes attributed to the sample.
     */
    public java.lang.Number getSize() {
        return size;
    }

    /**
     * Id of the corresponding profile tree node.
     */
    public java.lang.Integer getNodeId() {
        return nodeId;
    }

    /**
     * Time-ordered sample ordinal number. It is unique across all profiles retrieved
     * between startSampling and stopSampling.
     */
    public java.lang.Number getOrdinal() {
        return ordinal;
    }

    private static SamplingHeapProfileSample fromJson(JsonInput input) {
        java.lang.Number size = null;
        java.lang.Integer nodeId = null;
        java.lang.Number ordinal = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "size":
                    size = input.nextNumber();
                    break;
                case "nodeId":
                    nodeId = input.nextNumber().intValue();
                    break;
                case "ordinal":
                    ordinal = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SamplingHeapProfileSample(size, nodeId, ordinal);
    }
}
