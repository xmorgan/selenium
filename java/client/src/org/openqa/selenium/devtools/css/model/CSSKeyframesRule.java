package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS keyframes rule representation.
 */
public class CSSKeyframesRule {

    private final org.openqa.selenium.devtools.css.model.Value animationName;

    private final java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframeRule> keyframes;

    public CSSKeyframesRule(org.openqa.selenium.devtools.css.model.Value animationName, java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframeRule> keyframes) {
        this.animationName = java.util.Objects.requireNonNull(animationName, "animationName is required");
        this.keyframes = java.util.Objects.requireNonNull(keyframes, "keyframes is required");
    }

    /**
     * Animation name.
     */
    public org.openqa.selenium.devtools.css.model.Value getAnimationName() {
        return animationName;
    }

    /**
     * List of keyframes.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframeRule> getKeyframes() {
        return keyframes;
    }

    private static CSSKeyframesRule fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.Value animationName = null;
        java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframeRule> keyframes = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "animationName":
                    animationName = input.read(org.openqa.selenium.devtools.css.model.Value.class);
                    break;
                case "keyframes":
                    keyframes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframeRule>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CSSKeyframesRule(animationName, keyframes);
    }
}
