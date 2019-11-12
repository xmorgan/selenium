package org.openqa.selenium.devtools.indexeddb.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Key range.
 */
public class KeyRange {

    private final org.openqa.selenium.devtools.indexeddb.model.Key lower;

    private final org.openqa.selenium.devtools.indexeddb.model.Key upper;

    private final java.lang.Boolean lowerOpen;

    private final java.lang.Boolean upperOpen;

    public KeyRange(org.openqa.selenium.devtools.indexeddb.model.Key lower, org.openqa.selenium.devtools.indexeddb.model.Key upper, java.lang.Boolean lowerOpen, java.lang.Boolean upperOpen) {
        this.lower = lower;
        this.upper = upper;
        this.lowerOpen = java.util.Objects.requireNonNull(lowerOpen, "lowerOpen is required");
        this.upperOpen = java.util.Objects.requireNonNull(upperOpen, "upperOpen is required");
    }

    /**
     * Lower bound.
     */
    public org.openqa.selenium.devtools.indexeddb.model.Key getLower() {
        return lower;
    }

    /**
     * Upper bound.
     */
    public org.openqa.selenium.devtools.indexeddb.model.Key getUpper() {
        return upper;
    }

    /**
     * If true lower bound is open.
     */
    public java.lang.Boolean getLowerOpen() {
        return lowerOpen;
    }

    /**
     * If true upper bound is open.
     */
    public java.lang.Boolean getUpperOpen() {
        return upperOpen;
    }

    private static KeyRange fromJson(JsonInput input) {
        org.openqa.selenium.devtools.indexeddb.model.Key lower = null;
        org.openqa.selenium.devtools.indexeddb.model.Key upper = null;
        java.lang.Boolean lowerOpen = null;
        java.lang.Boolean upperOpen = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "lower":
                    lower = input.read(org.openqa.selenium.devtools.indexeddb.model.Key.class);
                    break;
                case "upper":
                    upper = input.read(org.openqa.selenium.devtools.indexeddb.model.Key.class);
                    break;
                case "lowerOpen":
                    lowerOpen = input.nextBoolean();
                    break;
                case "upperOpen":
                    upperOpen = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new KeyRange(lower, upper, lowerOpen, upperOpen);
    }
}
