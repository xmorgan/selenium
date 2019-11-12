package org.openqa.selenium.devtools.domsnapshot;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain facilitates obtaining document snapshots with DOM, layout, and style information.
 */
@Beta()
public class DOMSnapshot {

    /**
     * Disables DOM snapshot agent for the given page.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOMSnapshot.disable", params.build());
    }

    /**
     * Enables DOM snapshot agent for the given page.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOMSnapshot.enable", params.build());
    }

    public static class GetSnapshotResponse {

        private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DOMNode> domNodes;

        private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeNode> layoutTreeNodes;

        private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ComputedStyle> computedStyles;

        public GetSnapshotResponse(java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DOMNode> domNodes, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeNode> layoutTreeNodes, java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ComputedStyle> computedStyles) {
            this.domNodes = java.util.Objects.requireNonNull(domNodes, "domNodes is required");
            this.layoutTreeNodes = java.util.Objects.requireNonNull(layoutTreeNodes, "layoutTreeNodes is required");
            this.computedStyles = java.util.Objects.requireNonNull(computedStyles, "computedStyles is required");
        }

        /**
         * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
         */
        public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DOMNode> getDomNodes() {
            return domNodes;
        }

        /**
         * The nodes in the layout tree.
         */
        public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeNode> getLayoutTreeNodes() {
            return layoutTreeNodes;
        }

        /**
         * Whitelisted ComputedStyle properties for each node in the layout tree.
         */
        public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ComputedStyle> getComputedStyles() {
            return computedStyles;
        }

        private static GetSnapshotResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DOMNode> domNodes = null;
            java.util.List<org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeNode> layoutTreeNodes = null;
            java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ComputedStyle> computedStyles = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "domNodes":
                        domNodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DOMNode>>() {
                        }.getType());
                        break;
                    case "layoutTreeNodes":
                        layoutTreeNodes = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.LayoutTreeNode>>() {
                        }.getType());
                        break;
                    case "computedStyles":
                        computedStyles = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.ComputedStyle>>() {
                        }.getType());
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetSnapshotResponse(domNodes, layoutTreeNodes, computedStyles);
        }
    }

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
     * template contents, and imported documents) in a flattened array, as well as layout and
     * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
     * flattened.
     */
    @Deprecated()
    public static Command<org.openqa.selenium.devtools.domsnapshot.DOMSnapshot.GetSnapshotResponse> getSnapshot(java.util.List<java.lang.String> computedStyleWhitelist, java.util.Optional<java.lang.Boolean> includeEventListeners, java.util.Optional<java.lang.Boolean> includePaintOrder, java.util.Optional<java.lang.Boolean> includeUserAgentShadowTree) {
        java.util.Objects.requireNonNull(computedStyleWhitelist, "computedStyleWhitelist is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("computedStyleWhitelist", computedStyleWhitelist);
        includeEventListeners.ifPresent(p -> params.put("includeEventListeners", p));
        includePaintOrder.ifPresent(p -> params.put("includePaintOrder", p));
        includeUserAgentShadowTree.ifPresent(p -> params.put("includeUserAgentShadowTree", p));
        return new Command<>("DOMSnapshot.getSnapshot", params.build(), input -> input.read(org.openqa.selenium.devtools.domsnapshot.DOMSnapshot.GetSnapshotResponse.class));
    }

    public static class CaptureSnapshotResponse {

        private final java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DocumentSnapshot> documents;

        private final java.util.List<java.lang.String> strings;

        public CaptureSnapshotResponse(java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DocumentSnapshot> documents, java.util.List<java.lang.String> strings) {
            this.documents = java.util.Objects.requireNonNull(documents, "documents is required");
            this.strings = java.util.Objects.requireNonNull(strings, "strings is required");
        }

        /**
         * The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document.
         */
        public java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DocumentSnapshot> getDocuments() {
            return documents;
        }

        /**
         * Shared string table that all string properties refer to with indexes.
         */
        public java.util.List<java.lang.String> getStrings() {
            return strings;
        }

        private static CaptureSnapshotResponse fromJson(JsonInput input) {
            java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DocumentSnapshot> documents = null;
            java.util.List<java.lang.String> strings = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "documents":
                        documents = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.domsnapshot.model.DocumentSnapshot>>() {
                        }.getType());
                        break;
                    case "strings":
                        strings = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                        }.getType());
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new CaptureSnapshotResponse(documents, strings);
        }
    }

    /**
     * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
     * template contents, and imported documents) in a flattened array, as well as layout and
     * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
     * flattened.
     */
    public static Command<org.openqa.selenium.devtools.domsnapshot.DOMSnapshot.CaptureSnapshotResponse> captureSnapshot(java.util.List<java.lang.String> computedStyles, java.util.Optional<java.lang.Boolean> includePaintOrder, java.util.Optional<java.lang.Boolean> includeDOMRects) {
        java.util.Objects.requireNonNull(computedStyles, "computedStyles is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("computedStyles", computedStyles);
        includePaintOrder.ifPresent(p -> params.put("includePaintOrder", p));
        includeDOMRects.ifPresent(p -> params.put("includeDOMRects", p));
        return new Command<>("DOMSnapshot.captureSnapshot", params.build(), input -> input.read(org.openqa.selenium.devtools.domsnapshot.DOMSnapshot.CaptureSnapshotResponse.class));
    }
}
