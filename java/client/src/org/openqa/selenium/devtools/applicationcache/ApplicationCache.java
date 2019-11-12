package org.openqa.selenium.devtools.applicationcache;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class ApplicationCache {

    /**
     * Enables application cache domain notifications.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("ApplicationCache.enable", params.build());
    }

    /**
     * Returns relevant application cache data for the document in given frame.
     */
    public static Command<org.openqa.selenium.devtools.applicationcache.model.ApplicationCache> getApplicationCacheForFrame(org.openqa.selenium.devtools.page.model.FrameId frameId) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        return new Command<>("ApplicationCache.getApplicationCacheForFrame", params.build(), ConverterFunctions.map("applicationCache", org.openqa.selenium.devtools.applicationcache.model.ApplicationCache.class));
    }

    /**
     * Returns array of frame identifiers with manifest urls for each frame containing a document
     * associated with some application cache.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.applicationcache.model.FrameWithManifest>> getFramesWithManifests() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("ApplicationCache.getFramesWithManifests", params.build(), ConverterFunctions.map("frameIds", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.applicationcache.model.FrameWithManifest>>() {
        }.getType()));
    }

    /**
     * Returns manifest URL for document in the given frame.
     */
    public static Command<java.lang.String> getManifestForFrame(org.openqa.selenium.devtools.page.model.FrameId frameId) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        return new Command<>("ApplicationCache.getManifestForFrame", params.build(), ConverterFunctions.map("manifestURL", java.lang.String.class));
    }

    public static Event<org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheStatusUpdated> applicationCacheStatusUpdated() {
        return new Event<>("ApplicationCache.applicationCacheStatusUpdated", input -> input.read(org.openqa.selenium.devtools.applicationcache.model.ApplicationCacheStatusUpdated.class));
    }

    public static Event<java.lang.Boolean> networkStateUpdated() {
        return new Event<>("ApplicationCache.networkStateUpdated", ConverterFunctions.map("isNowOnline", java.lang.Boolean.class));
    }
}
