package org.openqa.selenium.devtools.indexeddb;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class IndexedDB {

    /**
     * Clears all entries from an object store.
     */
    public static Command<Void> clearObjectStore(java.lang.String securityOrigin, java.lang.String databaseName, java.lang.String objectStoreName) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        java.util.Objects.requireNonNull(objectStoreName, "objectStoreName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        params.put("databaseName", databaseName);
        params.put("objectStoreName", objectStoreName);
        return new Command<>("IndexedDB.clearObjectStore", params.build());
    }

    /**
     * Deletes a database.
     */
    public static Command<Void> deleteDatabase(java.lang.String securityOrigin, java.lang.String databaseName) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        params.put("databaseName", databaseName);
        return new Command<>("IndexedDB.deleteDatabase", params.build());
    }

    /**
     * Delete a range of entries from an object store
     */
    public static Command<Void> deleteObjectStoreEntries(java.lang.String securityOrigin, java.lang.String databaseName, java.lang.String objectStoreName, org.openqa.selenium.devtools.indexeddb.model.KeyRange keyRange) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        java.util.Objects.requireNonNull(objectStoreName, "objectStoreName is required");
        java.util.Objects.requireNonNull(keyRange, "keyRange is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        params.put("databaseName", databaseName);
        params.put("objectStoreName", objectStoreName);
        params.put("keyRange", keyRange);
        return new Command<>("IndexedDB.deleteObjectStoreEntries", params.build());
    }

    /**
     * Disables events from backend.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("IndexedDB.disable", params.build());
    }

    /**
     * Enables events from backend.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("IndexedDB.enable", params.build());
    }

    public static class RequestDataResponse {

        private final java.util.List<org.openqa.selenium.devtools.indexeddb.model.DataEntry> objectStoreDataEntries;

        private final java.lang.Boolean hasMore;

        public RequestDataResponse(java.util.List<org.openqa.selenium.devtools.indexeddb.model.DataEntry> objectStoreDataEntries, java.lang.Boolean hasMore) {
            this.objectStoreDataEntries = java.util.Objects.requireNonNull(objectStoreDataEntries, "objectStoreDataEntries is required");
            this.hasMore = java.util.Objects.requireNonNull(hasMore, "hasMore is required");
        }

        /**
         * Array of object store data entries.
         */
        public java.util.List<org.openqa.selenium.devtools.indexeddb.model.DataEntry> getObjectStoreDataEntries() {
            return objectStoreDataEntries;
        }

        /**
         * If true, there are more entries to fetch in the given range.
         */
        public java.lang.Boolean getHasMore() {
            return hasMore;
        }

        private static RequestDataResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.indexeddb.model.DataEntry> objectStoreDataEntries = null;
            java.lang.Boolean hasMore = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "objectStoreDataEntries":
                        objectStoreDataEntries = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.indexeddb.model.DataEntry>>() {
                        }.getType());
                        break;
                    case "hasMore":
                        hasMore = input.nextBoolean();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new RequestDataResponse(objectStoreDataEntries, hasMore);
        }
    }

    /**
     * Requests data from object store or index.
     */
    public static Command<org.openqa.selenium.devtools.indexeddb.IndexedDB.RequestDataResponse> requestData(java.lang.String securityOrigin, java.lang.String databaseName, java.lang.String objectStoreName, java.lang.String indexName, java.lang.Integer skipCount, java.lang.Integer pageSize, java.util.Optional<org.openqa.selenium.devtools.indexeddb.model.KeyRange> keyRange) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        java.util.Objects.requireNonNull(objectStoreName, "objectStoreName is required");
        java.util.Objects.requireNonNull(indexName, "indexName is required");
        java.util.Objects.requireNonNull(skipCount, "skipCount is required");
        java.util.Objects.requireNonNull(pageSize, "pageSize is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        params.put("databaseName", databaseName);
        params.put("objectStoreName", objectStoreName);
        params.put("indexName", indexName);
        params.put("skipCount", skipCount);
        params.put("pageSize", pageSize);
        keyRange.ifPresent(p -> params.put("keyRange", p));
        return new Command<>("IndexedDB.requestData", params.build(), input -> input.read(org.openqa.selenium.devtools.indexeddb.IndexedDB.RequestDataResponse.class));
    }

    public static class GetMetadataResponse {

        private final java.lang.Number entriesCount;

        private final java.lang.Number keyGeneratorValue;

        public GetMetadataResponse(java.lang.Number entriesCount, java.lang.Number keyGeneratorValue) {
            this.entriesCount = java.util.Objects.requireNonNull(entriesCount, "entriesCount is required");
            this.keyGeneratorValue = java.util.Objects.requireNonNull(keyGeneratorValue, "keyGeneratorValue is required");
        }

        /**
         * the entries count
         */
        public java.lang.Number getEntriesCount() {
            return entriesCount;
        }

        /**
         * the current value of key generator, to become the next inserted
         * key into the object store. Valid if objectStore.autoIncrement
         * is true.
         */
        public java.lang.Number getKeyGeneratorValue() {
            return keyGeneratorValue;
        }

        private static GetMetadataResponse fromJson(JsonInput input) {
            java.lang.Number entriesCount = null;
            java.lang.Number keyGeneratorValue = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "entriesCount":
                        entriesCount = input.nextNumber();
                        break;
                    case "keyGeneratorValue":
                        keyGeneratorValue = input.nextNumber();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetMetadataResponse(entriesCount, keyGeneratorValue);
        }
    }

    /**
     * Gets metadata of an object store
     */
    public static Command<org.openqa.selenium.devtools.indexeddb.IndexedDB.GetMetadataResponse> getMetadata(java.lang.String securityOrigin, java.lang.String databaseName, java.lang.String objectStoreName) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        java.util.Objects.requireNonNull(objectStoreName, "objectStoreName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        params.put("databaseName", databaseName);
        params.put("objectStoreName", objectStoreName);
        return new Command<>("IndexedDB.getMetadata", params.build(), input -> input.read(org.openqa.selenium.devtools.indexeddb.IndexedDB.GetMetadataResponse.class));
    }

    /**
     * Requests database with given name in given frame.
     */
    public static Command<org.openqa.selenium.devtools.indexeddb.model.DatabaseWithObjectStores> requestDatabase(java.lang.String securityOrigin, java.lang.String databaseName) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        java.util.Objects.requireNonNull(databaseName, "databaseName is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        params.put("databaseName", databaseName);
        return new Command<>("IndexedDB.requestDatabase", params.build(), ConverterFunctions.map("databaseWithObjectStores", org.openqa.selenium.devtools.indexeddb.model.DatabaseWithObjectStores.class));
    }

    /**
     * Requests database names for given security origin.
     */
    public static Command<java.util.List<java.lang.String>> requestDatabaseNames(java.lang.String securityOrigin) {
        java.util.Objects.requireNonNull(securityOrigin, "securityOrigin is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("securityOrigin", securityOrigin);
        return new Command<>("IndexedDB.requestDatabaseNames", params.build(), ConverterFunctions.map("databaseNames", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }
}
