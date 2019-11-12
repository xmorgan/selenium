package org.openqa.selenium.devtools.profiler.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Coverage data for a JavaScript function.
 */
public class FunctionCoverage {

    private final java.lang.String functionName;

    private final java.util.List<org.openqa.selenium.devtools.profiler.model.CoverageRange> ranges;

    private final java.lang.Boolean isBlockCoverage;

    public FunctionCoverage(java.lang.String functionName, java.util.List<org.openqa.selenium.devtools.profiler.model.CoverageRange> ranges, java.lang.Boolean isBlockCoverage) {
        this.functionName = java.util.Objects.requireNonNull(functionName, "functionName is required");
        this.ranges = java.util.Objects.requireNonNull(ranges, "ranges is required");
        this.isBlockCoverage = java.util.Objects.requireNonNull(isBlockCoverage, "isBlockCoverage is required");
    }

    /**
     * JavaScript function name.
     */
    public java.lang.String getFunctionName() {
        return functionName;
    }

    /**
     * Source ranges inside the function with coverage data.
     */
    public java.util.List<org.openqa.selenium.devtools.profiler.model.CoverageRange> getRanges() {
        return ranges;
    }

    /**
     * Whether coverage data for this function has block granularity.
     */
    public java.lang.Boolean getIsBlockCoverage() {
        return isBlockCoverage;
    }

    private static FunctionCoverage fromJson(JsonInput input) {
        java.lang.String functionName = null;
        java.util.List<org.openqa.selenium.devtools.profiler.model.CoverageRange> ranges = null;
        java.lang.Boolean isBlockCoverage = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "functionName":
                    functionName = input.nextString();
                    break;
                case "ranges":
                    ranges = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.CoverageRange>>() {
                    }.getType());
                    break;
                case "isBlockCoverage":
                    isBlockCoverage = input.nextBoolean();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new FunctionCoverage(functionName, ranges, isBlockCoverage);
    }
}
