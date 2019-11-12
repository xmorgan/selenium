package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when frame schedules a potential navigation.
 */
@java.lang.Deprecated()
public class FrameScheduledNavigation {

    public enum Reason {

        FORMSUBMISSIONGET("formSubmissionGet"),
        FORMSUBMISSIONPOST("formSubmissionPost"),
        HTTPHEADERREFRESH("httpHeaderRefresh"),
        SCRIPTINITIATED("scriptInitiated"),
        METATAGREFRESH("metaTagRefresh"),
        PAGEBLOCKINTERSTITIAL("pageBlockInterstitial"),
        RELOAD("reload");

        private String value;

        Reason(String value) {
            this.value = value;
        }

        public static Reason fromString(String s) {
            return java.util.Arrays.stream(Reason.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Reason "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Reason fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final org.openqa.selenium.devtools.page.model.FrameId frameId;

    private final java.lang.Number delay;

    private final Reason reason;

    private final java.lang.String url;

    public FrameScheduledNavigation(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.Number delay, Reason reason, java.lang.String url) {
        this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
        this.delay = java.util.Objects.requireNonNull(delay, "delay is required");
        this.reason = java.util.Objects.requireNonNull(reason, "reason is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
    }

    /**
     * Id of the frame that has scheduled a navigation.
     */
    public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
        return frameId;
    }

    /**
     * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not
     * guaranteed to start.
     */
    public java.lang.Number getDelay() {
        return delay;
    }

    /**
     * The reason for the navigation.
     */
    public Reason getReason() {
        return reason;
    }

    /**
     * The destination URL for the scheduled navigation.
     */
    public java.lang.String getUrl() {
        return url;
    }

    private static FrameScheduledNavigation fromJson(JsonInput input) {
        org.openqa.selenium.devtools.page.model.FrameId frameId = null;
        java.lang.Number delay = null;
        Reason reason = null;
        java.lang.String url = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "frameId":
                    frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                    break;
                case "delay":
                    delay = input.nextNumber();
                    break;
                case "reason":
                    reason = Reason.fromString(input.nextString());
                    break;
                case "url":
                    url = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FrameScheduledNavigation(frameId, delay, reason, url);
    }
}
