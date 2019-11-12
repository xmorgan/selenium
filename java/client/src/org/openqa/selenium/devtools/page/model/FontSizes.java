package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Default font sizes.
 */
@org.openqa.selenium.Beta()
public class FontSizes {

    private final java.lang.Integer standard;

    private final java.lang.Integer fixed;

    public FontSizes(java.lang.Integer standard, java.lang.Integer fixed) {
        this.standard = standard;
        this.fixed = fixed;
    }

    /**
     * Default standard font size.
     */
    public java.lang.Integer getStandard() {
        return standard;
    }

    /**
     * Default fixed font size.
     */
    public java.lang.Integer getFixed() {
        return fixed;
    }

    private static FontSizes fromJson(JsonInput input) {
        java.lang.Integer standard = null;
        java.lang.Integer fixed = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "standard":
                    standard = input.nextNumber().intValue();
                    break;
                case "fixed":
                    fixed = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FontSizes(standard, fixed);
    }
}
