package org.openqa.selenium.devtools.schema;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain is deprecated.
 */
@Deprecated()
public class Schema {

    /**
     * Returns supported domains.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.schema.model.Domain>> getDomains() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Schema.getDomains", params.build(), ConverterFunctions.map("domains", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.schema.model.Domain>>() {
        }.getType()));
    }
}
