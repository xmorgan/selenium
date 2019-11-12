package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Describes a single graphics processor (GPU).
 */
public class GPUDevice {

    private final java.lang.Number vendorId;

    private final java.lang.Number deviceId;

    private final java.lang.String vendorString;

    private final java.lang.String deviceString;

    private final java.lang.String driverVendor;

    private final java.lang.String driverVersion;

    public GPUDevice(java.lang.Number vendorId, java.lang.Number deviceId, java.lang.String vendorString, java.lang.String deviceString, java.lang.String driverVendor, java.lang.String driverVersion) {
        this.vendorId = java.util.Objects.requireNonNull(vendorId, "vendorId is required");
        this.deviceId = java.util.Objects.requireNonNull(deviceId, "deviceId is required");
        this.vendorString = java.util.Objects.requireNonNull(vendorString, "vendorString is required");
        this.deviceString = java.util.Objects.requireNonNull(deviceString, "deviceString is required");
        this.driverVendor = java.util.Objects.requireNonNull(driverVendor, "driverVendor is required");
        this.driverVersion = java.util.Objects.requireNonNull(driverVersion, "driverVersion is required");
    }

    /**
     * PCI ID of the GPU vendor, if available; 0 otherwise.
     */
    public java.lang.Number getVendorId() {
        return vendorId;
    }

    /**
     * PCI ID of the GPU device, if available; 0 otherwise.
     */
    public java.lang.Number getDeviceId() {
        return deviceId;
    }

    /**
     * String description of the GPU vendor, if the PCI ID is not available.
     */
    public java.lang.String getVendorString() {
        return vendorString;
    }

    /**
     * String description of the GPU device, if the PCI ID is not available.
     */
    public java.lang.String getDeviceString() {
        return deviceString;
    }

    /**
     * String description of the GPU driver vendor.
     */
    public java.lang.String getDriverVendor() {
        return driverVendor;
    }

    /**
     * String description of the GPU driver version.
     */
    public java.lang.String getDriverVersion() {
        return driverVersion;
    }

    private static GPUDevice fromJson(JsonInput input) {
        java.lang.Number vendorId = null;
        java.lang.Number deviceId = null;
        java.lang.String vendorString = null;
        java.lang.String deviceString = null;
        java.lang.String driverVendor = null;
        java.lang.String driverVersion = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "vendorId":
                    vendorId = input.nextNumber();
                    break;
                case "deviceId":
                    deviceId = input.nextNumber();
                    break;
                case "vendorString":
                    vendorString = input.nextString();
                    break;
                case "deviceString":
                    deviceString = input.nextString();
                    break;
                case "driverVendor":
                    driverVendor = input.nextString();
                    break;
                case "driverVersion":
                    driverVersion = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new GPUDevice(vendorId, deviceId, vendorString, deviceString, driverVendor, driverVersion);
    }
}
