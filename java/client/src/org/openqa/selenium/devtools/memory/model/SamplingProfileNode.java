package org.openqa.selenium.devtools.memory.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Heap profile sample.
 */
public class SamplingProfileNode {

    private final java.lang.Number size;

    private final java.lang.Number total;

    private final java.util.List<java.lang.String> stack;

    public SamplingProfileNode(java.lang.Number size, java.lang.Number total, java.util.List<java.lang.String> stack) {
        this.size = java.util.Objects.requireNonNull(size, "size is required");
        this.total = java.util.Objects.requireNonNull(total, "total is required");
        this.stack = java.util.Objects.requireNonNull(stack, "stack is required");
    }

    /**
     * Size of the sampled allocation.
     */
    public java.lang.Number getSize() {
        return size;
    }

    /**
     * Total bytes attributed to this sample.
     */
    public java.lang.Number getTotal() {
        return total;
    }

    /**
     * Execution stack at the point of allocation.
     */
    public java.util.List<java.lang.String> getStack() {
        return stack;
    }

    private static SamplingProfileNode fromJson(JsonInput input) {
        java.lang.Number size = null;
        java.lang.Number total = null;
        java.util.List<java.lang.String> stack = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "size":
                    size = input.nextNumber();
                    break;
                case "total":
                    total = input.nextNumber();
                    break;
                case "stack":
                    stack = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new SamplingProfileNode(size, total, stack);
    }
}
