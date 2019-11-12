package org.openqa.selenium.devtools.browser;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * The Browser domain defines methods and events for browser managing.
 */
public class Browser {

    /**
     * Set permission settings for given origin.
     */
    @Beta()
    public static Command<Void> setPermission(java.lang.String origin, org.openqa.selenium.devtools.browser.model.PermissionDescriptor permission, org.openqa.selenium.devtools.browser.model.PermissionSetting setting, java.util.Optional<org.openqa.selenium.devtools.target.model.TargetID> browserContextId) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        java.util.Objects.requireNonNull(permission, "permission is required");
        java.util.Objects.requireNonNull(setting, "setting is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        params.put("permission", permission);
        params.put("setting", setting);
        browserContextId.ifPresent(p -> params.put("browserContextId", p));
        return new Command<>("Browser.setPermission", params.build());
    }

    /**
     * Grant specific permissions to the given origin and reject all others.
     */
    @Beta()
    public static Command<Void> grantPermissions(java.lang.String origin, java.util.List<org.openqa.selenium.devtools.browser.model.PermissionType> permissions, java.util.Optional<org.openqa.selenium.devtools.target.model.BrowserContextID> browserContextId) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        java.util.Objects.requireNonNull(permissions, "permissions is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        params.put("permissions", permissions);
        browserContextId.ifPresent(p -> params.put("browserContextId", p));
        return new Command<>("Browser.grantPermissions", params.build());
    }

    /**
     * Reset all permission management for all origins.
     */
    @Beta()
    public static Command<Void> resetPermissions(java.util.Optional<org.openqa.selenium.devtools.target.model.BrowserContextID> browserContextId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        browserContextId.ifPresent(p -> params.put("browserContextId", p));
        return new Command<>("Browser.resetPermissions", params.build());
    }

    /**
     * Close browser gracefully.
     */
    public static Command<Void> close() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Browser.close", params.build());
    }

    /**
     * Crashes browser on the main thread.
     */
    @Beta()
    public static Command<Void> crash() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Browser.crash", params.build());
    }

    /**
     * Crashes GPU process.
     */
    @Beta()
    public static Command<Void> crashGpuProcess() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Browser.crashGpuProcess", params.build());
    }

    public static class GetVersionResponse {

        private final java.lang.String protocolVersion;

        private final java.lang.String product;

        private final java.lang.String revision;

        private final java.lang.String userAgent;

        private final java.lang.String jsVersion;

        public GetVersionResponse(java.lang.String protocolVersion, java.lang.String product, java.lang.String revision, java.lang.String userAgent, java.lang.String jsVersion) {
            this.protocolVersion = java.util.Objects.requireNonNull(protocolVersion, "protocolVersion is required");
            this.product = java.util.Objects.requireNonNull(product, "product is required");
            this.revision = java.util.Objects.requireNonNull(revision, "revision is required");
            this.userAgent = java.util.Objects.requireNonNull(userAgent, "userAgent is required");
            this.jsVersion = java.util.Objects.requireNonNull(jsVersion, "jsVersion is required");
        }

        /**
         * Protocol version.
         */
        public java.lang.String getProtocolVersion() {
            return protocolVersion;
        }

        /**
         * Product name.
         */
        public java.lang.String getProduct() {
            return product;
        }

        /**
         * Product revision.
         */
        public java.lang.String getRevision() {
            return revision;
        }

        /**
         * User-Agent.
         */
        public java.lang.String getUserAgent() {
            return userAgent;
        }

        /**
         * V8 version.
         */
        public java.lang.String getJsVersion() {
            return jsVersion;
        }

        private static GetVersionResponse fromJson(JsonInput input) {
            java.lang.String protocolVersion = null;
            java.lang.String product = null;
            java.lang.String revision = null;
            java.lang.String userAgent = null;
            java.lang.String jsVersion = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "protocolVersion":
                        protocolVersion = input.nextString();
                        break;
                    case "product":
                        product = input.nextString();
                        break;
                    case "revision":
                        revision = input.nextString();
                        break;
                    case "userAgent":
                        userAgent = input.nextString();
                        break;
                    case "jsVersion":
                        jsVersion = input.nextString();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetVersionResponse(protocolVersion, product, revision, userAgent, jsVersion);
        }
    }

    /**
     * Returns version information.
     */
    public static Command<org.openqa.selenium.devtools.browser.Browser.GetVersionResponse> getVersion() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Browser.getVersion", params.build(), input -> input.read(org.openqa.selenium.devtools.browser.Browser.GetVersionResponse.class));
    }

    /**
     * Returns the command line switches for the browser process if, and only if
     * --enable-automation is on the commandline.
     */
    @Beta()
    public static Command<java.util.List<java.lang.String>> getBrowserCommandLine() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Browser.getBrowserCommandLine", params.build(), ConverterFunctions.map("arguments", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Get Chrome histograms.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.browser.model.Histogram>> getHistograms(java.util.Optional<java.lang.String> query, java.util.Optional<java.lang.Boolean> delta) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        query.ifPresent(p -> params.put("query", p));
        delta.ifPresent(p -> params.put("delta", p));
        return new Command<>("Browser.getHistograms", params.build(), ConverterFunctions.map("histograms", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.browser.model.Histogram>>() {
        }.getType()));
    }

    /**
     * Get a Chrome histogram by name.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.browser.model.Histogram> getHistogram(java.lang.String name, java.util.Optional<java.lang.Boolean> delta) {
        java.util.Objects.requireNonNull(name, "name is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("name", name);
        delta.ifPresent(p -> params.put("delta", p));
        return new Command<>("Browser.getHistogram", params.build(), ConverterFunctions.map("histogram", org.openqa.selenium.devtools.browser.model.Histogram.class));
    }

    /**
     * Get position and size of the browser window.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.browser.model.Bounds> getWindowBounds(org.openqa.selenium.devtools.browser.model.WindowID windowId) {
        java.util.Objects.requireNonNull(windowId, "windowId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("windowId", windowId);
        return new Command<>("Browser.getWindowBounds", params.build(), ConverterFunctions.map("bounds", org.openqa.selenium.devtools.browser.model.Bounds.class));
    }

    public static class GetWindowForTargetResponse {

        private final org.openqa.selenium.devtools.browser.model.WindowID windowId;

        private final org.openqa.selenium.devtools.browser.model.Bounds bounds;

        public GetWindowForTargetResponse(org.openqa.selenium.devtools.browser.model.WindowID windowId, org.openqa.selenium.devtools.browser.model.Bounds bounds) {
            this.windowId = java.util.Objects.requireNonNull(windowId, "windowId is required");
            this.bounds = java.util.Objects.requireNonNull(bounds, "bounds is required");
        }

        /**
         * Browser window id.
         */
        public org.openqa.selenium.devtools.browser.model.WindowID getWindowId() {
            return windowId;
        }

        /**
         * Bounds information of the window. When window state is 'minimized', the restored window
         * position and size are returned.
         */
        public org.openqa.selenium.devtools.browser.model.Bounds getBounds() {
            return bounds;
        }

        private static GetWindowForTargetResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.browser.model.WindowID windowId = null;
            org.openqa.selenium.devtools.browser.model.Bounds bounds = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "windowId":
                        windowId = input.read(org.openqa.selenium.devtools.browser.model.WindowID.class);
                        break;
                    case "bounds":
                        bounds = input.read(org.openqa.selenium.devtools.browser.model.Bounds.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetWindowForTargetResponse(windowId, bounds);
        }
    }

    /**
     * Get the browser window that contains the devtools target.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.browser.Browser.GetWindowForTargetResponse> getWindowForTarget(java.util.Optional<org.openqa.selenium.devtools.target.model.TargetID> targetId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        targetId.ifPresent(p -> params.put("targetId", p));
        return new Command<>("Browser.getWindowForTarget", params.build(), input -> input.read(org.openqa.selenium.devtools.browser.Browser.GetWindowForTargetResponse.class));
    }

    /**
     * Set position and/or size of the browser window.
     */
    @Beta()
    public static Command<Void> setWindowBounds(org.openqa.selenium.devtools.browser.model.WindowID windowId, org.openqa.selenium.devtools.browser.model.Bounds bounds) {
        java.util.Objects.requireNonNull(windowId, "windowId is required");
        java.util.Objects.requireNonNull(bounds, "bounds is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("windowId", windowId);
        params.put("bounds", bounds);
        return new Command<>("Browser.setWindowBounds", params.build());
    }

    /**
     * Set dock tile details, platform-specific.
     */
    @Beta()
    public static Command<Void> setDockTile(java.util.Optional<java.lang.String> badgeLabel, java.util.Optional<java.lang.String> image) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        badgeLabel.ifPresent(p -> params.put("badgeLabel", p));
        image.ifPresent(p -> params.put("image", p));
        return new Command<>("Browser.setDockTile", params.build());
    }
}
