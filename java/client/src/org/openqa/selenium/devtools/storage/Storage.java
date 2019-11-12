package org.openqa.selenium.devtools.storage;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Storage {

    /**
     * Clears storage for origin.
     */
    public static Command<Void> clearDataForOrigin(java.lang.String origin, java.lang.String storageTypes) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        java.util.Objects.requireNonNull(storageTypes, "storageTypes is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        params.put("storageTypes", storageTypes);
        return new Command<>("Storage.clearDataForOrigin", params.build());
    }

    public static class GetUsageAndQuotaResponse {

        private final java.lang.Number usage;

        private final java.lang.Number quota;

        private final java.util.List<org.openqa.selenium.devtools.storage.model.UsageForType> usageBreakdown;

        public GetUsageAndQuotaResponse(java.lang.Number usage, java.lang.Number quota, java.util.List<org.openqa.selenium.devtools.storage.model.UsageForType> usageBreakdown) {
            this.usage = java.util.Objects.requireNonNull(usage, "usage is required");
            this.quota = java.util.Objects.requireNonNull(quota, "quota is required");
            this.usageBreakdown = java.util.Objects.requireNonNull(usageBreakdown, "usageBreakdown is required");
        }

        /**
         * Storage usage (bytes).
         */
        public java.lang.Number getUsage() {
            return usage;
        }

        /**
         * Storage quota (bytes).
         */
        public java.lang.Number getQuota() {
            return quota;
        }

        /**
         * Storage usage per type (bytes).
         */
        public java.util.List<org.openqa.selenium.devtools.storage.model.UsageForType> getUsageBreakdown() {
            return usageBreakdown;
        }

        private static GetUsageAndQuotaResponse fromJson(JsonInput input) {
            java.lang.Number usage = null;
            java.lang.Number quota = null;
            java.util.List<org.openqa.selenium.devtools.storage.model.UsageForType> usageBreakdown = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "usage":
                        usage = input.nextNumber();
                        break;
                    case "quota":
                        quota = input.nextNumber();
                        break;
                    case "usageBreakdown":
                        usageBreakdown = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.storage.model.UsageForType>>() {
                        }.getType());
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetUsageAndQuotaResponse(usage, quota, usageBreakdown);
        }
    }

    /**
     * Returns usage and quota in bytes.
     */
    public static Command<org.openqa.selenium.devtools.storage.Storage.GetUsageAndQuotaResponse> getUsageAndQuota(java.lang.String origin) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        return new Command<>("Storage.getUsageAndQuota", params.build(), input -> input.read(org.openqa.selenium.devtools.storage.Storage.GetUsageAndQuotaResponse.class));
    }

    /**
     * Registers origin to be notified when an update occurs to its cache storage list.
     */
    public static Command<Void> trackCacheStorageForOrigin(java.lang.String origin) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        return new Command<>("Storage.trackCacheStorageForOrigin", params.build());
    }

    /**
     * Registers origin to be notified when an update occurs to its IndexedDB.
     */
    public static Command<Void> trackIndexedDBForOrigin(java.lang.String origin) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        return new Command<>("Storage.trackIndexedDBForOrigin", params.build());
    }

    /**
     * Unregisters origin from receiving notifications for cache storage.
     */
    public static Command<Void> untrackCacheStorageForOrigin(java.lang.String origin) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        return new Command<>("Storage.untrackCacheStorageForOrigin", params.build());
    }

    /**
     * Unregisters origin from receiving notifications for IndexedDB.
     */
    public static Command<Void> untrackIndexedDBForOrigin(java.lang.String origin) {
        java.util.Objects.requireNonNull(origin, "origin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("origin", origin);
        return new Command<>("Storage.untrackIndexedDBForOrigin", params.build());
    }

    public static Event<org.openqa.selenium.devtools.storage.model.CacheStorageContentUpdated> cacheStorageContentUpdated() {
        return new Event<>("Storage.cacheStorageContentUpdated", input -> input.read(org.openqa.selenium.devtools.storage.model.CacheStorageContentUpdated.class));
    }

    public static Event<java.lang.String> cacheStorageListUpdated() {
        return new Event<>("Storage.cacheStorageListUpdated", ConverterFunctions.map("origin", java.lang.String.class));
    }

    public static Event<org.openqa.selenium.devtools.storage.model.IndexedDBContentUpdated> indexedDBContentUpdated() {
        return new Event<>("Storage.indexedDBContentUpdated", input -> input.read(org.openqa.selenium.devtools.storage.model.IndexedDBContentUpdated.class));
    }

    public static Event<java.lang.String> indexedDBListUpdated() {
        return new Event<>("Storage.indexedDBListUpdated", ConverterFunctions.map("origin", java.lang.String.class));
    }
}
