package org.openqa.selenium.devtools.profiler;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

public class Profiler {

    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.disable", params.build());
    }

    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.enable", params.build());
    }

    /**
     * Collect coverage data for the current isolate. The coverage data may be incomplete due to
     * garbage collection.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.profiler.model.ScriptCoverage>> getBestEffortCoverage() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.getBestEffortCoverage", params.build(), ConverterFunctions.map("result", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.ScriptCoverage>>() {
        }.getType()));
    }

    /**
     * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
     */
    public static Command<Void> setSamplingInterval(java.lang.Integer interval) {
        java.util.Objects.requireNonNull(interval, "interval is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("interval", interval);
        return new Command<>("Profiler.setSamplingInterval", params.build());
    }

    public static Command<Void> start() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.start", params.build());
    }

    /**
     * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code
     * coverage may be incomplete. Enabling prevents running optimized code and resets execution
     * counters.
     */
    public static Command<Void> startPreciseCoverage(java.util.Optional<java.lang.Boolean> callCount, java.util.Optional<java.lang.Boolean> detailed) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        callCount.ifPresent(p -> params.put("callCount", p));
        detailed.ifPresent(p -> params.put("detailed", p));
        return new Command<>("Profiler.startPreciseCoverage", params.build());
    }

    /**
     * Enable type profile.
     */
    @Beta()
    public static Command<Void> startTypeProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.startTypeProfile", params.build());
    }

    public static Command<org.openqa.selenium.devtools.profiler.model.Profile> stop() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.stop", params.build(), ConverterFunctions.map("profile", org.openqa.selenium.devtools.profiler.model.Profile.class));
    }

    /**
     * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
     * executing optimized code.
     */
    public static Command<Void> stopPreciseCoverage() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.stopPreciseCoverage", params.build());
    }

    /**
     * Disable type profile. Disabling releases type profile data collected so far.
     */
    @Beta()
    public static Command<Void> stopTypeProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.stopTypeProfile", params.build());
    }

    /**
     * Collect coverage data for the current isolate, and resets execution counters. Precise code
     * coverage needs to have started.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.profiler.model.ScriptCoverage>> takePreciseCoverage() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.takePreciseCoverage", params.build(), ConverterFunctions.map("result", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.ScriptCoverage>>() {
        }.getType()));
    }

    /**
     * Collect type profile.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.profiler.model.ScriptTypeProfile>> takeTypeProfile() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Profiler.takeTypeProfile", params.build(), ConverterFunctions.map("result", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.profiler.model.ScriptTypeProfile>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.profiler.model.ConsoleProfileFinished> consoleProfileFinished() {
        return new Event<>("Profiler.consoleProfileFinished", input -> input.read(org.openqa.selenium.devtools.profiler.model.ConsoleProfileFinished.class));
    }

    public static Event<org.openqa.selenium.devtools.profiler.model.ConsoleProfileStarted> consoleProfileStarted() {
        return new Event<>("Profiler.consoleProfileStarted", input -> input.read(org.openqa.selenium.devtools.profiler.model.ConsoleProfileStarted.class));
    }
}
