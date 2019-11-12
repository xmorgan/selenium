package org.openqa.selenium.devtools.animation.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Keyframe Style
 */
public class KeyframeStyle {

    private final java.lang.String offset;

    private final java.lang.String easing;

    public KeyframeStyle(java.lang.String offset, java.lang.String easing) {
        this.offset = java.util.Objects.requireNonNull(offset, "offset is required");
        this.easing = java.util.Objects.requireNonNull(easing, "easing is required");
    }

    /**
     * Keyframe's time offset.
     */
    public java.lang.String getOffset() {
        return offset;
    }

    /**
     * `AnimationEffect`'s timing function.
     */
    public java.lang.String getEasing() {
        return easing;
    }

    private static KeyframeStyle fromJson(JsonInput input) {
        java.lang.String offset = null;
        java.lang.String easing = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "offset":
                    offset = input.nextString();
                    break;
                case "easing":
                    easing = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new KeyframeStyle(offset, easing);
    }
}
