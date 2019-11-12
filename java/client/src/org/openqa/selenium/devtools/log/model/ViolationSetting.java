package org.openqa.selenium.devtools.log.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Violation configuration setting.
 */
public class ViolationSetting {

    public enum Name {

        LONGTASK("longTask"),
        LONGLAYOUT("longLayout"),
        BLOCKEDEVENT("blockedEvent"),
        BLOCKEDPARSER("blockedParser"),
        DISCOURAGEDAPIUSE("discouragedAPIUse"),
        HANDLER("handler"),
        RECURRINGHANDLER("recurringHandler");

        private String value;

        Name(String value) {
            this.value = value;
        }

        public static Name fromString(String s) {
            return java.util.Arrays.stream(Name.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Name "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Name fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final Name name;

    private final java.lang.Number threshold;

    public ViolationSetting(Name name, java.lang.Number threshold) {
        this.name = java.util.Objects.requireNonNull(name, "name is required");
        this.threshold = java.util.Objects.requireNonNull(threshold, "threshold is required");
    }

    /**
     * Violation type.
     */
    public Name getName() {
        return name;
    }

    /**
     * Time threshold to trigger upon.
     */
    public java.lang.Number getThreshold() {
        return threshold;
    }

    private static ViolationSetting fromJson(JsonInput input) {
        Name name = null;
        java.lang.Number threshold = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "name":
                    name = Name.fromString(input.nextString());
                    break;
                case "threshold":
                    threshold = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ViolationSetting(name, threshold);
    }
}
