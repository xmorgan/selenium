package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Inherited CSS rule collection from ancestor node.
 */
public class InheritedStyleEntry {

    private final org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle;

    private final java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matchedCSSRules;

    public InheritedStyleEntry(org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle, java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matchedCSSRules) {
        this.inlineStyle = inlineStyle;
        this.matchedCSSRules = java.util.Objects.requireNonNull(matchedCSSRules, "matchedCSSRules is required");
    }

    /**
     * The ancestor node's inline style, if any, in the style inheritance chain.
     */
    public org.openqa.selenium.devtools.css.model.CSSStyle getInlineStyle() {
        return inlineStyle;
    }

    /**
     * Matches of CSS rules matching the ancestor node in the style inheritance chain.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> getMatchedCSSRules() {
        return matchedCSSRules;
    }

    private static InheritedStyleEntry fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle = null;
        java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matchedCSSRules = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "inlineStyle":
                    inlineStyle = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                    break;
                case "matchedCSSRules":
                    matchedCSSRules = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new InheritedStyleEntry(inlineStyle, matchedCSSRules);
    }
}
