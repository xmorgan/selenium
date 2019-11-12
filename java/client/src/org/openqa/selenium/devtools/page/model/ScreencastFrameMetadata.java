package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Screencast frame metadata.
 */
@org.openqa.selenium.Beta()
public class ScreencastFrameMetadata {

    private final java.lang.Number offsetTop;

    private final java.lang.Number pageScaleFactor;

    private final java.lang.Number deviceWidth;

    private final java.lang.Number deviceHeight;

    private final java.lang.Number scrollOffsetX;

    private final java.lang.Number scrollOffsetY;

    private final org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp;

    public ScreencastFrameMetadata(java.lang.Number offsetTop, java.lang.Number pageScaleFactor, java.lang.Number deviceWidth, java.lang.Number deviceHeight, java.lang.Number scrollOffsetX, java.lang.Number scrollOffsetY, org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp) {
        this.offsetTop = java.util.Objects.requireNonNull(offsetTop, "offsetTop is required");
        this.pageScaleFactor = java.util.Objects.requireNonNull(pageScaleFactor, "pageScaleFactor is required");
        this.deviceWidth = java.util.Objects.requireNonNull(deviceWidth, "deviceWidth is required");
        this.deviceHeight = java.util.Objects.requireNonNull(deviceHeight, "deviceHeight is required");
        this.scrollOffsetX = java.util.Objects.requireNonNull(scrollOffsetX, "scrollOffsetX is required");
        this.scrollOffsetY = java.util.Objects.requireNonNull(scrollOffsetY, "scrollOffsetY is required");
        this.timestamp = timestamp;
    }

    /**
     * Top offset in DIP.
     */
    public java.lang.Number getOffsetTop() {
        return offsetTop;
    }

    /**
     * Page scale factor.
     */
    public java.lang.Number getPageScaleFactor() {
        return pageScaleFactor;
    }

    /**
     * Device screen width in DIP.
     */
    public java.lang.Number getDeviceWidth() {
        return deviceWidth;
    }

    /**
     * Device screen height in DIP.
     */
    public java.lang.Number getDeviceHeight() {
        return deviceHeight;
    }

    /**
     * Position of horizontal scroll in CSS pixels.
     */
    public java.lang.Number getScrollOffsetX() {
        return scrollOffsetX;
    }

    /**
     * Position of vertical scroll in CSS pixels.
     */
    public java.lang.Number getScrollOffsetY() {
        return scrollOffsetY;
    }

    /**
     * Frame swap timestamp.
     */
    public org.openqa.selenium.devtools.network.model.TimeSinceEpoch getTimestamp() {
        return timestamp;
    }

    private static ScreencastFrameMetadata fromJson(JsonInput input) {
        java.lang.Number offsetTop = null;
        java.lang.Number pageScaleFactor = null;
        java.lang.Number deviceWidth = null;
        java.lang.Number deviceHeight = null;
        java.lang.Number scrollOffsetX = null;
        java.lang.Number scrollOffsetY = null;
        org.openqa.selenium.devtools.network.model.TimeSinceEpoch timestamp = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "offsetTop":
                    offsetTop = input.nextNumber();
                    break;
                case "pageScaleFactor":
                    pageScaleFactor = input.nextNumber();
                    break;
                case "deviceWidth":
                    deviceWidth = input.nextNumber();
                    break;
                case "deviceHeight":
                    deviceHeight = input.nextNumber();
                    break;
                case "scrollOffsetX":
                    scrollOffsetX = input.nextNumber();
                    break;
                case "scrollOffsetY":
                    scrollOffsetY = input.nextNumber();
                    break;
                case "timestamp":
                    timestamp = input.read(org.openqa.selenium.devtools.network.model.TimeSinceEpoch.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ScreencastFrameMetadata(offsetTop, pageScaleFactor, deviceWidth, deviceHeight, scrollOffsetX, scrollOffsetY, timestamp);
    }
}
