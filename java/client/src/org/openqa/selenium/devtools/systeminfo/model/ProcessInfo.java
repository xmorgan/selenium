package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Represents process info.
 */
public class ProcessInfo {

    private final java.lang.String type;

    private final java.lang.Integer id;

    private final java.lang.Number cpuTime;

    public ProcessInfo(java.lang.String type, java.lang.Integer id, java.lang.Number cpuTime) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.id = java.util.Objects.requireNonNull(id, "id is required");
        this.cpuTime = java.util.Objects.requireNonNull(cpuTime, "cpuTime is required");
    }

    /**
     * Specifies process type.
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Specifies process id.
     */
    public java.lang.Integer getId() {
        return id;
    }

    /**
     * Specifies cumulative CPU usage in seconds across all threads of the
     * process since the process start.
     */
    public java.lang.Number getCpuTime() {
        return cpuTime;
    }

    private static ProcessInfo fromJson(JsonInput input) {
        java.lang.String type = null;
        java.lang.Integer id = null;
        java.lang.Number cpuTime = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = input.nextString();
                    break;
                case "id":
                    id = input.nextNumber().intValue();
                    break;
                case "cpuTime":
                    cpuTime = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ProcessInfo(type, id, cpuTime);
    }
}
