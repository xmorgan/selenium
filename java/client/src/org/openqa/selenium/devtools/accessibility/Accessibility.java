package org.openqa.selenium.devtools.accessibility;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Accessibility {

    /**
     * Disables the accessibility domain.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Accessibility.disable", params.build());
    }

    /**
     * Enables the accessibility domain which causes `AXNodeId`s to remain consistent between method calls.
     * This turns on accessibility for the page, which can impact performance until accessibility is disabled.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Accessibility.enable", params.build());
    }

    /**
     * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNode>> getPartialAXTree(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId, java.util.Optional<java.lang.Boolean> fetchRelatives) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        fetchRelatives.ifPresent(p -> params.put("fetchRelatives", p));
        return new Command<>("Accessibility.getPartialAXTree", params.build(), ConverterFunctions.map("nodes", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNode>>() {
        }.getType()));
    }

    /**
     * Fetches the entire accessibility tree
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNode>> getFullAXTree() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Accessibility.getFullAXTree", params.build(), ConverterFunctions.map("nodes", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXNode>>() {
        }.getType()));
    }
}
