package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Authorization challenge for HTTP status code 401 or 407.
 */
@org.openqa.selenium.Beta()
public class AuthChallenge {

    public enum Source {

        SERVER("Server"), PROXY("Proxy");

        private String value;

        Source(String value) {
            this.value = value;
        }

        public static Source fromString(String s) {
            return java.util.Arrays.stream(Source.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Source "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Source fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final Source source;

    private final java.lang.String origin;

    private final java.lang.String scheme;

    private final java.lang.String realm;

    public AuthChallenge(Source source, java.lang.String origin, java.lang.String scheme, java.lang.String realm) {
        this.source = source;
        this.origin = java.util.Objects.requireNonNull(origin, "origin is required");
        this.scheme = java.util.Objects.requireNonNull(scheme, "scheme is required");
        this.realm = java.util.Objects.requireNonNull(realm, "realm is required");
    }

    /**
     * Source of the authentication challenge.
     */
    public Source getSource() {
        return source;
    }

    /**
     * Origin of the challenger.
     */
    public java.lang.String getOrigin() {
        return origin;
    }

    /**
     * The authentication scheme used, such as basic or digest
     */
    public java.lang.String getScheme() {
        return scheme;
    }

    /**
     * The realm of the challenge. May be empty.
     */
    public java.lang.String getRealm() {
        return realm;
    }

    private static AuthChallenge fromJson(JsonInput input) {
        Source source = null;
        java.lang.String origin = null;
        java.lang.String scheme = null;
        java.lang.String realm = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "source":
                    source = Source.fromString(input.nextString());
                    break;
                case "origin":
                    origin = input.nextString();
                    break;
                case "scheme":
                    scheme = input.nextString();
                    break;
                case "realm":
                    realm = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AuthChallenge(source, origin, scheme, realm);
    }
}
