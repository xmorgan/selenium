package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Error while paring app manifest.
 */
public class AppManifestError {

    private final java.lang.String message;

    private final java.lang.Integer critical;

    private final java.lang.Integer line;

    private final java.lang.Integer column;

    public AppManifestError(java.lang.String message, java.lang.Integer critical, java.lang.Integer line, java.lang.Integer column) {
        this.message = java.util.Objects.requireNonNull(message, "message is required");
        this.critical = java.util.Objects.requireNonNull(critical, "critical is required");
        this.line = java.util.Objects.requireNonNull(line, "line is required");
        this.column = java.util.Objects.requireNonNull(column, "column is required");
    }

    /**
     * Error message.
     */
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * If criticial, this is a non-recoverable parse error.
     */
    public java.lang.Integer getCritical() {
        return critical;
    }

    /**
     * Error line.
     */
    public java.lang.Integer getLine() {
        return line;
    }

    /**
     * Error column.
     */
    public java.lang.Integer getColumn() {
        return column;
    }

    private static AppManifestError fromJson(JsonInput input) {
        java.lang.String message = null;
        java.lang.Integer critical = null;
        java.lang.Integer line = null;
        java.lang.Integer column = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "message":
                    message = input.nextString();
                    break;
                case "critical":
                    critical = input.nextNumber().intValue();
                    break;
                case "line":
                    line = input.nextNumber().intValue();
                    break;
                case "column":
                    column = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AppManifestError(message, critical, line, column);
    }
}
