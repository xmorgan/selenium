package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Match data for a CSS rule.
 */
public class RuleMatch {

    private final org.openqa.selenium.devtools.css.model.CSSRule rule;

    private final java.util.List<java.lang.Integer> matchingSelectors;

    public RuleMatch(org.openqa.selenium.devtools.css.model.CSSRule rule, java.util.List<java.lang.Integer> matchingSelectors) {
        this.rule = java.util.Objects.requireNonNull(rule, "rule is required");
        this.matchingSelectors = java.util.Objects.requireNonNull(matchingSelectors, "matchingSelectors is required");
    }

    /**
     * CSS rule in the match.
     */
    public org.openqa.selenium.devtools.css.model.CSSRule getRule() {
        return rule;
    }

    /**
     * Matching selector indices in the rule's selectorList selectors (0-based).
     */
    public java.util.List<java.lang.Integer> getMatchingSelectors() {
        return matchingSelectors;
    }

    private static RuleMatch fromJson(JsonInput input) {
        org.openqa.selenium.devtools.css.model.CSSRule rule = null;
        java.util.List<java.lang.Integer> matchingSelectors = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "rule":
                    rule = input.read(org.openqa.selenium.devtools.css.model.CSSRule.class);
                    break;
                case "matchingSelectors":
                    matchingSelectors = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.Integer>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RuleMatch(rule, matchingSelectors);
    }
}
