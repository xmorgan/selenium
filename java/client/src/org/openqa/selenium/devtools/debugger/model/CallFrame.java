package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * JavaScript call frame. Array of call frames form the call stack.
 */
public class CallFrame {

    private final org.openqa.selenium.devtools.debugger.model.CallFrameId callFrameId;

    private final java.lang.String functionName;

    private final org.openqa.selenium.devtools.debugger.model.Location functionLocation;

    private final org.openqa.selenium.devtools.debugger.model.Location location;

    private final java.lang.String url;

    private final java.util.List<org.openqa.selenium.devtools.debugger.model.Scope> scopeChain;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject _this;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObject returnValue;

    public CallFrame(org.openqa.selenium.devtools.debugger.model.CallFrameId callFrameId, java.lang.String functionName, org.openqa.selenium.devtools.debugger.model.Location functionLocation, org.openqa.selenium.devtools.debugger.model.Location location, java.lang.String url, java.util.List<org.openqa.selenium.devtools.debugger.model.Scope> scopeChain, org.openqa.selenium.devtools.runtime.model.RemoteObject _this, org.openqa.selenium.devtools.runtime.model.RemoteObject returnValue) {
        this.callFrameId = java.util.Objects.requireNonNull(callFrameId, "callFrameId is required");
        this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
        this.functionLocation = functionLocation;
        this.location = java.util.Objects.requireNonNull(location, "location is required");
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.scopeChain = java.util.Objects.requireNonNull(scopeChain, "scopeChain is required");
        this._this = java.util.Objects.requireNonNull(_this, "this is required");
        this.returnValue = returnValue;
    }

    /**
     * Call frame identifier. This identifier is only valid while the virtual machine is paused.
     */
    public org.openqa.selenium.devtools.debugger.model.CallFrameId getCallFrameId() {
        return callFrameId;
    }

    /**
     * Name of the JavaScript function called on this call frame.
     */
    public java.lang.String getFunctionName() {
        return functionName;
    }

    /**
     * Location in the source code.
     */
    public org.openqa.selenium.devtools.debugger.model.Location getFunctionLocation() {
        return functionLocation;
    }

    /**
     * Location in the source code.
     */
    public org.openqa.selenium.devtools.debugger.model.Location getLocation() {
        return location;
    }

    /**
     * JavaScript script name or url.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Scope chain for this call frame.
     */
    public java.util.List<org.openqa.selenium.devtools.debugger.model.Scope> getScopeChain() {
        return scopeChain;
    }

    /**
     * `this` object for this call frame.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getThis() {
        return _this;
    }

    /**
     * The value being returned, if the function is at return point.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObject getReturnValue() {
        return returnValue;
    }

    private static CallFrame fromJson(JsonInput input) {
        org.openqa.selenium.devtools.debugger.model.CallFrameId callFrameId = null;
        java.lang.String functionName = null;
        org.openqa.selenium.devtools.debugger.model.Location functionLocation = null;
        org.openqa.selenium.devtools.debugger.model.Location location = null;
        java.lang.String url = null;
        java.util.List<org.openqa.selenium.devtools.debugger.model.Scope> scopeChain = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject _this = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObject returnValue = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "callFrameId":
                    callFrameId = input.read(org.openqa.selenium.devtools.debugger.model.CallFrameId.class);
                    break;
                case "functionName":
                    functionName = input.nextString();
                    break;
                case "functionLocation":
                    functionLocation = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                    break;
                case "location":
                    location = input.read(org.openqa.selenium.devtools.debugger.model.Location.class);
                    break;
                case "url":
                    url = input.nextString();
                    break;
                case "scopeChain":
                    scopeChain = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.debugger.model.Scope>>() {
                    }.getType());
                    break;
                case "this":
                    _this = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                case "returnValue":
                    returnValue = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObject.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CallFrame(callFrameId, functionName, functionLocation, location, url, scopeChain, _this, returnValue);
    }
}
