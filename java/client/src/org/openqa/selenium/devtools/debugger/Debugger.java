package org.openqa.selenium.devtools.debugger;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Debugger domain exposes JavaScript debugging capabilities. It allows setting and removing
 * breakpoints, stepping through execution, exploring stack traces, etc.
 */
public class Debugger {

    public enum ContinueToLocationTargetCallFrames {

        ANY("any"), CURRENT("current");

        private String value;

        ContinueToLocationTargetCallFrames(String value) {
            this.value = value;
        }

        public static ContinueToLocationTargetCallFrames fromString(String s) {
            return java.util.Arrays.stream(ContinueToLocationTargetCallFrames.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within ContinueToLocationTargetCallFrames "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static ContinueToLocationTargetCallFrames fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Continues execution until specific location is reached.
     */
    public static Command<Void> continueToLocation(org.openqa.selenium.devtools.debugger.model.Location location, java.util.Optional<ContinueToLocationTargetCallFrames> targetCallFrames) {
        java.util.Objects.requireNonNull(location, "location is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("location", location);
        targetCallFrames.ifPresent(p -> params.put("targetCallFrames", p));
        return new Command<>("Debugger.continueToLocation", params.build());
    }

    /**
     * Disables debugger for given page.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Debugger.disable", params.build());
    }

    /**
     * Enables debugger for the given page. Clients should not assume that the debugging has been
     * enabled until the result for this command is received.
     */
    public static Command<org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId> enable(java.util.Optional<java.lang.Number> maxScriptsCacheSize) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        maxScriptsCacheSize.ifPresent(p -> params.put("maxScriptsCacheSize", p));
        return new Command<>("Debugger.enable", params.build(), ConverterFunctions.map("debuggerId", org.openqa.selenium.devtools.runtime.model.UniqueDebuggerId.class));
    }

    public static class EvaluateOnCallFrameResponse {

        private final org.openqa.selenium.devtools.runtime.model.RemoteObject result;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public EvaluateOnCallFrameResponse(org.openqa.selenium.devtools.runtime.model.RemoteObject result, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.result = java.util.Objects.requireNonNull(result, "result is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Object wrapper for the evaluation result.
         */
        public org.openqa.selenium.devtools.runtime.model.RemoteObject getResult() {
            return result;
        }

        /**
         * Exception details.
         */
        public org.openqa.selenium.devtools.runtime.model.ExceptionDetails getExceptionDetails() {
            return exceptionDetails;
        }

        private static EvaluateOnCallFrameResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.runtime.model.RemoteObject result = null;
            org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "result":
                        result = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                        break;
                    case "exceptionDetails":
                        exceptionDetails = input.read(org.openqa.selenium.devtools.runtime.model.ExceptionDetails.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new EvaluateOnCallFrameResponse(result, exceptionDetails);
        }
    }

    /**
     * Evaluates expression on a given call frame.
     */
    public static Command<org.openqa.selenium.devtools.debugger.Debugger.EvaluateOnCallFrameResponse> evaluateOnCallFrame(org.openqa.selenium.devtools.debugger.model.CallFrameId callFrameId, java.lang.String expression, java.util.Optional<java.lang.String> objectGroup, java.util.Optional<java.lang.Boolean> includeCommandLineAPI, java.util.Optional<java.lang.Boolean> silent, java.util.Optional<java.lang.Boolean> returnByValue, java.util.Optional<java.lang.Boolean> generatePreview, java.util.Optional<java.lang.Boolean> throwOnSideEffect, java.util.Optional<org.openqa.selenium.devtools.runtime.model.TimeDelta> timeout) {
        java.util.Objects.requireNonNull(callFrameId, "callFrameId is required");
        java.util.Objects.requireNonNull(expression, "expression is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("callFrameId", callFrameId);
        params.put("expression", expression);
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        includeCommandLineAPI.ifPresent(p -> params.put("includeCommandLineAPI", p));
        silent.ifPresent(p -> params.put("silent", p));
        returnByValue.ifPresent(p -> params.put("returnByValue", p));
        generatePreview.ifPresent(p -> params.put("generatePreview", p));
        throwOnSideEffect.ifPresent(p -> params.put("throwOnSideEffect", p));
        timeout.ifPresent(p -> params.put("timeout", p));
        return new Command<>("Debugger.evaluateOnCallFrame", params.build(), input -> input.read(org.openqa.selenium.devtools.debugger.Debugger.EvaluateOnCallFrameResponse.class));
    }

    /**
     * Returns possible locations for breakpoint. scriptId in start and end range locations should be
     * the same.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.debugger.model.BreakLocation>> getPossibleBreakpoints(org.openqa.selenium.devtools.debugger.model.Location start, java.util.Optional<org.openqa.selenium.devtools.debugger.model.Location> end, java.util.Optional<java.lang.Boolean> restrictToFunction) {
        java.util.Objects.requireNonNull(start, "start is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("start", start);
        end.ifPresent(p -> params.put("end", p));
        restrictToFunction.ifPresent(p -> params.put("restrictToFunction", p));
        return new Command<>("Debugger.getPossibleBreakpoints", params.build(), ConverterFunctions.map("locations", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.BreakLocation>>() {
        }.getType()));
    }

    /**
     * Returns source for the script with given id.
     */
    public static Command<java.lang.String> getScriptSource(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId) {
        java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scriptId", scriptId);
        return new Command<>("Debugger.getScriptSource", params.build(), ConverterFunctions.map("scriptSource", java.lang.String.class));
    }

    /**
     * Returns stack trace with given `stackTraceId`.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.runtime.model.StackTrace> getStackTrace(org.openqa.selenium.devtools.runtime.model.StackTraceId stackTraceId) {
        java.util.Objects.requireNonNull(stackTraceId, "stackTraceId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("stackTraceId", stackTraceId);
        return new Command<>("Debugger.getStackTrace", params.build(), ConverterFunctions.map("stackTrace", org.openqa.selenium.devtools.runtime.model.StackTrace.class));
    }

    /**
     * Stops on the next JavaScript statement.
     */
    public static Command<Void> pause() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Debugger.pause", params.build());
    }

    @Beta()
    public static Command<Void> pauseOnAsyncCall(org.openqa.selenium.devtools.runtime.model.StackTraceId parentStackTraceId) {
        java.util.Objects.requireNonNull(parentStackTraceId, "parentStackTraceId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("parentStackTraceId", parentStackTraceId);
        return new Command<>("Debugger.pauseOnAsyncCall", params.build());
    }

    /**
     * Removes JavaScript breakpoint.
     */
    public static Command<Void> removeBreakpoint(org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId) {
        java.util.Objects.requireNonNull(breakpointId, "breakpointId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("breakpointId", breakpointId);
        return new Command<>("Debugger.removeBreakpoint", params.build());
    }

    public static class RestartFrameResponse {

        private final java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames;

        private final org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace;

        private final org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId;

        public RestartFrameResponse(java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames, org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace, org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId) {
            this.callFrames = java.util.Objects.requireNonNull(callFrames, "callFrames is required");
            this.asyncStackTrace = java.util.Objects.requireNonNull(asyncStackTrace, "asyncStackTrace is required");
            this.asyncStackTraceId = java.util.Objects.requireNonNull(asyncStackTraceId, "asyncStackTraceId is required");
        }

        /**
         * New stack trace.
         */
        public java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> getCallFrames() {
            return callFrames;
        }

        /**
         * Async stack trace, if any.
         */
        public org.openqa.selenium.devtools.runtime.model.StackTrace getAsyncStackTrace() {
            return asyncStackTrace;
        }

        /**
         * Async stack trace, if any.
         */
        public org.openqa.selenium.devtools.runtime.model.StackTraceId getAsyncStackTraceId() {
            return asyncStackTraceId;
        }

        private static RestartFrameResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames = null;
            org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace = null;
            org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "callFrames":
                        callFrames = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame>>() {
                        }.getType());
                        break;
                    case "asyncStackTrace":
                        asyncStackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                        break;
                    case "asyncStackTraceId":
                        asyncStackTraceId = input.read(org.openqa.selenium.devtools.runtime.model.StackTraceId.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new RestartFrameResponse(callFrames, asyncStackTrace, asyncStackTraceId);
        }
    }

    /**
     * Restarts particular call frame from the beginning.
     */
    public static Command<org.openqa.selenium.devtools.debugger.Debugger.RestartFrameResponse> restartFrame(org.openqa.selenium.devtools.debugger.model.CallFrameId callFrameId) {
        java.util.Objects.requireNonNull(callFrameId, "callFrameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("callFrameId", callFrameId);
        return new Command<>("Debugger.restartFrame", params.build(), input -> input.read(org.openqa.selenium.devtools.debugger.Debugger.RestartFrameResponse.class));
    }

    /**
     * Resumes JavaScript execution.
     */
    public static Command<Void> resume() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Debugger.resume", params.build());
    }

    /**
     * Searches for given string in script content.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.debugger.model.SearchMatch>> searchInContent(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String query, java.util.Optional<java.lang.Boolean> caseSensitive, java.util.Optional<java.lang.Boolean> isRegex) {
        java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        java.util.Objects.requireNonNull(query, "query is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scriptId", scriptId);
        params.put("query", query);
        caseSensitive.ifPresent(p -> params.put("caseSensitive", p));
        isRegex.ifPresent(p -> params.put("isRegex", p));
        return new Command<>("Debugger.searchInContent", params.build(), ConverterFunctions.map("result", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.SearchMatch>>() {
        }.getType()));
    }

    /**
     * Enables or disables async call stacks tracking.
     */
    public static Command<Void> setAsyncCallStackDepth(java.lang.Integer maxDepth) {
        java.util.Objects.requireNonNull(maxDepth, "maxDepth is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("maxDepth", maxDepth);
        return new Command<>("Debugger.setAsyncCallStackDepth", params.build());
    }

    /**
     * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
     * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
     * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
     */
    @Beta()
    public static Command<Void> setBlackboxPatterns(java.util.List<java.lang.String> patterns) {
        java.util.Objects.requireNonNull(patterns, "patterns is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("patterns", patterns);
        return new Command<>("Debugger.setBlackboxPatterns", params.build());
    }

    /**
     * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
     * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
     * Positions array contains positions where blackbox state is changed. First interval isn't
     * blackboxed. Array should be sorted.
     */
    @Beta()
    public static Command<Void> setBlackboxedRanges(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.util.List<org.openqa.selenium.devtools.debugger.model.ScriptPosition> positions) {
        java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        java.util.Objects.requireNonNull(positions, "positions is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scriptId", scriptId);
        params.put("positions", positions);
        return new Command<>("Debugger.setBlackboxedRanges", params.build());
    }

    public static class SetBreakpointResponse {

        private final org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId;

        private final org.openqa.selenium.devtools.debugger.model.Location actualLocation;

        public SetBreakpointResponse(org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId, org.openqa.selenium.devtools.debugger.model.Location actualLocation) {
            this.breakpointId = java.util.Objects.requireNonNull(breakpointId, "breakpointId is required");
            this.actualLocation = java.util.Objects.requireNonNull(actualLocation, "actualLocation is required");
        }

        /**
         * Id of the created breakpoint for further reference.
         */
        public org.openqa.selenium.devtools.debugger.model.BreakpointId getBreakpointId() {
            return breakpointId;
        }

        /**
         * Location this breakpoint resolved into.
         */
        public org.openqa.selenium.devtools.debugger.model.Location getActualLocation() {
            return actualLocation;
        }

        private static SetBreakpointResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId = null;
            org.openqa.selenium.devtools.debugger.model.Location actualLocation = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "breakpointId":
                        breakpointId = input.read(org.openqa.selenium.devtools.debugger.model.BreakpointId.class);
                        break;
                    case "actualLocation":
                        actualLocation = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new SetBreakpointResponse(breakpointId, actualLocation);
        }
    }

    /**
     * Sets JavaScript breakpoint at a given location.
     */
    public static Command<org.openqa.selenium.devtools.debugger.Debugger.SetBreakpointResponse> setBreakpoint(org.openqa.selenium.devtools.debugger.model.Location location, java.util.Optional<java.lang.String> condition) {
        java.util.Objects.requireNonNull(location, "location is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("location", location);
        condition.ifPresent(p -> params.put("condition", p));
        return new Command<>("Debugger.setBreakpoint", params.build(), input -> input.read(org.openqa.selenium.devtools.debugger.Debugger.SetBreakpointResponse.class));
    }

    public enum SetInstrumentationBreakpointInstrumentation {

        BEFORESCRIPTEXECUTION("beforeScriptExecution"), BEFORESCRIPTWITHSOURCEMAPEXECUTION("beforeScriptWithSourceMapExecution");

        private String value;

        SetInstrumentationBreakpointInstrumentation(String value) {
            this.value = value;
        }

        public static SetInstrumentationBreakpointInstrumentation fromString(String s) {
            return java.util.Arrays.stream(SetInstrumentationBreakpointInstrumentation.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetInstrumentationBreakpointInstrumentation "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetInstrumentationBreakpointInstrumentation fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Sets instrumentation breakpoint.
     */
    public static Command<org.openqa.selenium.devtools.debugger.model.BreakpointId> setInstrumentationBreakpoint(SetInstrumentationBreakpointInstrumentation instrumentation) {
        java.util.Objects.requireNonNull(instrumentation, "instrumentation is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("instrumentation", instrumentation);
        return new Command<>("Debugger.setInstrumentationBreakpoint", params.build(), ConverterFunctions.map("breakpointId", org.openqa.selenium.devtools.debugger.model.BreakpointId.class));
    }

    public static class SetBreakpointByUrlResponse {

        private final org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId;

        private final java.util.List<org.openqa.selenium.devtools.debugger.model.Location> locations;

        public SetBreakpointByUrlResponse(org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId, java.util.List<org.openqa.selenium.devtools.debugger.model.Location> locations) {
            this.breakpointId = java.util.Objects.requireNonNull(breakpointId, "breakpointId is required");
            this.locations = java.util.Objects.requireNonNull(locations, "locations is required");
        }

        /**
         * Id of the created breakpoint for further reference.
         */
        public org.openqa.selenium.devtools.debugger.model.BreakpointId getBreakpointId() {
            return breakpointId;
        }

        /**
         * List of the locations this breakpoint resolved into upon addition.
         */
        public java.util.List<org.openqa.selenium.devtools.debugger.model.Location> getLocations() {
            return locations;
        }

        private static SetBreakpointByUrlResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.debugger.model.BreakpointId breakpointId = null;
            java.util.List<org.openqa.selenium.devtools.debugger.model.Location> locations = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "breakpointId":
                        breakpointId = input.read(org.openqa.selenium.devtools.debugger.model.BreakpointId.class);
                        break;
                    case "locations":
                        locations = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.Location>>() {
                        }.getType());
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new SetBreakpointByUrlResponse(breakpointId, locations);
        }
    }

    /**
     * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
     * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
     * `locations` property. Further matching script parsing will result in subsequent
     * `breakpointResolved` events issued. This logical breakpoint will survive page reloads.
     */
    public static Command<org.openqa.selenium.devtools.debugger.Debugger.SetBreakpointByUrlResponse> setBreakpointByUrl(java.lang.Integer lineNumber, java.util.Optional<java.lang.String> url, java.util.Optional<java.lang.String> urlRegex, java.util.Optional<java.lang.String> scriptHash, java.util.Optional<java.lang.Integer> columnNumber, java.util.Optional<java.lang.String> condition) {
        java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("lineNumber", lineNumber);
        url.ifPresent(p -> params.put("url", p));
        urlRegex.ifPresent(p -> params.put("urlRegex", p));
        scriptHash.ifPresent(p -> params.put("scriptHash", p));
        columnNumber.ifPresent(p -> params.put("columnNumber", p));
        condition.ifPresent(p -> params.put("condition", p));
        return new Command<>("Debugger.setBreakpointByUrl", params.build(), input -> input.read(org.openqa.selenium.devtools.debugger.Debugger.SetBreakpointByUrlResponse.class));
    }

    /**
     * Sets JavaScript breakpoint before each call to the given function.
     * If another function was created from the same source as a given one,
     * calling it will also trigger the breakpoint.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.debugger.model.BreakpointId> setBreakpointOnFunctionCall(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId, java.util.Optional<java.lang.String> condition) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        condition.ifPresent(p -> params.put("condition", p));
        return new Command<>("Debugger.setBreakpointOnFunctionCall", params.build(), ConverterFunctions.map("breakpointId", org.openqa.selenium.devtools.debugger.model.BreakpointId.class));
    }

    /**
     * Activates / deactivates all breakpoints on the page.
     */
    public static Command<Void> setBreakpointsActive(java.lang.Boolean active) {
        java.util.Objects.requireNonNull(active, "active is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("active", active);
        return new Command<>("Debugger.setBreakpointsActive", params.build());
    }

    public enum SetPauseOnExceptionsState {

        NONE("none"), UNCAUGHT("uncaught"), ALL("all");

        private String value;

        SetPauseOnExceptionsState(String value) {
            this.value = value;
        }

        public static SetPauseOnExceptionsState fromString(String s) {
            return java.util.Arrays.stream(SetPauseOnExceptionsState.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetPauseOnExceptionsState "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetPauseOnExceptionsState fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
     * no exceptions. Initial pause on exceptions state is `none`.
     */
    public static Command<Void> setPauseOnExceptions(SetPauseOnExceptionsState state) {
        java.util.Objects.requireNonNull(state, "state is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("state", state);
        return new Command<>("Debugger.setPauseOnExceptions", params.build());
    }

    /**
     * Changes return value in top frame. Available only at return break position.
     */
    @Beta()
    public static Command<Void> setReturnValue(org.openqa.selenium.devtools.runtime.model.CallArgument newValue) {
        java.util.Objects.requireNonNull(newValue, "newValue is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("newValue", newValue);
        return new Command<>("Debugger.setReturnValue", params.build());
    }

    public static class SetScriptSourceResponse {

        private final java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames;

        private final java.lang.Boolean stackChanged;

        private final org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace;

        private final org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public SetScriptSourceResponse(java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames, java.lang.Boolean stackChanged, org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace, org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.callFrames = java.util.Objects.requireNonNull(callFrames, "callFrames is required");
            this.stackChanged = java.util.Objects.requireNonNull(stackChanged, "stackChanged is required");
            this.asyncStackTrace = java.util.Objects.requireNonNull(asyncStackTrace, "asyncStackTrace is required");
            this.asyncStackTraceId = java.util.Objects.requireNonNull(asyncStackTraceId, "asyncStackTraceId is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * New stack trace in case editing has happened while VM was stopped.
         */
        public java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> getCallFrames() {
            return callFrames;
        }

        /**
         * Whether current call stack  was modified after applying the changes.
         */
        public java.lang.Boolean getStackChanged() {
            return stackChanged;
        }

        /**
         * Async stack trace, if any.
         */
        public org.openqa.selenium.devtools.runtime.model.StackTrace getAsyncStackTrace() {
            return asyncStackTrace;
        }

        /**
         * Async stack trace, if any.
         */
        public org.openqa.selenium.devtools.runtime.model.StackTraceId getAsyncStackTraceId() {
            return asyncStackTraceId;
        }

        /**
         * Exception details if any.
         */
        public org.openqa.selenium.devtools.runtime.model.ExceptionDetails getExceptionDetails() {
            return exceptionDetails;
        }

        private static SetScriptSourceResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame> callFrames = null;
            java.lang.Boolean stackChanged = null;
            org.openqa.selenium.devtools.runtime.model.StackTrace asyncStackTrace = null;
            org.openqa.selenium.devtools.runtime.model.StackTraceId asyncStackTraceId = null;
            org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "callFrames":
                        callFrames = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.CallFrame>>() {
                        }.getType());
                        break;
                    case "stackChanged":
                        stackChanged = input.nextBoolean();
                        break;
                    case "asyncStackTrace":
                        asyncStackTrace = input.read(org.openqa.selenium.devtools.runtime.model.StackTrace.class);
                        break;
                    case "asyncStackTraceId":
                        asyncStackTraceId = input.read(org.openqa.selenium.devtools.runtime.model.StackTraceId.class);
                        break;
                    case "exceptionDetails":
                        exceptionDetails = input.read(org.openqa.selenium.devtools.runtime.model.ExceptionDetails.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new SetScriptSourceResponse(callFrames, stackChanged, asyncStackTrace, asyncStackTraceId, exceptionDetails);
        }
    }

    /**
     * Edits JavaScript source live.
     */
    public static Command<org.openqa.selenium.devtools.debugger.Debugger.SetScriptSourceResponse> setScriptSource(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.lang.String scriptSource, java.util.Optional<java.lang.Boolean> dryRun) {
        java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        java.util.Objects.requireNonNull(scriptSource, "scriptSource is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scriptId", scriptId);
        params.put("scriptSource", scriptSource);
        dryRun.ifPresent(p -> params.put("dryRun", p));
        return new Command<>("Debugger.setScriptSource", params.build(), input -> input.read(org.openqa.selenium.devtools.debugger.Debugger.SetScriptSourceResponse.class));
    }

    /**
     * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
     */
    public static Command<Void> setSkipAllPauses(java.lang.Boolean skip) {
        java.util.Objects.requireNonNull(skip, "skip is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("skip", skip);
        return new Command<>("Debugger.setSkipAllPauses", params.build());
    }

    /**
     * Changes value of variable in a callframe. Object-based scopes are not supported and must be
     * mutated manually.
     */
    public static Command<Void> setVariableValue(java.lang.Integer scopeNumber, java.lang.String variableName, org.openqa.selenium.devtools.runtime.model.CallArgument newValue, org.openqa.selenium.devtools.debugger.model.CallFrameId callFrameId) {
        java.util.Objects.requireNonNull(scopeNumber, "scopeNumber is required");
        java.util.Objects.requireNonNull(variableName, "variableName is required");
        java.util.Objects.requireNonNull(newValue, "newValue is required");
        java.util.Objects.requireNonNull(callFrameId, "callFrameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scopeNumber", scopeNumber);
        params.put("variableName", variableName);
        params.put("newValue", newValue);
        params.put("callFrameId", callFrameId);
        return new Command<>("Debugger.setVariableValue", params.build());
    }

    /**
     * Steps into the function call.
     */
    public static Command<Void> stepInto(java.util.Optional<java.lang.Boolean> breakOnAsyncCall) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        breakOnAsyncCall.ifPresent(p -> params.put("breakOnAsyncCall", p));
        return new Command<>("Debugger.stepInto", params.build());
    }

    /**
     * Steps out of the function call.
     */
    public static Command<Void> stepOut() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Debugger.stepOut", params.build());
    }

    /**
     * Steps over the statement.
     */
    public static Command<Void> stepOver() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Debugger.stepOver", params.build());
    }

    public static Event<org.openqa.selenium.devtools.debugger.model.BreakpointResolved> breakpointResolved() {
        return new Event<>("Debugger.breakpointResolved", input -> input.read(org.openqa.selenium.devtools.debugger.model.BreakpointResolved.class));
    }

    public static Event<org.openqa.selenium.devtools.debugger.model.Paused> paused() {
        return new Event<>("Debugger.paused", input -> input.read(org.openqa.selenium.devtools.debugger.model.Paused.class));
    }

    public static Event<Void> resumed() {
        return new Event<>("Debugger.resumed", input -> null);
    }

    public static Event<org.openqa.selenium.devtools.debugger.model.ScriptFailedToParse> scriptFailedToParse() {
        return new Event<>("Debugger.scriptFailedToParse", input -> input.read(org.openqa.selenium.devtools.debugger.model.ScriptFailedToParse.class));
    }

    public static Event<org.openqa.selenium.devtools.debugger.model.ScriptParsed> scriptParsed() {
        return new Event<>("Debugger.scriptParsed", input -> input.read(org.openqa.selenium.devtools.debugger.model.ScriptParsed.class));
    }
}
