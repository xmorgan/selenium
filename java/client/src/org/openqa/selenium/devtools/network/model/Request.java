package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * HTTP request data.
 */
public class Request {

    public enum ReferrerPolicy {

        UNSAFE_URL("unsafe-url"),
        NO_REFERRER_WHEN_DOWNGRADE("no-referrer-when-downgrade"),
        NO_REFERRER("no-referrer"),
        ORIGIN("origin"),
        ORIGIN_WHEN_CROSS_ORIGIN("origin-when-cross-origin"),
        SAME_ORIGIN("same-origin"),
        STRICT_ORIGIN("strict-origin"),
        STRICT_ORIGIN_WHEN_CROSS_ORIGIN("strict-origin-when-cross-origin");

        private String value;

        ReferrerPolicy(String value) {
            this.value = value;
        }

        public static ReferrerPolicy fromString(String s) {
            return java.util.Arrays.stream(ReferrerPolicy.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ReferrerPolicy "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static ReferrerPolicy fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final java.lang.String url;

    private final java.lang.String urlFragment;

    private final java.lang.String method;

    private final org.openqa.selenium.devtools.network.model.Headers headers;

    private final java.lang.String postData;

    private final java.lang.Boolean hasPostData;

    private final org.openqa.selenium.devtools.security.model.MixedContentType mixedContentType;

    private final org.openqa.selenium.devtools.network.model.ResourcePriority initialPriority;

    private final ReferrerPolicy referrerPolicy;

    private final java.lang.Boolean isLinkPreload;

    public Request(java.lang.String url, java.lang.String urlFragment, java.lang.String method, org.openqa.selenium.devtools.network.model.Headers headers, java.lang.String postData, java.lang.Boolean hasPostData, org.openqa.selenium.devtools.security.model.MixedContentType mixedContentType, org.openqa.selenium.devtools.network.model.ResourcePriority initialPriority, ReferrerPolicy referrerPolicy, java.lang.Boolean isLinkPreload) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.urlFragment = urlFragment;
        this.method = java.util.Objects.requireNonNull(method, "method is required");
        this.headers = java.util.Objects.requireNonNull(headers, "headers is required");
        this.postData = postData;
        this.hasPostData = hasPostData;
        this.mixedContentType = mixedContentType;
        this.initialPriority = java.util.Objects.requireNonNull(initialPriority, "initialPriority is required");
        this.referrerPolicy = java.util.Objects.requireNonNull(referrerPolicy, "referrerPolicy is required");
        this.isLinkPreload = isLinkPreload;
    }

    /**
     * Request URL (without fragment).
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Fragment of the requested URL starting with hash, if present.
     */
    public java.lang.String getUrlFragment() {
        return urlFragment;
    }

    /**
     * HTTP request method.
     */
    public java.lang.String getMethod() {
        return method;
    }

    /**
     * HTTP request headers.
     */
    public org.openqa.selenium.devtools.network.model.Headers getHeaders() {
        return headers;
    }

    /**
     * HTTP POST request data.
     */
    public java.lang.String getPostData() {
        return postData;
    }

    /**
     * True when the request has POST data. Note that postData might still be omitted when this flag is true when the data is too long.
     */
    public java.lang.Boolean getHasPostData() {
        return hasPostData;
    }

    /**
     * The mixed content type of the request.
     */
    public org.openqa.selenium.devtools.security.model.MixedContentType getMixedContentType() {
        return mixedContentType;
    }

    /**
     * Priority of the resource request at the time request is sent.
     */
    public org.openqa.selenium.devtools.network.model.ResourcePriority getInitialPriority() {
        return initialPriority;
    }

    /**
     * The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/
     */
    public ReferrerPolicy getReferrerPolicy() {
        return referrerPolicy;
    }

    /**
     * Whether is loaded via link preload.
     */
    public java.lang.Boolean getIsLinkPreload() {
        return isLinkPreload;
    }

    private static Request fromJson(JsonInput input) {
        java.lang.String url = null;
        java.lang.String urlFragment = null;
        java.lang.String method = null;
        org.openqa.selenium.devtools.network.model.Headers headers = null;
        java.lang.String postData = null;
        java.lang.Boolean hasPostData = null;
        org.openqa.selenium.devtools.security.model.MixedContentType mixedContentType = null;
        org.openqa.selenium.devtools.network.model.ResourcePriority initialPriority = null;
        ReferrerPolicy referrerPolicy = null;
        java.lang.Boolean isLinkPreload = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "urlFragment":
                    urlFragment = input.nextString();
                    break;
                case "method":
                    method = input.nextString();
                    break;
                case "headers":
                    headers = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                case "postData":
                    postData = input.nextString();
                    break;
                case "hasPostData":
                    hasPostData = input.nextBoolean();
                    break;
                case "mixedContentType":
                    mixedContentType = input.read(org.openqa.selenium.devtools.security.model.MixedContentType.class);
                    break;
                case "initialPriority":
                    initialPriority = input.read(org.openqa.selenium.devtools.network.model.ResourcePriority.class);
                    break;
                case "referrerPolicy":
                    referrerPolicy = ReferrerPolicy.fromString(input.nextString());
                    break;
                case "isLinkPreload":
                    isLinkPreload = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Request(url, urlFragment, method, headers, postData, hasPostData, mixedContentType, initialPriority, referrerPolicy, isLinkPreload);
    }
}
