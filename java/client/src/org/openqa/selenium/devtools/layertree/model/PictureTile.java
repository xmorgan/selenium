package org.openqa.selenium.devtools.layertree.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Serialized fragment of layer picture along with its offset within the layer.
 */
public class PictureTile {

    private final java.lang.Number x;

    private final java.lang.Number y;

    private final java.lang.String picture;

    public PictureTile(java.lang.Number x, java.lang.Number y, java.lang.String picture) {
        this.x = java.util.Objects.requireNonNull(x, "x is required");
        this.y = java.util.Objects.requireNonNull(y, "y is required");
        this.picture = java.util.Objects.requireNonNull(picture, "picture is required");
    }

    /**
     * Offset from owning layer left boundary
     */
    public java.lang.Number getX() {
        return x;
    }

    /**
     * Offset from owning layer top boundary
     */
    public java.lang.Number getY() {
        return y;
    }

    /**
     * Base64-encoded snapshot data.
     */
    public java.lang.String getPicture() {
        return picture;
    }

    private static PictureTile fromJson(JsonInput input) {
        java.lang.Number x = null;
        java.lang.Number y = null;
        java.lang.String picture = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "x":
                    x = input.nextNumber();
                    break;
                case "y":
                    y = input.nextNumber();
                    break;
                case "picture":
                    picture = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PictureTile(x, y, picture);
    }
}
