package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class LayerPainted {

    private final org.openqa.selenium.devtools.layertree.model.LayerId layerId;

    private final org.openqa.selenium.devtools.dom.model.Rect clip;

    public LayerPainted(org.openqa.selenium.devtools.layertree.model.LayerId layerId, org.openqa.selenium.devtools.dom.model.Rect clip) {
        this.layerId = java.util.Objects.requireNonNull(layerId, "layerId is required");
        this.clip = java.util.Objects.requireNonNull(clip, "clip is required");
    }

    /**
     * The id of the painted layer.
     */
    public org.openqa.selenium.devtools.layertree.model.LayerId getLayerId() {
        return layerId;
    }

    /**
     * Clip rectangle.
     */
    public org.openqa.selenium.devtools.dom.model.Rect getClip() {
        return clip;
    }

    private static LayerPainted fromJson(JsonInput input) {
        org.openqa.selenium.devtools.layertree.model.LayerId layerId = null;
        org.openqa.selenium.devtools.dom.model.Rect clip = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "layerId":
                    layerId = input.read(org.openqa.selenium.devtools.layertree.model.LayerId.class);
                    break;
                case "clip":
                    clip = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new LayerPainted(layerId, clip);
    }
}
