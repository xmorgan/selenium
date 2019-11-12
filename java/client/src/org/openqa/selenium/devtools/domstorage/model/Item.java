package org.openqa.selenium.devtools.domstorage.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * DOM Storage item.
 */
public class Item {

    private final java.util.List<java.lang.String> item;

    public Item(java.util.List<java.lang.String> item) {
        this.item = java.util.Objects.requireNonNull(item, "Missing value for Item");
    }

    private static Item fromJson(JsonInput input) {
        return input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType());
    }

    public String toString() {
        return item.toString();
    }
}
