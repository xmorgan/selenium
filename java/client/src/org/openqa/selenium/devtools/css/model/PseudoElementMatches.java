package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS rule collection for a single pseudo style.
 */
public class PseudoElementMatches {

    private final org.openqa.selenium.devtools.dom.model.PseudoType pseudoType;

    private final java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matches;

    public PseudoElementMatches(org.openqa.selenium.devtools.dom.model.PseudoType pseudoType, java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matches) {
        this.pseudoType = java.util.Objects.requireNonNull(pseudoType, "pseudoType is required");
        this.matches = java.util.Objects.requireNonNull(matches, "matches is required");
    }

    /**
     * Pseudo element type.
     */
    public org.openqa.selenium.devtools.dom.model.PseudoType getPseudoType() {
        return pseudoType;
    }

    /**
     * Matches of CSS rules applicable to the pseudo style.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> getMatches() {
        return matches;
    }

    private static PseudoElementMatches fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.PseudoType pseudoType = null;
        java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matches = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "pseudoType":
                    pseudoType = input.read(org.openqa.selenium.devtools.dom.model.PseudoType.class);
                    break;
                case "matches":
                    matches = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new PseudoElementMatches(pseudoType, matches);
    }
}
