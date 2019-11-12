package org.openqa.selenium.devtools.backgroundservice.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Called when the recording state for the service has been updated.
 */
public class RecordingStateChanged {

    private final java.lang.Boolean isRecording;

    private final org.openqa.selenium.devtools.backgroundservice.model.ServiceName service;

    public RecordingStateChanged(java.lang.Boolean isRecording, org.openqa.selenium.devtools.backgroundservice.model.ServiceName service) {
        this.isRecording = java.util.Objects.requireNonNull(isRecording, "isRecording is required");
        this.service = java.util.Objects.requireNonNull(service, "service is required");
    }

    public java.lang.Boolean getIsRecording() {
        return isRecording;
    }

    public org.openqa.selenium.devtools.backgroundservice.model.ServiceName getService() {
        return service;
    }

    private static RecordingStateChanged fromJson(JsonInput input) {
        java.lang.Boolean isRecording = null;
        org.openqa.selenium.devtools.backgroundservice.model.ServiceName service = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "isRecording":
                    isRecording = input.nextBoolean();
                    break;
                case "service":
                    service = input.read(org.openqa.selenium.devtools.backgroundservice.model.ServiceName.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RecordingStateChanged(isRecording, service);
    }
}
