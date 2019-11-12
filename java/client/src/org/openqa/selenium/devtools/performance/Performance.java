package org.openqa.selenium.devtools.performance;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

public class Performance {

    /**
     * Disable collecting and reporting metrics.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Performance.disable", params.build());
    }

    /**
     * Enable collecting and reporting metrics.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Performance.enable", params.build());
    }

    public enum SetTimeDomainTimeDomain {

        TIMETICKS("timeTicks"), THREADTICKS("threadTicks");

        private String value;

        SetTimeDomainTimeDomain(String value) {
            this.value = value;
        }

        public static SetTimeDomainTimeDomain fromString(String s) {
            return java.util.Arrays.stream(SetTimeDomainTimeDomain.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SetTimeDomainTimeDomain "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static SetTimeDomainTimeDomain fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    /**
     * Sets time domain to use for collecting and reporting duration metrics.
     * Note that this must be called before enabling metrics collection. Calling
     * this method while metrics collection is enabled returns an error.
     */
    @Beta()
    public static Command<Void> setTimeDomain(SetTimeDomainTimeDomain timeDomain) {
        java.util.Objects.requireNonNull(timeDomain, "timeDomain is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("timeDomain", timeDomain);
        return new Command<>("Performance.setTimeDomain", params.build());
    }

    /**
     * Retrieve current values of run-time metrics.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.performance.model.Metric>> getMetrics() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Performance.getMetrics", params.build(), ConverterFunctions.map("metrics", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.performance.model.Metric>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.performance.model.Metrics> metrics() {
        return new Event<>("Performance.metrics", input -> input.read(org.openqa.selenium.devtools.performance.model.Metrics.class));
    }
}
