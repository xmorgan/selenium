package org.openqa.selenium.devtools.dom.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Called when shadow root is pushed into the element.
 */
@org.openqa.selenium.Beta()
public class ShadowRootPushed {

    private final org.openqa.selenium.devtools.dom.model.NodeId hostId;

    private final org.openqa.selenium.devtools.dom.model.Node root;

    public ShadowRootPushed(org.openqa.selenium.devtools.dom.model.NodeId hostId, org.openqa.selenium.devtools.dom.model.Node root) {
        this.hostId = java.util.Objects.requireNonNull(hostId, "hostId is required");
        this.root = java.util.Objects.requireNonNull(root, "root is required");
    }

    /**
     * Host element id.
     */
    public org.openqa.selenium.devtools.dom.model.NodeId getHostId() {
        return hostId;
    }

    /**
     * Shadow root.
     */
    public org.openqa.selenium.devtools.dom.model.Node getRoot() {
        return root;
    }

    private static ShadowRootPushed fromJson(JsonInput input) {
        org.openqa.selenium.devtools.dom.model.NodeId hostId = null;
        org.openqa.selenium.devtools.dom.model.Node root = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "hostId":
                    hostId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                    break;
                case "root":
                    root = input.read(org.openqa.selenium.devtools.dom.model.Node.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new ShadowRootPushed(hostId, root);
    }
}
