package org.openqa.selenium.devtools.serviceworker.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public enum ServiceWorkerVersionRunningStatus {

    STOPPED("stopped"), STARTING("starting"), RUNNING("running"), STOPPING("stopping");

    private String value;

    ServiceWorkerVersionRunningStatus(String value) {
        this.value = value;
    }

    public static ServiceWorkerVersionRunningStatus fromString(String s) {
        return java.util.Arrays.stream(ServiceWorkerVersionRunningStatus.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ServiceWorkerVersionRunningStatus "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ServiceWorkerVersionRunningStatus fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
