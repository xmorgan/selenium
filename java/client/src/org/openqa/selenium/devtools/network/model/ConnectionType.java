package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * The underlying connection technology that the browser is supposedly using.
 */
public enum ConnectionType {

    NONE("none"),
    CELLULAR2G("cellular2g"),
    CELLULAR3G("cellular3g"),
    CELLULAR4G("cellular4g"),
    BLUETOOTH("bluetooth"),
    ETHERNET("ethernet"),
    WIFI("wifi"),
    WIMAX("wimax"),
    OTHER("other");

    private String value;

    ConnectionType(String value) {
        this.value = value;
    }

    public static ConnectionType fromString(String s) {
        return java.util.Arrays.stream(ConnectionType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ConnectionType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static ConnectionType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
