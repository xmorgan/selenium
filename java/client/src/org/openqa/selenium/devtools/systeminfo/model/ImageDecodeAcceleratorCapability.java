package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Describes a supported image decoding profile with its associated minimum and
 * maximum resolutions and subsampling.
 */
public class ImageDecodeAcceleratorCapability {

    private final org.openqa.selenium.devtools.systeminfo.model.ImageType imageType;

    private final org.openqa.selenium.devtools.systeminfo.model.Size maxDimensions;

    private final org.openqa.selenium.devtools.systeminfo.model.Size minDimensions;

    private final java.util.List<org.openqa.selenium.devtools.systeminfo.model.SubsamplingFormat> subsamplings;

    public ImageDecodeAcceleratorCapability(org.openqa.selenium.devtools.systeminfo.model.ImageType imageType, org.openqa.selenium.devtools.systeminfo.model.Size maxDimensions, org.openqa.selenium.devtools.systeminfo.model.Size minDimensions, java.util.List<org.openqa.selenium.devtools.systeminfo.model.SubsamplingFormat> subsamplings) {
        this.imageType = java.util.Objects.requireNonNull(imageType, "imageType is required");
        this.maxDimensions = java.util.Objects.requireNonNull(maxDimensions, "maxDimensions is required");
        this.minDimensions = java.util.Objects.requireNonNull(minDimensions, "minDimensions is required");
        this.subsamplings = java.util.Objects.requireNonNull(subsamplings, "subsamplings is required");
    }

    /**
     * Image coded, e.g. Jpeg.
     */
    public org.openqa.selenium.devtools.systeminfo.model.ImageType getImageType() {
        return imageType;
    }

    /**
     * Maximum supported dimensions of the image in pixels.
     */
    public org.openqa.selenium.devtools.systeminfo.model.Size getMaxDimensions() {
        return maxDimensions;
    }

    /**
     * Minimum supported dimensions of the image in pixels.
     */
    public org.openqa.selenium.devtools.systeminfo.model.Size getMinDimensions() {
        return minDimensions;
    }

    /**
     * Optional array of supported subsampling formats, e.g. 4:2:0, if known.
     */
    public java.util.List<org.openqa.selenium.devtools.systeminfo.model.SubsamplingFormat> getSubsamplings() {
        return subsamplings;
    }

    private static ImageDecodeAcceleratorCapability fromJson(JsonInput input) {
        org.openqa.selenium.devtools.systeminfo.model.ImageType imageType = null;
        org.openqa.selenium.devtools.systeminfo.model.Size maxDimensions = null;
        org.openqa.selenium.devtools.systeminfo.model.Size minDimensions = null;
        java.util.List<org.openqa.selenium.devtools.systeminfo.model.SubsamplingFormat> subsamplings = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "imageType":
                    imageType = input.read(org.openqa.selenium.devtools.systeminfo.model.ImageType.class);
                    break;
                case "maxDimensions":
                    maxDimensions = input.read(org.openqa.selenium.devtools.systeminfo.model.Size.class);
                    break;
                case "minDimensions":
                    minDimensions = input.read(org.openqa.selenium.devtools.systeminfo.model.Size.class);
                    break;
                case "subsamplings":
                    subsamplings = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.systeminfo.model.SubsamplingFormat>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ImageDecodeAcceleratorCapability(imageType, maxDimensions, minDimensions, subsamplings);
    }
}
