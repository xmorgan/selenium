package org.openqa.selenium.devtools.domsnapshot.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Details of post layout rendered text positions. The exact layout should not be regarded as
 * stable and may change between versions.
 */
public class InlineTextBox {

    private final org.openqa.selenium.devtools.dom.model.Rect boundingBox;

    private final java.lang.Integer startCharacterIndex;

    private final java.lang.Integer numCharacters;

    public InlineTextBox(org.openqa.selenium.devtools.dom.model.Rect boundingBox, java.lang.Integer startCharacterIndex, java.lang.Integer numCharacters) {
        this.boundingBox = java.util.Objects.requireNonNull(boundingBox, "boundingBox is required");
        this.startCharacterIndex = java.util.Objects.requireNonNull(startCharacterIndex, "startCharacterIndex is required");
        this.numCharacters = java.util.Objects.requireNonNull(numCharacters, "numCharacters is required");
    }

    /**
     * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
     */
    public org.openqa.selenium.devtools.dom.model.Rect getBoundingBox() {
        return boundingBox;
    }

    /**
     * The starting index in characters, for this post layout textbox substring. Characters that
     * would be represented as a surrogate pair in UTF-16 have length 2.
     */
    public java.lang.Integer getStartCharacterIndex() {
        return startCharacterIndex;
    }

    /**
     * The number of characters in this post layout textbox substring. Characters that would be
     * represented as a surrogate pair in UTF-16 have length 2.
     */
    public java.lang.Integer getNumCharacters() {
        return numCharacters;
    }

    private static InlineTextBox fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.Rect boundingBox = null;
        java.lang.Integer startCharacterIndex = null;
        java.lang.Integer numCharacters = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "boundingBox":
                    boundingBox = input.read(org.openqa.selenium.devtools.dom.model.Rect.class);
                    break;
                case "startCharacterIndex":
                    startCharacterIndex = input.nextNumber().intValue();
                    break;
                case "numCharacters":
                    numCharacters = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new InlineTextBox(boundingBox, startCharacterIndex, numCharacters);
    }
}
