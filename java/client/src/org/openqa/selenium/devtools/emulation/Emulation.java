package org.openqa.selenium.devtools.emulation;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain emulates different environments for the page.
 */
public class Emulation {

    /**
     * Tells whether emulation is supported.
     */
    public static Command<java.lang.Boolean> canEmulate() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Emulation.canEmulate", params.build(), ConverterFunctions.map("result", java.lang.Boolean.class));
    }

    /**
     * Clears the overriden device metrics.
     */
    public static Command<Void> clearDeviceMetricsOverride() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Emulation.clearDeviceMetricsOverride", params.build());
    }

    /**
     * Clears the overriden Geolocation Position and Error.
     */
    public static Command<Void> clearGeolocationOverride() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Emulation.clearGeolocationOverride", params.build());
    }

    /**
     * Requests that page scale factor is reset to initial values.
     */
    @Beta()
    public static Command<Void> resetPageScaleFactor() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Emulation.resetPageScaleFactor", params.build());
    }

    /**
     * Enables or disables simulating a focused and active page.
     */
    @Beta()
    public static Command<Void> setFocusEmulationEnabled(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Emulation.setFocusEmulationEnabled", params.build());
    }

    /**
     * Enables CPU throttling to emulate slow CPUs.
     */
    @Beta()
    public static Command<Void> setCPUThrottlingRate(java.lang.Number rate) {
        java.util.Objects.requireNonNull(rate, "rate is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("rate", rate);
        return new Command<>("Emulation.setCPUThrottlingRate", params.build());
    }

    /**
     * Sets or clears an override of the default background color of the frame. This override is used
     * if the content does not specify one.
     */
    public static Command<Void> setDefaultBackgroundColorOverride(java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> color) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        color.ifPresent(p -> params.put("color", p));
        return new Command<>("Emulation.setDefaultBackgroundColorOverride", params.build());
    }

    /**
     * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
     * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
     * query results).
     */
    public static Command<Void> setDeviceMetricsOverride(java.lang.Integer width, java.lang.Integer height, java.lang.Number deviceScaleFactor, java.lang.Boolean mobile, java.util.Optional<java.lang.Number> scale, java.util.Optional<java.lang.Integer> screenWidth, java.util.Optional<java.lang.Integer> screenHeight, java.util.Optional<java.lang.Integer> positionX, java.util.Optional<java.lang.Integer> positionY, java.util.Optional<java.lang.Boolean> dontSetVisibleSize, java.util.Optional<org.openqa.selenium.devtools.emulation.model.ScreenOrientation> screenOrientation, java.util.Optional<org.openqa.selenium.devtools.page.model.Viewport> viewport) {
        java.util.Objects.requireNonNull(width, "width is required");
        java.util.Objects.requireNonNull(height, "height is required");
        java.util.Objects.requireNonNull(deviceScaleFactor, "deviceScaleFactor is required");
        java.util.Objects.requireNonNull(mobile, "mobile is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("width", width);
        params.put("height", height);
        params.put("deviceScaleFactor", deviceScaleFactor);
        params.put("mobile", mobile);
        scale.ifPresent(p -> params.put("scale", p));
        screenWidth.ifPresent(p -> params.put("screenWidth", p));
        screenHeight.ifPresent(p -> params.put("screenHeight", p));
        positionX.ifPresent(p -> params.put("positionX", p));
        positionY.ifPresent(p -> params.put("positionY", p));
        dontSetVisibleSize.ifPresent(p -> params.put("dontSetVisibleSize", p));
        screenOrientation.ifPresent(p -> params.put("screenOrientation", p));
        viewport.ifPresent(p -> params.put("viewport", p));
        return new Command<>("Emulation.setDeviceMetricsOverride", params.build());
    }

    @Beta()
    public static Command<Void> setScrollbarsHidden(java.lang.Boolean hidden) {
        java.util.Objects.requireNonNull(hidden, "hidden is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("hidden", hidden);
        return new Command<>("Emulation.setScrollbarsHidden", params.build());
    }

    @Beta()
    public static Command<Void> setDocumentCookieDisabled(java.lang.Boolean disabled) {
        java.util.Objects.requireNonNull(disabled, "disabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("disabled", disabled);
        return new Command<>("Emulation.setDocumentCookieDisabled", params.build());
    }

    public enum SetEmitTouchEventsForMouseConfiguration {

        MOBILE("mobile"), DESKTOP("desktop");

        private String value;

        SetEmitTouchEventsForMouseConfiguration(String value) {
            this.value = value;
        }

        public static SetEmitTouchEventsForMouseConfiguration fromString(String s) {
            return java.util.Arrays.stream(SetEmitTouchEventsForMouseConfiguration.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetEmitTouchEventsForMouseConfiguration "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetEmitTouchEventsForMouseConfiguration fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    @Beta()
    public static Command<Void> setEmitTouchEventsForMouse(java.lang.Boolean enabled, java.util.Optional<SetEmitTouchEventsForMouseConfiguration> configuration) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        configuration.ifPresent(p -> params.put("configuration", p));
        return new Command<>("Emulation.setEmitTouchEventsForMouse", params.build());
    }

    /**
     * Emulates the given media for CSS media queries.
     */
    public static Command<Void> setEmulatedMedia(java.lang.String media) {
        java.util.Objects.requireNonNull(media, "media is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("media", media);
        return new Command<>("Emulation.setEmulatedMedia", params.build());
    }

    /**
     * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
     * unavailable.
     */
    public static Command<Void> setGeolocationOverride(java.util.Optional<java.lang.Number> latitude, java.util.Optional<java.lang.Number> longitude, java.util.Optional<java.lang.Number> accuracy) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        latitude.ifPresent(p -> params.put("latitude", p));
        longitude.ifPresent(p -> params.put("longitude", p));
        accuracy.ifPresent(p -> params.put("accuracy", p));
        return new Command<>("Emulation.setGeolocationOverride", params.build());
    }

    /**
     * Overrides value returned by the javascript navigator object.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> setNavigatorOverrides(java.lang.String platform) {
        java.util.Objects.requireNonNull(platform, "platform is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("platform", platform);
        return new Command<>("Emulation.setNavigatorOverrides", params.build());
    }

    /**
     * Sets a specified page scale factor.
     */
    @Beta()
    public static Command<Void> setPageScaleFactor(java.lang.Number pageScaleFactor) {
        java.util.Objects.requireNonNull(pageScaleFactor, "pageScaleFactor is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("pageScaleFactor", pageScaleFactor);
        return new Command<>("Emulation.setPageScaleFactor", params.build());
    }

    /**
     * Switches script execution in the page.
     */
    public static Command<Void> setScriptExecutionDisabled(java.lang.Boolean value) {
        java.util.Objects.requireNonNull(value, "value is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("value", value);
        return new Command<>("Emulation.setScriptExecutionDisabled", params.build());
    }

    /**
     * Enables touch on platforms which do not support them.
     */
    public static Command<Void> setTouchEmulationEnabled(java.lang.Boolean enabled, java.util.Optional<java.lang.Integer> maxTouchPoints) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        maxTouchPoints.ifPresent(p -> params.put("maxTouchPoints", p));
        return new Command<>("Emulation.setTouchEmulationEnabled", params.build());
    }

    /**
     * Turns on virtual time for all frames (replacing real-time with a synthetic time source) and sets
     * the current virtual time policy.  Note this supersedes any previous time budget.
     */
    @Beta()
    public static Command<java.lang.Number> setVirtualTimePolicy(org.openqa.selenium.devtools.emulation.model.VirtualTimePolicy policy, java.util.Optional<java.lang.Number> budget, java.util.Optional<java.lang.Integer> maxVirtualTimeTaskStarvationCount, java.util.Optional<java.lang.Boolean> waitForNavigation, java.util.Optional<org.openqa.selenium.devtools.network.model.TimeSinceEpoch> initialVirtualTime) {
        java.util.Objects.requireNonNull(policy, "policy is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("policy", policy);
        budget.ifPresent(p -> params.put("budget", p));
        maxVirtualTimeTaskStarvationCount.ifPresent(p -> params.put("maxVirtualTimeTaskStarvationCount", p));
        waitForNavigation.ifPresent(p -> params.put("waitForNavigation", p));
        initialVirtualTime.ifPresent(p -> params.put("initialVirtualTime", p));
        return new Command<>("Emulation.setVirtualTimePolicy", params.build(), ConverterFunctions.map("virtualTimeTicksBase", java.lang.Number.class));
    }

    /**
     * Overrides default host system timezone with the specified one.
     */
    @Beta()
    public static Command<Void> setTimezoneOverride(java.lang.String timezoneId) {
        java.util.Objects.requireNonNull(timezoneId, "timezoneId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("timezoneId", timezoneId);
        return new Command<>("Emulation.setTimezoneOverride", params.build());
    }

    /**
     * Resizes the frame/viewport of the page. Note that this does not affect the frame's container
     * (e.g. browser window). Can be used to produce screenshots of the specified size. Not supported
     * on Android.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> setVisibleSize(java.lang.Integer width, java.lang.Integer height) {
        java.util.Objects.requireNonNull(width, "width is required");
        java.util.Objects.requireNonNull(height, "height is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("width", width);
        params.put("height", height);
        return new Command<>("Emulation.setVisibleSize", params.build());
    }

    /**
     * Allows overriding user agent with the given string.
     */
    public static Command<Void> setUserAgentOverride(java.lang.String userAgent, java.util.Optional<java.lang.String> acceptLanguage, java.util.Optional<java.lang.String> platform) {
        java.util.Objects.requireNonNull(userAgent, "userAgent is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("userAgent", userAgent);
        acceptLanguage.ifPresent(p -> params.put("acceptLanguage", p));
        platform.ifPresent(p -> params.put("platform", p));
        return new Command<>("Emulation.setUserAgentOverride", params.build());
    }

    public static Event<Void> virtualTimeBudgetExpired() {
        return new Event<>("Emulation.virtualTimeBudgetExpired", input -> null);
    }
}
