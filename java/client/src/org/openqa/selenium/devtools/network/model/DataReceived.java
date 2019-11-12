package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when data chunk was received over the network.
 */
public class DataReceived {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.MonotonicTime timestamp;

    private final java.lang.Integer dataLength;

    private final java.lang.Integer encodedDataLength;

    public DataReceived(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.MonotonicTime timestamp, java.lang.Integer dataLength, java.lang.Integer encodedDataLength) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.timestamp = java.util.Objects.requireNonNull(timestamp, "timestamp is required");
        this.dataLength = java.util.Objects.requireNonNull(dataLength, "dataLength is required");
        this.encodedDataLength = java.util.Objects.requireNonNull(encodedDataLength, "encodedDataLength is required");
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
     * Data chunk length.
     */
    public java.lang.Integer getDataLength() {
        return dataLength;
    }

    /**
     * Actual bytes received (might be less than dataLength for compressed encodings).
     */
    public java.lang.Integer getEncodedDataLength() {
        return encodedDataLength;
    }

    private static DataReceived fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.MonotonicTime timestamp = null;
        java.lang.Integer dataLength = null;
        java.lang.Integer encodedDataLength = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.MonotonicTime.class);
                    break;
                case "dataLength":
                    dataLength = input.nextNumber().intValue();
                    break;
                case "encodedDataLength":
                    encodedDataLength = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new DataReceived(requestId, timestamp, dataLength, encodedDataLength);
    }
}
