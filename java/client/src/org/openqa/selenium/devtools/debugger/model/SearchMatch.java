package org.openqa.selenium.devtools.debugger.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Search match for resource.
 */
public class SearchMatch {

    private final java.lang.Number lineNumber;

    private final java.lang.String lineContent;

    public SearchMatch(java.lang.Number lineNumber, java.lang.String lineContent) {
        this.lineNumber = java.util.Objects.requireNonNull(lineNumber, "lineNumber is required");
        this.lineContent = java.util.Objects.requireNonNull(lineContent, "lineContent is required");
    }

    /**
     * Line number in resource content.
     */
    public java.lang.Number getLineNumber() {
        return lineNumber;
    }

    /**
     * Line with match content.
     */
    public java.lang.String getLineContent() {
        return lineContent;
    }

    private static SearchMatch fromJson(JsonInput input) {
        java.lang.Number lineNumber = null;
        java.lang.String lineContent = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "lineNumber":
                    lineNumber = input.nextNumber();
                    break;
                case "lineContent":
                    lineContent = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SearchMatch(lineNumber, lineContent);
    }
}
