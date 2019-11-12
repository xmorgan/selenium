package org.openqa.selenium.devtools.storage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Enum of possible storage types.
 */
public enum StorageType {

    APPCACHE("appcache"),
    COOKIES("cookies"),
    FILE_SYSTEMS("file_systems"),
    INDEXEDDB("indexeddb"),
    LOCAL_STORAGE("local_storage"),
    SHADER_CACHE("shader_cache"),
    WEBSQL("websql"),
    SERVICE_WORKERS("service_workers"),
    CACHE_STORAGE("cache_storage"),
    ALL("all"),
    OTHER("other");

    private String value;

    StorageType(String value) {
        this.value = value;
    }

    public static StorageType fromString(String s) {
        return java.util.Arrays.stream(StorageType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within StorageType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static StorageType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
