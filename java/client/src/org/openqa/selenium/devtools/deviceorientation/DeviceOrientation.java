package org.openqa.selenium.devtools.deviceorientation;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class DeviceOrientation {

    /**
     * Clears the overridden Device Orientation.
     */
    public static Command<Void> clearDeviceOrientationOverride() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DeviceOrientation.clearDeviceOrientationOverride", params.build());
    }

    /**
     * Overrides the Device Orientation.
     */
    public static Command<Void> setDeviceOrientationOverride(java.lang.Number alpha, java.lang.Number beta, java.lang.Number gamma) {
        java.util.Objects.requireNonNull(alpha, "alpha is required");
        java.util.Objects.requireNonNull(beta, "beta is required");
        java.util.Objects.requireNonNull(gamma, "gamma is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("alpha", alpha);
        params.put("beta", beta);
        params.put("gamma", gamma);
        return new Command<>("DeviceOrientation.setDeviceOrientationOverride", params.build());
    }
}
