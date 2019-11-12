package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * WebSocket request data.
 */
public class WebSocketRequest {

    private final org.openqa.selenium.devtools.network.model.Headers headers;

    public WebSocketRequest(org.openqa.selenium.devtools.network.model.Headers headers) {
        this.headers = java.util.Objects.requireNonNull(headers, "headers is required");
    }

    /**
     * HTTP request headers.
     */
    public org.openqa.selenium.devtools.network.model.Headers getHeaders() {
        return headers;
    }

    private static WebSocketRequest fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.Headers headers = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "headers":
                    headers = input.read(org.openqa.selenium.devtools.network.model.Headers.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketRequest(headers);
    }
}
