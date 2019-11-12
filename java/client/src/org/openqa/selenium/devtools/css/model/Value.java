package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Data for a simple selector (these are delimited by commas in a selector list).
 */
public class Value {

    private final java.lang.String text;

    private final org.openqa.selenium.devtools.css.model.SourceRange range;

    public Value(java.lang.String text, org.openqa.selenium.devtools.css.model.SourceRange range) {
        this.text = java.util.Objects.requireNonNull(text, "text is required");
        this.range = range;
    }

    /**
     * Value text.
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Value range in the underlying resource (if available).
     */
    public org.openqa.selenium.devtools.css.model.SourceRange getRange() {
        return range;
    }

    private static Value fromJson(JsonInput input) {
        java.lang.String text = null;
        org.openqa.selenium.devtools.css.model.SourceRange range = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "text":
                    text = input.nextString();
                    break;
                case "range":
                    range = input.read(org.openqa.selenium.devtools.css.model.SourceRange.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Value(text, range);
    }
}
