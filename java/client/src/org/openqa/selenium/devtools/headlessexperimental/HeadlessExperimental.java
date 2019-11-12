package org.openqa.selenium.devtools.headlessexperimental;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain provides experimental commands only supported in headless mode.
 */
@Beta()
public class HeadlessExperimental {

    public static class BeginFrameResponse {

        private final java.lang.Boolean hasDamage;

        private final java.lang.String screenshotData;

        public BeginFrameResponse(java.lang.Boolean hasDamage, java.lang.String screenshotData) {
            this.hasDamage = java.util.Objects.requireNonNull(hasDamage, "hasDamage is required");
            this.screenshotData = java.util.Objects.requireNonNull(screenshotData, "screenshotData is required");
        }

        /**
         * Whether the BeginFrame resulted in damage and, thus, a new frame was committed to the
         * display. Reported for diagnostic uses, may be removed in the future.
         */
        public java.lang.Boolean getHasDamage() {
            return hasDamage;
        }

        /**
         * Base64-encoded image data of the screenshot, if one was requested and successfully taken.
         */
        public java.lang.String getScreenshotData() {
            return screenshotData;
        }

        private static BeginFrameResponse fromJson(JsonInput input) {
            java.lang.Boolean hasDamage = null;
            java.lang.String screenshotData = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "hasDamage":
                        hasDamage = input.nextBoolean();
                        break;
                    case "screenshotData":
                        screenshotData = input.nextString();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new BeginFrameResponse(hasDamage, screenshotData);
        }
    }

    /**
     * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
     * screenshot from the resulting frame. Requires that the target was created with enabled
     * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
     * https://goo.gl/3zHXhB for more background.
     */
    public static Command<org.openqa.selenium.devtools.headlessexperimental.HeadlessExperimental.BeginFrameResponse> beginFrame(java.util.Optional<java.lang.Number> frameTimeTicks, java.util.Optional<java.lang.Number> interval, java.util.Optional<java.lang.Boolean> noDisplayUpdates, java.util.Optional<org.openqa.selenium.devtools.headlessexperimental.model.ScreenshotParams> screenshot) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        frameTimeTicks.ifPresent(p -> params.put("frameTimeTicks", p));
        interval.ifPresent(p -> params.put("interval", p));
        noDisplayUpdates.ifPresent(p -> params.put("noDisplayUpdates", p));
        screenshot.ifPresent(p -> params.put("screenshot", p));
        return new Command<>("HeadlessExperimental.beginFrame", params.build(), input -> input.read(org.openqa.selenium.devtools.headlessexperimental.HeadlessExperimental.BeginFrameResponse.class));
    }

    /**
     * Disables headless events for the target.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeadlessExperimental.disable", params.build());
    }

    /**
     * Enables headless events for the target.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("HeadlessExperimental.enable", params.build());
    }

    public static Event<java.lang.Boolean> needsBeginFramesChanged() {
        return new Event<>("HeadlessExperimental.needsBeginFramesChanged", ConverterFunctions.map("needsBeginFrames", java.lang.Boolean.class));
    }
}
