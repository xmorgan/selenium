package org.openqa.selenium.devtools.systeminfo;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * The SystemInfo domain defines methods and events for querying low-level system information.
 */
@Beta()
public class SystemInfo {

    public static class GetInfoResponse {

        private final org.openqa.selenium.devtools.systeminfo.model.GPUInfo gpu;

        private final java.lang.String modelName;

        private final java.lang.String modelVersion;

        private final java.lang.String commandLine;

        public GetInfoResponse(org.openqa.selenium.devtools.systeminfo.model.GPUInfo gpu, java.lang.String modelName, java.lang.String modelVersion, java.lang.String commandLine) {
            this.gpu = java.util.Objects.requireNonNull(gpu, "gpu is required");
            this.modelName = java.util.Objects.requireNonNull(modelName, "modelName is required");
            this.modelVersion = java.util.Objects.requireNonNull(modelVersion, "modelVersion is required");
            this.commandLine = java.util.Objects.requireNonNull(commandLine, "commandLine is required");
        }

        /**
         * Information about the GPUs on the system.
         */
        public org.openqa.selenium.devtools.systeminfo.model.GPUInfo getGpu() {
            return gpu;
        }

        /**
         * A platform-dependent description of the model of the machine. On Mac OS, this is, for
         * example, 'MacBookPro'. Will be the empty string if not supported.
         */
        public java.lang.String getModelName() {
            return modelName;
        }

        /**
         * A platform-dependent description of the version of the machine. On Mac OS, this is, for
         * example, '10.1'. Will be the empty string if not supported.
         */
        public java.lang.String getModelVersion() {
            return modelVersion;
        }

        /**
         * The command line string used to launch the browser. Will be the empty string if not
         * supported.
         */
        public java.lang.String getCommandLine() {
            return commandLine;
        }

        private static GetInfoResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.systeminfo.model.GPUInfo gpu = null;
            java.lang.String modelName = null;
            java.lang.String modelVersion = null;
            java.lang.String commandLine = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "gpu":
                        gpu = input.read(org.openqa.selenium.devtools.systeminfo.model.GPUInfo.class);
                        break;
                    case "modelName":
                        modelName = input.nextString();
                        break;
                    case "modelVersion":
                        modelVersion = input.nextString();
                        break;
                    case "commandLine":
                        commandLine = input.nextString();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetInfoResponse(gpu, modelName, modelVersion, commandLine);
        }
    }

    /**
     * Returns information about the system.
     */
    public static Command<org.openqa.selenium.devtools.systeminfo.SystemInfo.GetInfoResponse> getInfo() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("SystemInfo.getInfo", params.build(), input -> input.read(org.openqa.selenium.devtools.systeminfo.SystemInfo.GetInfoResponse.class));
    }

    /**
     * Returns information about all running processes.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.systeminfo.model.ProcessInfo>> getProcessInfo() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("SystemInfo.getProcessInfo", params.build(), ConverterFunctions.map("processInfo", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.systeminfo.model.ProcessInfo>>() {
        }.getType()));
    }
}
