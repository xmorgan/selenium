package org.openqa.selenium.devtools.runtime.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class CustomPreview {

    private final java.lang.String header;

    private final org.openqa.selenium.devtools.runtime.model.RemoteObjectId bodyGetterId;

    public CustomPreview(java.lang.String header, org.openqa.selenium.devtools.runtime.model.RemoteObjectId bodyGetterId) {
        this.header = java.util.Objects.requireNonNull(header, "header is required");
        this.bodyGetterId = bodyGetterId;
    }

    /**
     * The JSON-stringified result of formatter.header(object, config) call.
     * It contains json ML array that represents RemoteObject.
     */
    public java.lang.String getHeader() {
        return header;
    }

    /**
     * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will
     * contain RemoteObjectId for the function that returns result of formatter.body(object, config) call.
     * The result value is json ML array.
     */
    public org.openqa.selenium.devtools.runtime.model.RemoteObjectId getBodyGetterId() {
        return bodyGetterId;
    }

    private static CustomPreview fromJson(JsonInput input) {
        java.lang.String header = null;
        org.openqa.selenium.devtools.runtime.model.RemoteObjectId bodyGetterId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "header":
                    header = input.nextString();
                    break;
                case "bodyGetterId":
                    bodyGetterId = input.read(org.openqa.selenium.devtools.runtime.model.RemoteObjectId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CustomPreview(header, bodyGetterId);
    }
}
