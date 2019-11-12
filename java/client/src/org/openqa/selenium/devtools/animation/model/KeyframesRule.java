package org.openqa.selenium.devtools.animation.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Keyframes Rule
 */
public class KeyframesRule {

    private final java.lang.String name;

    private final java.util.List<org.openqa.selenium.devtools.animation.model.KeyframeStyle> keyframes;

    public KeyframesRule(java.lang.String name, java.util.List<org.openqa.selenium.devtools.animation.model.KeyframeStyle> keyframes) {
        this.name = name;
        this.keyframes = java.util.Objects.requireNonNull(keyframes, "keyframes is required");
    }

    /**
     * CSS keyframed animation's name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * List of animation keyframes.
     */
    public java.util.List<org.openqa.selenium.devtools.animation.model.KeyframeStyle> getKeyframes() {
        return keyframes;
    }

    private static KeyframesRule fromJson(JsonInput input) {
        java.lang.String name = null;
        java.util.List<org.openqa.selenium.devtools.animation.model.KeyframeStyle> keyframes = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "keyframes":
                    keyframes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.animation.model.KeyframeStyle>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new KeyframesRule(name, keyframes);
    }
}
