package org.openqa.selenium.devtools.browser.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Chrome histogram.
 */
@org.openqa.selenium.Beta()
public class Histogram {

    private final java.lang.String name;

    private final java.lang.Integer sum;

    private final java.lang.Integer count;

    private final java.util.List<org.openqa.selenium.devtools.browser.model.Bucket> buckets;

    public Histogram(java.lang.String name, java.lang.Integer sum, java.lang.Integer count, java.util.List<org.openqa.selenium.devtools.browser.model.Bucket> buckets) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.sum = java.util.Objects.requireNonNull(sum, "sum is required");
        this.count = java.util.Objects.requireNonNull(count, "count is required");
        this.buckets = java.util.Objects.requireNonNull(buckets, "buckets is required");
    }

    /**
     * Name.
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * Sum of sample values.
     */
    public java.lang.Integer getSum() {
        return sum;
    }

    /**
     * Total number of samples.
     */
    public java.lang.Integer getCount() {
        return count;
    }

    /**
     * Buckets.
     */
    public java.util.List<org.openqa.selenium.devtools.browser.model.Bucket> getBuckets() {
        return buckets;
    }

    private static Histogram fromJson(JsonInput input) {
        java.lang.String name = null;
        java.lang.Integer sum = null;
        java.lang.Integer count = null;
        java.util.List<org.openqa.selenium.devtools.browser.model.Bucket> buckets = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = input.nextString();
                    break;
                case "sum":
                    sum = input.nextNumber().intValue();
                    break;
                case "count":
                    count = input.nextNumber().intValue();
                    break;
                case "buckets":
                    buckets = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.browser.model.Bucket>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Histogram(name, sum, count, buckets);
    }
}
