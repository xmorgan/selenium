package org.openqa.selenium.devtools.overlay;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain provides various functionality related to drawing atop the inspected page.
 */
@Beta()
public class Overlay {

    /**
     * Disables domain notifications.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Overlay.disable", params.build());
    }

    /**
     * Enables domain notifications.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Overlay.enable", params.build());
    }

    /**
     * For testing.
     */
    public static Command<java.util.Map<String, Object>> getHighlightObjectForTest(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.util.Optional<java.lang.Boolean> includeDistance, java.util.Optional<java.lang.Boolean> includeStyle) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        includeDistance.ifPresent(p -> params.put("includeDistance", p));
        includeStyle.ifPresent(p -> params.put("includeStyle", p));
        return new Command<>("Overlay.getHighlightObjectForTest", params.build(), ConverterFunctions.map("highlight", new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
        }.getType()));
    }

    /**
     * Hides any highlight.
     */
    public static Command<Void> hideHighlight() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Overlay.hideHighlight", params.build());
    }

    /**
     * Highlights owner element of the frame with given id.
     */
    public static Command<Void> highlightFrame(org.openqa.selenium.devtools.page.model.FrameId frameId, java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> contentColor, java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> contentOutlineColor) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        contentColor.ifPresent(p -> params.put("contentColor", p));
        contentOutlineColor.ifPresent(p -> params.put("contentOutlineColor", p));
        return new Command<>("Overlay.highlightFrame", params.build());
    }

    /**
     * Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or
     * objectId must be specified.
     */
    public static Command<Void> highlightNode(org.openqa.selenium.devtools.overlay.model.HighlightConfig highlightConfig, java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId, java.util.Optional<java.lang.String> selector) {
        java.util.Objects.requireNonNull(highlightConfig, "highlightConfig is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("highlightConfig", highlightConfig);
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        selector.ifPresent(p -> params.put("selector", p));
        return new Command<>("Overlay.highlightNode", params.build());
    }

    /**
     * Highlights given quad. Coordinates are absolute with respect to the main frame viewport.
     */
    public static Command<Void> highlightQuad(org.openqa.selenium.devtools.dom.model.Quad quad, java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> color, java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> outlineColor) {
        java.util.Objects.requireNonNull(quad, "quad is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("quad", quad);
        color.ifPresent(p -> params.put("color", p));
        outlineColor.ifPresent(p -> params.put("outlineColor", p));
        return new Command<>("Overlay.highlightQuad", params.build());
    }

    /**
     * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
     */
    public static Command<Void> highlightRect(java.lang.Integer x, java.lang.Integer y, java.lang.Integer width, java.lang.Integer height, java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> color, java.util.Optional<org.openqa.selenium.devtools.dom.model.RGBA> outlineColor) {
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        java.util.Objects.requireNonNull(width, "width is required");
        java.util.Objects.requireNonNull(height, "height is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("x", x);
        params.put("y", y);
        params.put("width", width);
        params.put("height", height);
        color.ifPresent(p -> params.put("color", p));
        outlineColor.ifPresent(p -> params.put("outlineColor", p));
        return new Command<>("Overlay.highlightRect", params.build());
    }

    /**
     * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted.
     * Backend then generates 'inspectNodeRequested' event upon element selection.
     */
    public static Command<Void> setInspectMode(org.openqa.selenium.devtools.overlay.model.InspectMode mode, java.util.Optional<org.openqa.selenium.devtools.overlay.model.HighlightConfig> highlightConfig) {
        java.util.Objects.requireNonNull(mode, "mode is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("mode", mode);
        highlightConfig.ifPresent(p -> params.put("highlightConfig", p));
        return new Command<>("Overlay.setInspectMode", params.build());
    }

    /**
     * Highlights owner element of all frames detected to be ads.
     */
    public static Command<Void> setShowAdHighlights(java.lang.Boolean show) {
        java.util.Objects.requireNonNull(show, "show is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("show", show);
        return new Command<>("Overlay.setShowAdHighlights", params.build());
    }

    public static Command<Void> setPausedInDebuggerMessage(java.util.Optional<java.lang.String> message) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        message.ifPresent(p -> params.put("message", p));
        return new Command<>("Overlay.setPausedInDebuggerMessage", params.build());
    }

    /**
     * Requests that backend shows debug borders on layers
     */
    public static Command<Void> setShowDebugBorders(java.lang.Boolean show) {
        java.util.Objects.requireNonNull(show, "show is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("show", show);
        return new Command<>("Overlay.setShowDebugBorders", params.build());
    }

    /**
     * Requests that backend shows the FPS counter
     */
    public static Command<Void> setShowFPSCounter(java.lang.Boolean show) {
        java.util.Objects.requireNonNull(show, "show is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("show", show);
        return new Command<>("Overlay.setShowFPSCounter", params.build());
    }

    /**
     * Requests that backend shows paint rectangles
     */
    public static Command<Void> setShowPaintRects(java.lang.Boolean result) {
        java.util.Objects.requireNonNull(result, "result is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("result", result);
        return new Command<>("Overlay.setShowPaintRects", params.build());
    }

    /**
     * Requests that backend shows layout shift regions
     */
    public static Command<Void> setShowLayoutShiftRegions(java.lang.Boolean result) {
        java.util.Objects.requireNonNull(result, "result is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("result", result);
        return new Command<>("Overlay.setShowLayoutShiftRegions", params.build());
    }

    /**
     * Requests that backend shows scroll bottleneck rects
     */
    public static Command<Void> setShowScrollBottleneckRects(java.lang.Boolean show) {
        java.util.Objects.requireNonNull(show, "show is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("show", show);
        return new Command<>("Overlay.setShowScrollBottleneckRects", params.build());
    }

    /**
     * Requests that backend shows hit-test borders on layers
     */
    public static Command<Void> setShowHitTestBorders(java.lang.Boolean show) {
        java.util.Objects.requireNonNull(show, "show is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("show", show);
        return new Command<>("Overlay.setShowHitTestBorders", params.build());
    }

    /**
     * Paints viewport size upon main frame resize.
     */
    public static Command<Void> setShowViewportSizeOnResize(java.lang.Boolean show) {
        java.util.Objects.requireNonNull(show, "show is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("show", show);
        return new Command<>("Overlay.setShowViewportSizeOnResize", params.build());
    }

    public static Event<org.openqa.selenium.devtools.dom.model.BackendNodeId> inspectNodeRequested() {
        return new Event<>("Overlay.inspectNodeRequested", ConverterFunctions.map("backendNodeId", org.openqa.selenium.devtools.dom.model.BackendNodeId.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.NodeId> nodeHighlightRequested() {
        return new Event<>("Overlay.nodeHighlightRequested", ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    public static Event<org.openqa.selenium.devtools.page.model.Viewport> screenshotRequested() {
        return new Event<>("Overlay.screenshotRequested", ConverterFunctions.map("viewport", org.openqa.selenium.devtools.page.model.Viewport.class));
    }

    public static Event<Void> inspectModeCanceled() {
        return new Event<>("Overlay.inspectModeCanceled", input -> null);
    }
}
