package org.openqa.selenium.devtools.tracing.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
 * delivered via dataCollected events.
 */
public class TracingComplete {

    private final java.lang.Boolean dataLossOccurred;

    private final org.openqa.selenium.devtools.io.model.StreamHandle stream;

    private final org.openqa.selenium.devtools.tracing.model.StreamFormat traceFormat;

    private final org.openqa.selenium.devtools.tracing.model.StreamCompression streamCompression;

    public TracingComplete(java.lang.Boolean dataLossOccurred, org.openqa.selenium.devtools.io.model.StreamHandle stream, org.openqa.selenium.devtools.tracing.model.StreamFormat traceFormat, org.openqa.selenium.devtools.tracing.model.StreamCompression streamCompression) {
        this.dataLossOccurred = java.util.Objects.requireNonNull(dataLossOccurred, "dataLossOccurred is required");
        this.stream = stream;
        this.traceFormat = traceFormat;
        this.streamCompression = streamCompression;
    }

    /**
     * Indicates whether some trace data is known to have been lost, e.g. because the trace ring
     * buffer wrapped around.
     */
    public java.lang.Boolean getDataLossOccurred() {
        return dataLossOccurred;
    }

    /**
     * A handle of the stream that holds resulting trace data.
     */
    public org.openqa.selenium.devtools.io.model.StreamHandle getStream() {
        return stream;
    }

    /**
     * Trace data format of returned stream.
     */
    public org.openqa.selenium.devtools.tracing.model.StreamFormat getTraceFormat() {
        return traceFormat;
    }

    /**
     * Compression format of returned stream.
     */
    public org.openqa.selenium.devtools.tracing.model.StreamCompression getStreamCompression() {
        return streamCompression;
    }

    private static TracingComplete fromJson(JsonInput input) {
        java.lang.Boolean dataLossOccurred = null;
        org.openqa.selenium.devtools.io.model.StreamHandle stream = null;
        org.openqa.selenium.devtools.tracing.model.StreamFormat traceFormat = null;
        org.openqa.selenium.devtools.tracing.model.StreamCompression streamCompression = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "dataLossOccurred":
                    dataLossOccurred = input.nextBoolean();
                    break;
                case "stream":
                    stream = input.read(org.openqa.selenium.devtools.io.model.StreamHandle.class);
                    break;
                case "traceFormat":
                    traceFormat = input.read(org.openqa.selenium.devtools.tracing.model.StreamFormat.class);
                    break;
                case "streamCompression":
                    streamCompression = input.read(org.openqa.selenium.devtools.tracing.model.StreamCompression.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new TracingComplete(dataLossOccurred, stream, traceFormat, streamCompression);
    }
}
