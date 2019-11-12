package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * A descriptor of operation to mutate style declaration text.
 */
public class StyleDeclarationEdit {

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final org.openqa.selenium.devtools.css.model.SourceRange range;

    private final java.lang.String text;

    public StyleDeclarationEdit(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.css.model.SourceRange range, java.lang.String text) {
        this.styleSheetId = java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        this.range = java.util.Objects.requireNonNull(range, "range is required");
        this.text = java.util.Objects.requireNonNull(text, "text is required");
    }

    /**
     * The css style sheet identifier.
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * The range of the style text in the enclosing stylesheet.
     */
    public org.openqa.selenium.devtools.css.model.SourceRange getRange() {
        return range;
    }

    /**
     * New style text.
     */
    public java.lang.String getText() {
        return text;
    }

    private static StyleDeclarationEdit fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        org.openqa.selenium.devtools.css.model.SourceRange range = null;
        java.lang.String text = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "range":
                    range = input.read(org.openqa.selenium.devtools.css.model.SourceRange.class);
                    break;
                case "text":
                    text = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new StyleDeclarationEdit(styleSheetId, range, text);
    }
}
