package org.openqa.selenium.devtools.serviceworker.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public enum ServiceWorkerVersionStatus {

    NEW("new"),
    INSTALLING("installing"),
    INSTALLED("installed"),
    ACTIVATING("activating"),
    ACTIVATED("activated"),
    REDUNDANT("redundant");

    private String value;

    ServiceWorkerVersionStatus(String value) {
        this.value = value;
    }

    public static ServiceWorkerVersionStatus fromString(String s) {
        return java.util.Arrays.stream(ServiceWorkerVersionStatus.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ServiceWorkerVersionStatus "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ServiceWorkerVersionStatus fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
