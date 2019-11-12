package org.openqa.selenium.devtools.runtime;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Runtime domain exposes JavaScript runtime by means of remote evaluation and mirror objects.
 * Evaluation results are returned as mirror object that expose object type, string representation
 * and unique identifier that can be used for further object reference. Original objects are
 * maintained in memory unless they are either explicitly released or are released along with the
 * other objects in their object group.
 */
public class Runtime {

    public static class AwaitPromiseResponse {

        private final org.openqa.selenium.devtools.runtime.model.RemoteObject result;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public AwaitPromiseResponse(org.openqa.selenium.devtools.runtime.model.RemoteObject result, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.result = java.util.Objects.requireNonNull(result, "result is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Promise result. Will contain rejected value if promise was rejected.
         */
        public org.openqa.selenium.devtools.runtime.model.RemoteObject getResult() {
            return result;
        }

        /**
         * Exception details if stack strace is available.
         */
        public org.openqa.selenium.devtools.runtime.model.ExceptionDetails getExceptionDetails() {
            return exceptionDetails;
        }

        private static AwaitPromiseResponse fromJson(JsonInput input) {
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
            return new AwaitPromiseResponse(result, exceptionDetails);
        }
    }

    /**
     * Add handler to promise with given promise object id.
     */
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.AwaitPromiseResponse> awaitPromise(org.openqa.selenium.devtools.runtime.model.RemoteObjectId promiseObjectId, java.util.Optional<java.lang.Boolean> returnByValue, java.util.Optional<java.lang.Boolean> generatePreview) {
        java.util.Objects.requireNonNull(promiseObjectId, "promiseObjectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("promiseObjectId", promiseObjectId);
        returnByValue.ifPresent(p -> params.put("returnByValue", p));
        generatePreview.ifPresent(p -> params.put("generatePreview", p));
        return new Command<>("Runtime.awaitPromise", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.AwaitPromiseResponse.class));
    }

    public static class CallFunctionOnResponse {

        private final org.openqa.selenium.devtools.runtime.model.RemoteObject result;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public CallFunctionOnResponse(org.openqa.selenium.devtools.runtime.model.RemoteObject result, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.result = java.util.Objects.requireNonNull(result, "result is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Call result.
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

        private static CallFunctionOnResponse fromJson(JsonInput input) {
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
            return new CallFunctionOnResponse(result, exceptionDetails);
        }
    }

    /**
     * Calls function with given declaration on the given object. Object group of the result is
     * inherited from the target object.
     */
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.CallFunctionOnResponse> callFunctionOn(java.lang.String functionDeclaration, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId, java.util.Optional<java.util.List<org.openqa.selenium.devtools.runtime.model.CallArgument>> arguments, java.util.Optional<java.lang.Boolean> silent, java.util.Optional<java.lang.Boolean> returnByValue, java.util.Optional<java.lang.Boolean> generatePreview, java.util.Optional<java.lang.Boolean> userGesture, java.util.Optional<java.lang.Boolean> awaitPromise, java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextId, java.util.Optional<java.lang.String> objectGroup) {
        java.util.Objects.requireNonNull(functionDeclaration, "functionDeclaration is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("functionDeclaration", functionDeclaration);
        objectId.ifPresent(p -> params.put("objectId", p));
        arguments.ifPresent(p -> params.put("arguments", p));
        silent.ifPresent(p -> params.put("silent", p));
        returnByValue.ifPresent(p -> params.put("returnByValue", p));
        generatePreview.ifPresent(p -> params.put("generatePreview", p));
        userGesture.ifPresent(p -> params.put("userGesture", p));
        awaitPromise.ifPresent(p -> params.put("awaitPromise", p));
        executionContextId.ifPresent(p -> params.put("executionContextId", p));
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        return new Command<>("Runtime.callFunctionOn", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.CallFunctionOnResponse.class));
    }

    public static class CompileScriptResponse {

        private final org.openqa.selenium.devtools.runtime.model.ScriptId scriptId;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public CompileScriptResponse(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.scriptId = java.util.Objects.requireNonNull(scriptId, "scriptId is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Id of the script.
         */
        public org.openqa.selenium.devtools.runtime.model.ScriptId getScriptId() {
            return scriptId;
        }

        /**
         * Exception details.
         */
        public org.openqa.selenium.devtools.runtime.model.ExceptionDetails getExceptionDetails() {
            return exceptionDetails;
        }

        private static CompileScriptResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.runtime.model.ScriptId scriptId = null;
            org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "scriptId":
                        scriptId = input.read(org.openqa.selenium.devtools.runtime.model.ScriptId.class);
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
            return new CompileScriptResponse(scriptId, exceptionDetails);
        }
    }

    /**
     * Compiles expression.
     */
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.CompileScriptResponse> compileScript(java.lang.String expression, java.lang.String sourceURL, java.lang.Boolean persistScript, java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextId) {
        java.util.Objects.requireNonNull(expression, "expression is required");
        java.util.Objects.requireNonNull(sourceURL, "sourceURL is required");
        java.util.Objects.requireNonNull(persistScript, "persistScript is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("expression", expression);
        params.put("sourceURL", sourceURL);
        params.put("persistScript", persistScript);
        executionContextId.ifPresent(p -> params.put("executionContextId", p));
        return new Command<>("Runtime.compileScript", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.CompileScriptResponse.class));
    }

    /**
     * Disables reporting of execution contexts creation.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.disable", params.build());
    }

    /**
     * Discards collected exceptions and console API calls.
     */
    public static Command<Void> discardConsoleEntries() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.discardConsoleEntries", params.build());
    }

    /**
     * Enables reporting of execution contexts creation by means of `executionContextCreated` event.
     * When the reporting gets enabled the event will be sent immediately for each existing execution
     * context.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.enable", params.build());
    }

    public static class EvaluateResponse {

        private final org.openqa.selenium.devtools.runtime.model.RemoteObject result;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public EvaluateResponse(org.openqa.selenium.devtools.runtime.model.RemoteObject result, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.result = java.util.Objects.requireNonNull(result, "result is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Evaluation result.
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

        private static EvaluateResponse fromJson(JsonInput input) {
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
            return new EvaluateResponse(result, exceptionDetails);
        }
    }

    /**
     * Evaluates expression on global object.
     */
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.EvaluateResponse> evaluate(java.lang.String expression, java.util.Optional<java.lang.String> objectGroup, java.util.Optional<java.lang.Boolean> includeCommandLineAPI, java.util.Optional<java.lang.Boolean> silent, java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> contextId, java.util.Optional<java.lang.Boolean> returnByValue, java.util.Optional<java.lang.Boolean> generatePreview, java.util.Optional<java.lang.Boolean> userGesture, java.util.Optional<java.lang.Boolean> awaitPromise, java.util.Optional<java.lang.Boolean> throwOnSideEffect, java.util.Optional<org.openqa.selenium.devtools.runtime.model.TimeDelta> timeout) {
        java.util.Objects.requireNonNull(expression, "expression is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("expression", expression);
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        includeCommandLineAPI.ifPresent(p -> params.put("includeCommandLineAPI", p));
        silent.ifPresent(p -> params.put("silent", p));
        contextId.ifPresent(p -> params.put("contextId", p));
        returnByValue.ifPresent(p -> params.put("returnByValue", p));
        generatePreview.ifPresent(p -> params.put("generatePreview", p));
        userGesture.ifPresent(p -> params.put("userGesture", p));
        awaitPromise.ifPresent(p -> params.put("awaitPromise", p));
        throwOnSideEffect.ifPresent(p -> params.put("throwOnSideEffect", p));
        timeout.ifPresent(p -> params.put("timeout", p));
        return new Command<>("Runtime.evaluate", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.EvaluateResponse.class));
    }

    /**
     * Returns the isolate id.
     */
    @Beta()
    public static Command<java.lang.String> getIsolateId() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.getIsolateId", params.build(), ConverterFunctions.map("id", java.lang.String.class));
    }

    public static class GetHeapUsageResponse {

        private final java.lang.Number usedSize;

        private final java.lang.Number totalSize;

        public GetHeapUsageResponse(java.lang.Number usedSize, java.lang.Number totalSize) {
            this.usedSize = java.util.Objects.requireNonNull(usedSize, "usedSize is required");
            this.totalSize = java.util.Objects.requireNonNull(totalSize, "totalSize is required");
        }

        /**
         * Used heap size in bytes.
         */
        public java.lang.Number getUsedSize() {
            return usedSize;
        }

        /**
         * Allocated heap size in bytes.
         */
        public java.lang.Number getTotalSize() {
            return totalSize;
        }

        private static GetHeapUsageResponse fromJson(JsonInput input) {
            java.lang.Number usedSize = null;
            java.lang.Number totalSize = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "usedSize":
                        usedSize = input.nextNumber();
                        break;
                    case "totalSize":
                        totalSize = input.nextNumber();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetHeapUsageResponse(usedSize, totalSize);
        }
    }

    /**
     * Returns the JavaScript heap usage.
     * It is the total usage of the corresponding isolate not scoped to a particular Runtime.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.GetHeapUsageResponse> getHeapUsage() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.getHeapUsage", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.GetHeapUsageResponse.class));
    }

    public static class GetPropertiesResponse {

        private final java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyDescriptor> result;

        private final java.util.List<org.openqa.selenium.devtools.runtime.model.InternalPropertyDescriptor> internalProperties;

        private final java.util.List<org.openqa.selenium.devtools.runtime.model.PrivatePropertyDescriptor> privateProperties;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public GetPropertiesResponse(java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyDescriptor> result, java.util.List<org.openqa.selenium.devtools.runtime.model.InternalPropertyDescriptor> internalProperties, java.util.List<org.openqa.selenium.devtools.runtime.model.PrivatePropertyDescriptor> privateProperties, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.result = java.util.Objects.requireNonNull(result, "result is required");
            this.internalProperties = java.util.Objects.requireNonNull(internalProperties, "internalProperties is required");
            this.privateProperties = java.util.Objects.requireNonNull(privateProperties, "privateProperties is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Object properties.
         */
        public java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyDescriptor> getResult() {
            return result;
        }

        /**
         * Internal object properties (only of the element itself).
         */
        public java.util.List<org.openqa.selenium.devtools.runtime.model.InternalPropertyDescriptor> getInternalProperties() {
            return internalProperties;
        }

        /**
         * Object private properties.
         */
        public java.util.List<org.openqa.selenium.devtools.runtime.model.PrivatePropertyDescriptor> getPrivateProperties() {
            return privateProperties;
        }

        /**
         * Exception details.
         */
        public org.openqa.selenium.devtools.runtime.model.ExceptionDetails getExceptionDetails() {
            return exceptionDetails;
        }

        private static GetPropertiesResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyDescriptor> result = null;
            java.util.List<org.openqa.selenium.devtools.runtime.model.InternalPropertyDescriptor> internalProperties = null;
            java.util.List<org.openqa.selenium.devtools.runtime.model.PrivatePropertyDescriptor> privateProperties = null;
            org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "result":
                        result = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.PropertyDescriptor>>() {
                        }.getType());
                        break;
                    case "internalProperties":
                        internalProperties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.InternalPropertyDescriptor>>() {
                        }.getType());
                        break;
                    case "privateProperties":
                        privateProperties = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.runtime.model.PrivatePropertyDescriptor>>() {
                        }.getType());
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
            return new GetPropertiesResponse(result, internalProperties, privateProperties, exceptionDetails);
        }
    }

    /**
     * Returns properties of a given object. Object group of the result is inherited from the target
     * object.
     */
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.GetPropertiesResponse> getProperties(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId, java.util.Optional<java.lang.Boolean> ownProperties, java.util.Optional<java.lang.Boolean> accessorPropertiesOnly, java.util.Optional<java.lang.Boolean> generatePreview) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        ownProperties.ifPresent(p -> params.put("ownProperties", p));
        accessorPropertiesOnly.ifPresent(p -> params.put("accessorPropertiesOnly", p));
        generatePreview.ifPresent(p -> params.put("generatePreview", p));
        return new Command<>("Runtime.getProperties", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.GetPropertiesResponse.class));
    }

    /**
     * Returns all let, const and class variables from global scope.
     */
    public static Command<java.util.List<java.lang.String>> globalLexicalScopeNames(java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        executionContextId.ifPresent(p -> params.put("executionContextId", p));
        return new Command<>("Runtime.globalLexicalScopeNames", params.build(), ConverterFunctions.map("names", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    public static Command<org.openqa.selenium.devtools.runtime.model.RemoteObject> queryObjects(org.openqa.selenium.devtools.runtime.model.RemoteObjectId prototypeObjectId, java.util.Optional<java.lang.String> objectGroup) {
        java.util.Objects.requireNonNull(prototypeObjectId, "prototypeObjectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("prototypeObjectId", prototypeObjectId);
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        return new Command<>("Runtime.queryObjects", params.build(), ConverterFunctions.map("objects", org.openqa.selenium.devtools.runtime.model.RemoteObject.class));
    }

    /**
     * Releases remote object with given id.
     */
    public static Command<Void> releaseObject(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        return new Command<>("Runtime.releaseObject", params.build());
    }

    /**
     * Releases all remote objects that belong to a given group.
     */
    public static Command<Void> releaseObjectGroup(java.lang.String objectGroup) {
        java.util.Objects.requireNonNull(objectGroup, "objectGroup is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectGroup", objectGroup);
        return new Command<>("Runtime.releaseObjectGroup", params.build());
    }

    /**
     * Tells inspected instance to run if it was waiting for debugger to attach.
     */
    public static Command<Void> runIfWaitingForDebugger() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.runIfWaitingForDebugger", params.build());
    }

    public static class RunScriptResponse {

        private final org.openqa.selenium.devtools.runtime.model.RemoteObject result;

        private final org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails;

        public RunScriptResponse(org.openqa.selenium.devtools.runtime.model.RemoteObject result, org.openqa.selenium.devtools.runtime.model.ExceptionDetails exceptionDetails) {
            this.result = java.util.Objects.requireNonNull(result, "result is required");
            this.exceptionDetails = java.util.Objects.requireNonNull(exceptionDetails, "exceptionDetails is required");
        }

        /**
         * Run result.
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

        private static RunScriptResponse fromJson(JsonInput input) {
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
            return new RunScriptResponse(result, exceptionDetails);
        }
    }

    /**
     * Runs script with given id in a given context.
     */
    public static Command<org.openqa.selenium.devtools.runtime.Runtime.RunScriptResponse> runScript(org.openqa.selenium.devtools.runtime.model.ScriptId scriptId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextId, java.util.Optional<java.lang.String> objectGroup, java.util.Optional<java.lang.Boolean> silent, java.util.Optional<java.lang.Boolean> includeCommandLineAPI, java.util.Optional<java.lang.Boolean> returnByValue, java.util.Optional<java.lang.Boolean> generatePreview, java.util.Optional<java.lang.Boolean> awaitPromise) {
        java.util.Objects.requireNonNull(scriptId, "scriptId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scriptId", scriptId);
        executionContextId.ifPresent(p -> params.put("executionContextId", p));
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        silent.ifPresent(p -> params.put("silent", p));
        includeCommandLineAPI.ifPresent(p -> params.put("includeCommandLineAPI", p));
        returnByValue.ifPresent(p -> params.put("returnByValue", p));
        generatePreview.ifPresent(p -> params.put("generatePreview", p));
        awaitPromise.ifPresent(p -> params.put("awaitPromise", p));
        return new Command<>("Runtime.runScript", params.build(), input -> input.read(org.openqa.selenium.devtools.runtime.Runtime.RunScriptResponse.class));
    }

    /**
     * Enables or disables async call stacks tracking.
     */
    public static Command<Void> setAsyncCallStackDepth(java.lang.Integer maxDepth) {
        java.util.Objects.requireNonNull(maxDepth, "maxDepth is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("maxDepth", maxDepth);
        return new Command<>("Runtime.setAsyncCallStackDepth", params.build());
    }

    @Beta()
    public static Command<Void> setCustomObjectFormatterEnabled(java.lang.Boolean enabled) {
        java.util.Objects.requireNonNull(enabled, "enabled is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enabled", enabled);
        return new Command<>("Runtime.setCustomObjectFormatterEnabled", params.build());
    }

    @Beta()
    public static Command<Void> setMaxCallStackSizeToCapture(java.lang.Integer size) {
        java.util.Objects.requireNonNull(size, "size is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("size", size);
        return new Command<>("Runtime.setMaxCallStackSizeToCapture", params.build());
    }

    /**
     * Terminate current or next JavaScript execution.
     * Will cancel the termination when the outer-most script execution ends.
     */
    @Beta()
    public static Command<Void> terminateExecution() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Runtime.terminateExecution", params.build());
    }

    /**
     * If executionContextId is empty, adds binding with the given name on the
     * global objects of all inspected contexts, including those created later,
     * bindings survive reloads.
     * If executionContextId is specified, adds binding only on global object of
     * given execution context.
     * Binding function takes exactly one argument, this argument should be string,
     * in case of any other input, function throws an exception.
     * Each binding function call produces Runtime.bindingCalled notification.
     */
    @Beta()
    public static Command<Void> addBinding(java.lang.String name, java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextId) {
        java.util.Objects.requireNonNull(name, "name is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("name", name);
        executionContextId.ifPresent(p -> params.put("executionContextId", p));
        return new Command<>("Runtime.addBinding", params.build());
    }

    /**
     * This method does not remove binding function from global object but
     * unsubscribes current runtime agent from Runtime.bindingCalled notifications.
     */
    @Beta()
    public static Command<Void> removeBinding(java.lang.String name) {
        java.util.Objects.requireNonNull(name, "name is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("name", name);
        return new Command<>("Runtime.removeBinding", params.build());
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.BindingCalled> bindingCalled() {
        return new Event<>("Runtime.bindingCalled", input -> input.read(org.openqa.selenium.devtools.runtime.model.BindingCalled.class));
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.ConsoleAPICalled> consoleAPICalled() {
        return new Event<>("Runtime.consoleAPICalled", input -> input.read(org.openqa.selenium.devtools.runtime.model.ConsoleAPICalled.class));
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.ExceptionRevoked> exceptionRevoked() {
        return new Event<>("Runtime.exceptionRevoked", input -> input.read(org.openqa.selenium.devtools.runtime.model.ExceptionRevoked.class));
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.ExceptionThrown> exceptionThrown() {
        return new Event<>("Runtime.exceptionThrown", input -> input.read(org.openqa.selenium.devtools.runtime.model.ExceptionThrown.class));
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.ExecutionContextDescription> executionContextCreated() {
        return new Event<>("Runtime.executionContextCreated", ConverterFunctions.map("context", org.openqa.selenium.devtools.runtime.model.ExecutionContextDescription.class));
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextDestroyed() {
        return new Event<>("Runtime.executionContextDestroyed", ConverterFunctions.map("executionContextId", org.openqa.selenium.devtools.runtime.model.ExecutionContextId.class));
    }

    public static Event<Void> executionContextsCleared() {
        return new Event<>("Runtime.executionContextsCleared", input -> null);
    }

    public static Event<org.openqa.selenium.devtools.runtime.model.InspectRequested> inspectRequested() {
        return new Event<>("Runtime.inspectRequested", input -> input.read(org.openqa.selenium.devtools.runtime.model.InspectRequested.class));
    }
}
