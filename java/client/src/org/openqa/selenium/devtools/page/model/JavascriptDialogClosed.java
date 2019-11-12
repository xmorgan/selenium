package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
 * closed.
 */
public class JavascriptDialogClosed {

    private final java.lang.Boolean result;

    private final java.lang.String userInput;

    public JavascriptDialogClosed(java.lang.Boolean result, java.lang.String userInput) {
        this.result = java.util.Objects.requireNonNull(result, "result is required");
        this.userInput = java.util.Objects.requireNonNull(userInput, "userInput is required");
    }

    /**
     * Whether dialog was confirmed.
     */
    public java.lang.Boolean getResult() {
        return result;
    }

    /**
     * User input in case of prompt.
     */
    public java.lang.String getUserInput() {
        return userInput;
    }

    private static JavascriptDialogClosed fromJson(JsonInput input) {
        java.lang.Boolean result = null;
        java.lang.String userInput = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "result":
                    result = input.nextBoolean();
                    break;
                case "userInput":
                    userInput = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new JavascriptDialogClosed(result, userInput);
    }
}
