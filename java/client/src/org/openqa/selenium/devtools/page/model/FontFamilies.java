package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Generic font families collection.
 */
@org.openqa.selenium.Beta()
public class FontFamilies {

    private final java.lang.String standard;

    private final java.lang.String fixed;

    private final java.lang.String serif;

    private final java.lang.String sansSerif;

    private final java.lang.String cursive;

    private final java.lang.String fantasy;

    private final java.lang.String pictograph;

    public FontFamilies(java.lang.String standard, java.lang.String fixed, java.lang.String serif, java.lang.String sansSerif, java.lang.String cursive, java.lang.String fantasy, java.lang.String pictograph) {
        this.standard = standard;
        this.fixed = fixed;
        this.serif = serif;
        this.sansSerif = sansSerif;
        this.cursive = cursive;
        this.fantasy = fantasy;
        this.pictograph = pictograph;
    }

    /**
     * The standard font-family.
     */
    public java.lang.String getStandard() {
        return standard;
    }

    /**
     * The fixed font-family.
     */
    public java.lang.String getFixed() {
        return fixed;
    }

    /**
     * The serif font-family.
     */
    public java.lang.String getSerif() {
        return serif;
    }

    /**
     * The sansSerif font-family.
     */
    public java.lang.String getSansSerif() {
        return sansSerif;
    }

    /**
     * The cursive font-family.
     */
    public java.lang.String getCursive() {
        return cursive;
    }

    /**
     * The fantasy font-family.
     */
    public java.lang.String getFantasy() {
        return fantasy;
    }

    /**
     * The pictograph font-family.
     */
    public java.lang.String getPictograph() {
        return pictograph;
    }

    private static FontFamilies fromJson(JsonInput input) {
        java.lang.String standard = null;
        java.lang.String fixed = null;
        java.lang.String serif = null;
        java.lang.String sansSerif = null;
        java.lang.String cursive = null;
        java.lang.String fantasy = null;
        java.lang.String pictograph = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "standard":
                    standard = input.nextString();
                    break;
                case "fixed":
                    fixed = input.nextString();
                    break;
                case "serif":
                    serif = input.nextString();
                    break;
                case "sansSerif":
                    sansSerif = input.nextString();
                    break;
                case "cursive":
                    cursive = input.nextString();
                    break;
                case "fantasy":
                    fantasy = input.nextString();
                    break;
                case "pictograph":
                    pictograph = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FontFamilies(standard, fixed, serif, sansSerif, cursive, fantasy, pictograph);
    }
}
