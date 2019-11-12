package org.openqa.selenium.devtools.dom;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain exposes DOM read/write operations. Each DOM Node is represented with its mirror object
 * that has an `id`. This `id` can be used to get additional information on the Node, resolve it into
 * the JavaScript object wrapper, etc. It is important that client receives DOM events only for the
 * nodes that are known to the client. Backend keeps track of the nodes that were sent to the client
 * and never sends the same node twice. It is client's responsibility to collect information about
 * the nodes that were sent to the client.<p>Note that `iframe` owner elements will return
 * corresponding document elements as their child nodes.</p>
 */
public class DOM {

    /**
     * Collects class names for the node with given id and all of it's child nodes.
     */
    @Beta()
    public static Command<java.util.List<java.lang.String>> collectClassNamesFromSubtree(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("DOM.collectClassNamesFromSubtree", params.build(), ConverterFunctions.map("classNames", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Creates a deep copy of the specified node and places it into the target container before the
     * given anchor.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> copyTo(org.openqa.selenium.devtools.dom.model.NodeId nodeId, org.openqa.selenium.devtools.dom.model.NodeId targetNodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> insertBeforeNodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(targetNodeId, "targetNodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("targetNodeId", targetNodeId);
        insertBeforeNodeId.ifPresent(p -> params.put("insertBeforeNodeId", p));
        return new Command<>("DOM.copyTo", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    /**
     * Describes node given its id, does not require domain to be enabled. Does not start tracking any
     * objects, can be used for automation.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.Node> describeNode(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId, java.util.Optional<java.lang.Integer> depth, java.util.Optional<java.lang.Boolean> pierce) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        depth.ifPresent(p -> params.put("depth", p));
        pierce.ifPresent(p -> params.put("pierce", p));
        return new Command<>("DOM.describeNode", params.build(), ConverterFunctions.map("node", org.openqa.selenium.devtools.dom.model.Node.class));
    }

    /**
     * Disables DOM agent for the given page.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.disable", params.build());
    }

    /**
     * Discards search results from the session with the given id. `getSearchResults` should no longer
     * be called for that search.
     */
    @Beta()
    public static Command<Void> discardSearchResults(java.lang.String searchId) {
        java.util.Objects.requireNonNull(searchId, "searchId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("searchId", searchId);
        return new Command<>("DOM.discardSearchResults", params.build());
    }

    /**
     * Enables DOM agent for the given page.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.enable", params.build());
    }

    /**
     * Focuses the given element.
     */
    public static Command<Void> focus(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        return new Command<>("DOM.focus", params.build());
    }

    /**
     * Returns attributes for the specified node.
     */
    public static Command<java.util.List<java.lang.String>> getAttributes(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("DOM.getAttributes", params.build(), ConverterFunctions.map("attributes", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Returns boxes for the given node.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.BoxModel> getBoxModel(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        return new Command<>("DOM.getBoxModel", params.build(), ConverterFunctions.map("model", org.openqa.selenium.devtools.dom.model.BoxModel.class));
    }

    /**
     * Returns quads that describe node position on the page. This method
     * might return multiple quads for inline nodes.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.dom.model.Quad>> getContentQuads(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        return new Command<>("DOM.getContentQuads", params.build(), ConverterFunctions.map("quads", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.Quad>>() {
        }.getType()));
    }

    /**
     * Returns the root DOM node (and optionally the subtree) to the caller.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.Node> getDocument(java.util.Optional<java.lang.Integer> depth, java.util.Optional<java.lang.Boolean> pierce) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        depth.ifPresent(p -> params.put("depth", p));
        pierce.ifPresent(p -> params.put("pierce", p));
        return new Command<>("DOM.getDocument", params.build(), ConverterFunctions.map("root", org.openqa.selenium.devtools.dom.model.Node.class));
    }

    /**
     * Returns the root DOM node (and optionally the subtree) to the caller.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.dom.model.Node>> getFlattenedDocument(java.util.Optional<java.lang.Integer> depth, java.util.Optional<java.lang.Boolean> pierce) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        depth.ifPresent(p -> params.put("depth", p));
        pierce.ifPresent(p -> params.put("pierce", p));
        return new Command<>("DOM.getFlattenedDocument", params.build(), ConverterFunctions.map("nodes", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.Node>>() {
        }.getType()));
    }

    public static class GetNodeForLocationResponse {

        private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

        private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

        public GetNodeForLocationResponse(org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId, org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
            this.backendNodeId = java.util.Objects.requireNonNull(backendNodeId, "backendNodeId is required");
            this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        }

        /**
         * Resulting node.
         */
        public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
            return backendNodeId;
        }

        /**
         * Id of the node at given coordinates, only when enabled and requested document.
         */
        public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
            return nodeId;
        }

        private static GetNodeForLocationResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
            org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "backendNodeId":
                        backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                        break;
                    case "nodeId":
                        nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetNodeForLocationResponse(backendNodeId, nodeId);
        }
    }

    /**
     * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
     * either returned or not.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.dom.DOM.GetNodeForLocationResponse> getNodeForLocation(java.lang.Integer x, java.lang.Integer y, java.util.Optional<java.lang.Boolean> includeUserAgentShadowDOM) {
        java.util.Objects.requireNonNull(x, "x is required");
        java.util.Objects.requireNonNull(y, "y is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("x", x);
        params.put("y", y);
        includeUserAgentShadowDOM.ifPresent(p -> params.put("includeUserAgentShadowDOM", p));
        return new Command<>("DOM.getNodeForLocation", params.build(), input -> input.read(org.openqa.selenium.devtools.dom.DOM.GetNodeForLocationResponse.class));
    }

    /**
     * Returns node's HTML markup.
     */
    public static Command<java.lang.String> getOuterHTML(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        return new Command<>("DOM.getOuterHTML", params.build(), ConverterFunctions.map("outerHTML", java.lang.String.class));
    }

    /**
     * Returns the id of the nearest ancestor that is a relayout boundary.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> getRelayoutBoundary(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("DOM.getRelayoutBoundary", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    /**
     * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
     * identifier.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>> getSearchResults(java.lang.String searchId, java.lang.Integer fromIndex, java.lang.Integer toIndex) {
        java.util.Objects.requireNonNull(searchId, "searchId is required");
        java.util.Objects.requireNonNull(fromIndex, "fromIndex is required");
        java.util.Objects.requireNonNull(toIndex, "toIndex is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("searchId", searchId);
        params.put("fromIndex", fromIndex);
        params.put("toIndex", toIndex);
        return new Command<>("DOM.getSearchResults", params.build(), ConverterFunctions.map("nodeIds", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>>() {
        }.getType()));
    }

    /**
     * Hides any highlight.
     */
    public static Command<Void> hideHighlight() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.hideHighlight", params.build());
    }

    /**
     * Highlights DOM node.
     */
    public static Command<Void> highlightNode() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.highlightNode", params.build());
    }

    /**
     * Highlights given rectangle.
     */
    public static Command<Void> highlightRect() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.highlightRect", params.build());
    }

    /**
     * Marks last undoable state.
     */
    @Beta()
    public static Command<Void> markUndoableState() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.markUndoableState", params.build());
    }

    /**
     * Moves node into the new container, places it before the given anchor.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> moveTo(org.openqa.selenium.devtools.dom.model.NodeId nodeId, org.openqa.selenium.devtools.dom.model.NodeId targetNodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> insertBeforeNodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(targetNodeId, "targetNodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("targetNodeId", targetNodeId);
        insertBeforeNodeId.ifPresent(p -> params.put("insertBeforeNodeId", p));
        return new Command<>("DOM.moveTo", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    public static class PerformSearchResponse {

        private final java.lang.String searchId;

        private final java.lang.Integer resultCount;

        public PerformSearchResponse(java.lang.String searchId, java.lang.Integer resultCount) {
            this.searchId = java.util.Objects.requireNonNull(searchId, "searchId is required");
            this.resultCount = java.util.Objects.requireNonNull(resultCount, "resultCount is required");
        }

        /**
         * Unique search session identifier.
         */
        public java.lang.String getSearchId() {
            return searchId;
        }

        /**
         * Number of search results.
         */
        public java.lang.Integer getResultCount() {
            return resultCount;
        }

        private static PerformSearchResponse fromJson(JsonInput input) {
            java.lang.String searchId = null;
            java.lang.Integer resultCount = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "searchId":
                        searchId = input.nextString();
                        break;
                    case "resultCount":
                        resultCount = input.nextNumber().intValue();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new PerformSearchResponse(searchId, resultCount);
        }
    }

    /**
     * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
     * `cancelSearch` to end this search session.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.dom.DOM.PerformSearchResponse> performSearch(java.lang.String query, java.util.Optional<java.lang.Boolean> includeUserAgentShadowDOM) {
        java.util.Objects.requireNonNull(query, "query is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("query", query);
        includeUserAgentShadowDOM.ifPresent(p -> params.put("includeUserAgentShadowDOM", p));
        return new Command<>("DOM.performSearch", params.build(), input -> input.read(org.openqa.selenium.devtools.dom.DOM.PerformSearchResponse.class));
    }

    /**
     * Requests that the node is sent to the caller given its path. // FIXME, use XPath
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> pushNodeByPathToFrontend(java.lang.String path) {
        java.util.Objects.requireNonNull(path, "path is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("path", path);
        return new Command<>("DOM.pushNodeByPathToFrontend", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    /**
     * Requests that a batch of nodes is sent to the caller given their backend node ids.
     */
    @Beta()
    public static Command<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>> pushNodesByBackendIdsToFrontend(java.util.List<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeIds) {
        java.util.Objects.requireNonNull(backendNodeIds, "backendNodeIds is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("backendNodeIds", backendNodeIds);
        return new Command<>("DOM.pushNodesByBackendIdsToFrontend", params.build(), ConverterFunctions.map("nodeIds", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>>() {
        }.getType()));
    }

    /**
     * Executes `querySelector` on a given node.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> querySelector(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String selector) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(selector, "selector is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("selector", selector);
        return new Command<>("DOM.querySelector", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    /**
     * Executes `querySelectorAll` on a given node.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>> querySelectorAll(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String selector) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(selector, "selector is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("selector", selector);
        return new Command<>("DOM.querySelectorAll", params.build(), ConverterFunctions.map("nodeIds", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>>() {
        }.getType()));
    }

    /**
     * Re-does the last undone action.
     */
    @Beta()
    public static Command<Void> redo() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.redo", params.build());
    }

    /**
     * Removes attribute with given name from an element with given id.
     */
    public static Command<Void> removeAttribute(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String name) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(name, "name is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("name", name);
        return new Command<>("DOM.removeAttribute", params.build());
    }

    /**
     * Removes node with given id.
     */
    public static Command<Void> removeNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("DOM.removeNode", params.build());
    }

    /**
     * Requests that children of the node with given id are returned to the caller in form of
     * `setChildNodes` events where not only immediate children are retrieved, but all children down to
     * the specified depth.
     */
    public static Command<Void> requestChildNodes(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.util.Optional<java.lang.Integer> depth, java.util.Optional<java.lang.Boolean> pierce) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        depth.ifPresent(p -> params.put("depth", p));
        pierce.ifPresent(p -> params.put("pierce", p));
        return new Command<>("DOM.requestChildNodes", params.build());
    }

    /**
     * Requests that the node is sent to the caller given the JavaScript node object reference. All
     * nodes that form the path from the node to the root are also sent to the client as a series of
     * `setChildNodes` notifications.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> requestNode(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        return new Command<>("DOM.requestNode", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    /**
     * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
     */
    public static Command<org.openqa.selenium.devtools.runtime.model.RemoteObject> resolveNode(java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<java.lang.String> objectGroup, java.util.Optional<org.openqa.selenium.devtools.runtime.model.ExecutionContextId> executionContextId) {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectGroup.ifPresent(p -> params.put("objectGroup", p));
        executionContextId.ifPresent(p -> params.put("executionContextId", p));
        return new Command<>("DOM.resolveNode", params.build(), ConverterFunctions.map("object", org.openqa.selenium.devtools.runtime.model.RemoteObject.class));
    }

    /**
     * Sets attribute for an element with given id.
     */
    public static Command<Void> setAttributeValue(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String name, java.lang.String value) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(name, "name is required");
        java.util.Objects.requireNonNull(value, "value is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("name", name);
        params.put("value", value);
        return new Command<>("DOM.setAttributeValue", params.build());
    }

    /**
     * Sets attributes on element with given id. This method is useful when user edits some existing
     * attribute value and types in several attribute name/value pairs.
     */
    public static Command<Void> setAttributesAsText(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String text, java.util.Optional<java.lang.String> name) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(text, "text is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("text", text);
        name.ifPresent(p -> params.put("name", p));
        return new Command<>("DOM.setAttributesAsText", params.build());
    }

    /**
     * Sets files for the given file input element.
     */
    public static Command<Void> setFileInputFiles(java.util.List<java.lang.String> files, java.util.Optional<org.openqa.selenium.devtools.dom.model.NodeId> nodeId, java.util.Optional<org.openqa.selenium.devtools.dom.model.BackendNodeId> backendNodeId, java.util.Optional<org.openqa.selenium.devtools.runtime.model.RemoteObjectId> objectId) {
        java.util.Objects.requireNonNull(files, "files is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("files", files);
        nodeId.ifPresent(p -> params.put("nodeId", p));
        backendNodeId.ifPresent(p -> params.put("backendNodeId", p));
        objectId.ifPresent(p -> params.put("objectId", p));
        return new Command<>("DOM.setFileInputFiles", params.build());
    }

    /**
     * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
     */
    @Beta()
    public static Command<Void> setNodeStackTracesEnabled(java.lang.Boolean enable) {
        java.util.Objects.requireNonNull(enable, "enable is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("enable", enable);
        return new Command<>("DOM.setNodeStackTracesEnabled", params.build());
    }

    /**
     * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.runtime.model.StackTrace> getNodeStackTraces(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("DOM.getNodeStackTraces", params.build(), ConverterFunctions.map("creation", org.openqa.selenium.devtools.runtime.model.StackTrace.class));
    }

    /**
     * Returns file information for the given
     * File wrapper.
     */
    @Beta()
    public static Command<java.lang.String> getFileInfo(org.openqa.selenium.devtools.runtime.model.RemoteObjectId objectId) {
        java.util.Objects.requireNonNull(objectId, "objectId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("objectId", objectId);
        return new Command<>("DOM.getFileInfo", params.build(), ConverterFunctions.map("path", java.lang.String.class));
    }

    /**
     * Enables console to refer to the node with given id via $x (see Command Line API for more details
     * $x functions).
     */
    @Beta()
    public static Command<Void> setInspectedNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("DOM.setInspectedNode", params.build());
    }

    /**
     * Sets node name for a node with given id.
     */
    public static Command<org.openqa.selenium.devtools.dom.model.NodeId> setNodeName(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String name) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(name, "name is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("name", name);
        return new Command<>("DOM.setNodeName", params.build(), ConverterFunctions.map("nodeId", org.openqa.selenium.devtools.dom.model.NodeId.class));
    }

    /**
     * Sets node value for a node with given id.
     */
    public static Command<Void> setNodeValue(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String value) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(value, "value is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("value", value);
        return new Command<>("DOM.setNodeValue", params.build());
    }

    /**
     * Sets node HTML markup, returns new node id.
     */
    public static Command<Void> setOuterHTML(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String outerHTML) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(outerHTML, "outerHTML is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("outerHTML", outerHTML);
        return new Command<>("DOM.setOuterHTML", params.build());
    }

    /**
     * Undoes the last performed action.
     */
    @Beta()
    public static Command<Void> undo() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("DOM.undo", params.build());
    }

    public static class GetFrameOwnerResponse {

        private final org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId;

        private final org.openqa.selenium.devtools.dom.model.NodeId nodeId;

        public GetFrameOwnerResponse(org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId, org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
            this.backendNodeId = java.util.Objects.requireNonNull(backendNodeId, "backendNodeId is required");
            this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        }

        /**
         * Resulting node.
         */
        public org.openqa.selenium.devtools.dom.model.BackendNodeId getBackendNodeId() {
            return backendNodeId;
        }

        /**
         * Id of the node at given coordinates, only when enabled and requested document.
         */
        public org.openqa.selenium.devtools.dom.model.NodeId getNodeId() {
            return nodeId;
        }

        private static GetFrameOwnerResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.dom.model.BackendNodeId backendNodeId = null;
            org.openqa.selenium.devtools.dom.model.NodeId nodeId = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "backendNodeId":
                        backendNodeId = input.read(org.openqa.selenium.devtools.dom.model.BackendNodeId.class);
                        break;
                    case "nodeId":
                        nodeId = input.read(org.openqa.selenium.devtools.dom.model.NodeId.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetFrameOwnerResponse(backendNodeId, nodeId);
        }
    }

    /**
     * Returns iframe node that owns iframe with the given domain.
     */
    @Beta()
    public static Command<org.openqa.selenium.devtools.dom.DOM.GetFrameOwnerResponse> getFrameOwner(org.openqa.selenium.devtools.page.model.FrameId frameId) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        return new Command<>("DOM.getFrameOwner", params.build(), input -> input.read(org.openqa.selenium.devtools.dom.DOM.GetFrameOwnerResponse.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.AttributeModified> attributeModified() {
        return new Event<>("DOM.attributeModified", input -> input.read(org.openqa.selenium.devtools.dom.model.AttributeModified.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.AttributeRemoved> attributeRemoved() {
        return new Event<>("DOM.attributeRemoved", input -> input.read(org.openqa.selenium.devtools.dom.model.AttributeRemoved.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.CharacterDataModified> characterDataModified() {
        return new Event<>("DOM.characterDataModified", input -> input.read(org.openqa.selenium.devtools.dom.model.CharacterDataModified.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.ChildNodeCountUpdated> childNodeCountUpdated() {
        return new Event<>("DOM.childNodeCountUpdated", input -> input.read(org.openqa.selenium.devtools.dom.model.ChildNodeCountUpdated.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.ChildNodeInserted> childNodeInserted() {
        return new Event<>("DOM.childNodeInserted", input -> input.read(org.openqa.selenium.devtools.dom.model.ChildNodeInserted.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.ChildNodeRemoved> childNodeRemoved() {
        return new Event<>("DOM.childNodeRemoved", input -> input.read(org.openqa.selenium.devtools.dom.model.ChildNodeRemoved.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.DistributedNodesUpdated> distributedNodesUpdated() {
        return new Event<>("DOM.distributedNodesUpdated", input -> input.read(org.openqa.selenium.devtools.dom.model.DistributedNodesUpdated.class));
    }

    public static Event<Void> documentUpdated() {
        return new Event<>("DOM.documentUpdated", input -> null);
    }

    public static Event<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>> inlineStyleInvalidated() {
        return new Event<>("DOM.inlineStyleInvalidated", ConverterFunctions.map("nodeIds", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.dom.model.NodeId>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.PseudoElementAdded> pseudoElementAdded() {
        return new Event<>("DOM.pseudoElementAdded", input -> input.read(org.openqa.selenium.devtools.dom.model.PseudoElementAdded.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.PseudoElementRemoved> pseudoElementRemoved() {
        return new Event<>("DOM.pseudoElementRemoved", input -> input.read(org.openqa.selenium.devtools.dom.model.PseudoElementRemoved.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.SetChildNodes> setChildNodes() {
        return new Event<>("DOM.setChildNodes", input -> input.read(org.openqa.selenium.devtools.dom.model.SetChildNodes.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.ShadowRootPopped> shadowRootPopped() {
        return new Event<>("DOM.shadowRootPopped", input -> input.read(org.openqa.selenium.devtools.dom.model.ShadowRootPopped.class));
    }

    public static Event<org.openqa.selenium.devtools.dom.model.ShadowRootPushed> shadowRootPushed() {
        return new Event<>("DOM.shadowRootPushed", input -> input.read(org.openqa.selenium.devtools.dom.model.ShadowRootPushed.class));
    }
}
