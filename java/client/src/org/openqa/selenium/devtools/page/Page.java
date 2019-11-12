package org.openqa.selenium.devtools.page;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Actions and events related to the inspected page belong to the page domain.
 */
public class Page {

    /**
     * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
     */
    @Beta()
    @Deprecated()
    public static Command<org.openqa.selenium.devtools.page.model.ScriptIdentifier> addScriptToEvaluateOnLoad(java.lang.String scriptSource) {
        java.util.Objects.requireNonNull(scriptSource, "scriptSource is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scriptSource", scriptSource);
        return new Command<>("Page.addScriptToEvaluateOnLoad", params.build(), ConverterFunctions.map("identifier", org.openqa.selenium.devtools.page.model.ScriptIdentifier.class));
    }

    /**
     * Evaluates given script in every frame upon creation (before loading frame's scripts).
     */
    public static Command<org.openqa.selenium.devtools.page.model.ScriptIdentifier> addScriptToEvaluateOnNewDocument(java.lang.String source, java.util.Optional<java.lang.String> worldName) {
        java.util.Objects.requireNonNull(source, "source is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("source", source);
        worldName.ifPresent(p -> params.put("worldName", p));
        return new Command<>("Page.addScriptToEvaluateOnNewDocument", params.build(), ConverterFunctions.map("identifier", org.openqa.selenium.devtools.page.model.ScriptIdentifier.class));
    }

    /**
     * Brings page to front (activates tab).
     */
    public static Command<Void> bringToFront() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.bringToFront", params.build());
    }

    public enum CaptureScreenshotFormat {

        JPEG("jpeg"), PNG("png");

        private String value;

        CaptureScreenshotFormat(String value) {
            this.value = value;
        }

        public static CaptureScreenshotFormat fromString(String s) {
            return java.util.Arrays.stream(CaptureScreenshotFormat.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CaptureScreenshotFormat "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static CaptureScreenshotFormat fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Capture page screenshot.
     */
    public static Command<java.lang.String> captureScreenshot(java.util.Optional<CaptureScreenshotFormat> format, java.util.Optional<java.lang.Integer> quality, java.util.Optional<org.openqa.selenium.devtools.page.model.Viewport> clip, java.util.Optional<java.lang.Boolean> fromSurface) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        format.ifPresent(p -> params.put("format", p));
        quality.ifPresent(p -> params.put("quality", p));
        clip.ifPresent(p -> params.put("clip", p));
        fromSurface.ifPresent(p -> params.put("fromSurface", p));
        return new Command<>("Page.captureScreenshot", params.build(), ConverterFunctions.map("data", java.lang.String.class));
    }

    public enum CaptureSnapshotFormat {

        MHTML("mhtml");

        private String value;

        CaptureSnapshotFormat(String value) {
            this.value = value;
        }

        public static CaptureSnapshotFormat fromString(String s) {
            return java.util.Arrays.stream(CaptureSnapshotFormat.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within CaptureSnapshotFormat "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static CaptureSnapshotFormat fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
     * iframes, shadow DOM, external resources, and element-inline styles.
     */
    @Beta()
    public static Command<java.lang.String> captureSnapshot(java.util.Optional<CaptureSnapshotFormat> format) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        format.ifPresent(p -> params.put("format", p));
        return new Command<>("Page.captureSnapshot", params.build(), ConverterFunctions.map("data", java.lang.String.class));
    }

    /**
     * Clears the overriden device metrics.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> clearDeviceMetricsOverride() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.clearDeviceMetricsOverride", params.build());
    }

    /**
     * Clears the overridden Device Orientation.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> clearDeviceOrientationOverride() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.clearDeviceOrientationOverride", params.build());
    }

    /**
     * Clears the overriden Geolocation Position and Error.
     */
    @Deprecated()
    public static Command<Void> clearGeolocationOverride() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.clearGeolocationOverride", params.build());
    }

    /**
     * Creates an isolated world for the given frame.
     */
    public static Command<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> createIsolatedWorld(org.openqa.selenium.devtools.page.model.FrameId frameId, java.util.Optional<java.lang.String> worldName, java.util.Optional<java.lang.Boolean> grantUniveralAccess) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        worldName.ifPresent(p -> params.put("worldName", p));
        grantUniveralAccess.ifPresent(p -> params.put("grantUniveralAccess", p));
        return new Command<>("Page.createIsolatedWorld", params.build(), ConverterFunctions.map("executionContextId", org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class));
    }

    /**
     * Deletes browser cookie with given name, domain and path.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> deleteCookie(java.lang.String cookieName, java.lang.String url) {
        java.util.Objects.requireNonNull(cookieName, "cookieName is required");
        java.util.Objects.requireNonNull(url, "url is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cookieName", cookieName);
        params.put("url", url);
        return new Command<>("Page.deleteCookie", params.build());
    }

    /**
     * Disables page domain notifications.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.disable", params.build());
    }

    /**
     * Enables page domain notifications.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.enable", params.build());
    }

    public static class GetAppManifestResponse {

        private final java.lang.String url;

        private final java.util.List<org.openqa.selenium.devtools.page.model.AppManifestError> errors;

        private final java.lang.String data;

        public GetAppManifestResponse(java.lang.String url, java.util.List<org.openqa.selenium.devtools.page.model.AppManifestError> errors, java.lang.String data) {
            this.url = java.util.Objects.requireNonNull(url, "url is required");
            this.errors = java.util.Objects.requireNonNull(errors, "errors is required");
            this.data = java.util.Objects.requireNonNull(data, "data is required");
        }

        /**
         * Manifest location.
         */
        public java.lang.String getUrl() {
            return url;
        }

        public java.util.List<org.openqa.selenium.devtools.page.model.AppManifestError> getErrors() {
            return errors;
        }

        /**
         * Manifest content.
         */
        public java.lang.String getData() {
            return data;
        }

        private static GetAppManifestResponse fromJson(JsonInput input) {
            java.lang.String url = null;
            java.util.List<org.openqa.selenium.devtools.page.model.AppManifestError> errors = null;
            java.lang.String data = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "url":
                        url = input.nextString();
                        break;
                    case "errors":
                        errors = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.page.model.AppManifestError>>() {
                        }.getType());
                        break;
                    case "data":
                        data = input.nextString();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetAppManifestResponse(url, errors, data);
        }
    }

    public static Command<org.openqa.selenium.devtools.page.Page.GetAppManifestResponse> getAppManifest() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getAppManifest", params.build(), input -> input.read(org.openqa.selenium.devtools.page.Page.GetAppManifestResponse.class));
    }

    @Beta()
    public static Command<java.util.List<java.lang.String>> getInstallabilityErrors() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getInstallabilityErrors", params.build(), ConverterFunctions.map("errors", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Returns all browser cookies. Depending on the backend support, will return detailed cookie
     * information in the `cookies` field.
     */
    @Beta()
    @Deprecated()
    public static Command<java.util.List<org.openqa.selenium.devtools.network.model.Cookie>> getCookies() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getCookies", params.build(), ConverterFunctions.map("cookies", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.network.model.Cookie>>() {
        }.getType()));
    }

    /**
     * Returns present frame tree structure.
     */
    public static Command<org.openqa.selenium.devtools.page.model.FrameTree> getFrameTree() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getFrameTree", params.build(), ConverterFunctions.map("frameTree", org.openqa.selenium.devtools.page.model.FrameTree.class));
    }

    public static class GetLayoutMetricsResponse {

        private final org.openqa.selenium.devtools.page.model.LayoutViewport layoutViewport;

        private final org.openqa.selenium.devtools.page.model.VisualViewport visualViewport;

        private final org.openqa.selenium.devtools.dom.model.Rect contentSize;

        public GetLayoutMetricsResponse(org.openqa.selenium.devtools.page.model.LayoutViewport layoutViewport, org.openqa.selenium.devtools.page.model.VisualViewport visualViewport, org.openqa.selenium.devtools.dom.model.Rect contentSize) {
            this.layoutViewport = java.util.Objects.requireNonNull(layoutViewport, "layoutViewport is required");
            this.visualViewport = java.util.Objects.requireNonNull(visualViewport, "visualViewport is required");
            this.contentSize = java.util.Objects.requireNonNull(contentSize, "contentSize is required");
        }

        /**
         * Metrics relating to the layout viewport.
         */
        public org.openqa.selenium.devtools.page.model.LayoutViewport getLayoutViewport() {
            return layoutViewport;
        }

        /**
         * Metrics relating to the visual viewport.
         */
        public org.openqa.selenium.devtools.page.model.VisualViewport getVisualViewport() {
            return visualViewport;
        }

        /**
         * Size of scrollable area.
         */
        public org.openqa.selenium.devtools.dom.model.Rect getContentSize() {
            return contentSize;
        }

        private static GetLayoutMetricsResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.page.model.LayoutViewport layoutViewport = null;
            org.openqa.selenium.devtools.page.model.VisualViewport visualViewport = null;
            org.openqa.selenium.devtools.dom.model.Rect contentSize = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "layoutViewport":
                        layoutViewport = input.read(org.openqa.selenium.devtools.page.model.LayoutViewport.class);
                        break;
                    case "visualViewport":
                        visualViewport = input.read(org.openqa.selenium.devtools.page.model.VisualViewport.class);
                        break;
                    case "contentSize":
                        contentSize = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetLayoutMetricsResponse(layoutViewport, visualViewport, contentSize);
        }
    }

    /**
     * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
     */
    public static Command<org.openqa.selenium.devtools.page.Page.GetLayoutMetricsResponse> getLayoutMetrics() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getLayoutMetrics", params.build(), input -> input.read(org.openqa.selenium.devtools.page.Page.GetLayoutMetricsResponse.class));
    }

    public static class GetNavigationHistoryResponse {

        private final java.lang.Integer currentIndex;

        private final java.util.List<org.openqa.selenium.devtools.page.model.NavigationEntry> entries;

        public GetNavigationHistoryResponse(java.lang.Integer currentIndex, java.util.List<org.openqa.selenium.devtools.page.model.NavigationEntry> entries) {
            this.currentIndex = java.util.Objects.requireNonNull(currentIndex, "currentIndex is required");
            this.entries = java.util.Objects.requireNonNull(entries, "entries is required");
        }

        /**
         * Index of the current navigation history entry.
         */
        public java.lang.Integer getCurrentIndex() {
            return currentIndex;
        }

        /**
         * Array of navigation history entries.
         */
        public java.util.List<org.openqa.selenium.devtools.page.model.NavigationEntry> getEntries() {
            return entries;
        }

        private static GetNavigationHistoryResponse fromJson(JsonInput input) {
            java.lang.Integer currentIndex = null;
            java.util.List<org.openqa.selenium.devtools.page.model.NavigationEntry> entries = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "currentIndex":
                        currentIndex = input.nextNumber().intValue();
                        break;
                    case "entries":
                        entries = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.page.model.NavigationEntry>>() {
                        }.getType());
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetNavigationHistoryResponse(currentIndex, entries);
        }
    }

    /**
     * Returns navigation history for the current page.
     */
    public static Command<org.openqa.selenium.devtools.page.Page.GetNavigationHistoryResponse> getNavigationHistory() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getNavigationHistory", params.build(), input -> input.read(org.openqa.selenium.devtools.page.Page.GetNavigationHistoryResponse.class));
    }

    /**
     * Resets navigation history for the current page.
     */
    public static Command<Void> resetNavigationHistory() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.resetNavigationHistory", params.build());
    }

    public static class GetResourceContentResponse {

        private final java.lang.String content;

        private final java.lang.Boolean base64Encoded;

        public GetResourceContentResponse(java.lang.String content, java.lang.Boolean base64Encoded) {
            this.content = java.util.Objects.requireNonNull(content, "content is required");
            this.base64Encoded = java.util.Objects.requireNonNull(base64Encoded, "base64Encoded is required");
        }

        /**
         * Resource content.
         */
        public java.lang.String getContent() {
            return content;
        }

        /**
         * True, if content was served as base64.
         */
        public java.lang.Boolean getBase64Encoded() {
            return base64Encoded;
        }

        private static GetResourceContentResponse fromJson(JsonInput input) {
            java.lang.String content = null;
            java.lang.Boolean base64Encoded = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "content":
                        content = input.nextString();
                        break;
                    case "base64Encoded":
                        base64Encoded = input.nextBoolean();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetResourceContentResponse(content, base64Encoded);
        }
    }

    /**
     * Returns content of the given resource.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.page.Page.GetResourceContentResponse> getResourceContent(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String url) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        java.util.Objects.requireNonNull(url, "url is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        params.put("url", url);
        return new Command<>("Page.getResourceContent", params.build(), input -> input.read(org.openqa.selenium.devtools.page.Page.GetResourceContentResponse.class));
    }

    /**
     * Returns present frame / resource tree structure.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.page.model.FrameResourceTree> getResourceTree() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.getResourceTree", params.build(), ConverterFunctions.map("frameTree", org.openqa.selenium.devtools.page.model.FrameResourceTree.class));
    }

    /**
     * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
     */
    public static Command<Void> handleJavaScriptDialog(java.lang.Boolean accept, java.util.Optional<java.lang.String> promptText) {
        java.util.Objects.requireNonNull(accept, "accept is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("accept", accept);
        promptText.ifPresent(p -> params.put("promptText", p));
        return new Command<>("Page.handleJavaScriptDialog", params.build());
    }

    public static class NavigateResponse {

        private final org.openqa.selenium.devtools.page.model.FrameId frameId;

        private final org.openqa.selenium.devtools.network.model.LoaderId loaderId;

        private final java.lang.String errorText;

        public NavigateResponse(org.openqa.selenium.devtools.page.model.FrameId frameId, org.openqa.selenium.devtools.network.model.LoaderId loaderId, java.lang.String errorText) {
            this.frameId = java.util.Objects.requireNonNull(frameId, "frameId is required");
            this.loaderId = java.util.Objects.requireNonNull(loaderId, "loaderId is required");
            this.errorText = java.util.Objects.requireNonNull(errorText, "errorText is required");
        }

        /**
         * Frame id that has navigated (or failed to navigate)
         */
        public org.openqa.selenium.devtools.page.model.FrameId getFrameId() {
            return frameId;
        }

        /**
         * Loader identifier.
         */
        public org.openqa.selenium.devtools.network.model.LoaderId getLoaderId() {
            return loaderId;
        }

        /**
         * User friendly error message, present if and only if navigation has failed.
         */
        public java.lang.String getErrorText() {
            return errorText;
        }

        private static NavigateResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.page.model.FrameId frameId = null;
            org.openqa.selenium.devtools.network.model.LoaderId loaderId = null;
            java.lang.String errorText = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "frameId":
                        frameId = input.read(org.openqa.selenium.devtools.page.model.FrameId.class);
                        break;
                    case "loaderId":
                        loaderId = input.read(org.openqa.selenium.devtools.network.model.LoaderId.class);
                        break;
                    case "errorText":
                        errorText = input.nextString();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new NavigateResponse(frameId, loaderId, errorText);
        }
    }

    /**
     * Navigates current page to the given URL.
     */
    public static Command<org.openqa.selenium.devtools.page.Page.NavigateResponse> navigate(java.lang.String url, java.util.Optional<java.lang.String> referrer, java.util.Optional<org.openqa.selenium.devtools.page.model.TransitionType> transitionType, java.util.Optional<org.openqa.selenium.devtools.page.model.FrameId> frameId) {
        java.util.Objects.requireNonNull(url, "url is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("url", url);
        referrer.ifPresent(p -> params.put("referrer", p));
        transitionType.ifPresent(p -> params.put("transitionType", p));
        frameId.ifPresent(p -> params.put("frameId", p));
        return new Command<>("Page.navigate", params.build(), input -> input.read(org.openqa.selenium.devtools.page.Page.NavigateResponse.class));
    }

    /**
     * Navigates current page to the given history entry.
     */
    public static Command<Void> navigateToHistoryEntry(java.lang.Integer entryId) {
        java.util.Objects.requireNonNull(entryId, "entryId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("entryId", entryId);
        return new Command<>("Page.navigateToHistoryEntry", params.build());
    }

    public static class PrintToPDFResponse {

        private final java.lang.String data;

        private final org.openqa.selenium.devtools.io.model.StreamHandle stream;

        public PrintToPDFResponse(java.lang.String data, org.openqa.selenium.devtools.io.model.StreamHandle stream) {
            this.data = java.util.Objects.requireNonNull(data, "data is required");
            this.stream = java.util.Objects.requireNonNull(stream, "stream is required");
        }

        /**
         * Base64-encoded pdf data. Empty if |returnAsStream| is specified.
         */
        public java.lang.String getData() {
            return data;
        }

        /**
         * A handle of the stream that holds resulting PDF data.
         */
        public org.openqa.selenium.devtools.io.model.StreamHandle getStream() {
            return stream;
        }

        private static PrintToPDFResponse fromJson(JsonInput input) {
            java.lang.String data = null;
            org.openqa.selenium.devtools.io.model.StreamHandle stream = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "data":
                        data = input.nextString();
                        break;
                    case "stream":
                        stream = input.read(org.openqa.selenium.devtools.io.model.StreamHandle.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new PrintToPDFResponse(data, stream);
        }
    }

    public enum PrintToPDFTransferMode {

        RETURNASBASE64("ReturnAsBase64"), RETURNASSTREAM("ReturnAsStream");

        private String value;

        PrintToPDFTransferMode(String value) {
            this.value = value;
        }

        public static PrintToPDFTransferMode fromString(String s) {
            return java.util.Arrays.stream(PrintToPDFTransferMode.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within PrintToPDFTransferMode "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static PrintToPDFTransferMode fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Print page as PDF.
     */
    public static Command<org.openqa.selenium.devtools.page.Page.PrintToPDFResponse> printToPDF(java.util.Optional<java.lang.Boolean> landscape, java.util.Optional<java.lang.Boolean> displayHeaderFooter, java.util.Optional<java.lang.Boolean> printBackground, java.util.Optional<java.lang.Number> scale, java.util.Optional<java.lang.Number> paperWidth, java.util.Optional<java.lang.Number> paperHeight, java.util.Optional<java.lang.Number> marginTop, java.util.Optional<java.lang.Number> marginBottom, java.util.Optional<java.lang.Number> marginLeft, java.util.Optional<java.lang.Number> marginRight, java.util.Optional<java.lang.String> pageRanges, java.util.Optional<java.lang.Boolean> ignoreInvalidPageRanges, java.util.Optional<java.lang.String> headerTemplate, java.util.Optional<java.lang.String> footerTemplate, java.util.Optional<java.lang.Boolean> preferCSSPageSize, java.util.Optional<PrintToPDFTransferMode> transferMode) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        landscape.ifPresent(p -> params.put("landscape", p));
        displayHeaderFooter.ifPresent(p -> params.put("displayHeaderFooter", p));
        printBackground.ifPresent(p -> params.put("printBackground", p));
        scale.ifPresent(p -> params.put("scale", p));
        paperWidth.ifPresent(p -> params.put("paperWidth", p));
        paperHeight.ifPresent(p -> params.put("paperHeight", p));
        marginTop.ifPresent(p -> params.put("marginTop", p));
        marginBottom.ifPresent(p -> params.put("marginBottom", p));
        marginLeft.ifPresent(p -> params.put("marginLeft", p));
        marginRight.ifPresent(p -> params.put("marginRight", p));
        pageRanges.ifPresent(p -> params.put("pageRanges", p));
        ignoreInvalidPageRanges.ifPresent(p -> params.put("ignoreInvalidPageRanges", p));
        headerTemplate.ifPresent(p -> params.put("headerTemplate", p));
        footerTemplate.ifPresent(p -> params.put("footerTemplate", p));
        preferCSSPageSize.ifPresent(p -> params.put("preferCSSPageSize", p));
        transferMode.ifPresent(p -> params.put("transferMode", p));
        return new Command<>("Page.printToPDF", params.build(), input -> input.read(org.openqa.selenium.devtools.page.Page.PrintToPDFResponse.class));
    }

    /**
     * Reloads given page optionally ignoring the cache.
     */
    public static Command<Void> reload(java.util.Optional<java.lang.Boolean> ignoreCache, java.util.Optional<java.lang.String> scriptToEvaluateOnLoad) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        ignoreCache.ifPresent(p -> params.put("ignoreCache", p));
        scriptToEvaluateOnLoad.ifPresent(p -> params.put("scriptToEvaluateOnLoad", p));
        return new Command<>("Page.reload", params.build());
    }

    /**
     * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> removeScriptToEvaluateOnLoad(org.openqa.selenium.devtools.page.model.ScriptIdentifier identifier) {
        java.util.Objects.requireNonNull(identifier, "identifier is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("identifier", identifier);
        return new Command<>("Page.removeScriptToEvaluateOnLoad", params.build());
    }

    /**
     * Removes given script from the list.
     */
    public static Command<Void> removeScriptToEvaluateOnNewDocument(org.openqa.selenium.devtools.page.model.ScriptIdentifier identifier) {
        java.util.Objects.requireNonNull(identifier, "identifier is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("identifier", identifier);
        return new Command<>("Page.removeScriptToEvaluateOnNewDocument", params.build());
    }

    /**
     * Acknowledges that a screencast frame has been received by the frontend.
     */
    @Beta()
    public static Command<Void> screencastFrameAck(java.lang.Integer sessionId) {
        java.util.Objects.requireNonNull(sessionId, "sessionId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("sessionId", sessionId);
        return new Command<>("Page.screencastFrameAck", params.build());
    }

    /**
     * Searches for given string in resource content.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.debugger.model.SearchMatch>> searchInResource(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String url, java.lang.String query, java.util.Optional<java.lang.Boolean> caseSensitive, java.util.Optional<java.lang.Boolean> isRegex) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        java.util.Objects.requireNonNull(url, "url is required");
        java.util.Objects.requireNonNull(query, "query is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        params.put("url", url);
        params.put("query", query);
        caseSensitive.ifPresent(p -> params.put("caseSensitive", p));
        isRegex.ifPresent(p -> params.put("isRegex", p));
        return new Command<>("Page.searchInResource", params.build(), ConverterFunctions.map("result", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.SearchMatch>>() {
        }.getType()));
    }

    /**
     * Enable Chrome's experimental ad filter on all sites.
     */
    @Beta()
    public static Command<Void> setAdBlockingEnabled(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Page.setAdBlockingEnabled", params.build());
    }

    /**
     * Enable page Content Security Policy by-passing.
     */
    @Beta()
    public static Command<Void> setBypassCSP(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Page.setBypassCSP", params.build());
    }

    /**
     * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
     * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
     * query results).
     */
    @Beta()
    @Deprecated()
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
        return new Command<>("Page.setDeviceMetricsOverride", params.build());
    }

    /**
     * Overrides the Device Orientation.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> setDeviceOrientationOverride(java.lang.Number alpha, java.lang.Number beta, java.lang.Number gamma) {
        java.util.Objects.requireNonNull(alpha, "alpha is required");
        java.util.Objects.requireNonNull(beta, "beta is required");
        java.util.Objects.requireNonNull(gamma, "gamma is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("alpha", alpha);
        params.put("beta", beta);
        params.put("gamma", gamma);
        return new Command<>("Page.setDeviceOrientationOverride", params.build());
    }

    /**
     * Set generic font families.
     */
    @Beta()
    public static Command<Void> setFontFamilies(org.openqa.selenium.devtools.page.model.FontFamilies fontFamilies) {
        java.util.Objects.requireNonNull(fontFamilies, "fontFamilies is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("fontFamilies", fontFamilies);
        return new Command<>("Page.setFontFamilies", params.build());
    }

    /**
     * Set default font sizes.
     */
    @Beta()
    public static Command<Void> setFontSizes(org.openqa.selenium.devtools.page.model.FontSizes fontSizes) {
        java.util.Objects.requireNonNull(fontSizes, "fontSizes is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("fontSizes", fontSizes);
        return new Command<>("Page.setFontSizes", params.build());
    }

    /**
     * Sets given markup as the document's HTML.
     */
    public static Command<Void> setDocumentContent(org.openqa.selenium.devtools.page.model.FrameId frameId, java.lang.String html) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        java.util.Objects.requireNonNull(html, "html is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        params.put("html", html);
        return new Command<>("Page.setDocumentContent", params.build());
    }

    public enum SetDownloadBehaviorBehavior {

        DENY("deny"), ALLOW("allow"), DEFAULT("default");

        private String value;

        SetDownloadBehaviorBehavior(String value) {
            this.value = value;
        }

        public static SetDownloadBehaviorBehavior fromString(String s) {
            return java.util.Arrays.stream(SetDownloadBehaviorBehavior.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetDownloadBehaviorBehavior "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetDownloadBehaviorBehavior fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Set the behavior when downloading a file.
     */
    @Beta()
    public static Command<Void> setDownloadBehavior(SetDownloadBehaviorBehavior behavior, java.util.Optional<java.lang.String> downloadPath) {
        java.util.Objects.requireNonNull(behavior, "behavior is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("behavior", behavior);
        downloadPath.ifPresent(p -> params.put("downloadPath", p));
        return new Command<>("Page.setDownloadBehavior", params.build());
    }

    /**
     * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
     * unavailable.
     */
    @Deprecated()
    public static Command<Void> setGeolocationOverride(java.util.Optional<java.lang.Number> latitude, java.util.Optional<java.lang.Number> longitude, java.util.Optional<java.lang.Number> accuracy) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        latitude.ifPresent(p -> params.put("latitude", p));
        longitude.ifPresent(p -> params.put("longitude", p));
        accuracy.ifPresent(p -> params.put("accuracy", p));
        return new Command<>("Page.setGeolocationOverride", params.build());
    }

    /**
     * Controls whether page will emit lifecycle events.
     */
    @Beta()
    public static Command<Void> setLifecycleEventsEnabled(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Page.setLifecycleEventsEnabled", params.build());
    }

    public enum SetTouchEmulationEnabledConfiguration {

        MOBILE("mobile"), DESKTOP("desktop");

        private String value;

        SetTouchEmulationEnabledConfiguration(String value) {
            this.value = value;
        }

        public static SetTouchEmulationEnabledConfiguration fromString(String s) {
            return java.util.Arrays.stream(SetTouchEmulationEnabledConfiguration.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetTouchEmulationEnabledConfiguration "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetTouchEmulationEnabledConfiguration fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Toggles mouse event-based touch event emulation.
     */
    @Beta()
    @Deprecated()
    public static Command<Void> setTouchEmulationEnabled(java.lang.Boolean enabled, java.util.Optional<SetTouchEmulationEnabledConfiguration> configuration) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        configuration.ifPresent(p -> params.put("configuration", p));
        return new Command<>("Page.setTouchEmulationEnabled", params.build());
    }

    public enum StartScreencastFormat {

        JPEG("jpeg"), PNG("png");

        private String value;

        StartScreencastFormat(String value) {
            this.value = value;
        }

        public static StartScreencastFormat fromString(String s) {
            return java.util.Arrays.stream(StartScreencastFormat.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within StartScreencastFormat "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static StartScreencastFormat fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Starts sending each frame using the `screencastFrame` event.
     */
    @Beta()
    public static Command<Void> startScreencast(java.util.Optional<StartScreencastFormat> format, java.util.Optional<java.lang.Integer> quality, java.util.Optional<java.lang.Integer> maxWidth, java.util.Optional<java.lang.Integer> maxHeight, java.util.Optional<java.lang.Integer> everyNthFrame) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        format.ifPresent(p -> params.put("format", p));
        quality.ifPresent(p -> params.put("quality", p));
        maxWidth.ifPresent(p -> params.put("maxWidth", p));
        maxHeight.ifPresent(p -> params.put("maxHeight", p));
        everyNthFrame.ifPresent(p -> params.put("everyNthFrame", p));
        return new Command<>("Page.startScreencast", params.build());
    }

    /**
     * Force the page stop all navigations and pending resource fetches.
     */
    public static Command<Void> stopLoading() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.stopLoading", params.build());
    }

    /**
     * Crashes renderer on the IO thread, generates minidumps.
     */
    @Beta()
    public static Command<Void> crash() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.crash", params.build());
    }

    /**
     * Tries to close page, running its beforeunload hooks, if any.
     */
    @Beta()
    public static Command<Void> close() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.close", params.build());
    }

    public enum SetWebLifecycleStateState {

        FROZEN("frozen"), ACTIVE("active");

        private String value;

        SetWebLifecycleStateState(String value) {
            this.value = value;
        }

        public static SetWebLifecycleStateState fromString(String s) {
            return java.util.Arrays.stream(SetWebLifecycleStateState.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetWebLifecycleStateState "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetWebLifecycleStateState fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Tries to update the web lifecycle state of the page.
     * It will transition the page to the given state according to:
     * https://github.com/WICG/web-lifecycle/
     */
    @Beta()
    public static Command<Void> setWebLifecycleState(SetWebLifecycleStateState state) {
        java.util.Objects.requireNonNull(state, "state is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("state", state);
        return new Command<>("Page.setWebLifecycleState", params.build());
    }

    /**
     * Stops sending each frame in the `screencastFrame`.
     */
    @Beta()
    public static Command<Void> stopScreencast() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.stopScreencast", params.build());
    }

    /**
     * Forces compilation cache to be generated for every subresource script.
     */
    @Beta()
    public static Command<Void> setProduceCompilationCache(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Page.setProduceCompilationCache", params.build());
    }

    /**
     * Seeds compilation cache for given url. Compilation cache does not survive
     * cross-process navigation.
     */
    @Beta()
    public static Command<Void> addCompilationCache(java.lang.String url, java.lang.String data) {
        java.util.Objects.requireNonNull(url, "url is required");
        java.util.Objects.requireNonNull(data, "data is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("url", url);
        params.put("data", data);
        return new Command<>("Page.addCompilationCache", params.build());
    }

    /**
     * Clears seeded compilation cache.
     */
    @Beta()
    public static Command<Void> clearCompilationCache() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.clearCompilationCache", params.build());
    }

    /**
     * Generates a report for testing.
     */
    @Beta()
    public static Command<Void> generateTestReport(java.lang.String message, java.util.Optional<java.lang.String> group) {
        java.util.Objects.requireNonNull(message, "message is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("message", message);
        group.ifPresent(p -> params.put("group", p));
        return new Command<>("Page.generateTestReport", params.build());
    }

    /**
     * Pauses page execution. Can be resumed using generic Runtime.runIfWaitingForDebugger.
     */
    @Beta()
    public static Command<Void> waitForDebugger() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Page.waitForDebugger", params.build());
    }

    /**
     * Intercept file chooser requests and transfer control to protocol clients.
     * When file chooser interception is enabled, native file chooser dialog is not shown.
     * Instead, a protocol event `Page.fileChooserOpened` is emitted.
     * File chooser can be handled with `page.handleFileChooser` command.
     */
    @Beta()
    public static Command<Void> setInterceptFileChooserDialog(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Page.setInterceptFileChooserDialog", params.build());
    }

    public enum HandleFileChooserAction {

        ACCEPT("accept"), CANCEL("cancel"), FALLBACK("fallback");

        private String value;

        HandleFileChooserAction(String value) {
            this.value = value;
        }

        public static HandleFileChooserAction fromString(String s) {
            return java.util.Arrays.stream(HandleFileChooserAction.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within HandleFileChooserAction "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static HandleFileChooserAction fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Accepts or cancels an intercepted file chooser dialog.
     */
    @Beta()
    public static Command<Void> handleFileChooser(HandleFileChooserAction action, java.util.Optional<java.util.List<java.lang.String>> files) {
        java.util.Objects.requireNonNull(action, "action is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("action", action);
        files.ifPresent(p -> params.put("files", p));
        return new Command<>("Page.handleFileChooser", params.build());
    }

    public static Event<org.openqa.selenium.devtools.network.model.MonotonicTime> domContentEventFired() {
        return new Event<>("Page.domContentEventFired", ConverterFunctions.map("timestamp", org.openqa.selenium.devtools.network.model.MonotonicTime.class));
    }

    public enum Mode {

        SELECTSINGLE("selectSingle"), SELECTMULTIPLE("selectMultiple");

        private String value;

        Mode(String value) {
            this.value = value;
        }

        public static Mode fromString(String s) {
            return java.util.Arrays.stream(Mode.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Mode "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Mode fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    public static Event<Mode> fileChooserOpened() {
        return new Event<>("Page.fileChooserOpened", ConverterFunctions.map("Mode", Mode.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameAttached> frameAttached() {
        return new Event<>("Page.frameAttached", input -> input.read(org.openqa.selenium.devtools.page.model.FrameAttached.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameId> frameClearedScheduledNavigation() {
        return new Event<>("Page.frameClearedScheduledNavigation", ConverterFunctions.map("frameId", org.openqa.selenium.devtools.page.model.FrameId.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameId> frameDetached() {
        return new Event<>("Page.frameDetached", ConverterFunctions.map("frameId", org.openqa.selenium.devtools.page.model.FrameId.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.Frame> frameNavigated() {
        return new Event<>("Page.frameNavigated", ConverterFunctions.map("frame", org.openqa.selenium.devtools.page.model.Frame.class));
    }

    public static Event<Void> frameResized() {
        return new Event<>("Page.frameResized", input -> null);
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameRequestedNavigation> frameRequestedNavigation() {
        return new Event<>("Page.frameRequestedNavigation", input -> input.read(org.openqa.selenium.devtools.page.model.FrameRequestedNavigation.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameScheduledNavigation> frameScheduledNavigation() {
        return new Event<>("Page.frameScheduledNavigation", input -> input.read(org.openqa.selenium.devtools.page.model.FrameScheduledNavigation.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameId> frameStartedLoading() {
        return new Event<>("Page.frameStartedLoading", ConverterFunctions.map("frameId", org.openqa.selenium.devtools.page.model.FrameId.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.FrameId> frameStoppedLoading() {
        return new Event<>("Page.frameStoppedLoading", ConverterFunctions.map("frameId", org.openqa.selenium.devtools.page.model.FrameId.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.DownloadWillBegin> downloadWillBegin() {
        return new Event<>("Page.downloadWillBegin", input -> input.read(org.openqa.selenium.devtools.page.model.DownloadWillBegin.class));
    }

    public static Event<Void> interstitialHidden() {
        return new Event<>("Page.interstitialHidden", input -> null);
    }

    public static Event<Void> interstitialShown() {
        return new Event<>("Page.interstitialShown", input -> null);
    }

    public static Event<org.openqa.selenium.devtools.page.model.JavascriptDialogClosed> javascriptDialogClosed() {
        return new Event<>("Page.javascriptDialogClosed", input -> input.read(org.openqa.selenium.devtools.page.model.JavascriptDialogClosed.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.JavascriptDialogOpening> javascriptDialogOpening() {
        return new Event<>("Page.javascriptDialogOpening", input -> input.read(org.openqa.selenium.devtools.page.model.JavascriptDialogOpening.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.LifecycleEvent> lifecycleEvent() {
        return new Event<>("Page.lifecycleEvent", input -> input.read(org.openqa.selenium.devtools.page.model.LifecycleEvent.class));
    }

    public static Event<org.openqa.selenium.devtools.network.model.MonotonicTime> loadEventFired() {
        return new Event<>("Page.loadEventFired", ConverterFunctions.map("timestamp", org.openqa.selenium.devtools.network.model.MonotonicTime.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.NavigatedWithinDocument> navigatedWithinDocument() {
        return new Event<>("Page.navigatedWithinDocument", input -> input.read(org.openqa.selenium.devtools.page.model.NavigatedWithinDocument.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.ScreencastFrame> screencastFrame() {
        return new Event<>("Page.screencastFrame", input -> input.read(org.openqa.selenium.devtools.page.model.ScreencastFrame.class));
    }

    public static Event<java.lang.Boolean> screencastVisibilityChanged() {
        return new Event<>("Page.screencastVisibilityChanged", ConverterFunctions.map("visible", java.lang.Boolean.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.WindowOpen> windowOpen() {
        return new Event<>("Page.windowOpen", input -> input.read(org.openqa.selenium.devtools.page.model.WindowOpen.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.CompilationCacheProduced> compilationCacheProduced() {
        return new Event<>("Page.compilationCacheProduced", input -> input.read(org.openqa.selenium.devtools.page.model.CompilationCacheProduced.class));
    }
}
