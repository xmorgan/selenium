package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Called when shadow root is popped from the element.
 */
@org.openqa.selenium.Beta()
public class ShadowRootPopped {

    private final org.openqa.selenium.devtools.dom.model.NodeId hostId;

    private final org.openqa.selenium.devtools.dom.model.NodeId rootId;

    public ShadowRootPopped(org.openqa.selenium.devtools.dom.model.NodeId hostId, org.openqa.selenium.devtools.dom.model.NodeId rootId) {
        this.hostId = java.util.Objects.requireNonNull(hostId, "hostId is required");
        this.rootId = java.util.Objects.requireNonNull(rootId, "rootId is required");
    }

    /**
     * Host element id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getHostId() {
        return hostId;
    }

    /**
     * Shadow root id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getRootId() {
        return rootId;
    }

    private static ShadowRootPopped fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId hostId = null;
        org.openqa.selenium.devtools.dom.model.NodeId rootId = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "hostId":
                    hostId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "rootId":
                    rootId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ShadowRootPopped(hostId, rootId);
    }
}
