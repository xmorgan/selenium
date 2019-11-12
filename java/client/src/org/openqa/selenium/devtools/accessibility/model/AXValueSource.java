package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A single source for a computed AX property.
 */
public class AXValueSource {

    private final org.openqa.selenium.devtools.accessibility.model.AXValueSourceType type;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue value;

    private final java.lang.String attribute;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue attributeValue;

    private final java.lang.Boolean superseded;

    private final org.openqa.selenium.devtools.accessibility.model.AXValueNativeSourceType nativeSource;

    private final org.openqa.selenium.devtools.accessibility.model.AXValue nativeSourceValue;

    private final java.lang.Boolean invalid;

    private final java.lang.String invalidReason;

    public AXValueSource(org.openqa.selenium.devtools.accessibility.model.AXValueSourceType type, org.openqa.selenium.devtools.accessibility.model.AXValue value, java.lang.String attribute, org.openqa.selenium.devtools.accessibility.model.AXValue attributeValue, java.lang.Boolean superseded, org.openqa.selenium.devtools.accessibility.model.AXValueNativeSourceType nativeSource, org.openqa.selenium.devtools.accessibility.model.AXValue nativeSourceValue, java.lang.Boolean invalid, java.lang.String invalidReason) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.value = value;
        this.attribute = attribute;
        this.attributeValue = attributeValue;
        this.superseded = superseded;
        this.nativeSource = nativeSource;
        this.nativeSourceValue = nativeSourceValue;
        this.invalid = invalid;
        this.invalidReason = invalidReason;
    }

    /**
     * What type of source this is.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValueSourceType getType() {
        return type;
    }

    /**
     * The value of this property source.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getValue() {
        return value;
    }

    /**
     * The name of the relevant attribute, if any.
     */
    public java.lang.String getAttribute() {
        return attribute;
    }

    /**
     * The value of the relevant attribute, if any.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getAttributeValue() {
        return attributeValue;
    }

    /**
     * Whether this source is superseded by a higher priority source.
     */
    public java.lang.Boolean getSuperseded() {
        return superseded;
    }

    /**
     * The native markup source for this value, e.g. a <label> element.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValueNativeSourceType getNativeSource() {
        return nativeSource;
    }

    /**
     * The value, such as a node or node list, of the native source.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValue getNativeSourceValue() {
        return nativeSourceValue;
    }

    /**
     * Whether the value for this property is invalid.
     */
    public java.lang.Boolean getInvalid() {
        return invalid;
    }

    /**
     * Reason for the value being invalid, if it is.
     */
    public java.lang.String getInvalidReason() {
        return invalidReason;
    }

    private static AXValueSource fromJson(JsonInput input) {
        org.openqa.selenium.devtools.accessibility.model.AXValueSourceType type = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue value = null;
        java.lang.String attribute = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue attributeValue = null;
        java.lang.Boolean superseded = null;
        org.openqa.selenium.devtools.accessibility.model.AXValueNativeSourceType nativeSource = null;
        org.openqa.selenium.devtools.accessibility.model.AXValue nativeSourceValue = null;
        java.lang.Boolean invalid = null;
        java.lang.String invalidReason = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = input.read(org.openqa.selenium.devtools.accessibility.model.AXValueSourceType.class);
                    break;
                case "value":
                    value = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "attribute":
                    attribute = input.nextString();
                    break;
                case "attributeValue":
                    attributeValue = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "superseded":
                    superseded = input.nextBoolean();
                    break;
                case "nativeSource":
                    nativeSource = input.read(org.openqa.selenium.devtools.accessibility.model.AXValueNativeSourceType.class);
                    break;
                case "nativeSourceValue":
                    nativeSourceValue = input.read(org.openqa.selenium.devtools.accessibility.model.AXValue.class);
                    break;
                case "invalid":
                    invalid = input.nextBoolean();
                    break;
                case "invalidReason":
                    invalidReason = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AXValueSource(type, value, attribute, attributeValue, superseded, nativeSource, nativeSourceValue, invalid, invalidReason);
    }
}
