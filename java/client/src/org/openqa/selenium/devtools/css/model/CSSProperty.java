package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS property declaration data.
 */
public class CSSProperty {

    private final java.lang.String name;

    private final java.lang.String value;

    private final java.lang.Boolean important;

    private final java.lang.Boolean implicit;

    private final java.lang.String text;

    private final java.lang.Boolean parsedOk;

    private final java.lang.Boolean disabled;

    private final org.openqa.selenium.devtools.css.model.SourceRange range;

    public CSSProperty(java.lang.String name, java.lang.String value, java.lang.Boolean important, java.lang.Boolean implicit, java.lang.String text, java.lang.Boolean parsedOk, java.lang.Boolean disabled, org.openqa.selenium.devtools.css.model.SourceRange range) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.value = java.util.Objects.requireNonNull(value, "value is required");
        this.important = important;
        this.implicit = implicit;
        this.text = text;
        this.parsedOk = parsedOk;
        this.disabled = disabled;
        this.range = range;
    }

    /**
     * The property name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * The property value.
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Whether the property has "!important" annotation (implies `false` if absent).
     */
    public java.lang.Boolean getImportant() {
        return important;
    }

    /**
     * Whether the property is implicit (implies `false` if absent).
     */
    public java.lang.Boolean getImplicit() {
        return implicit;
    }

    /**
     * The full property text as specified in the style.
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Whether the property is understood by the browser (implies `true` if absent).
     */
    public java.lang.Boolean getParsedOk() {
        return parsedOk;
    }

    /**
     * Whether the property is disabled by the user (present for source-based properties only).
     */
    public java.lang.Boolean getDisabled() {
        return disabled;
    }

    /**
     * The entire property range in the enclosing style declaration (if available).
     */
    public org.openqa.selenium.devtools.css.model.SourceRange getRange() {
        return range;
    }

    private static CSSProperty fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.String value = null;
        java.lang.Boolean important = null;
        java.lang.Boolean implicit = null;
        java.lang.String text = null;
        java.lang.Boolean parsedOk = null;
        java.lang.Boolean disabled = null;
        org.openqa.selenium.devtools.css.model.SourceRange range = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "value":
                    value = input.nextString();
                    break;
                case "important":
                    important = input.nextBoolean();
                    break;
                case "implicit":
                    implicit = input.nextBoolean();
                    break;
                case "text":
                    text = input.nextString();
                    break;
                case "parsedOk":
                    parsedOk = input.nextBoolean();
                    break;
                case "disabled":
                    disabled = input.nextBoolean();
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
        return new CSSProperty(name, value, important, implicit, text, parsedOk, disabled, range);
    }
}
