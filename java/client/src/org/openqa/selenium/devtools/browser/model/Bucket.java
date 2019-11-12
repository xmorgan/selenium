package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Chrome histogram bucket.
 */
@org.openqa.selenium.Beta()
public class Bucket {

    private final java.lang.Integer low;

    private final java.lang.Integer high;

    private final java.lang.Integer count;

    public Bucket(java.lang.Integer low, java.lang.Integer high, java.lang.Integer count) {
        this.low = java.util.Objects.requireNonNull(low, "low is required");
        this.high = java.util.Objects.requireNonNull(high, "high is required");
        this.count = java.util.Objects.requireNonNull(count, "count is required");
    }

    /**
     * Minimum value (inclusive).
     */
    public java.lang.Integer getLow() {
        return low;
    }

    /**
     * Maximum value (exclusive).
     */
    public java.lang.Integer getHigh() {
        return high;
    }

    /**
     * Number of samples.
     */
    public java.lang.Integer getCount() {
        return count;
    }

    private static Bucket fromJson(JsonInput input) {
        java.lang.Integer low = null;
        java.lang.Integer high = null;
        java.lang.Integer count = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "low":
                    low = input.nextNumber().intValue();
                    break;
                case "high":
                    high = input.nextNumber().intValue();
                    break;
                case "count":
                    count = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Bucket(low, high, count);
    }
}
