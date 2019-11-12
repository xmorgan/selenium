package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Fired when a signed exchange was received over the network
 */
@org.openqa.selenium.Beta()
public class SignedExchangeReceived {

    private final org.openqa.selenium.devtools.network.model.RequestId requestId;

    private final org.openqa.selenium.devtools.network.model.SignedExchangeInfo info;

    public SignedExchangeReceived(org.openqa.selenium.devtools.network.model.RequestId requestId, org.openqa.selenium.devtools.network.model.SignedExchangeInfo info) {
        this.requestId = java.util.Objects.requireNonNull(requestId, "requestId is required");
        this.info = java.util.Objects.requireNonNull(info, "info is required");
    }

    /**
     * Request identifier.
     */
    public org.openqa.selenium.devtools.network.model.RequestId getRequestId() {
        return requestId;
    }

    /**
     * Information about the signed exchange response.
     */
    public org.openqa.selenium.devtools.network.model.SignedExchangeInfo getInfo() {
        return info;
    }

    private static SignedExchangeReceived fromJson(JsonInput input) {
        org.openqa.selenium.devtools.network.model.RequestId requestId = null;
        org.openqa.selenium.devtools.network.model.SignedExchangeInfo info = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestId":
                    requestId = input.read(org.openqa.selenium.devtools.network.model.RequestId.class);
                    break;
                case "info":
                    info = input.read(org.openqa.selenium.devtools.network.model.SignedExchangeInfo.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SignedExchangeReceived(requestId, info);
    }
}
