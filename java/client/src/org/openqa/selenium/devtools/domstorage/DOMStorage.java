package org.openqa.selenium.devtools.domstorage;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * Query and modify DOM storage.
 */
@Beta()
public class DOMStorage {

    public static Command<Void> clear(org.openqa.selenium.devtools.domstorage.model.StorageId storageId) {
        java.util.Objects.requireNonNull(storageId, "storageId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("storageId", storageId);
        return new Command<>("DOMStorage.clear", params.build());
    }

    /**
     * Disables storage tracking, prevents storage events from being sent to the client.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOMStorage.disable", params.build());
    }

    /**
     * Enables storage tracking, storage events will now be delivered to the client.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOMStorage.enable", params.build());
    }

    public static Command<java.util.List<org.openqa.selenium.devtools.domstorage.model.Item>> getDOMStorageItems(org.openqa.selenium.devtools.domstorage.model.StorageId storageId) {
        java.util.Objects.requireNonNull(storageId, "storageId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("storageId", storageId);
        return new Command<>("DOMStorage.getDOMStorageItems", params.build(), ConverterFunctions.map("entries", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domstorage.model.Item>>() {
        }.getType()));
    }

    public static Command<Void> removeDOMStorageItem(org.openqa.selenium.devtools.domstorage.model.StorageId storageId, java.lang.String key) {
        java.util.Objects.requireNonNull(storageId, "storageId is required");
        java.util.Objects.requireNonNull(key, "key is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("storageId", storageId);
        params.put("key", key);
        return new Command<>("DOMStorage.removeDOMStorageItem", params.build());
    }

    public static Command<Void> setDOMStorageItem(org.openqa.selenium.devtools.domstorage.model.StorageId storageId, java.lang.String key, java.lang.String value) {
        java.util.Objects.requireNonNull(storageId, "storageId is required");
        java.util.Objects.requireNonNull(key, "key is required");
        java.util.Objects.requireNonNull(value, "value is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("storageId", storageId);
        params.put("key", key);
        params.put("value", value);
        return new Command<>("DOMStorage.setDOMStorageItem", params.build());
    }

    public static Event<org.openqa.selenium.devtools.domstorage.model.DomStorageItemAdded> domStorageItemAdded() {
        return new Event<>("DOMStorage.domStorageItemAdded", input -> input.read(org.openqa.selenium.devtools.domstorage.model.DomStorageItemAdded.class));
    }

    public static Event<org.openqa.selenium.devtools.domstorage.model.DomStorageItemRemoved> domStorageItemRemoved() {
        return new Event<>("DOMStorage.domStorageItemRemoved", input -> input.read(org.openqa.selenium.devtools.domstorage.model.DomStorageItemRemoved.class));
    }

    public static Event<org.openqa.selenium.devtools.domstorage.model.DomStorageItemUpdated> domStorageItemUpdated() {
        return new Event<>("DOMStorage.domStorageItemUpdated", input -> input.read(org.openqa.selenium.devtools.domstorage.model.DomStorageItemUpdated.class));
    }

    public static Event<org.openqa.selenium.devtools.domstorage.model.StorageId> domStorageItemsCleared() {
        return new Event<>("DOMStorage.domStorageItemsCleared", ConverterFunctions.map("storageId", org.openqa.selenium.devtools.domstorage.model.StorageId.class));
    }
}
