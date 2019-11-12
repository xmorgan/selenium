package org.openqa.selenium.devtools.domdebugger;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * DOM debugging allows setting breakpoints on particular DOM operations and events. JavaScript
 * execution will stop on these operations as if there was a regular breakpoint set.
 */
public class DOMDebugger {

    /**
     * Returns event listeners of the given object.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener>> getEventListeners(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId, java.util.Optional<java.lang.Integer> depth, java.util.Optional<java.lang.Boolean> pierce) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        depth.ifPresent(p -> params.put("depth", p));
        pierce.ifPresent(p -> params.put("pierce", p));
        return new Command<>("DOMDebugger.getEventListeners", params.build(), ConverterFunctions.map("listeners", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domdebugger.model.EventListener>>() {
        }.getType()));
    }

    /**
     * Removes DOM breakpoint that was set using `setDOMBreakpoint`.
     */
    public static Command<Void> removeDOMBreakpoint(org.openqa.selenium.devtools.dom.model.NodeId nodeId, org.openqa.selenium.devtools.domdebugger.model.DOMBreakpointType type) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(type, "type is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("type", type);
        return new Command<>("DOMDebugger.removeDOMBreakpoint", params.build());
    }

    /**
     * Removes breakpoint on particular DOM event.
     */
    public static Command<Void> removeEventListenerBreakpoint(java.lang.String eventName, java.util.Optional<java.lang.String> targetName) {
        java.util.Objects.requireNonNull(eventName, "eventName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("eventName", eventName);
        targetName.ifPresent(p -> params.put("targetName", p));
        return new Command<>("DOMDebugger.removeEventListenerBreakpoint", params.build());
    }

    /**
     * Removes breakpoint on particular native event.
     */
    @Beta()
    public static Command<Void> removeInstrumentationBreakpoint(java.lang.String eventName) {
        java.util.Objects.requireNonNull(eventName, "eventName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("eventName", eventName);
        return new Command<>("DOMDebugger.removeInstrumentationBreakpoint", params.build());
    }

    /**
     * Removes breakpoint from XMLHttpRequest.
     */
    public static Command<Void> removeXHRBreakpoint(java.lang.String url) {
        java.util.Objects.requireNonNull(url, "url is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("url", url);
        return new Command<>("DOMDebugger.removeXHRBreakpoint", params.build());
    }

    /**
     * Sets breakpoint on particular operation with DOM.
     */
    public static Command<Void> setDOMBreakpoint(org.openqa.selenium.devtools.dom.model.NodeId nodeId, org.openqa.selenium.devtools.domdebugger.model.DOMBreakpointType type) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(type, "type is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("type", type);
        return new Command<>("DOMDebugger.setDOMBreakpoint", params.build());
    }

    /**
     * Sets breakpoint on particular DOM event.
     */
    public static Command<Void> setEventListenerBreakpoint(java.lang.String eventName, java.util.Optional<java.lang.String> targetName) {
        java.util.Objects.requireNonNull(eventName, "eventName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("eventName", eventName);
        targetName.ifPresent(p -> params.put("targetName", p));
        return new Command<>("DOMDebugger.setEventListenerBreakpoint", params.build());
    }

    /**
     * Sets breakpoint on particular native event.
     */
    @Beta()
    public static Command<Void> setInstrumentationBreakpoint(java.lang.String eventName) {
        java.util.Objects.requireNonNull(eventName, "eventName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("eventName", eventName);
        return new Command<>("DOMDebugger.setInstrumentationBreakpoint", params.build());
    }

    /**
     * Sets breakpoint on XMLHttpRequest.
     */
    public static Command<Void> setXHRBreakpoint(java.lang.String url) {
        java.util.Objects.requireNonNull(url, "url is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("url", url);
        return new Command<>("DOMDebugger.setXHRBreakpoint", params.build());
    }
}
