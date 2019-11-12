package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Coverage data for a source range.
 */
public class CoverageRange {

    private final java.lang.Integer startOffset;

    private final java.lang.Integer endOffset;

    private final java.lang.Integer count;

    public CoverageRange(java.lang.Integer startOffset, java.lang.Integer endOffset, java.lang.Integer count) {
        this.startOffset = java.util.Objects.requireNonNull(startOffset, "startOffset is required");
        this.endOffset = java.util.Objects.requireNonNull(endOffset, "endOffset is required");
        this.count = java.util.Objects.requireNonNull(count, "count is required");
    }

    /**
     * JavaScript script source offset for the range start.
     */
    public java.lang.Integer getStartOffset() {
        return startOffset;
    }

    /**
     * JavaScript script source offset for the range end.
     */
    public java.lang.Integer getEndOffset() {
        return endOffset;
    }

    /**
     * Collected execution count of the source range.
     */
    public java.lang.Integer getCount() {
        return count;
    }

    private static CoverageRange fromJson(JsonInput input) {
        java.lang.Integer startOffset = null;
        java.lang.Integer endOffset = null;
        java.lang.Integer count = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "startOffset":
                    startOffset = input.nextNumber().intValue();
                    break;
                case "endOffset":
                    endOffset = input.nextNumber().intValue();
                    break;
                case "count":
                    count = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CoverageRange(startOffset, endOffset, count);
    }
}
