package org.openqa.selenium.devtools.audits;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Audits domain allows investigation of page violations and possible improvements.
 */
@Beta()
public class Audits {

    public static class GetEncodedResponseResponse {

        private final java.lang.String body;

        private final java.lang.Integer originalSize;

        private final java.lang.Integer encodedSize;

        public GetEncodedResponseResponse(java.lang.String body, java.lang.Integer originalSize, java.lang.Integer encodedSize) {
            this.body = java.util.Objects.requireNonNull(body, "body is required");
            this.originalSize = java.util.Objects.requireNonNull(originalSize, "originalSize is required");
            this.encodedSize = java.util.Objects.requireNonNull(encodedSize, "encodedSize is required");
        }

        /**
         * The encoded body as a base64 string. Omitted if sizeOnly is true.
         */
        public java.lang.String getBody() {
            return body;
        }

        /**
         * Size before re-encoding.
         */
        public java.lang.Integer getOriginalSize() {
            return originalSize;
        }

        /**
         * Size after re-encoding.
         */
        public java.lang.Integer getEncodedSize() {
            return encodedSize;
        }

        private static GetEncodedResponseResponse fromJson(JsonInput input) {
            java.lang.String body = null;
            java.lang.Integer originalSize = null;
            java.lang.Integer encodedSize = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "body":
                        body = input.nextString();
                        break;
                    case "originalSize":
                        originalSize = input.nextNumber().intValue();
                        break;
                    case "encodedSize":
                        encodedSize = input.nextNumber().intValue();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetEncodedResponseResponse(body, originalSize, encodedSize);
        }
    }

    public enum GetEncodedResponseEncoding {

        WEBP("webp"), JPEG("jpeg"), PNG("png");

        private String value;

        GetEncodedResponseEncoding(String value) {
            this.value = value;
        }

        public static GetEncodedResponseEncoding fromString(String s) {
            return java.util.Arrays.stream(GetEncodedResponseEncoding.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within GetEncodedResponseEncoding "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static GetEncodedResponseEncoding fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Returns the response body and size if it were re-encoded with the specified settings. Only
     * applies to images.
     */
    public static Command<org.openqa.selenium.devtools.audits.Audits.GetEncodedResponseResponse> getEncodedResponse(org.openqa.selenium.devtools.network.model.RequestId requestId, GetEncodedResponseEncoding encoding, java.util.Optional<java.lang.Number> quality, java.util.Optional<java.lang.Boolean> sizeOnly) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        java.util.Objects.requireNonNull(encoding, "encoding is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        params.put("encoding", encoding);
        quality.ifPresent(p -> params.put("quality", p));
        sizeOnly.ifPresent(p -> params.put("sizeOnly", p));
        return new Command<>("Audits.getEncodedResponse", params.build(), input -> input.read(org.openqa.selenium.devtools.audits.Audits.GetEncodedResponseResponse.class));
    }
}
