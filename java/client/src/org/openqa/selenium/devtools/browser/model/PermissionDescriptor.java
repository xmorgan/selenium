package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Definition of PermissionDescriptor defined in the Permissions API:
 * https://w3c.github.io/permissions/#dictdef-permissiondescriptor.
 */
@org.openqa.selenium.Beta()
public class PermissionDescriptor {

    private final java.lang.String name;

    private final java.lang.Boolean sysex;

    private final java.lang.Boolean userVisibleOnly;

    private final java.lang.String type;

    public PermissionDescriptor(java.lang.String name, java.lang.Boolean sysex, java.lang.Boolean userVisibleOnly, java.lang.String type) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.sysex = sysex;
        this.userVisibleOnly = userVisibleOnly;
        this.type = type;
    }

    /**
     * Name of permission.
     * See https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl for valid permission names.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * For "midi" permission, may also specify sysex control.
     */
    public java.lang.Boolean getSysex() {
        return sysex;
    }

    /**
     * For "push" permission, may specify userVisibleOnly.
     * Note that userVisibleOnly = true is the only currently supported type.
     */
    public java.lang.Boolean getUserVisibleOnly() {
        return userVisibleOnly;
    }

    /**
     * For "wake-lock" permission, must specify type as either "screen" or "system".
     */
    public java.lang.String getType() {
        return type;
    }

    private static PermissionDescriptor fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.Boolean sysex = null;
        java.lang.Boolean userVisibleOnly = null;
        java.lang.String type = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "sysex":
                    sysex = input.nextBoolean();
                    break;
                case "userVisibleOnly":
                    userVisibleOnly = input.nextBoolean();
                    break;
                case "type":
                    type = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PermissionDescriptor(name, sysex, userVisibleOnly, type);
    }
}
