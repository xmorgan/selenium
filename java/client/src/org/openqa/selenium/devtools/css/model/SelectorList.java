package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Selector list data.
 */
public class SelectorList {

    private final java.util.List<org.openqa.selenium.devtools.css.model.Value> selectors;

    private final java.lang.String text;

    public SelectorList(java.util.List<org.openqa.selenium.devtools.css.model.Value> selectors, java.lang.String text) {
        this.selectors = java.util.Objects.requireNonNull(selectors, "selectors is required");
        this.text = java.util.Objects.requireNonNull(text, "text is required");
    }

    /**
     * Selectors in the list.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.Value> getSelectors() {
        return selectors;
    }

    /**
     * Rule selector text.
     */
    public java.lang.String getText() {
        return text;
    }

    private static SelectorList fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.css.model.Value> selectors = null;
        java.lang.String text = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "selectors":
                    selectors = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.Value>>() {
                    }.getType());
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
        return new SelectorList(selectors, text);
    }
}
