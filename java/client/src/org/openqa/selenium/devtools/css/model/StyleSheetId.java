package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class StyleSheetId {

    private final java.lang.String styleSheetId;

    public StyleSheetId(java.lang.String styleSheetId) {
        this.styleSheetId = java.util.Objects.requireNonNull(styleSheetId, "Missing value for StyleSheetId");
    }

    private static StyleSheetId fromJson(JsonInput input) {
        return new StyleSheetId(input.nextString());
    }

    public String toJson() {
        return styleSheetId.toString();
    }

    public String toString() {
        return styleSheetId.toString();
    }
}
