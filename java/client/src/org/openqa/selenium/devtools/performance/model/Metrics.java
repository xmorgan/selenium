package org.openqa.selenium.devtools.performance.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Current values of the metrics.
 */
public class Metrics {

    private final java.util.List<org.openqa.selenium.devtools.performance.model.Metric> metrics;

    private final java.lang.String title;

    public Metrics(java.util.List<org.openqa.selenium.devtools.performance.model.Metric> metrics, java.lang.String title) {
        this.metrics = java.util.Objects.requireNonNull(metrics, "metrics is required");
        this.title = java.util.Objects.requireNonNull(title, "title is required");
    }

    /**
     * Current values of the metrics.
     */
    public java.util.List<org.openqa.selenium.devtools.performance.model.Metric> getMetrics() {
        return metrics;
    }

    /**
     * Timestamp title.
     */
    public java.lang.String getTitle() {
        return title;
    }

    private static Metrics fromJson(JsonInput input) {
        java.util.List<org.openqa.selenium.devtools.performance.model.Metric> metrics = null;
        java.lang.String title = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "metrics":
                    metrics = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.performance.model.Metric>>() {
                    }.getType());
                    break;
                case "title":
                    title = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Metrics(metrics, title);
    }
}
