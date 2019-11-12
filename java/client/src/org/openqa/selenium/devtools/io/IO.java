package org.openqa.selenium.devtools.io;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Input/Output operations for streams produced by DevTools.
 */
public class IO {

    /**
     * Close the stream, discard any temporary backing storage.
     */
    public static Command<Void> close(org.openqa.selenium.devtools.io.model.StreamHandle handle) {
        java.util.Objects.requireNonNull(handle, "handle is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("handle", handle);
        return new Command<>("IO.close", params.build());
    }

    public static class ReadResponse {

        private final java.lang.Boolean base64Encoded;

        private final java.lang.String data;

        private final java.lang.Boolean eof;

        public ReadResponse(java.lang.Boolean base64Encoded, java.lang.String data, java.lang.Boolean eof) {
            this.base64Encoded = java.util.Objects.requireNonNull(base64Encoded, "base64Encoded is required");
            this.data = java.util.Objects.requireNonNull(data, "data is required");
            this.eof = java.util.Objects.requireNonNull(eof, "eof is required");
        }

        /**
         * Set if the data is base64-encoded
         */
        public java.lang.Boolean getBase64Encoded() {
            return base64Encoded;
        }

        /**
         * Data that were read.
         */
        public java.lang.String getData() {
            return data;
        }

        /**
         * Set if the end-of-file condition occured while reading.
         */
        public java.lang.Boolean getEof() {
            return eof;
        }

        private static ReadResponse fromJson(JsonInput input) {
            java.lang.Boolean base64Encoded = null;
            java.lang.String data = null;
            java.lang.Boolean eof = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "base64Encoded":
                        base64Encoded = input.nextBoolean();
                        break;
                    case "data":
                        data = input.nextString();
                        break;
                    case "eof":
                        eof = input.nextBoolean();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new ReadResponse(base64Encoded, data, eof);
        }
    }

    /**
     * Read a chunk of the stream
     */
    public static Command<org.openqa.selenium.devtools.io.IO.ReadResponse> read(org.openqa.selenium.devtools.io.model.StreamHandle handle, java.util.Optional<java.lang.Integer> offset, java.util.Optional<java.lang.Integer> size) {
        java.util.Objects.requireNonNull(handle, "handle is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("handle", handle);
        offset.ifPresent(p -> params.put("offset", p));
        size.ifPresent(p -> params.put("size", p));
        return new Command<>("IO.read", params.build(), input -> input.read(org.openqa.selenium.devtools.io.IO.ReadResponse.class));
    }

    /**
     * Return UUID of Blob object specified by a remote object id.
     */
    public static Command<java.lang.String> resolveBlob(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        return new Command<>("IO.resolveBlob", params.build(), ConverterFunctions.map("uuid", java.lang.String.class));
    }
}
