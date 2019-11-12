package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * WebSocket message data. This represents an entire WebSocket message, not just a fragmented frame as the name suggests.
 */
public class WebSocketFrame {

    private final java.lang.Number opcode;

    private final java.lang.Boolean mask;

    private final java.lang.String payloadData;

    public WebSocketFrame(java.lang.Number opcode, java.lang.Boolean mask, java.lang.String payloadData) {
        this.opcode = java.util.Objects.requireNonNull(opcode, "opcode is required");
        this.mask = java.util.Objects.requireNonNull(mask, "mask is required");
        this.payloadData = java.util.Objects.requireNonNull(payloadData, "payloadData is required");
    }

    /**
     * WebSocket message opcode.
     */
    public java.lang.Number getOpcode() {
        return opcode;
    }

    /**
     * WebSocket message mask.
     */
    public java.lang.Boolean getMask() {
        return mask;
    }

    /**
     * WebSocket message payload data.
     * If the opcode is 1, this is a text message and payloadData is a UTF-8 string.
     * If the opcode isn't 1, then payloadData is a base64 encoded string representing binary data.
     */
    public java.lang.String getPayloadData() {
        return payloadData;
    }

    private static WebSocketFrame fromJson(JsonInput input) {
        java.lang.Number opcode = null;
        java.lang.Boolean mask = null;
        java.lang.String payloadData = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "opcode":
                    opcode = input.nextNumber();
                    break;
                case "mask":
                    mask = input.nextBoolean();
                    break;
                case "payloadData":
                    payloadData = input.nextString();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new WebSocketFrame(opcode, mask, payloadData);
    }
}
