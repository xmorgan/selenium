package org.openqa.selenium.devtools.tethering;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * The Tethering domain defines methods and events for browser port binding.
 */
@Beta()
public class Tethering {

    /**
     * Request browser port binding.
     */
    public static Command<Void> bind(java.lang.Integer port) {
        java.util.Objects.requireNonNull(port, "port is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("port", port);
        return new Command<>("Tethering.bind", params.build());
    }

    /**
     * Request browser port unbinding.
     */
    public static Command<Void> unbind(java.lang.Integer port) {
        java.util.Objects.requireNonNull(port, "port is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("port", port);
        return new Command<>("Tethering.unbind", params.build());
    }

    public static Event<org.openqa.selenium.devtools.tethering.model.Accepted> accepted() {
        return new Event<>("Tethering.accepted", input -> input.read(org.openqa.selenium.devtools.tethering.model.Accepted.class));
    }
}
