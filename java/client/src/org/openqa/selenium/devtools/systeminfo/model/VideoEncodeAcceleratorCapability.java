package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Describes a supported video encoding profile with its associated maximum
 * resolution and maximum framerate.
 */
public class VideoEncodeAcceleratorCapability {

    private final java.lang.String profile;

    private final org.openqa.selenium.devtools.systeminfo.model.Size maxResolution;

    private final java.lang.Integer maxFramerateNumerator;

    private final java.lang.Integer maxFramerateDenominator;

    public VideoEncodeAcceleratorCapability(java.lang.String profile, org.openqa.selenium.devtools.systeminfo.model.Size maxResolution, java.lang.Integer maxFramerateNumerator, java.lang.Integer maxFramerateDenominator) {
        this.profile = java.util.Objects.requireNonNull(profile, "profile is required");
        this.maxResolution = java.util.Objects.requireNonNull(maxResolution, "maxResolution is required");
        this.maxFramerateNumerator = java.util.Objects.requireNonNull(maxFramerateNumerator, "maxFramerateNumerator is required");
        this.maxFramerateDenominator = java.util.Objects.requireNonNull(maxFramerateDenominator, "maxFramerateDenominator is required");
    }

    /**
     * Video codec profile that is supported, e.g H264 Main.
     */
    public java.lang.String getProfile() {
        return profile;
    }

    /**
     * Maximum video dimensions in pixels supported for this |profile|.
     */
    public org.openqa.selenium.devtools.systeminfo.model.Size getMaxResolution() {
        return maxResolution;
    }

    /**
     * Maximum encoding framerate in frames per second supported for this
     * |profile|, as fraction's numerator and denominator, e.g. 24/1 fps,
     * 24000/1001 fps, etc.
     */
    public java.lang.Integer getMaxFramerateNumerator() {
        return maxFramerateNumerator;
    }

    public java.lang.Integer getMaxFramerateDenominator() {
        return maxFramerateDenominator;
    }

    private static VideoEncodeAcceleratorCapability fromJson(JsonInput input) {
        java.lang.String profile = null;
        org.openqa.selenium.devtools.systeminfo.model.Size maxResolution = null;
        java.lang.Integer maxFramerateNumerator = null;
        java.lang.Integer maxFramerateDenominator = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "profile":
                    profile = input.nextString();
                    break;
                case "maxResolution":
                    maxResolution = input.read(org.openqa.selenium.devtools.systeminfo.model.Size.class);
                    break;
                case "maxFramerateNumerator":
                    maxFramerateNumerator = input.nextNumber().intValue();
                    break;
                case "maxFramerateDenominator":
                    maxFramerateDenominator = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new VideoEncodeAcceleratorCapability(profile, maxResolution, maxFramerateNumerator, maxFramerateDenominator);
    }
}
