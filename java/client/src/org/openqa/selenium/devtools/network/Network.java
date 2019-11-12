package org.openqa.selenium.devtools.network;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Network domain allows tracking network activities of the page. It exposes information about http,
 * file, data and other requests and responses, their headers, bodies, timing, etc.
 */
public class Network {

    /**
     * Tells whether clearing browser cache is supported.
     */
    @Deprecated()
    public static Command<java.lang.Boolean> canClearBrowserCache() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.canClearBrowserCache", params.build(), ConverterFunctions.map("result", java.lang.Boolean.class));
    }

    /**
     * Tells whether clearing browser cookies is supported.
     */
    @Deprecated()
    public static Command<java.lang.Boolean> canClearBrowserCookies() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.canClearBrowserCookies", params.build(), ConverterFunctions.map("result", java.lang.Boolean.class));
    }

    /**
     * Tells whether emulation of network conditions is supported.
     */
    @Deprecated()
    public static Command<java.lang.Boolean> canEmulateNetworkConditions() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.canEmulateNetworkConditions", params.build(), ConverterFunctions.map("result", java.lang.Boolean.class));
    }

    /**
     * Clears browser cache.
     */
    public static Command<Void> clearBrowserCache() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.clearBrowserCache", params.build());
    }

    /**
     * Clears browser cookies.
     */
    public static Command<Void> clearBrowserCookies() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.clearBrowserCookies", params.build());
    }

    /**
     * Response to Network.requestIntercepted which either modifies the request to continue with any
     * modifications, or blocks it, or completes it with the provided response bytes. If a network
     * fetch occurs as a result which encounters a redirect an additional Network.requestIntercepted
     * event will be sent with the same InterceptionId.
     * Deprecated, use Fetch.continueRequest, Fetch.fulfillRequest and Fetch.failRequest instead.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> continueInterceptedRequest(org.openqa.selenium.devtools.network.model.InterceptionId interceptionId, java.util.Optional<org.openqa.selenium.devtools.network.model.ErrorReason> errorReason, java.util.Optional<java.lang.String> rawResponse, java.util.Optional<java.lang.String> url, java.util.Optional<java.lang.String> method, java.util.Optional<java.lang.String> postData, java.util.Optional<org.openqa.selenium.devtools.network.model.Headers> headers, java.util.Optional<org.openqa.selenium.devtools.network.model.AuthChallengeResponse> authChallengeResponse) {
        java.util.Objects.requireNonNull(interceptionId, "interceptionId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("interceptionId", interceptionId);
        errorReason.ifPresent(p -> params.put("errorReason", p));
        rawResponse.ifPresent(p -> params.put("rawResponse", p));
        url.ifPresent(p -> params.put("url", p));
        method.ifPresent(p -> params.put("method", p));
        postData.ifPresent(p -> params.put("postData", p));
        headers.ifPresent(p -> params.put("headers", p));
        authChallengeResponse.ifPresent(p -> params.put("authChallengeResponse", p));
        return new Command<>("Network.continueInterceptedRequest", params.build());
    }

    /**
     * Deletes browser cookies with matching name and url or domain/path pair.
     */
    public static Command<Void> deleteCookies(java.lang.String name, java.util.Optional<java.lang.String> url, java.util.Optional<java.lang.String> domain, java.util.Optional<java.lang.String> path) {
        java.util.Objects.requireNonNull(name, "name is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("name", name);
        url.ifPresent(p -> params.put("url", p));
        domain.ifPresent(p -> params.put("domain", p));
        path.ifPresent(p -> params.put("path", p));
        return new Command<>("Network.deleteCookies", params.build());
    }

    /**
     * Disables network tracking, prevents network events from being sent to the client.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.disable", params.build());
    }

    /**
     * Activates emulation of network conditions.
     */
    public static Command<Void> emulateNetworkConditions(java.lang.Boolean offline, java.lang.Number latency, java.lang.Number downloadThroughput, java.lang.Number uploadThroughput, java.util.Optional<org.openqa.selenium.devtools.network.model.ConnectionType> connectionType) {
        java.util.Objects.requireNonNull(offline, "offline is required");
        java.util.Objects.requireNonNull(latency, "latency is required");
        java.util.Objects.requireNonNull(downloadThroughput, "downloadThroughput is required");
        java.util.Objects.requireNonNull(uploadThroughput, "uploadThroughput is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("offline", offline);
        params.put("latency", latency);
        params.put("downloadThroughput", downloadThroughput);
        params.put("uploadThroughput", uploadThroughput);
        connectionType.ifPresent(p -> params.put("connectionType", p));
        return new Command<>("Network.emulateNetworkConditions", params.build());
    }

    /**
     * Enables network tracking, network events will now be delivered to the client.
     */
    public static Command<Void> enable(java.util.Optional<java.lang.Integer> maxTotalBufferSize, java.util.Optional<java.lang.Integer> maxResourceBufferSize, java.util.Optional<java.lang.Integer> maxPostDataSize) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        maxTotalBufferSize.ifPresent(p -> params.put("maxTotalBufferSize", p));
        maxResourceBufferSize.ifPresent(p -> params.put("maxResourceBufferSize", p));
        maxPostDataSize.ifPresent(p -> params.put("maxPostDataSize", p));
        return new Command<>("Network.enable", params.build());
    }

    /**
     * Returns all browser cookies. Depending on the backend support, will return detailed cookie
     * information in the `cookies` field.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.network.model.Cookie>> getAllCookies() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Network.getAllCookies", params.build(), ConverterFunctions.map("cookies", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.Cookie>>() {
        }.getType()));
    }

    /**
     * Returns the DER-encoded certificate.
     */
    @Beta()
    public static Command<java.util.List<java.lang.String>> getCertificate(java.lang.String origin) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        return new Command<>("Network.getCertificate", params.build(), ConverterFunctions.map("tableNames", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Returns all browser cookies for the current URL. Depending on the backend support, will return
     * detailed cookie information in the `cookies` field.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.network.model.Cookie>> getCookies(java.util.Optional<java.util.List<java.lang.String>> urls) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        urls.ifPresent(p -> params.put("urls", p));
        return new Command<>("Network.getCookies", params.build(), ConverterFunctions.map("cookies", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.Cookie>>() {
        }.getType()));
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
     * Returns content served for the given request.
     */
    public static Command<org.openqa.selenium.devtools.network.Network.GetResponseBodyResponse> getResponseBody(org.openqa.selenium.devtools.network.model.RequestId requestId) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        return new Command<>("Network.getResponseBody", params.build(), input -> input.read(org.openqa.selenium.devtools.network.Network.GetResponseBodyResponse.class));
    }

    /**
     * Returns post data sent with the request. Returns an error when no data was sent with the request.
     */
    public static Command<java.lang.String> getRequestPostData(org.openqa.selenium.devtools.network.model.RequestId requestId) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        return new Command<>("Network.getRequestPostData", params.build(), ConverterFunctions.map("postData", java.lang.String.class));
    }

    public static class GetResponseBodyForInterceptionResponse {

        private final java.lang.String body;

        private final java.lang.Boolean base64Encoded;

        public GetResponseBodyForInterceptionResponse(java.lang.String body, java.lang.Boolean base64Encoded) {
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

        private static GetResponseBodyForInterceptionResponse fromJson(JsonInput input) {
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
            return new GetResponseBodyForInterceptionResponse(body, base64Encoded);
        }
    }

    /**
     * Returns content served for the given currently intercepted request.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.network.Network.GetResponseBodyForInterceptionResponse> getResponseBodyForInterception(org.openqa.selenium.devtools.network.model.InterceptionId interceptionId) {
        java.util.Objects.requireNonNull(interceptionId, "interceptionId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("interceptionId", interceptionId);
        return new Command<>("Network.getResponseBodyForInterception", params.build(), input -> input.read(org.openqa.selenium.devtools.network.Network.GetResponseBodyForInterceptionResponse.class));
    }

    /**
     * Returns a handle to the stream representing the response body. Note that after this command,
     * the intercepted request can't be continued as is -- you either need to cancel it or to provide
     * the response body. The stream only supports sequential read, IO.read will fail if the position
     * is specified.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.io.model.StreamHandle> takeResponseBodyForInterceptionAsStream(org.openqa.selenium.devtools.network.model.InterceptionId interceptionId) {
        java.util.Objects.requireNonNull(interceptionId, "interceptionId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("interceptionId", interceptionId);
        return new Command<>("Network.takeResponseBodyForInterceptionAsStream", params.build(), ConverterFunctions.map("stream", org.openqa.selenium.devtools.io.model.StreamHandle.class));
    }

    /**
     * This method sends a new XMLHttpRequest which is identical to the original one. The following
     * parameters should be identical: method, url, async, request body, extra headers, withCredentials
     * attribute, user, password.
     */
    @Beta()
    public static Command<Void> replayXHR(org.openqa.selenium.devtools.network.model.RequestId requestId) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        return new Command<>("Network.replayXHR", params.build());
    }

    /**
     * Searches for given string in response content.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.debugger.model.SearchMatch>> searchInResponseBody(org.openqa.selenium.devtools.network.model.RequestId requestId, java.lang.String query, java.util.Optional<java.lang.Boolean> caseSensitive, java.util.Optional<java.lang.Boolean> isRegex) {
        java.util.Objects.requireNonNull(requestId, "requestId is required");
        java.util.Objects.requireNonNull(query, "query is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("requestId", requestId);
        params.put("query", query);
        caseSensitive.ifPresent(p -> params.put("caseSensitive", p));
        isRegex.ifPresent(p -> params.put("isRegex", p));
        return new Command<>("Network.searchInResponseBody", params.build(), ConverterFunctions.map("result", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.SearchMatch>>() {
        }.getType()));
    }

    /**
     * Blocks URLs from loading.
     */
    @Beta()
    public static Command<Void> setBlockedURLs(java.util.List<java.lang.String> urls) {
        java.util.Objects.requireNonNull(urls, "urls is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("urls", urls);
        return new Command<>("Network.setBlockedURLs", params.build());
    }

    /**
     * Toggles ignoring of service worker for each request.
     */
    @Beta()
    public static Command<Void> setBypassServiceWorker(java.lang.Boolean bypass) {
        java.util.Objects.requireNonNull(bypass, "bypass is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("bypass", bypass);
        return new Command<>("Network.setBypassServiceWorker", params.build());
    }

    /**
     * Toggles ignoring cache for each request. If `true`, cache will not be used.
     */
    public static Command<Void> setCacheDisabled(java.lang.Boolean cacheDisabled) {
        java.util.Objects.requireNonNull(cacheDisabled, "cacheDisabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cacheDisabled", cacheDisabled);
        return new Command<>("Network.setCacheDisabled", params.build());
    }

    /**
     * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
     */
    public static Command<java.lang.Boolean> setCookie(java.lang.String name, java.lang.String value, java.util.Optional<java.lang.String> url, java.util.Optional<java.lang.String> domain, java.util.Optional<java.lang.String> path, java.util.Optional<java.lang.Boolean> secure, java.util.Optional<java.lang.Boolean> httpOnly, java.util.Optional<org.openqa.selenium.devtools.network.model.CookieSameSite> sameSite, java.util.Optional<org.openqa.selenium.devtools.network.model.TimeSinceEpoch> expires) {
        java.util.Objects.requireNonNull(name, "name is required");
        java.util.Objects.requireNonNull(value, "value is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("name", name);
        params.put("value", value);
        url.ifPresent(p -> params.put("url", p));
        domain.ifPresent(p -> params.put("domain", p));
        path.ifPresent(p -> params.put("path", p));
        secure.ifPresent(p -> params.put("secure", p));
        httpOnly.ifPresent(p -> params.put("httpOnly", p));
        sameSite.ifPresent(p -> params.put("sameSite", p));
        expires.ifPresent(p -> params.put("expires", p));
        return new Command<>("Network.setCookie", params.build(), ConverterFunctions.map("success", java.lang.Boolean.class));
    }

    /**
     * Sets given cookies.
     */
    public static Command<Void> setCookies(java.util.List<org.openqa.selenium.devtools.network.model.CookieParam> cookies) {
        java.util.Objects.requireNonNull(cookies, "cookies is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cookies", cookies);
        return new Command<>("Network.setCookies", params.build());
    }

    /**
     * For testing.
     */
    @Beta()
    public static Command<Void> setDataSizeLimitsForTest(java.lang.Integer maxTotalSize, java.lang.Integer maxResourceSize) {
        java.util.Objects.requireNonNull(maxTotalSize, "maxTotalSize is required");
        java.util.Objects.requireNonNull(maxResourceSize, "maxResourceSize is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("maxTotalSize", maxTotalSize);
        params.put("maxResourceSize", maxResourceSize);
        return new Command<>("Network.setDataSizeLimitsForTest", params.build());
    }

    /**
     * Specifies whether to always send extra HTTP headers with the requests from this page.
     */
    public static Command<Void> setExtraHTTPHeaders(org.openqa.selenium.devtools.network.model.Headers headers) {
        java.util.Objects.requireNonNull(headers, "headers is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("headers", headers);
        return new Command<>("Network.setExtraHTTPHeaders", params.build());
    }

    /**
     * Sets the requests to intercept that match the provided patterns and optionally resource types.
     * Deprecated, please use Fetch.enable instead.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> setRequestInterception(java.util.List<org.openqa.selenium.devtools.network.model.RequestPattern> patterns) {
        java.util.Objects.requireNonNull(patterns, "patterns is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("patterns", patterns);
        return new Command<>("Network.setRequestInterception", params.build());
    }

    /**
     * Allows overriding user agent with the given string.
     */
    public static Command<Void> setUserAgentOverride(java.lang.String userAgent, java.util.Optional<java.lang.String> acceptLanguage, java.util.Optional<java.lang.String> platform) {
        java.util.Objects.requireNonNull(userAgent, "userAgent is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("userAgent", userAgent);
        acceptLanguage.ifPresent(p -> params.put("acceptLanguage", p));
        platform.ifPresent(p -> params.put("platform", p));
        return new Command<>("Network.setUserAgentOverride", params.build());
    }

    public static Event<org.openqa.selenium.devtools.network.model.DataReceived> dataReceived() {
        return new Event<>("Network.dataReceived", input -> input.read(org.openqa.selenium.devtools.network.model.DataReceived.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.EventSourceMessageReceived> eventSourceMessageReceived() {
        return new Event<>("Network.eventSourceMessageReceived", input -> input.read(org.openqa.selenium.devtools.network.model.EventSourceMessageReceived.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.LoadingFailed> loadingFailed() {
        return new Event<>("Network.loadingFailed", input -> input.read(org.openqa.selenium.devtools.network.model.LoadingFailed.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.LoadingFinished> loadingFinished() {
        return new Event<>("Network.loadingFinished", input -> input.read(org.openqa.selenium.devtools.network.model.LoadingFinished.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.RequestIntercepted> requestIntercepted() {
        return new Event<>("Network.requestIntercepted", input -> input.read(org.openqa.selenium.devtools.network.model.RequestIntercepted.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.RequestId> requestServedFromCache() {
        return new Event<>("Network.requestServedFromCache", ConverterFunctions.map("requestId", org.openqa.selenium.devtools.network.model.RequestId.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.RequestWillBeSent> requestWillBeSent() {
        return new Event<>("Network.requestWillBeSent", input -> input.read(org.openqa.selenium.devtools.network.model.RequestWillBeSent.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.ResourceChangedPriority> resourceChangedPriority() {
        return new Event<>("Network.resourceChangedPriority", input -> input.read(org.openqa.selenium.devtools.network.model.ResourceChangedPriority.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.SignedExchangeReceived> signedExchangeReceived() {
        return new Event<>("Network.signedExchangeReceived", input -> input.read(org.openqa.selenium.devtools.network.model.SignedExchangeReceived.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.ResponseReceived> responseReceived() {
        return new Event<>("Network.responseReceived", input -> input.read(org.openqa.selenium.devtools.network.model.ResponseReceived.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketClosed> webSocketClosed() {
        return new Event<>("Network.webSocketClosed", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketClosed.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketCreated> webSocketCreated() {
        return new Event<>("Network.webSocketCreated", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketCreated.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketFrameError> webSocketFrameError() {
        return new Event<>("Network.webSocketFrameError", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketFrameError.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketFrameReceived> webSocketFrameReceived() {
        return new Event<>("Network.webSocketFrameReceived", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketFrameReceived.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketFrameSent> webSocketFrameSent() {
        return new Event<>("Network.webSocketFrameSent", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketFrameSent.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketHandshakeResponseReceived> webSocketHandshakeResponseReceived() {
        return new Event<>("Network.webSocketHandshakeResponseReceived", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketHandshakeResponseReceived.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.WebSocketWillSendHandshakeRequest> webSocketWillSendHandshakeRequest() {
        return new Event<>("Network.webSocketWillSendHandshakeRequest", input -> input.read(org.openqa.selenium.devtools.network.model.WebSocketWillSendHandshakeRequest.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.RequestWillBeSentExtraInfo> requestWillBeSentExtraInfo() {
        return new Event<>("Network.requestWillBeSentExtraInfo", input -> input.read(org.openqa.selenium.devtools.network.model.RequestWillBeSentExtraInfo.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.ResponseReceivedExtraInfo> responseReceivedExtraInfo() {
        return new Event<>("Network.responseReceivedExtraInfo", input -> input.read(org.openqa.selenium.devtools.network.model.ResponseReceivedExtraInfo.class));
    }
}
