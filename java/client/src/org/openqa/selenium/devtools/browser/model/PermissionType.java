package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public enum PermissionType {

    ACCESSIBILITYEVENTS("accessibilityEvents"),
    AUDIOCAPTURE("audioCapture"),
    BACKGROUNDSYNC("backgroundSync"),
    BACKGROUNDFETCH("backgroundFetch"),
    CLIPBOARDREAD("clipboardRead"),
    CLIPBOARDWRITE("clipboardWrite"),
    DURABLESTORAGE("durableStorage"),
    FLASH("flash"),
    GEOLOCATION("geolocation"),
    MIDI("midi"),
    MIDISYSEX("midiSysex"),
    NOTIFICATIONS("notifications"),
    PAYMENTHANDLER("paymentHandler"),
    PERIODICBACKGROUNDSYNC("periodicBackgroundSync"),
    PROTECTEDMEDIAIDENTIFIER("protectedMediaIdentifier"),
    SENSORS("sensors"),
    VIDEOCAPTURE("videoCapture"),
    IDLEDETECTION("idleDetection"),
    WAKELOCKSCREEN("wakeLockScreen"),
    WAKELOCKSYSTEM("wakeLockSystem");

    private String value;

    PermissionType(String value) {
        this.value = value;
    }

    public static PermissionType fromString(String s) {
        return java.util.Arrays.stream(PermissionType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within PermissionType "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static PermissionType fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
