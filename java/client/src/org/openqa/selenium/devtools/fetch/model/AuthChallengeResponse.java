package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Response to an AuthChallenge.
 */
@org.openqa.selenium.Beta()
public class AuthChallengeResponse {

    public enum Response {

        DEFAULT("Default"), CANCELAUTH("CancelAuth"), PROVIDECREDENTIALS("ProvideCredentials");

        private String value;

        Response(String value) {
            this.value = value;
        }

        public static Response fromString(String s) {
            return java.util.Arrays.stream(Response.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Response "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Response fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final Response response;

    private final java.lang.String username;

    private final java.lang.String password;

    public AuthChallengeResponse(Response response, java.lang.String username, java.lang.String password) {
        this.response = java.util.Objects.requireNonNull(response, "response is required");
        this.username = username;
        this.password = password;
    }

    /**
     * The decision on what to do in response to the authorization challenge.  Default means
     * deferring to the default behavior of the net stack, which will likely either the Cancel
     * authentication or display a popup dialog box.
     */
    public Response getResponse() {
        return response;
    }

    /**
     * The username to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    public java.lang.String getUsername() {
        return username;
    }

    /**
     * The password to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    public java.lang.String getPassword() {
        return password;
    }

    private static AuthChallengeResponse fromJson(JsonInput input) {
        Response response = null;
        java.lang.String username = null;
        java.lang.String password = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "response":
                    response = Response.fromString(input.nextString());
                    break;
                case "username":
                    username = input.nextString();
                    break;
                case "password":
                    password = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AuthChallengeResponse(response, username, password);
    }
}
