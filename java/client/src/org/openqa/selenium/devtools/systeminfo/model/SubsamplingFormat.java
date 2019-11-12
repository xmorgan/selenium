package org.openqa.selenium.devtools.systeminfo.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * YUV subsampling type of the pixels of a given image.
 */
public enum SubsamplingFormat {

    YUV420("yuv420"), YUV422("yuv422"), YUV444("yuv444");

    private String value;

    SubsamplingFormat(String value) {
        this.value = value;
    }

    public static SubsamplingFormat fromString(String s) {
        return java.util.Arrays.stream(SubsamplingFormat.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within SubsamplingFormat "));
    }

    public String toString() {
        return value;
    }

    public String toJson() {
        return value;
    }

    private static SubsamplingFormat fromJson(JsonInput input) {
        return fromString(input.nextString());
    }
}
