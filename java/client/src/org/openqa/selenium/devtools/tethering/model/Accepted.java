package org.openqa.selenium.devtools.tethering.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Informs that port was successfully bound and got a specified connection id.
 */
public class Accepted {

    private final java.lang.Integer port;

    private final java.lang.String connectionId;

    public Accepted(java.lang.Integer port, java.lang.String connectionId) {
        this.port = java.util.Objects.requireNonNull(port, "port is required");
        this.connectionId = java.util.Objects.requireNonNull(connectionId, "connectionId is required");
    }

    /**
     * Port number that was successfully bound.
     */
    public java.lang.Integer getPort() {
        return port;
    }

    /**
     * Connection id to be used.
     */
    public java.lang.String getConnectionId() {
        return connectionId;
    }

    private static Accepted fromJson(JsonInput input) {
        java.lang.Integer port = null;
        java.lang.String connectionId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "port":
                    port = input.nextNumber().intValue();
                    break;
                case "connectionId":
                    connectionId = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Accepted(port, connectionId);
    }
}
