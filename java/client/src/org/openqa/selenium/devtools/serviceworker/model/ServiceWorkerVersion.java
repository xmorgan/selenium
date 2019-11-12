package org.openqa.selenium.devtools.serviceworker.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * ServiceWorker version.
 */
public class ServiceWorkerVersion {

    private final java.lang.String versionId;

    private final org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId;

    private final java.lang.String scriptURL;

    private final org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionRunningStatus runningStatus;

    private final org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionStatus status;

    private final java.lang.Number scriptLastModified;

    private final java.lang.Number scriptResponseTime;

    private final java.util.List<org.openqa.selenium.devtools.target.model.TargetID> controlledClients;

    private final org.openqa.selenium.devtools.target.model.TargetID targetId;

    public ServiceWorkerVersion(java.lang.String versionId, org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId, java.lang.String scriptURL, org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionRunningStatus runningStatus, org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionStatus status, java.lang.Number scriptLastModified, java.lang.Number scriptResponseTime, java.util.List<org.openqa.selenium.devtools.target.model.TargetID> controlledClients, org.openqa.selenium.devtools.target.model.TargetID targetId) {
        this.versionId = java.util.Objects.requireNonNull(versionId, "versionId is required");
        this.registrationId = java.util.Objects.requireNonNull(registrationId, "registrationId is required");
        this.scriptURL = java.util.Objects.requireNonNull(scriptURL, "scriptURL is required");
        this.runningStatus = java.util.Objects.requireNonNull(runningStatus, "runningStatus is required");
        this.status = java.util.Objects.requireNonNull(status, "status is required");
        this.scriptLastModified = scriptLastModified;
        this.scriptResponseTime = scriptResponseTime;
        this.controlledClients = controlledClients;
        this.targetId = targetId;
    }

    public java.lang.String getVersionId() {
        return versionId;
    }

    public org.openqa.selenium.devtools.serviceworker.model.RegistrationID getRegistrationId() {
        return registrationId;
    }

    public java.lang.String getScriptURL() {
        return scriptURL;
    }

    public org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionRunningStatus getRunningStatus() {
        return runningStatus;
    }

    public org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionStatus getStatus() {
        return status;
    }

    /**
     * The Last-Modified header value of the main script.
     */
    public java.lang.Number getScriptLastModified() {
        return scriptLastModified;
    }

    /**
     * The time at which the response headers of the main script were received from the server.
     * For cached script it is the last time the cache entry was validated.
     */
    public java.lang.Number getScriptResponseTime() {
        return scriptResponseTime;
    }

    public java.util.List<org.openqa.selenium.devtools.target.model.TargetID> getControlledClients() {
        return controlledClients;
    }

    public org.openqa.selenium.devtools.target.model.TargetID getTargetId() {
        return targetId;
    }

    private static ServiceWorkerVersion fromJson(JsonInput input) {
        java.lang.String versionId = null;
        org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId = null;
        java.lang.String scriptURL = null;
        org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionRunningStatus runningStatus = null;
        org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionStatus status = null;
        java.lang.Number scriptLastModified = null;
        java.lang.Number scriptResponseTime = null;
        java.util.List<org.openqa.selenium.devtools.target.model.TargetID> controlledClients = null;
        org.openqa.selenium.devtools.target.model.TargetID targetId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "versionId":
                    versionId = input.nextString();
                    break;
                case "registrationId":
                    registrationId = input.read(org.openqa.selenium.devtools.serviceworker.model.RegistrationID.class);
                    break;
                case "scriptURL":
                    scriptURL = input.nextString();
                    break;
                case "runningStatus":
                    runningStatus = input.read(org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionRunningStatus.class);
                    break;
                case "status":
                    status = input.read(org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersionStatus.class);
                    break;
                case "scriptLastModified":
                    scriptLastModified = input.nextNumber();
                    break;
                case "scriptResponseTime":
                    scriptResponseTime = input.nextNumber();
                    break;
                case "controlledClients":
                    controlledClients = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.target.model.TargetID>>() {
                    }.getType());
                    break;
                case "targetId":
                    targetId = input.read(org.openqa.selenium.devtools.target.model.TargetID.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ServiceWorkerVersion(versionId, registrationId, scriptURL, runningStatus, status, scriptLastModified, scriptResponseTime, controlledClients, targetId);
    }
}
