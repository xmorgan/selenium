package org.openqa.selenium.devtools.database.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Database error.
 */
public class Error {

    private final java.lang.String message;

    private final java.lang.Integer code;

    public Error(java.lang.String message, java.lang.Integer code) {
        this.message = java.util.Objects.requireNonNull(message, "message is required");
        this.code = java.util.Objects.requireNonNull(code, "code is required");
    }

    /**
     * Error message.
     */
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * Error code.
     */
    public java.lang.Integer getCode() {
        return code;
    }

    private static Error fromJson(JsonInput input) {
        java.lang.String message = null;
        java.lang.Integer code = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "message":
                    message = input.nextString();
                    break;
                case "code":
                    code = input.nextNumber().intValue();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new Error(message, code);
    }
}
