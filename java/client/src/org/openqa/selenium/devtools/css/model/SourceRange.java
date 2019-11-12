package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Text range within a resource. All numbers are zero-based.
 */
public class SourceRange {

    private final java.lang.Integer startLine;

    private final java.lang.Integer startColumn;

    private final java.lang.Integer endLine;

    private final java.lang.Integer endColumn;

    public SourceRange(java.lang.Integer startLine, java.lang.Integer startColumn, java.lang.Integer endLine, java.lang.Integer endColumn) {
        this.startLine = java.util.Objects.requireNonNull(startLine, "startLine is required");
        this.startColumn = java.util.Objects.requireNonNull(startColumn, "startColumn is required");
        this.endLine = java.util.Objects.requireNonNull(endLine, "endLine is required");
        this.endColumn = java.util.Objects.requireNonNull(endColumn, "endColumn is required");
    }

    /**
     * Start line of range.
     */
    public java.lang.Integer getStartLine() {
        return startLine;
    }

    /**
     * Start column of range (inclusive).
     */
    public java.lang.Integer getStartColumn() {
        return startColumn;
    }

    /**
     * End line of range
     */
    public java.lang.Integer getEndLine() {
        return endLine;
    }

    /**
     * End column of range (exclusive).
     */
    public java.lang.Integer getEndColumn() {
        return endColumn;
    }

    private static SourceRange fromJson(JsonInput input) {
        java.lang.Integer startLine = null;
        java.lang.Integer startColumn = null;
        java.lang.Integer endLine = null;
        java.lang.Integer endColumn = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "startLine":
                    startLine = input.nextNumber().intValue();
                    break;
                case "startColumn":
                    startColumn = input.nextNumber().intValue();
                    break;
                case "endLine":
                    endLine = input.nextNumber().intValue();
                    break;
                case "endColumn":
                    endColumn = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SourceRange(startLine, startColumn, endLine, endColumn);
    }
}
