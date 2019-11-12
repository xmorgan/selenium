package org.openqa.selenium.devtools.serviceworker;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class ServiceWorker {

    public static Command<Void> deliverPushMessage(java.lang.String origin, org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId, java.lang.String data) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        java.util.Objects.requireNonNull(registrationId, "registrationId is required");
        java.util.Objects.requireNonNull(data, "data is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        params.put("registrationId", registrationId);
        params.put("data", data);
        return new Command<>("ServiceWorker.deliverPushMessage", params.build());
    }

    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("ServiceWorker.disable", params.build());
    }

    public static Command<Void> dispatchSyncEvent(java.lang.String origin, org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId, java.lang.String tag, java.lang.Boolean lastChance) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        java.util.Objects.requireNonNull(registrationId, "registrationId is required");
        java.util.Objects.requireNonNull(tag, "tag is required");
        java.util.Objects.requireNonNull(lastChance, "lastChance is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        params.put("registrationId", registrationId);
        params.put("tag", tag);
        params.put("lastChance", lastChance);
        return new Command<>("ServiceWorker.dispatchSyncEvent", params.build());
    }

    public static Command<Void> dispatchPeriodicSyncEvent(java.lang.String origin, org.openqa.selenium.devtools.serviceworker.model.RegistrationID registrationId, java.lang.String tag) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        java.util.Objects.requireNonNull(registrationId, "registrationId is required");
        java.util.Objects.requireNonNull(tag, "tag is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        params.put("registrationId", registrationId);
        params.put("tag", tag);
        return new Command<>("ServiceWorker.dispatchPeriodicSyncEvent", params.build());
    }

    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("ServiceWorker.enable", params.build());
    }

    public static Command<Void> inspectWorker(java.lang.String versionId) {
        java.util.Objects.requireNonNull(versionId, "versionId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("versionId", versionId);
        return new Command<>("ServiceWorker.inspectWorker", params.build());
    }

    public static Command<Void> setForceUpdateOnPageLoad(java.lang.Boolean forceUpdateOnPageLoad) {
        java.util.Objects.requireNonNull(forceUpdateOnPageLoad, "forceUpdateOnPageLoad is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("forceUpdateOnPageLoad", forceUpdateOnPageLoad);
        return new Command<>("ServiceWorker.setForceUpdateOnPageLoad", params.build());
    }

    public static Command<Void> skipWaiting(java.lang.String scopeURL) {
        java.util.Objects.requireNonNull(scopeURL, "scopeURL is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scopeURL", scopeURL);
        return new Command<>("ServiceWorker.skipWaiting", params.build());
    }

    public static Command<Void> startWorker(java.lang.String scopeURL) {
        java.util.Objects.requireNonNull(scopeURL, "scopeURL is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scopeURL", scopeURL);
        return new Command<>("ServiceWorker.startWorker", params.build());
    }

    public static Command<Void> stopAllWorkers() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("ServiceWorker.stopAllWorkers", params.build());
    }

    public static Command<Void> stopWorker(java.lang.String versionId) {
        java.util.Objects.requireNonNull(versionId, "versionId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("versionId", versionId);
        return new Command<>("ServiceWorker.stopWorker", params.build());
    }

    public static Command<Void> unregister(java.lang.String scopeURL) {
        java.util.Objects.requireNonNull(scopeURL, "scopeURL is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scopeURL", scopeURL);
        return new Command<>("ServiceWorker.unregister", params.build());
    }

    public static Command<Void> updateRegistration(java.lang.String scopeURL) {
        java.util.Objects.requireNonNull(scopeURL, "scopeURL is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("scopeURL", scopeURL);
        return new Command<>("ServiceWorker.updateRegistration", params.build());
    }

    public static Event<org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerErrorMessage> workerErrorReported() {
        return new Event<>("ServiceWorker.workerErrorReported", ConverterFunctions.map("errorMessage", org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerErrorMessage.class));
    }

    public static Event<java.util.List<org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerRegistration>> workerRegistrationUpdated() {
        return new Event<>("ServiceWorker.workerRegistrationUpdated", ConverterFunctions.map("registrations", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerRegistration>>() {
        }.getType()));
    }

    public static Event<java.util.List<org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersion>> workerVersionUpdated() {
        return new Event<>("ServiceWorker.workerVersionUpdated", ConverterFunctions.map("versions", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.serviceworker.model.ServiceWorkerVersion>>() {
        }.getType()));
    }
}
