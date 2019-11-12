package org.openqa.selenium.devtools.input;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

public class Input {

    public enum DispatchKeyEventType {

        KEYDOWN("keyDown"), KEYUP("keyUp"), RAWKEYDOWN("rawKeyDown"), CHAR("char");

        private String value;

        DispatchKeyEventType(String value) {
            this.value = value;
        }

        public static DispatchKeyEventType fromString(String s) {
            return java.util.Arrays.stream(DispatchKeyEventType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within DispatchKeyEventType "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static DispatchKeyEventType fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Dispatches a key event to the page.
     */
    public static Command<Void> dispatchKeyEvent(DispatchKeyEventType type, java.util.Optional<java.lang.Integer> modifiers, java.util.Optional<org.openqa.selenium.devtools.input.model.TimeSinceEpoch> timestamp, java.util.Optional<java.lang.String> text, java.util.Optional<java.lang.String> unmodifiedText, java.util.Optional<java.lang.String> keyIdentifier, java.util.Optional<java.lang.String> code, java.util.Optional<java.lang.String> key, java.util.Optional<java.lang.Integer> windowsVirtualKeyCode, java.util.Optional<java.lang.Integer> nativeVirtualKeyCode, java.util.Optional<java.lang.Boolean> autoRepeat, java.util.Optional<java.lang.Boolean> isKeypad, java.util.Optional<java.lang.Boolean> isSystemKey, java.util.Optional<java.lang.Integer> location) {
        java.util.Objects.requireNonNull(type, "type is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("type", type);
        modifiers.ifPresent(p -> params.put("modifiers", p));
        timestamp.ifPresent(p -> params.put("timestamp", p));
        text.ifPresent(p -> params.put("text", p));
        unmodifiedText.ifPresent(p -> params.put("unmodifiedText", p));
        keyIdentifier.ifPresent(p -> params.put("keyIdentifier", p));
        code.ifPresent(p -> params.put("code", p));
        key.ifPresent(p -> params.put("key", p));
        windowsVirtualKeyCode.ifPresent(p -> params.put("windowsVirtualKeyCode", p));
        nativeVirtualKeyCode.ifPresent(p -> params.put("nativeVirtualKeyCode", p));
        autoRepeat.ifPresent(p -> params.put("autoRepeat", p));
        isKeypad.ifPresent(p -> params.put("isKeypad", p));
        isSystemKey.ifPresent(p -> params.put("isSystemKey", p));
        location.ifPresent(p -> params.put("location", p));
        return new Command<>("Input.dispatchKeyEvent", params.build());
    }

    /**
     * This method emulates inserting text that doesn't come from a key press,
     * for example an emoji keyboard or an IME.
     */
    @Beta()
    public static Command<Void> insertText(java.lang.String text) {
        java.util.Objects.requireNonNull(text, "text is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("text", text);
        return new Command<>("Input.insertText", params.build());
    }

    public enum DispatchMouseEventType {

        MOUSEPRESSED("mousePressed"), MOUSERELEASED("mouseReleased"), MOUSEMOVED("mouseMoved"), MOUSEWHEEL("mouseWheel");

        private String value;

        DispatchMouseEventType(String value) {
            this.value = value;
        }

        public static DispatchMouseEventType fromString(String s) {
            return java.util.Arrays.stream(DispatchMouseEventType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within DispatchMouseEventType "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static DispatchMouseEventType fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    public enum DispatchMouseEventButton {

        NONE("none"),
        LEFT("left"),
        MIDDLE("middle"),
        RIGHT("right"),
        BACK("back"),
        FORWARD("forward");

        private String value;

        DispatchMouseEventButton(String value) {
            this.value = value;
        }

        public static DispatchMouseEventButton fromString(String s) {
            return java.util.Arrays.stream(DispatchMouseEventButton.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within DispatchMouseEventButton "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static DispatchMouseEventButton fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    public enum DispatchMouseEventPointerType {

        MOUSE("mouse"), PEN("pen");

        private String value;

        DispatchMouseEventPointerType(String value) {
            this.value = value;
        }

        public static DispatchMouseEventPointerType fromString(String s) {
            return java.util.Arrays.stream(DispatchMouseEventPointerType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within DispatchMouseEventPointerType "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static DispatchMouseEventPointerType fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Dispatches a mouse event to the page.
     */
    public static Command<Void> dispatchMouseEvent(DispatchMouseEventType type, java.lang.Number x, java.lang.Number y, java.util.Optional<java.lang.Integer> modifiers, java.util.Optional<org.openqa.selenium.devtools.input.model.TimeSinceEpoch> timestamp, java.util.Optional<DispatchMouseEventButton> button, java.util.Optional<java.lang.Integer> buttons, java.util.Optional<java.lang.Integer> clickCount, java.util.Optional<java.lang.Number> deltaX, java.util.Optional<java.lang.Number> deltaY, java.util.Optional<DispatchMouseEventPointerType> pointerType) {
        java.util.Objects.requireNonNull(type, "type is required");
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("type", type);
        params.put("x", x);
        params.put("y", y);
        modifiers.ifPresent(p -> params.put("modifiers", p));
        timestamp.ifPresent(p -> params.put("timestamp", p));
        button.ifPresent(p -> params.put("button", p));
        buttons.ifPresent(p -> params.put("buttons", p));
        clickCount.ifPresent(p -> params.put("clickCount", p));
        deltaX.ifPresent(p -> params.put("deltaX", p));
        deltaY.ifPresent(p -> params.put("deltaY", p));
        pointerType.ifPresent(p -> params.put("pointerType", p));
        return new Command<>("Input.dispatchMouseEvent", params.build());
    }

    public enum DispatchTouchEventType {

        TOUCHSTART("touchStart"), TOUCHEND("touchEnd"), TOUCHMOVE("touchMove"), TOUCHCANCEL("touchCancel");

        private String value;

        DispatchTouchEventType(String value) {
            this.value = value;
        }

        public static DispatchTouchEventType fromString(String s) {
            return java.util.Arrays.stream(DispatchTouchEventType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within DispatchTouchEventType "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static DispatchTouchEventType fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Dispatches a touch event to the page.
     */
    public static Command<Void> dispatchTouchEvent(DispatchTouchEventType type, java.util.List<org.openqa.selenium.devtools.input.model.TouchPoint> touchPoints, java.util.Optional<java.lang.Integer> modifiers, java.util.Optional<org.openqa.selenium.devtools.input.model.TimeSinceEpoch> timestamp) {
        java.util.Objects.requireNonNull(type, "type is required");
        java.util.Objects.requireNonNull(touchPoints, "touchPoints is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("type", type);
        params.put("touchPoints", touchPoints);
        modifiers.ifPresent(p -> params.put("modifiers", p));
        timestamp.ifPresent(p -> params.put("timestamp", p));
        return new Command<>("Input.dispatchTouchEvent", params.build());
    }

    public enum EmulateTouchFromMouseEventType {

        MOUSEPRESSED("mousePressed"), MOUSERELEASED("mouseReleased"), MOUSEMOVED("mouseMoved"), MOUSEWHEEL("mouseWheel");

        private String value;

        EmulateTouchFromMouseEventType(String value) {
            this.value = value;
        }

        public static EmulateTouchFromMouseEventType fromString(String s) {
            return java.util.Arrays.stream(EmulateTouchFromMouseEventType.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within EmulateTouchFromMouseEventType "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static EmulateTouchFromMouseEventType fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    public enum EmulateTouchFromMouseEventButton {

        NONE("none"), LEFT("left"), MIDDLE("middle"), RIGHT("right");

        private String value;

        EmulateTouchFromMouseEventButton(String value) {
            this.value = value;
        }

        public static EmulateTouchFromMouseEventButton fromString(String s) {
            return java.util.Arrays.stream(EmulateTouchFromMouseEventButton.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within EmulateTouchFromMouseEventButton "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static EmulateTouchFromMouseEventButton fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Emulates touch event from the mouse event parameters.
     */
    @Beta()
    public static Command<Void> emulateTouchFromMouseEvent(EmulateTouchFromMouseEventType type, java.lang.Integer x, java.lang.Integer y, EmulateTouchFromMouseEventButton button, java.util.Optional<org.openqa.selenium.devtools.input.model.TimeSinceEpoch> timestamp, java.util.Optional<java.lang.Number> deltaX, java.util.Optional<java.lang.Number> deltaY, java.util.Optional<java.lang.Integer> modifiers, java.util.Optional<java.lang.Integer> clickCount) {
        java.util.Objects.requireNonNull(type, "type is required");
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        java.util.Objects.requireNonNull(button, "button is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("type", type);
        params.put("x", x);
        params.put("y", y);
        params.put("button", button);
        timestamp.ifPresent(p -> params.put("timestamp", p));
        deltaX.ifPresent(p -> params.put("deltaX", p));
        deltaY.ifPresent(p -> params.put("deltaY", p));
        modifiers.ifPresent(p -> params.put("modifiers", p));
        clickCount.ifPresent(p -> params.put("clickCount", p));
        return new Command<>("Input.emulateTouchFromMouseEvent", params.build());
    }

    /**
     * Ignores input events (useful while auditing page).
     */
    public static Command<Void> setIgnoreInputEvents(java.lang.Boolean ignore) {
        java.util.Objects.requireNonNull(ignore, "ignore is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("ignore", ignore);
        return new Command<>("Input.setIgnoreInputEvents", params.build());
    }

    /**
     * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
     */
    @Beta()
    public static Command<Void> synthesizePinchGesture(java.lang.Number x, java.lang.Number y, java.lang.Number scaleFactor, java.util.Optional<java.lang.Integer> relativeSpeed, java.util.Optional<org.openqa.selenium.devtools.input.model.GestureSourceType> gestureSourceType) {
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        java.util.Objects.requireNonNull(scaleFactor, "scaleFactor is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("x", x);
        params.put("y", y);
        params.put("scaleFactor", scaleFactor);
        relativeSpeed.ifPresent(p -> params.put("relativeSpeed", p));
        gestureSourceType.ifPresent(p -> params.put("gestureSourceType", p));
        return new Command<>("Input.synthesizePinchGesture", params.build());
    }

    /**
     * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
     */
    @Beta()
    public static Command<Void> synthesizeScrollGesture(java.lang.Number x, java.lang.Number y, java.util.Optional<java.lang.Number> xDistance, java.util.Optional<java.lang.Number> yDistance, java.util.Optional<java.lang.Number> xOverscroll, java.util.Optional<java.lang.Number> yOverscroll, java.util.Optional<java.lang.Boolean> preventFling, java.util.Optional<java.lang.Integer> speed, java.util.Optional<org.openqa.selenium.devtools.input.model.GestureSourceType> gestureSourceType, java.util.Optional<java.lang.Integer> repeatCount, java.util.Optional<java.lang.Integer> repeatDelayMs, java.util.Optional<java.lang.String> interactionMarkerName) {
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("x", x);
        params.put("y", y);
        xDistance.ifPresent(p -> params.put("xDistance", p));
        yDistance.ifPresent(p -> params.put("yDistance", p));
        xOverscroll.ifPresent(p -> params.put("xOverscroll", p));
        yOverscroll.ifPresent(p -> params.put("yOverscroll", p));
        preventFling.ifPresent(p -> params.put("preventFling", p));
        speed.ifPresent(p -> params.put("speed", p));
        gestureSourceType.ifPresent(p -> params.put("gestureSourceType", p));
        repeatCount.ifPresent(p -> params.put("repeatCount", p));
        repeatDelayMs.ifPresent(p -> params.put("repeatDelayMs", p));
        interactionMarkerName.ifPresent(p -> params.put("interactionMarkerName", p));
        return new Command<>("Input.synthesizeScrollGesture", params.build());
    }

    /**
     * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
     */
    @Beta()
    public static Command<Void> synthesizeTapGesture(java.lang.Number x, java.lang.Number y, java.util.Optional<java.lang.Integer> duration, java.util.Optional<java.lang.Integer> tapCount, java.util.Optional<org.openqa.selenium.devtools.input.model.GestureSourceType> gestureSourceType) {
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("x", x);
        params.put("y", y);
        duration.ifPresent(p -> params.put("duration", p));
        tapCount.ifPresent(p -> params.put("tapCount", p));
        gestureSourceType.ifPresent(p -> params.put("gestureSourceType", p));
        return new Command<>("Input.synthesizeTapGesture", params.build());
    }
}
