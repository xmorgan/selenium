package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Media query descriptor.
 */
public class MediaQuery {

    private final java.util.List<org.openqa.selenium.devtools.css.model.MediaQueryExpression> expressions;

    private final java.lang.Boolean active;

    public MediaQuery(java.util.List<org.openqa.selenium.devtools.css.model.MediaQueryExpression> expressions, java.lang.Boolean active) {
        this.expressions = java.util.Objects.requireNonNull(expressions, "expressions is required");
        this.active = java.util.Objects.requireNonNull(active, "active is required");
    }

    /**
     * Array of media query expressions.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.MediaQueryExpression> getExpressions() {
        return expressions;
    }

    /**
     * Whether the media query condition is satisfied.
     */
    public java.lang.Boolean getActive() {
        return active;
    }

    private static MediaQuery fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.css.model.MediaQueryExpression> expressions = null;
        java.lang.Boolean active = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "expressions":
                    expressions = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.MediaQueryExpression>>() {
                    }.getType());
                    break;
                case "active":
                    active = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new MediaQuery(expressions, active);
    }
}
