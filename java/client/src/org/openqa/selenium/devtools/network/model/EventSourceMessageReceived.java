package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when EventSource message is received.
 */
public class EventSourceMessageReceived {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final java.lang.String eventName;

    private final java.lang.String eventId;

    private final java.lang.String data;

    public EventSourceMessageReceived(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, java.lang.String eventName, java.lang.String eventId, java.lang.String data) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.eventName = java.util.Objects.requireNonNull(eventName, "eventName is required");
        this.eventId = java.util.Objects.requireNonNull(eventId, "eventId is required");
        this.data = java.util.Objects.requireNonNull(data, "data is required");
    }

    /**
     * Request identifier.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * Timestamp.
     */
    public org.openqa.selenium.devtools.network.model.MonotonicTime getTimestamp() {
        return timestamp;
    }

    /**
     * Message type.
     */
    public java.lang.String getEventName() {
        return eventName;
    }

    /**
     * Message identifier.
     */
    public java.lang.String getEventId() {
        return eventId;
    }

    /**
     * Message content.
     */
    public java.lang.String getData() {
        return data;
    }

    private static EventSourceMessageReceived fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        java.lang.String eventName = null;
        java.lang.String eventId = null;
        java.lang.String data = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "eventName":
                    eventName = input.nextString();
                    break;
                case "eventId":
                    eventId = input.nextString();
                    break;
                case "data":
                    data = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new EventSourceMessageReceived(requestId, timestamp, eventName, eventId, data);
    }
}
