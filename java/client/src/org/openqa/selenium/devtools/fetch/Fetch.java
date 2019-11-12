package org.openqa.selenium.devtools.fetch;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * A domain for letting clients substitute browser's network layer with client code.
 */
@Beta()
public class Fetch {

    /**
     * Disables the fetch domain.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Fetch.disable", params.build());
    }

    /**
     * Enables issuing of requestPaused events. A request will be paused until client
     * calls one of failRequest, fulfillRequest or continueRequest/continueWithAuth.
     */
    public static Command<Void> enable(java.util.Optional<java.util.List<org.openqa.selenium.devtools.fetch.model.RequestPattern>> patterns, java.util.Optional<java.lang.Boolean> handleAuthRequests) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        patterns.ifPresent(p -> params.put("patterns", p));
        handleAuthRequests.ifPresent(p -> params.put("handleAuthRequests", p));
        return new Command<>("Fetch.enable", params.build());
    }

    /**
     * Causes the request to fail with specified reason.
     */
    public static Command<Void> failRequest(org.openqa.selenium.devtools.fetch.model.RequestId requestId, org.openqa.selenium.devtools.network.model.ErrorReason errorReason) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        java.util.Objects.requireNonNull(errorReason, "errorReason is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        params.put("errorReason", errorReason);
        return new Command<>("Fetch.failRequest", params.build());
    }

    /**
     * Provides response to the request.
     */
    public static Command<Void> fulfillRequest(org.openqa.selenium.devtools.fetch.model.RequestId requestId, java.lang.Integer responseCode, java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry> responseHeaders, java.util.Optional<java.lang.String> body, java.util.Optional<java.lang.String> responsePhrase) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        java.util.Objects.requireNonNull(responseCode, "responseCode is required");
        java.util.Objects.requireNonNull(responseHeaders, "responseHeaders is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        params.put("responseCode", responseCode);
        params.put("responseHeaders", responseHeaders);
        body.ifPresent(p -> params.put("body", p));
        responsePhrase.ifPresent(p -> params.put("responsePhrase", p));
        return new Command<>("Fetch.fulfillRequest", params.build());
    }

    /**
     * Continues the request, optionally modifying some of its parameters.
     */
    public static Command<Void> continueRequest(org.openqa.selenium.devtools.fetch.model.RequestId requestId, java.util.Optional<java.lang.String> url, java.util.Optional<java.lang.String> method, java.util.Optional<java.lang.String> postData, java.util.Optional<java.util.List<org.openqa.selenium.devtools.fetch.model.HeaderEntry>> headers) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        url.ifPresent(p -> params.put("url", p));
        method.ifPresent(p -> params.put("method", p));
        postData.ifPresent(p -> params.put("postData", p));
        headers.ifPresent(p -> params.put("headers", p));
        return new Command<>("Fetch.continueRequest", params.build());
    }

    /**
     * Continues a request supplying authChallengeResponse following authRequired event.
     */
    public static Command<Void> continueWithAuth(org.openqa.selenium.devtools.fetch.model.RequestId requestId, org.openqa.selenium.devtools.fetch.model.AuthChallengeResponse authChallengeResponse) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        java.util.Objects.requireNonNull(authChallengeResponse, "authChallengeResponse is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        params.put("authChallengeResponse", authChallengeResponse);
        return new Command<>("Fetch.continueWithAuth", params.build());
    }

    public static class GetResponseBodyResponse {

        private final java.lang.String body;

        private final java.lang.Boolean base64Encoded;

        public GetResponseBodyResponse(java.lang.String body, java.lang.Boolean base64Encoded) {
            this.body = java.util.Objects.requireNonNull(body, "body is required");
            this.base64Encoded = java.util.Objects.requireNonNull(base64Encoded, "base64Encoded is required");
        }

        /**
         * Response body.
         */
        public java.lang.String getBody() {
            return body;
        }

        /**
         * True, if content was sent as base64.
         */
        public java.lang.Boolean getBase64Encoded() {
            return base64Encoded;
        }

        private static GetResponseBodyResponse fromJson(JsonInput input) {
            java.lang.String body = null;
            java.lang.Boolean base64Encoded = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "body":
                        body = input.nextString();
                        break;
                    case "base64Encoded":
                        base64Encoded = input.nextBoolean();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetResponseBodyResponse(body, base64Encoded);
        }
    }

    /**
     * Causes the body of the response to be received from the server and
     * returned as a single string. May only be issued for a request that
     * is paused in the Response stage and is mutually exclusive with
     * takeResponseBodyForInterceptionAsStream. Calling other methods that
     * affect the request or disabling fetch domain before body is received
     * results in an undefined behavior.
     */
    public static Command<org.openqa.selenium.devtools.fetch.Fetch.GetResponseBodyResponse> getResponseBody(org.openqa.selenium.devtools.fetch.model.RequestId requestId) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        return new Command<>("Fetch.getResponseBody", params.build(), input -> input.read(org.openqa.selenium.devtools.fetch.Fetch.GetResponseBodyResponse.class));
    }

    /**
     * Returns a handle to the stream representing the response body.
     * The request must be paused in the HeadersReceived stage.
     * Note that after this command the request can't be continued
     * as is -- client either needs to cancel it or to provide the
     * response body.
     * The stream only supports sequential read, IO.read will fail if the position
     * is specified.
     * This method is mutually exclusive with getResponseBody.
     * Calling other methods that affect the request or disabling fetch
     * domain before body is received results in an undefined behavior.
     */
    public static Command<org.openqa.selenium.devtools.io.model.StreamHandle> takeResponseBodyAsStream(org.openqa.selenium.devtools.fetch.model.RequestId requestId) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        return new Command<>("Fetch.takeResponseBodyAsStream", params.build(), ConverterFunctions.map("stream", org.openqa.selenium.devtools.io.model.StreamHandle.class));
    }

    public static Event<org.openqa.selenium.devtools.fetch.model.RequestPaused> requestPaused() {
        return new Event<>("Fetch.requestPaused", input -> input.read(org.openqa.selenium.devtools.fetch.model.RequestPaused.class));
    }

    public static Event<org.openqa.selenium.devtools.fetch.model.AuthRequired> authRequired() {
        return new Event<>("Fetch.authRequired", input -> input.read(org.openqa.selenium.devtools.fetch.model.AuthRequired.class));
    }
}
