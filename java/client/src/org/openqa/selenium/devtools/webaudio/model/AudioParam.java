package org.openqa.selenium.devtools.webaudio.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Protocol object for AudioParam
 */
public class AudioParam {

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId paramId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId;

    private final org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId;

    private final org.openqa.selenium.devtools.webaudio.model.ParamType paramType;

    private final org.openqa.selenium.devtools.webaudio.model.AutomationRate rate;

    private final java.lang.Number defaultValue;

    private final java.lang.Number minValue;

    private final java.lang.Number maxValue;

    public AudioParam(org.openqa.selenium.devtools.webaudio.model.GraphObjectId paramId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId, org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId, org.openqa.selenium.devtools.webaudio.model.ParamType paramType, org.openqa.selenium.devtools.webaudio.model.AutomationRate rate, java.lang.Number defaultValue, java.lang.Number minValue, java.lang.Number maxValue) {
        this.paramId = java.util.Objects.requireNonNull(paramId, "paramId is required");
        this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        this.contextId = java.util.Objects.requireNonNull(contextId, "contextId is required");
        this.paramType = java.util.Objects.requireNonNull(paramType, "paramType is required");
        this.rate = java.util.Objects.requireNonNull(rate, "rate is required");
        this.defaultValue = java.util.Objects.requireNonNull(defaultValue, "defaultValue is required");
        this.minValue = java.util.Objects.requireNonNull(minValue, "minValue is required");
        this.maxValue = java.util.Objects.requireNonNull(maxValue, "maxValue is required");
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getParamId() {
        return paramId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getNodeId() {
        return nodeId;
    }

    public org.openqa.selenium.devtools.webaudio.model.GraphObjectId getContextId() {
        return contextId;
    }

    public org.openqa.selenium.devtools.webaudio.model.ParamType getParamType() {
        return paramType;
    }

    public org.openqa.selenium.devtools.webaudio.model.AutomationRate getRate() {
        return rate;
    }

    public java.lang.Number getDefaultValue() {
        return defaultValue;
    }

    public java.lang.Number getMinValue() {
        return minValue;
    }

    public java.lang.Number getMaxValue() {
        return maxValue;
    }

    private static AudioParam fromJson(JsonInput input) {
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId paramId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId nodeId = null;
        org.openqa.selenium.devtools.webaudio.model.GraphObjectId contextId = null;
        org.openqa.selenium.devtools.webaudio.model.ParamType paramType = null;
        org.openqa.selenium.devtools.webaudio.model.AutomationRate rate = null;
        java.lang.Number defaultValue = null;
        java.lang.Number minValue = null;
        java.lang.Number maxValue = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "paramId":
                    paramId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "nodeId":
                    nodeId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "contextId":
                    contextId = input.read(org.openqa.selenium.devtools.webaudio.model.GraphObjectId.class);
                    break;
                case "paramType":
                    paramType = input.read(org.openqa.selenium.devtools.webaudio.model.ParamType.class);
                    break;
                case "rate":
                    rate = input.read(org.openqa.selenium.devtools.webaudio.model.AutomationRate.class);
                    break;
                case "defaultValue":
                    defaultValue = input.nextNumber();
                    break;
                case "minValue":
                    minValue = input.nextNumber();
                    break;
                case "maxValue":
                    maxValue = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AudioParam(paramId, nodeId, contextId, paramType, rate, defaultValue, minValue, maxValue);
    }
}
