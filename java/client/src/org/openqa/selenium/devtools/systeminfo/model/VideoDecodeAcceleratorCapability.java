package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Describes a supported video decoding profile with its associated minimum and
 * maximum resolutions.
 */
public class VideoDecodeAcceleratorCapability {

    private final java.lang.String profile;

    private final org.openqa.selenium.devtools.systeminfo.model.Size maxResolution;

    private final org.openqa.selenium.devtools.systeminfo.model.Size minResolution;

    public VideoDecodeAcceleratorCapability(java.lang.String profile, org.openqa.selenium.devtools.systeminfo.model.Size maxResolution, org.openqa.selenium.devtools.systeminfo.model.Size minResolution) {
        this.profile = java.util.Objects.requireNonNull(profile, "profile is required");
        this.maxResolution = java.util.Objects.requireNonNull(maxResolution, "maxResolution is required");
        this.minResolution = java.util.Objects.requireNonNull(minResolution, "minResolution is required");
    }

    /**
     * Video codec profile that is supported, e.g. VP9 Profile 2.
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
     * Minimum video dimensions in pixels supported for this |profile|.
     */
    public org.openqa.selenium.devtools.systeminfo.model.Size getMinResolution() {
        return minResolution;
    }

    private static VideoDecodeAcceleratorCapability fromJson(JsonInput input) {
        java.lang.String profile = null;
        org.openqa.selenium.devtools.systeminfo.model.Size maxResolution = null;
        org.openqa.selenium.devtools.systeminfo.model.Size minResolution = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "profile":
                    profile = input.nextString();
                    break;
                case "maxResolution":
                    maxResolution = input.read(org.openqa.selenium.devtools.systeminfo.model.Size.class);
                    break;
                case "minResolution":
                    minResolution = input.read(org.openqa.selenium.devtools.systeminfo.model.Size.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new VideoDecodeAcceleratorCapability(profile, maxResolution, minResolution);
    }
}
