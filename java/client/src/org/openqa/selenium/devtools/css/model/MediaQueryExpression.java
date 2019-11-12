package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Media query expression descriptor.
 */
public class MediaQueryExpression {

    private final java.lang.Number value;

    private final java.lang.String unit;

    private final java.lang.String feature;

    private final org.openqa.selenium.devtools.css.model.SourceRange valueRange;

    private final java.lang.Number computedLength;

    public MediaQueryExpression(java.lang.Number value, java.lang.String unit, java.lang.String feature, org.openqa.selenium.devtools.css.model.SourceRange valueRange, java.lang.Number computedLength) {
        this.value = java.util.Objects.requireNonNull(value, "value is required");
        this.unit = java.util.Objects.requireNonNull(unit, "unit is required");
        this.feature = java.util.Objects.requireNonNull(feature, "feature is required");
        this.valueRange = valueRange;
        this.computedLength = computedLength;
    }

    /**
     * Media query expression value.
     */
    public java.lang.Number getValue() {
        return value;
    }

    /**
     * Media query expression units.
     */
    public java.lang.String getUnit() {
        return unit;
    }

    /**
     * Media query expression feature.
     */
    public java.lang.String getFeature() {
        return feature;
    }

    /**
     * The associated range of the value text in the enclosing stylesheet (if available).
     */
    public org.openqa.selenium.devtools.css.model.SourceRange getValueRange() {
        return valueRange;
    }

    /**
     * Computed length of media query expression (if applicable).
     */
    public java.lang.Number getComputedLength() {
        return computedLength;
    }

    private static MediaQueryExpression fromJson(JsonInput input) {
        java.lang.Number value = null;
        java.lang.String unit = null;
        java.lang.String feature = null;
        org.openqa.selenium.devtools.css.model.SourceRange valueRange = null;
        java.lang.Number computedLength = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "value":
                    value = input.nextNumber();
                    break;
                case "unit":
                    unit = input.nextString();
                    break;
                case "feature":
                    feature = input.nextString();
                    break;
                case "valueRange":
                    valueRange = input.read(org.openqa.selenium.devtools.css.model.SourceRange.class);
                    break;
                case "computedLength":
                    computedLength = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new MediaQueryExpression(value, unit, feature, valueRange, computedLength);
    }
}
