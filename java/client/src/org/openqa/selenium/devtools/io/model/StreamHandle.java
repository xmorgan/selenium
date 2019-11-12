package org.openqa.selenium.devtools.io.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * This is either obtained from another method or specifed as `blob:&lt;uuid&gt;` where
 * `&lt;uuid&gt` is an UUID of a Blob.
 */
public class StreamHandle {

    private final java.lang.String streamHandle;

    public StreamHandle(java.lang.String streamHandle) {
        this.streamHandle = java.util.Objects.requireNonNull(streamHandle, "Missing value for StreamHandle");
    }

    private static StreamHandle fromJson(JsonInput input) {
        return new StreamHandle(input.nextString());
    }

    public String toJson() {
        return streamHandle.toString();
    }

    public String toString() {
        return streamHandle.toString();
    }
}
