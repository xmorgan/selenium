package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Provides information about the GPU(s) on the system.
 */
public class GPUInfo {

    private final java.util.List<org.openqa.selenium.devtools.systeminfo.model.GPUDevice> devices;

    private final java.util.Map<String, Object> auxAttributes;

    private final java.util.Map<String, Object> featureStatus;

    private final java.util.List<java.lang.String> driverBugWorkarounds;

    private final java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoDecodeAcceleratorCapability> videoDecoding;

    private final java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoEncodeAcceleratorCapability> videoEncoding;

    private final java.util.List<org.openqa.selenium.devtools.systeminfo.model.ImageDecodeAcceleratorCapability> imageDecoding;

    public GPUInfo(java.util.List<org.openqa.selenium.devtools.systeminfo.model.GPUDevice> devices, java.util.Map<String, Object> auxAttributes, java.util.Map<String, Object> featureStatus, java.util.List<java.lang.String> driverBugWorkarounds, java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoDecodeAcceleratorCapability> videoDecoding, java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoEncodeAcceleratorCapability> videoEncoding, java.util.List<org.openqa.selenium.devtools.systeminfo.model.ImageDecodeAcceleratorCapability> imageDecoding) {
        this.devices = java.util.Objects.requireNonNull(devices, "devices is required");
        this.auxAttributes = auxAttributes;
        this.featureStatus = featureStatus;
        this.driverBugWorkarounds = java.util.Objects.requireNonNull(driverBugWorkarounds, "driverBugWorkarounds is required");
        this.videoDecoding = java.util.Objects.requireNonNull(videoDecoding, "videoDecoding is required");
        this.videoEncoding = java.util.Objects.requireNonNull(videoEncoding, "videoEncoding is required");
        this.imageDecoding = java.util.Objects.requireNonNull(imageDecoding, "imageDecoding is required");
    }

    /**
     * The graphics devices on the system. Element 0 is the primary GPU.
     */
    public java.util.List<org.openqa.selenium.devtools.systeminfo.model.GPUDevice> getDevices() {
        return devices;
    }

    /**
     * An optional dictionary of additional GPU related attributes.
     */
    public java.util.Map<String, Object> getAuxAttributes() {
        return auxAttributes;
    }

    /**
     * An optional dictionary of graphics features and their status.
     */
    public java.util.Map<String, Object> getFeatureStatus() {
        return featureStatus;
    }

    /**
     * An optional array of GPU driver bug workarounds.
     */
    public java.util.List<java.lang.String> getDriverBugWorkarounds() {
        return driverBugWorkarounds;
    }

    /**
     * Supported accelerated video decoding capabilities.
     */
    public java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoDecodeAcceleratorCapability> getVideoDecoding() {
        return videoDecoding;
    }

    /**
     * Supported accelerated video encoding capabilities.
     */
    public java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoEncodeAcceleratorCapability> getVideoEncoding() {
        return videoEncoding;
    }

    /**
     * Supported accelerated image decoding capabilities.
     */
    public java.util.List<org.openqa.selenium.devtools.systeminfo.model.ImageDecodeAcceleratorCapability> getImageDecoding() {
        return imageDecoding;
    }

    private static GPUInfo fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.systeminfo.model.GPUDevice> devices = null;
        java.util.Map<String, Object> auxAttributes = null;
        java.util.Map<String, Object> featureStatus = null;
        java.util.List<java.lang.String> driverBugWorkarounds = null;
        java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoDecodeAcceleratorCapability> videoDecoding = null;
        java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoEncodeAcceleratorCapability> videoEncoding = null;
        java.util.List<org.openqa.selenium.devtools.systeminfo.model.ImageDecodeAcceleratorCapability> imageDecoding = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "devices":
                    devices = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.systeminfo.model.GPUDevice>>() {
                    }.getType());
                    break;
                case "auxAttributes":
                    auxAttributes = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "featureStatus":
                    featureStatus = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "driverBugWorkarounds":
                    driverBugWorkarounds = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                case "videoDecoding":
                    videoDecoding = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoDecodeAcceleratorCapability>>() {
                    }.getType());
                    break;
                case "videoEncoding":
                    videoEncoding = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.systeminfo.model.VideoEncodeAcceleratorCapability>>() {
                    }.getType());
                    break;
                case "imageDecoding":
                    imageDecoding = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.systeminfo.model.ImageDecodeAcceleratorCapability>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new GPUInfo(devices, auxAttributes, featureStatus, driverBugWorkarounds, videoDecoding, videoEncoding, imageDecoding);
    }
}
