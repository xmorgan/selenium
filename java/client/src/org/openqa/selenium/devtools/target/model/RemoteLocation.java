package org.openqa.selenium.devtools.target.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class RemoteLocation {

    private final java.lang.String host;

    private final java.lang.Integer port;

    public RemoteLocation(java.lang.String host, java.lang.Integer port) {
        this.host = java.util.Objects.requireNonNull(host, "host is required");
        this.port = java.util.Objects.requireNonNull(port, "port is required");
    }

    public java.lang.String getHost() {
        return host;
    }

    public java.lang.Integer getPort() {
        return port;
    }

    private static RemoteLocation fromJson(JsonInput input) {
        java.lang.String host = null;
        java.lang.Integer port = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "host":
                    host = input.nextString();
                    break;
                case "port":
                    port = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RemoteLocation(host, port);
    }
}
