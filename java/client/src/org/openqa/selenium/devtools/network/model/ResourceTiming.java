package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Timing information for the request.
 */
public class ResourceTiming {

    private final java.lang.Number requestTime;

    private final java.lang.Number proxyStart;

    private final java.lang.Number proxyEnd;

    private final java.lang.Number dnsStart;

    private final java.lang.Number dnsEnd;

    private final java.lang.Number connectStart;

    private final java.lang.Number connectEnd;

    private final java.lang.Number sslStart;

    private final java.lang.Number sslEnd;

    private final java.lang.Number workerStart;

    private final java.lang.Number workerReady;

    private final java.lang.Number sendStart;

    private final java.lang.Number sendEnd;

    private final java.lang.Number pushStart;

    private final java.lang.Number pushEnd;

    private final java.lang.Number receiveHeadersEnd;

    public ResourceTiming(java.lang.Number requestTime, java.lang.Number proxyStart, java.lang.Number proxyEnd, java.lang.Number dnsStart, java.lang.Number dnsEnd, java.lang.Number connectStart, java.lang.Number connectEnd, java.lang.Number sslStart, java.lang.Number sslEnd, java.lang.Number workerStart, java.lang.Number workerReady, java.lang.Number sendStart, java.lang.Number sendEnd, java.lang.Number pushStart, java.lang.Number pushEnd, java.lang.Number receiveHeadersEnd) {
        this.requestTime = java.util.Objects.requireNonNull(requestTime, "requestTime is required");
        this.proxyStart = java.util.Objects.requireNonNull(proxyStart, "proxyStart is required");
        this.proxyEnd = java.util.Objects.requireNonNull(proxyEnd, "proxyEnd is required");
        this.dnsStart = java.util.Objects.requireNonNull(dnsStart, "dnsStart is required");
        this.dnsEnd = java.util.Objects.requireNonNull(dnsEnd, "dnsEnd is required");
        this.connectStart = java.util.Objects.requireNonNull(connectStart, "connectStart is required");
        this.connectEnd = java.util.Objects.requireNonNull(connectEnd, "connectEnd is required");
        this.sslStart = java.util.Objects.requireNonNull(sslStart, "sslStart is required");
        this.sslEnd = java.util.Objects.requireNonNull(sslEnd, "sslEnd is required");
        this.workerStart = java.util.Objects.requireNonNull(workerStart, "workerStart is required");
        this.workerReady = java.util.Objects.requireNonNull(workerReady, "workerReady is required");
        this.sendStart = java.util.Objects.requireNonNull(sendStart, "sendStart is required");
        this.sendEnd = java.util.Objects.requireNonNull(sendEnd, "sendEnd is required");
        this.pushStart = java.util.Objects.requireNonNull(pushStart, "pushStart is required");
        this.pushEnd = java.util.Objects.requireNonNull(pushEnd, "pushEnd is required");
        this.receiveHeadersEnd = java.util.Objects.requireNonNull(receiveHeadersEnd, "receiveHeadersEnd is required");
    }

    /**
     * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
     * milliseconds relatively to this requestTime.
     */
    public java.lang.Number getRequestTime() {
        return requestTime;
    }

    /**
     * Started resolving proxy.
     */
    public java.lang.Number getProxyStart() {
        return proxyStart;
    }

    /**
     * Finished resolving proxy.
     */
    public java.lang.Number getProxyEnd() {
        return proxyEnd;
    }

    /**
     * Started DNS address resolve.
     */
    public java.lang.Number getDnsStart() {
        return dnsStart;
    }

    /**
     * Finished DNS address resolve.
     */
    public java.lang.Number getDnsEnd() {
        return dnsEnd;
    }

    /**
     * Started connecting to the remote host.
     */
    public java.lang.Number getConnectStart() {
        return connectStart;
    }

    /**
     * Connected to the remote host.
     */
    public java.lang.Number getConnectEnd() {
        return connectEnd;
    }

    /**
     * Started SSL handshake.
     */
    public java.lang.Number getSslStart() {
        return sslStart;
    }

    /**
     * Finished SSL handshake.
     */
    public java.lang.Number getSslEnd() {
        return sslEnd;
    }

    /**
     * Started running ServiceWorker.
     */
    @Beta()
    public java.lang.Number getWorkerStart() {
        return workerStart;
    }

    /**
     * Finished Starting ServiceWorker.
     */
    @Beta()
    public java.lang.Number getWorkerReady() {
        return workerReady;
    }

    /**
     * Started sending request.
     */
    public java.lang.Number getSendStart() {
        return sendStart;
    }

    /**
     * Finished sending request.
     */
    public java.lang.Number getSendEnd() {
        return sendEnd;
    }

    /**
     * Time the server started pushing request.
     */
    @Beta()
    public java.lang.Number getPushStart() {
        return pushStart;
    }

    /**
     * Time the server finished pushing request.
     */
    @Beta()
    public java.lang.Number getPushEnd() {
        return pushEnd;
    }

    /**
     * Finished receiving response headers.
     */
    public java.lang.Number getReceiveHeadersEnd() {
        return receiveHeadersEnd;
    }

    private static ResourceTiming fromJson(JsonInput input) {
        java.lang.Number requestTime = null;
        java.lang.Number proxyStart = null;
        java.lang.Number proxyEnd = null;
        java.lang.Number dnsStart = null;
        java.lang.Number dnsEnd = null;
        java.lang.Number connectStart = null;
        java.lang.Number connectEnd = null;
        java.lang.Number sslStart = null;
        java.lang.Number sslEnd = null;
        java.lang.Number workerStart = null;
        java.lang.Number workerReady = null;
        java.lang.Number sendStart = null;
        java.lang.Number sendEnd = null;
        java.lang.Number pushStart = null;
        java.lang.Number pushEnd = null;
        java.lang.Number receiveHeadersEnd = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "requestTime":
                    requestTime = input.nextNumber();
                    break;
                case "proxyStart":
                    proxyStart = input.nextNumber();
                    break;
                case "proxyEnd":
                    proxyEnd = input.nextNumber();
                    break;
                case "dnsStart":
                    dnsStart = input.nextNumber();
                    break;
                case "dnsEnd":
                    dnsEnd = input.nextNumber();
                    break;
                case "connectStart":
                    connectStart = input.nextNumber();
                    break;
                case "connectEnd":
                    connectEnd = input.nextNumber();
                    break;
                case "sslStart":
                    sslStart = input.nextNumber();
                    break;
                case "sslEnd":
                    sslEnd = input.nextNumber();
                    break;
                case "workerStart":
                    workerStart = input.nextNumber();
                    break;
                case "workerReady":
                    workerReady = input.nextNumber();
                    break;
                case "sendStart":
                    sendStart = input.nextNumber();
                    break;
                case "sendEnd":
                    sendEnd = input.nextNumber();
                    break;
                case "pushStart":
                    pushStart = input.nextNumber();
                    break;
                case "pushEnd":
                    pushEnd = input.nextNumber();
                    break;
                case "receiveHeadersEnd":
                    receiveHeadersEnd = input.nextNumber();
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ResourceTiming(requestTime, proxyStart, proxyEnd, dnsStart, dnsEnd, connectStart, connectEnd, sslStart, sslEnd, workerStart, workerReady, sendStart, sendEnd, pushStart, pushEnd, receiveHeadersEnd);
    }
}
