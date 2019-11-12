package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Specifies a number of samples attributed to a certain source position.
 */
public class PositionTickInfo {

    private final java.lang.Integer line;

    private final java.lang.Integer ticks;

    public PositionTickInfo(java.lang.Integer line, java.lang.Integer ticks) {
        this.line = java.util.Objects.requireNonNull(line, "line is required");
        this.ticks = java.util.Objects.requireNonNull(ticks, "ticks is required");
    }

    /**
     * Source line number (1-based).
     */
    public java.lang.Integer getLine() {
        return line;
    }

    /**
     * Number of samples attributed to the source line.
     */
    public java.lang.Integer getTicks() {
        return ticks;
    }

    private static PositionTickInfo fromJson(JsonInput input) {
        java.lang.Integer line = null;
        java.lang.Integer ticks = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "line":
                    line = input.nextNumber().intValue();
                    break;
                case "ticks":
                    ticks = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PositionTickInfo(line, ticks);
    }
}
