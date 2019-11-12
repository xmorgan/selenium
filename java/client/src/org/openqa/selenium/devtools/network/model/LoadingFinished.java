package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when HTTP request has finished loading.
 */
public class LoadingFinished {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final java.lang.Number encodedDataLength;

    private final java.lang.Boolean shouldReportCorbBlocking;

    public LoadingFinished(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, java.lang.Number encodedDataLength, java.lang.Boolean shouldReportCorbBlocking) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.encodedDataLength = java.util.Objects.requireNonNull(encodedDataLength, "encodedDataLength is required");
        this.shouldReportCorbBlocking = shouldReportCorbBlocking;
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
     * Total number of bytes received for this request.
     */
    public java.lang.Number getEncodedDataLength() {
        return encodedDataLength;
    }

    /**
     * Set when 1) response was blocked by Cross-Origin Read Blocking and also
     * 2) this needs to be reported to the DevTools console.
     */
    public java.lang.Boolean getShouldReportCorbBlocking() {
        return shouldReportCorbBlocking;
    }

    private static LoadingFinished fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        java.lang.Number encodedDataLength = null;
        java.lang.Boolean shouldReportCorbBlocking = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "encodedDataLength":
                    encodedDataLength = input.nextNumber();
                    break;
                case "shouldReportCorbBlocking":
                    shouldReportCorbBlocking = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LoadingFinished(requestId, timestamp, encodedDataLength, shouldReportCorbBlocking);
    }
}
