package org.openqa.selenium.devtools.accessibility.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A single computed AX property.
 */
public class AXValue {

    private final org.openqa.selenium.devtools.accessibility.model.AXValueType type;

    private final java.util.Map<String, Object> value;

    private final java.util.List<org.openqa.selenium.devtools.accessibility.model.AXRelatedNode> relatedNodes;

    private final java.util.List<org.openqa.selenium.devtools.accessibility.model.AXValueSource> sources;

    public AXValue(org.openqa.selenium.devtools.accessibility.model.AXValueType type, java.util.Map<String, Object> value, java.util.List<org.openqa.selenium.devtools.accessibility.model.AXRelatedNode> relatedNodes, java.util.List<org.openqa.selenium.devtools.accessibility.model.AXValueSource> sources) {
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.value = value;
        this.relatedNodes = relatedNodes;
        this.sources = sources;
    }

    /**
     * The type of this value.
     */
    public org.openqa.selenium.devtools.accessibility.model.AXValueType getType() {
        return type;
    }

    /**
     * The computed value of this property.
     */
    public java.util.Map<String, Object> getValue() {
        return value;
    }

    /**
     * One or more related nodes, if applicable.
     */
    public java.util.List<org.openqa.selenium.devtools.accessibility.model.AXRelatedNode> getRelatedNodes() {
        return relatedNodes;
    }

    /**
     * The sources which contributed to the computation of this property.
     */
    public java.util.List<org.openqa.selenium.devtools.accessibility.model.AXValueSource> getSources() {
        return sources;
    }

    private static AXValue fromJson(JsonInput input) {
        org.openqa.selenium.devtools.accessibility.model.AXValueType type = null;
        java.util.Map<String, Object> value = null;
        java.util.List<org.openqa.selenium.devtools.accessibility.model.AXRelatedNode> relatedNodes = null;
        java.util.List<org.openqa.selenium.devtools.accessibility.model.AXValueSource> sources = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "type":
                    type = input.read(org.openqa.selenium.devtools.accessibility.model.AXValueType.class);
                    break;
                case "value":
                    value = input.read(new com.google.common.reflect.TypeToken<java.util.Map<String, Object>>() {
                    }.getType());
                    break;
                case "relatedNodes":
                    relatedNodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXRelatedNode>>() {
                    }.getType());
                    break;
                case "sources":
                    sources = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.accessibility.model.AXValueSource>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new AXValue(type, value, relatedNodes, sources);
    }
}
