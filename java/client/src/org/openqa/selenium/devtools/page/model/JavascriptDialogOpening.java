package org.openqa.selenium.devtools.page.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
 * open.
 */
public class JavascriptDialogOpening {

    private final java.lang.String url;

    private final java.lang.String message;

    private final org.openqa.selenium.devtools.page.model.DialogType type;

    private final java.lang.Boolean hasBrowserHandler;

    private final java.lang.String defaultPrompt;

    public JavascriptDialogOpening(java.lang.String url, java.lang.String message, org.openqa.selenium.devtools.page.model.DialogType type, java.lang.Boolean hasBrowserHandler, java.lang.String defaultPrompt) {
        this.url = java.util.Objects.requireNonNull(url, "url is required");
        this.message = java.util.Objects.requireNonNull(message, "message is required");
        this.type = java.util.Objects.requireNonNull(type, "type is required");
        this.hasBrowserHandler = java.util.Objects.requireNonNull(hasBrowserHandler, "hasBrowserHandler is required");
        this.defaultPrompt = defaultPrompt;
    }

    /**
     * Frame url.
     */
    public java.lang.String getUrl() {
        return url;
    }

    /**
     * Message that will be displayed by the dialog.
     */
    public java.lang.String getMessage() {
        return message;
    }

    /**
     * Dialog type.
     */
    public org.openqa.selenium.devtools.page.model.DialogType getType() {
        return type;
    }

    /**
     * True iff browser is capable showing or acting on the given dialog. When browser has no
     * dialog handler for given target, calling alert while Page domain is engaged will stall
     * the page execution. Execution can be resumed via calling Page.handleJavaScriptDialog.
     */
    public java.lang.Boolean getHasBrowserHandler() {
        return hasBrowserHandler;
    }

    /**
     * Default dialog prompt.
     */
    public java.lang.String getDefaultPrompt() {
        return defaultPrompt;
    }

    private static JavascriptDialogOpening fromJson(JsonInput input) {
        java.lang.String url = null;
        java.lang.String message = null;
        org.openqa.selenium.devtools.page.model.DialogType type = null;
        java.lang.Boolean hasBrowserHandler = null;
        java.lang.String defaultPrompt = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "url":
                    url = input.nextString();
                    break;
                case "message":
                    message = input.nextString();
                    break;
                case "type":
                    type = input.read(org.openqa.selenium.devtools.page.model.DialogType.class);
                    break;
                case "hasBrowserHandler":
                    hasBrowserHandler = input.nextBoolean();
                    break;
                case "defaultPrompt":
                    defaultPrompt = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new JavascriptDialogOpening(url, message, type, hasBrowserHandler, defaultPrompt);
    }
}
