package org.openqa.selenium.devtools.tracing.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class BufferUsage {

    private final java.lang.Number percentFull;

    private final java.lang.Number eventCount;

    private final java.lang.Number value;

    public BufferUsage(java.lang.Number percentFull, java.lang.Number eventCount, java.lang.Number value) {
        this.percentFull = percentFull;
        this.eventCount = eventCount;
        this.value = value;
    }

    /**
     * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
     * total size.
     */
    public java.lang.Number getPercentFull() {
        return percentFull;
    }

    /**
     * An approximate number of events in the trace log.
     */
    public java.lang.Number getEventCount() {
        return eventCount;
    }

    /**
     * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
     * total size.
     */
    public java.lang.Number getValue() {
        return value;
    }

    private static BufferUsage fromJson(JsonInput input) {
        java.lang.Number percentFull = null;
        java.lang.Number eventCount = null;
        java.lang.Number value = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "percentFull":
                    percentFull = input.nextNumber();
                    break;
                case "eventCount":
                    eventCount = input.nextNumber();
                    break;
                case "value":
                    value = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BufferUsage(percentFull, eventCount, value);
    }
}
