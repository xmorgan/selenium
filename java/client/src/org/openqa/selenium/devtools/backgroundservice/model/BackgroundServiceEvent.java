package org.openqa.selenium.devtools.backgroundservice.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class BackgroundServiceEvent {

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp;

    private final java.lang.String origin;

    private final org.openqa.selenium.devtools.serviceworker.model.RegistrationID serviceWorkerRegistrationId;

    private final org.openqa.selenium.devtools.backgroundservice.model.ServiceName service;

    private final java.lang.String eventName;

    private final java.lang.String instanceId;

    private final java.util.List<org.openqa.selenium.devtools.backgroundservice.model.EventMetadata> eventMetadata;

    public BackgroundServiceEvent(org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp, java.lang.String origin, org.openqa.selenium.devtools.serviceworker.model.RegistrationID serviceWorkerRegistrationId, org.openqa.selenium.devtools.backgroundservice.model.ServiceName service, java.lang.String eventName, java.lang.String instanceId, java.util.List<org.openqa.selenium.devtools.backgroundservice.model.EventMetadata> eventMetadata) {
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.serviceWorkerRegistrationId = java.util.Objects.requireNonNull(serviceWorkerRegistrationId, "serviceWorkerRegistrationId is required");
        this.service = java.util.Objects.requireNonNull(service, "service is required");
        this.eventName = java.util.Objects.requireNonNull(eventName, "eventName is required");
        this.instanceId = java.util.Objects.requireNonNull(instanceId, "instanceId is required");
        this.eventMetadata = java.util.Objects.requireNonNull(eventMetadata, "eventMetadata is required");
    }

    /**
     * Timestamp of the event (in seconds).
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getTimestamp() {
        return timestamp;
    }

    /**
     * The origin this event belongs to.
     */
    public java.lang.String getOrigin() {
        return origin;
    }

    /**
     * The Service Worker ID that initiated the event.
     */
    public org.openqa.selenium.devtools.serviceworker.model.RegistrationID getServiceWorkerRegistrationId() {
        return serviceWorkerRegistrationId;
    }

    /**
     * The Background Service this event belongs to.
     */
    public org.openqa.selenium.devtools.backgroundservice.model.ServiceName getService() {
        return service;
    }

    /**
     * A description of the event.
     */
    public java.lang.String getEventName() {
        return eventName;
    }

    /**
     * An identifier that groups related events together.
     */
    public java.lang.String getInstanceId() {
        return instanceId;
    }

    /**
     * A list of event-specific information.
     */
    public java.util.List<org.openqa.selenium.devtools.backgroundservice.model.EventMetadata> getEventMetadata() {
        return eventMetadata;
    }

    private static BackgroundServiceEvent fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp = null;
        java.lang.String origin = null;
        org.openqa.selenium.devtools.serviceworker.model.RegistrationID serviceWorkerRegistrationId = null;
        org.openqa.selenium.devtools.backgroundservice.model.ServiceName service = null;
        java.lang.String eventName = null;
        java.lang.String instanceId = null;
        java.util.List<org.openqa.selenium.devtools.backgroundservice.model.EventMetadata> eventMetadata = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                case "origin":
                    origin = input.nextString();
                    break;
                case "serviceWorkerRegistrationId":
                    serviceWorkerRegistrationId = input.read(org.openqa.selenium.devtools.serviceworker.model.RegistrationID.class);
                    break;
                case "service":
                    service = input.read(org.openqa.selenium.devtools.backgroundservice.model.ServiceName.class);
                    break;
                case "eventName":
                    eventName = input.nextString();
                    break;
                case "instanceId":
                    instanceId = input.nextString();
                    break;
                case "eventMetadata":
                    eventMetadata = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.backgroundservice.model.EventMetadata>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new BackgroundServiceEvent(timestamp, origin, serviceWorkerRegistrationId, service, eventName, instanceId, eventMetadata);
    }
}
