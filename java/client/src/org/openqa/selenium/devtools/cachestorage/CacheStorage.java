package org.openqa.selenium.devtools.cachestorage;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class CacheStorage {

    /**
     * Deletes a cache.
     */
    public static Command<Void> deleteCache(org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId) {
        java.util.Objects.requireNonNull(cacheId, "cacheId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cacheId", cacheId);
        return new Command<>("CacheStorage.deleteCache", params.build());
    }

    /**
     * Deletes a cache entry.
     */
    public static Command<Void> deleteEntry(org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId, java.lang.String request) {
        java.util.Objects.requireNonNull(cacheId, "cacheId is required");
        java.util.Objects.requireNonNull(request, "request is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cacheId", cacheId);
        params.put("request", request);
        return new Command<>("CacheStorage.deleteEntry", params.build());
    }

    /**
     * Requests cache names.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.cachestorage.model.Cache>> requestCacheNames(java.lang.String securityOrigin) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        return new Command<>("CacheStorage.requestCacheNames", params.build(), ConverterFunctions.map("caches", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.cachestorage.model.Cache>>() {
        }.getType()));
    }

    /**
     * Fetches cache entry.
     */
    public static Command<org.openqa.selenium.devtools.cachestorage.model.CachedResponse> requestCachedResponse(org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId, java.lang.String requestURL, java.util.List<org.openqa.selenium.devtools.cachestorage.model.Header> requestHeaders) {
        java.util.Objects.requireNonNull(cacheId, "cacheId is required");
        java.util.Objects.requireNonNull(requestURL, "requestURL is required");
        java.util.Objects.requireNonNull(requestHeaders, "requestHeaders is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cacheId", cacheId);
        params.put("requestURL", requestURL);
        params.put("requestHeaders", requestHeaders);
        return new Command<>("CacheStorage.requestCachedResponse", params.build(), ConverterFunctions.map("response", org.openqa.selenium.devtools.cachestorage.model.CachedResponse.class));
    }

    public static class RequestEntriesResponse {

        private final java.util.List<org.openqa.selenium.devtools.cachestorage.model.DataEntry> cacheDataEntries;

        private final java.lang.Number returnCount;

        public RequestEntriesResponse(java.util.List<org.openqa.selenium.devtools.cachestorage.model.DataEntry> cacheDataEntries, java.lang.Number returnCount) {
            this.cacheDataEntries = java.util.Objects.requireNonNull(cacheDataEntries, "cacheDataEntries is required");
            this.returnCount = java.util.Objects.requireNonNull(returnCount, "returnCount is required");
        }

        /**
         * Array of object store data entries.
         */
        public java.util.List<org.openqa.selenium.devtools.cachestorage.model.DataEntry> getCacheDataEntries() {
            return cacheDataEntries;
        }

        /**
         * Count of returned entries from this storage. If pathFilter is empty, it
         * is the count of all entries from this storage.
         */
        public java.lang.Number getReturnCount() {
            return returnCount;
        }

        private static RequestEntriesResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.cachestorage.model.DataEntry> cacheDataEntries = null;
            java.lang.Number returnCount = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "cacheDataEntries":
                        cacheDataEntries = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.cachestorage.model.DataEntry>>() {
                        }.getType());
                        break;
                    case "returnCount":
                        returnCount = input.nextNumber();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new RequestEntriesResponse(cacheDataEntries, returnCount);
        }
    }

    /**
     * Requests data from cache.
     */
    public static Command<org.openqa.selenium.devtools.cachestorage.CacheStorage.RequestEntriesResponse> requestEntries(org.openqa.selenium.devtools.cachestorage.model.CacheId cacheId, java.lang.Integer skipCount, java.lang.Integer pageSize, java.util.Optional<java.lang.String> pathFilter) {
        java.util.Objects.requireNonNull(cacheId, "cacheId is required");
        java.util.Objects.requireNonNull(skipCount, "skipCount is required");
        java.util.Objects.requireNonNull(pageSize, "pageSize is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("cacheId", cacheId);
        params.put("skipCount", skipCount);
        params.put("pageSize", pageSize);
        pathFilter.ifPresent(p -> params.put("pathFilter", p));
        return new Command<>("CacheStorage.requestEntries", params.build(), input -> input.read(org.openqa.selenium.devtools.cachestorage.CacheStorage.RequestEntriesResponse.class));
    }
}
