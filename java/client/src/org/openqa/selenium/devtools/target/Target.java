package org.openqa.selenium.devtools.target;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Supports additional targets discovery and allows to attach to them.
 */
public class Target {

    /**
     * Activates (focuses) the target.
     */
    public static Command<Void> activateTarget(org.openqa.selenium.devtools.target.model.TargetID targetId) {
        java.util.Objects.requireNonNull(targetId, "targetId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("targetId", targetId);
        return new Command<>("Target.activateTarget", params.build());
    }

    /**
     * Attaches to the target with given id.
     */
    public static Command<org.openqa.selenium.devtools.target.model.SessionID> attachToTarget(org.openqa.selenium.devtools.target.model.TargetID targetId, java.util.Optional<java.lang.Boolean> flatten) {
        java.util.Objects.requireNonNull(targetId, "targetId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("targetId", targetId);
        flatten.ifPresent(p -> params.put("flatten", p));
        return new Command<>("Target.attachToTarget", params.build(), ConverterFunctions.map("sessionId", org.openqa.selenium.devtools.target.model.SessionID.class));
    }

    /**
     * Attaches to the browser target, only uses flat sessionId mode.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.target.model.SessionID> attachToBrowserTarget() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Target.attachToBrowserTarget", params.build(), ConverterFunctions.map("sessionId", org.openqa.selenium.devtools.target.model.SessionID.class));
    }

    /**
     * Closes the target. If the target is a page that gets closed too.
     */
    public static Command<java.lang.Boolean> closeTarget(org.openqa.selenium.devtools.target.model.TargetID targetId) {
        java.util.Objects.requireNonNull(targetId, "targetId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("targetId", targetId);
        return new Command<>("Target.closeTarget", params.build(), ConverterFunctions.map("success", java.lang.Boolean.class));
    }

    /**
     * Inject object to the target's main frame that provides a communication
     * channel with browser target.
     *
     * Injected object will be available as `window[bindingName]`.
     *
     * The object has the follwing API:
     * - `binding.send(json)` - a method to send messages over the remote debugging protocol
     * - `binding.onmessage = json => handleMessage(json)` - a callback that will be called for the protocol notifications and command responses.
     */
    @Beta()
    public static Command<Void> exposeDevToolsProtocol(org.openqa.selenium.devtools.target.model.TargetID targetId, java.util.Optional<java.lang.String> bindingName) {
        java.util.Objects.requireNonNull(targetId, "targetId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("targetId", targetId);
        bindingName.ifPresent(p -> params.put("bindingName", p));
        return new Command<>("Target.exposeDevToolsProtocol", params.build());
    }

    /**
     * Creates a new empty BrowserContext. Similar to an incognito profile but you can have more than
     * one.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.target.model.BrowserContextID> createBrowserContext() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Target.createBrowserContext", params.build(), ConverterFunctions.map("browserContextId", org.openqa.selenium.devtools.target.model.BrowserContextID.class));
    }

    /**
     * Returns all browser contexts created with `Target.createBrowserContext` method.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.target.model.BrowserContextID>> getBrowserContexts() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Target.getBrowserContexts", params.build(), ConverterFunctions.map("browserContextIds", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.target.model.BrowserContextID>>() {
        }.getType()));
    }

    /**
     * Creates a new page.
     */
    public static Command<org.openqa.selenium.devtools.target.model.TargetID> createTarget(java.lang.String url, java.util.Optional<java.lang.Integer> width, java.util.Optional<java.lang.Integer> height, java.util.Optional<org.openqa.selenium.devtools.target.model.BrowserContextID> browserContextId, java.util.Optional<java.lang.Boolean> enableBeginFrameControl, java.util.Optional<java.lang.Boolean> newWindow, java.util.Optional<java.lang.Boolean> background) {
        java.util.Objects.requireNonNull(url, "url is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("url", url);
        width.ifPresent(p -> params.put("width", p));
        height.ifPresent(p -> params.put("height", p));
        browserContextId.ifPresent(p -> params.put("browserContextId", p));
        enableBeginFrameControl.ifPresent(p -> params.put("enableBeginFrameControl", p));
        newWindow.ifPresent(p -> params.put("newWindow", p));
        background.ifPresent(p -> params.put("background", p));
        return new Command<>("Target.createTarget", params.build(), ConverterFunctions.map("targetId", org.openqa.selenium.devtools.target.model.TargetID.class));
    }

    /**
     * Detaches session with given id.
     */
    public static Command<Void> detachFromTarget(java.util.Optional<org.openqa.selenium.devtools.target.model.SessionID> sessionId, java.util.Optional<org.openqa.selenium.devtools.target.model.TargetID> targetId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        sessionId.ifPresent(p -> params.put("sessionId", p));
        targetId.ifPresent(p -> params.put("targetId", p));
        return new Command<>("Target.detachFromTarget", params.build());
    }

    /**
     * Deletes a BrowserContext. All the belonging pages will be closed without calling their
     * beforeunload hooks.
     */
    @Beta()
    public static Command<Void> disposeBrowserContext(org.openqa.selenium.devtools.target.model.BrowserContextID browserContextId) {
        java.util.Objects.requireNonNull(browserContextId, "browserContextId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("browserContextId", browserContextId);
        return new Command<>("Target.disposeBrowserContext", params.build());
    }

    /**
     * Returns information about a target.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.target.model.TargetInfo> getTargetInfo(java.util.Optional<org.openqa.selenium.devtools.target.model.TargetID> targetId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        targetId.ifPresent(p -> params.put("targetId", p));
        return new Command<>("Target.getTargetInfo", params.build(), ConverterFunctions.map("targetInfo", org.openqa.selenium.devtools.target.model.TargetInfo.class));
    }

    /**
     * Retrieves a list of available targets.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.target.model.TargetInfo>> getTargets() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Target.getTargets", params.build(), ConverterFunctions.map("targetInfos", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.target.model.TargetInfo>>() {
        }.getType()));
    }

    /**
     * Sends protocol message over session with given id.
     */
    public static Command<Void> sendMessageToTarget(java.lang.String message, java.util.Optional<org.openqa.selenium.devtools.target.model.SessionID> sessionId, java.util.Optional<org.openqa.selenium.devtools.target.model.TargetID> targetId) {
        java.util.Objects.requireNonNull(message, "message is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("message", message);
        sessionId.ifPresent(p -> params.put("sessionId", p));
        targetId.ifPresent(p -> params.put("targetId", p));
        return new Command<>("Target.sendMessageToTarget", params.build());
    }

    /**
     * Controls whether to automatically attach to new targets which are considered to be related to
     * this one. When turned on, attaches to all existing related targets as well. When turned off,
     * automatically detaches from all currently attached targets.
     */
    @Beta()
    public static Command<Void> setAutoAttach(java.lang.Boolean autoAttach, java.lang.Boolean waitForDebuggerOnStart, java.util.Optional<java.lang.Boolean> flatten) {
        java.util.Objects.requireNonNull(autoAttach, "autoAttach is required");
        java.util.Objects.requireNonNull(waitForDebuggerOnStart, "waitForDebuggerOnStart is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("autoAttach", autoAttach);
        params.put("waitForDebuggerOnStart", waitForDebuggerOnStart);
        flatten.ifPresent(p -> params.put("flatten", p));
        return new Command<>("Target.setAutoAttach", params.build());
    }

    /**
     * Controls whether to discover available targets and notify via
     * `targetCreated/targetInfoChanged/targetDestroyed` events.
     */
    public static Command<Void> setDiscoverTargets(java.lang.Boolean discover) {
        java.util.Objects.requireNonNull(discover, "discover is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("discover", discover);
        return new Command<>("Target.setDiscoverTargets", params.build());
    }

    /**
     * Enables target discovery for the specified locations, when `setDiscoverTargets` was set to
     * `true`.
     */
    @Beta()
    public static Command<Void> setRemoteLocations(java.util.List<org.openqa.selenium.devtools.target.model.RemoteLocation> locations) {
        java.util.Objects.requireNonNull(locations, "locations is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("locations", locations);
        return new Command<>("Target.setRemoteLocations", params.build());
    }

    public static Event<org.openqa.selenium.devtools.target.model.AttachedToTarget> attachedToTarget() {
        return new Event<>("Target.attachedToTarget", input -> input.read(org.openqa.selenium.devtools.target.model.AttachedToTarget.class));
    }

    public static Event<org.openqa.selenium.devtools.target.model.DetachedFromTarget> detachedFromTarget() {
        return new Event<>("Target.detachedFromTarget", input -> input.read(org.openqa.selenium.devtools.target.model.DetachedFromTarget.class));
    }

    public static Event<org.openqa.selenium.devtools.target.model.ReceivedMessageFromTarget> receivedMessageFromTarget() {
        return new Event<>("Target.receivedMessageFromTarget", input -> input.read(org.openqa.selenium.devtools.target.model.ReceivedMessageFromTarget.class));
    }

    public static Event<org.openqa.selenium.devtools.target.model.TargetInfo> targetCreated() {
        return new Event<>("Target.targetCreated", ConverterFunctions.map("targetInfo", org.openqa.selenium.devtools.target.model.TargetInfo.class));
    }

    public static Event<org.openqa.selenium.devtools.target.model.TargetID> targetDestroyed() {
        return new Event<>("Target.targetDestroyed", ConverterFunctions.map("targetId", org.openqa.selenium.devtools.target.model.TargetID.class));
    }

    public static Event<org.openqa.selenium.devtools.target.model.TargetCrashed> targetCrashed() {
        return new Event<>("Target.targetCrashed", input -> input.read(org.openqa.selenium.devtools.target.model.TargetCrashed.class));
    }

    public static Event<org.openqa.selenium.devtools.target.model.TargetInfo> targetInfoChanged() {
        return new Event<>("Target.targetInfoChanged", ConverterFunctions.map("targetInfo", org.openqa.selenium.devtools.target.model.TargetInfo.class));
    }
}
