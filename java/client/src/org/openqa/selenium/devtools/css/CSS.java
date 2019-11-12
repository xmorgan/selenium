package org.openqa.selenium.devtools.css;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

/**
 * This domain exposes CSS read/write operations. All CSS objects (stylesheets, rules, and styles)
 * have an associated `id` used in subsequent operations on the related object. Each object type has
 * a specific `id` structure, and those are not interchangeable between objects of different kinds.
 * CSS objects can be loaded using the `get*ForNode()` calls (which accept a DOM node id). A client
 * can also keep track of stylesheets via the `styleSheetAdded`/`styleSheetRemoved` events and
 * subsequently load the required stylesheet contents using the `getStyleSheet[Text]()` methods.
 */
@Beta()
public class CSS {

    /**
     * Inserts a new rule with the given `ruleText` in a stylesheet with given `styleSheetId`, at the
     * position specified by `location`.
     */
    public static Command<org.openqa.selenium.devtools.css.model.CSSRule> addRule(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, java.lang.String ruleText, org.openqa.selenium.devtools.css.model.SourceRange location) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        java.util.Objects.requireNonNull(ruleText, "ruleText is required");
        java.util.Objects.requireNonNull(location, "location is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        params.put("ruleText", ruleText);
        params.put("location", location);
        return new Command<>("CSS.addRule", params.build(), ConverterFunctions.map("rule", org.openqa.selenium.devtools.css.model.CSSRule.class));
    }

    /**
     * Returns all class names from specified stylesheet.
     */
    public static Command<java.util.List<java.lang.String>> collectClassNames(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        return new Command<>("CSS.collectClassNames", params.build(), ConverterFunctions.map("classNames", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    /**
     * Creates a new special "via-inspector" stylesheet in the frame with given `frameId`.
     */
    public static Command<org.openqa.selenium.devtools.css.model.StyleSheetId> createStyleSheet(org.openqa.selenium.devtools.page.model.FrameId frameId) {
        java.util.Objects.requireNonNull(frameId, "frameId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("frameId", frameId);
        return new Command<>("CSS.createStyleSheet", params.build(), ConverterFunctions.map("styleSheetId", org.openqa.selenium.devtools.css.model.StyleSheetId.class));
    }

    /**
     * Disables the CSS agent for the given page.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("CSS.disable", params.build());
    }

    /**
     * Enables the CSS agent for the given page. Clients should not assume that the CSS agent has been
     * enabled until the result of this command is received.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("CSS.enable", params.build());
    }

    /**
     * Ensures that the given node will have specified pseudo-classes whenever its style is computed by
     * the browser.
     */
    public static Command<Void> forcePseudoState(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.util.List<java.lang.String> forcedPseudoClasses) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(forcedPseudoClasses, "forcedPseudoClasses is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("forcedPseudoClasses", forcedPseudoClasses);
        return new Command<>("CSS.forcePseudoState", params.build());
    }

    public static class GetBackgroundColorsResponse {

        private final java.util.List<java.lang.String> backgroundColors;

        private final java.lang.String computedFontSize;

        private final java.lang.String computedFontWeight;

        public GetBackgroundColorsResponse(java.util.List<java.lang.String> backgroundColors, java.lang.String computedFontSize, java.lang.String computedFontWeight) {
            this.backgroundColors = java.util.Objects.requireNonNull(backgroundColors, "backgroundColors is required");
            this.computedFontSize = java.util.Objects.requireNonNull(computedFontSize, "computedFontSize is required");
            this.computedFontWeight = java.util.Objects.requireNonNull(computedFontWeight, "computedFontWeight is required");
        }

        /**
         * The range of background colors behind this element, if it contains any visible text. If no
         * visible text is present, this will be undefined. In the case of a flat background color,
         * this will consist of simply that color. In the case of a gradient, this will consist of each
         * of the color stops. For anything more complicated, this will be an empty array. Images will
         * be ignored (as if the image had failed to load).
         */
        public java.util.List<java.lang.String> getBackgroundColors() {
            return backgroundColors;
        }

        /**
         * The computed font size for this node, as a CSS computed value string (e.g. '12px').
         */
        public java.lang.String getComputedFontSize() {
            return computedFontSize;
        }

        /**
         * The computed font weight for this node, as a CSS computed value string (e.g. 'normal' or
         * '100').
         */
        public java.lang.String getComputedFontWeight() {
            return computedFontWeight;
        }

        private static GetBackgroundColorsResponse fromJson(JsonInput input) {
            java.util.List<java.lang.String> backgroundColors = null;
            java.lang.String computedFontSize = null;
            java.lang.String computedFontWeight = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "backgroundColors":
                        backgroundColors = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                        }.getType());
                        break;
                    case "computedFontSize":
                        computedFontSize = input.nextString();
                        break;
                    case "computedFontWeight":
                        computedFontWeight = input.nextString();
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetBackgroundColorsResponse(backgroundColors, computedFontSize, computedFontWeight);
        }
    }

    public static Command<org.openqa.selenium.devtools.css.CSS.GetBackgroundColorsResponse> getBackgroundColors(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("CSS.getBackgroundColors", params.build(), input -> input.read(org.openqa.selenium.devtools.css.CSS.GetBackgroundColorsResponse.class));
    }

    /**
     * Returns the computed style for a DOM node identified by `nodeId`.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.css.model.CSSComputedStyleProperty>> getComputedStyleForNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("CSS.getComputedStyleForNode", params.build(), ConverterFunctions.map("computedStyle", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSComputedStyleProperty>>() {
        }.getType()));
    }

    public static class GetInlineStylesForNodeResponse {

        private final org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle;

        private final org.openqa.selenium.devtools.css.model.CSSStyle attributesStyle;

        public GetInlineStylesForNodeResponse(org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle, org.openqa.selenium.devtools.css.model.CSSStyle attributesStyle) {
            this.inlineStyle = java.util.Objects.requireNonNull(inlineStyle, "inlineStyle is required");
            this.attributesStyle = java.util.Objects.requireNonNull(attributesStyle, "attributesStyle is required");
        }

        /**
         * Inline style for the specified DOM node.
         */
        public org.openqa.selenium.devtools.css.model.CSSStyle getInlineStyle() {
            return inlineStyle;
        }

        /**
         * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
         */
        public org.openqa.selenium.devtools.css.model.CSSStyle getAttributesStyle() {
            return attributesStyle;
        }

        private static GetInlineStylesForNodeResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle = null;
            org.openqa.selenium.devtools.css.model.CSSStyle attributesStyle = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "inlineStyle":
                        inlineStyle = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                        break;
                    case "attributesStyle":
                        attributesStyle = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetInlineStylesForNodeResponse(inlineStyle, attributesStyle);
        }
    }

    /**
     * Returns the styles defined inline (explicitly in the "style" attribute and implicitly, using DOM
     * attributes) for a DOM node identified by `nodeId`.
     */
    public static Command<org.openqa.selenium.devtools.css.CSS.GetInlineStylesForNodeResponse> getInlineStylesForNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("CSS.getInlineStylesForNode", params.build(), input -> input.read(org.openqa.selenium.devtools.css.CSS.GetInlineStylesForNodeResponse.class));
    }

    public static class GetMatchedStylesForNodeResponse {

        private final org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle;

        private final org.openqa.selenium.devtools.css.model.CSSStyle attributesStyle;

        private final java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matchedCSSRules;

        private final java.util.List<org.openqa.selenium.devtools.css.model.PseudoElementMatches> pseudoElements;

        private final java.util.List<org.openqa.selenium.devtools.css.model.InheritedStyleEntry> inherited;

        private final java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframesRule> cssKeyframesRules;

        public GetMatchedStylesForNodeResponse(org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle, org.openqa.selenium.devtools.css.model.CSSStyle attributesStyle, java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matchedCSSRules, java.util.List<org.openqa.selenium.devtools.css.model.PseudoElementMatches> pseudoElements, java.util.List<org.openqa.selenium.devtools.css.model.InheritedStyleEntry> inherited, java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframesRule> cssKeyframesRules) {
            this.inlineStyle = java.util.Objects.requireNonNull(inlineStyle, "inlineStyle is required");
            this.attributesStyle = java.util.Objects.requireNonNull(attributesStyle, "attributesStyle is required");
            this.matchedCSSRules = java.util.Objects.requireNonNull(matchedCSSRules, "matchedCSSRules is required");
            this.pseudoElements = java.util.Objects.requireNonNull(pseudoElements, "pseudoElements is required");
            this.inherited = java.util.Objects.requireNonNull(inherited, "inherited is required");
            this.cssKeyframesRules = java.util.Objects.requireNonNull(cssKeyframesRules, "cssKeyframesRules is required");
        }

        /**
         * Inline style for the specified DOM node.
         */
        public org.openqa.selenium.devtools.css.model.CSSStyle getInlineStyle() {
            return inlineStyle;
        }

        /**
         * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
         */
        public org.openqa.selenium.devtools.css.model.CSSStyle getAttributesStyle() {
            return attributesStyle;
        }

        /**
         * CSS rules matching this node, from all applicable stylesheets.
         */
        public java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> getMatchedCSSRules() {
            return matchedCSSRules;
        }

        /**
         * Pseudo style matches for this node.
         */
        public java.util.List<org.openqa.selenium.devtools.css.model.PseudoElementMatches> getPseudoElements() {
            return pseudoElements;
        }

        /**
         * A chain of inherited styles (from the immediate node parent up to the DOM tree root).
         */
        public java.util.List<org.openqa.selenium.devtools.css.model.InheritedStyleEntry> getInherited() {
            return inherited;
        }

        /**
         * A list of CSS keyframed animations matching this node.
         */
        public java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframesRule> getCssKeyframesRules() {
            return cssKeyframesRules;
        }

        private static GetMatchedStylesForNodeResponse fromJson(JsonInput input) {
            org.openqa.selenium.devtools.css.model.CSSStyle inlineStyle = null;
            org.openqa.selenium.devtools.css.model.CSSStyle attributesStyle = null;
            java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch> matchedCSSRules = null;
            java.util.List<org.openqa.selenium.devtools.css.model.PseudoElementMatches> pseudoElements = null;
            java.util.List<org.openqa.selenium.devtools.css.model.InheritedStyleEntry> inherited = null;
            java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframesRule> cssKeyframesRules = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "inlineStyle":
                        inlineStyle = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                        break;
                    case "attributesStyle":
                        attributesStyle = input.read(org.openqa.selenium.devtools.css.model.CSSStyle.class);
                        break;
                    case "matchedCSSRules":
                        matchedCSSRules = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.RuleMatch>>() {
                        }.getType());
                        break;
                    case "pseudoElements":
                        pseudoElements = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.PseudoElementMatches>>() {
                        }.getType());
                        break;
                    case "inherited":
                        inherited = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.InheritedStyleEntry>>() {
                        }.getType());
                        break;
                    case "cssKeyframesRules":
                        cssKeyframesRules = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSKeyframesRule>>() {
                        }.getType());
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new GetMatchedStylesForNodeResponse(inlineStyle, attributesStyle, matchedCSSRules, pseudoElements, inherited, cssKeyframesRules);
        }
    }

    /**
     * Returns requested styles for a DOM node identified by `nodeId`.
     */
    public static Command<org.openqa.selenium.devtools.css.CSS.GetMatchedStylesForNodeResponse> getMatchedStylesForNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("CSS.getMatchedStylesForNode", params.build(), input -> input.read(org.openqa.selenium.devtools.css.CSS.GetMatchedStylesForNodeResponse.class));
    }

    /**
     * Returns all media queries parsed by the rendering engine.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia>> getMediaQueries() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("CSS.getMediaQueries", params.build(), ConverterFunctions.map("medias", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSMedia>>() {
        }.getType()));
    }

    /**
     * Requests information about platform fonts which we used to render child TextNodes in the given
     * node.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.css.model.PlatformFontUsage>> getPlatformFontsForNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        return new Command<>("CSS.getPlatformFontsForNode", params.build(), ConverterFunctions.map("fonts", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.PlatformFontUsage>>() {
        }.getType()));
    }

    /**
     * Returns the current textual content for a stylesheet.
     */
    public static Command<java.lang.String> getStyleSheetText(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        return new Command<>("CSS.getStyleSheetText", params.build(), ConverterFunctions.map("text", java.lang.String.class));
    }

    /**
     * Find a rule with the given active property for the given node and set the new value for this
     * property
     */
    public static Command<Void> setEffectivePropertyValueForNode(org.openqa.selenium.devtools.dom.model.NodeId nodeId, java.lang.String propertyName, java.lang.String value) {
        java.util.Objects.requireNonNull(nodeId, "nodeId is required");
        java.util.Objects.requireNonNull(propertyName, "propertyName is required");
        java.util.Objects.requireNonNull(value, "value is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("nodeId", nodeId);
        params.put("propertyName", propertyName);
        params.put("value", value);
        return new Command<>("CSS.setEffectivePropertyValueForNode", params.build());
    }

    /**
     * Modifies the keyframe rule key text.
     */
    public static Command<org.openqa.selenium.devtools.css.model.Value> setKeyframeKey(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.css.model.SourceRange range, java.lang.String keyText) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        java.util.Objects.requireNonNull(range, "range is required");
        java.util.Objects.requireNonNull(keyText, "keyText is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        params.put("range", range);
        params.put("keyText", keyText);
        return new Command<>("CSS.setKeyframeKey", params.build(), ConverterFunctions.map("keyText", org.openqa.selenium.devtools.css.model.Value.class));
    }

    /**
     * Modifies the rule selector.
     */
    public static Command<org.openqa.selenium.devtools.css.model.CSSMedia> setMediaText(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.css.model.SourceRange range, java.lang.String text) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        java.util.Objects.requireNonNull(range, "range is required");
        java.util.Objects.requireNonNull(text, "text is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        params.put("range", range);
        params.put("text", text);
        return new Command<>("CSS.setMediaText", params.build(), ConverterFunctions.map("media", org.openqa.selenium.devtools.css.model.CSSMedia.class));
    }

    /**
     * Modifies the rule selector.
     */
    public static Command<org.openqa.selenium.devtools.css.model.SelectorList> setRuleSelector(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, org.openqa.selenium.devtools.css.model.SourceRange range, java.lang.String selector) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        java.util.Objects.requireNonNull(range, "range is required");
        java.util.Objects.requireNonNull(selector, "selector is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        params.put("range", range);
        params.put("selector", selector);
        return new Command<>("CSS.setRuleSelector", params.build(), ConverterFunctions.map("selectorList", org.openqa.selenium.devtools.css.model.SelectorList.class));
    }

    /**
     * Sets the new stylesheet text.
     */
    public static Command<java.lang.String> setStyleSheetText(org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, java.lang.String text) {
        java.util.Objects.requireNonNull(styleSheetId, "styleSheetId is required");
        java.util.Objects.requireNonNull(text, "text is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("styleSheetId", styleSheetId);
        params.put("text", text);
        return new Command<>("CSS.setStyleSheetText", params.build(), ConverterFunctions.map("sourceMapURL", java.lang.String.class));
    }

    /**
     * Applies specified style edits one after another in the given order.
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.css.model.CSSStyle>> setStyleTexts(java.util.List<org.openqa.selenium.devtools.css.model.StyleDeclarationEdit> edits) {
        java.util.Objects.requireNonNull(edits, "edits is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("edits", edits);
        return new Command<>("CSS.setStyleTexts", params.build(), ConverterFunctions.map("styles", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.CSSStyle>>() {
        }.getType()));
    }

    /**
     * Enables the selector recording.
     */
    public static Command<Void> startRuleUsageTracking() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("CSS.startRuleUsageTracking", params.build());
    }

    /**
     * Stop tracking rule usage and return the list of rules that were used since last call to
     * `takeCoverageDelta` (or since start of coverage instrumentation)
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.css.model.RuleUsage>> stopRuleUsageTracking() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("CSS.stopRuleUsageTracking", params.build(), ConverterFunctions.map("ruleUsage", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.RuleUsage>>() {
        }.getType()));
    }

    /**
     * Obtain list of rules that became used since last call to this method (or since start of coverage
     * instrumentation)
     */
    public static Command<java.util.List<org.openqa.selenium.devtools.css.model.RuleUsage>> takeCoverageDelta() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("CSS.takeCoverageDelta", params.build(), ConverterFunctions.map("coverage", new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.RuleUsage>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.css.model.FontFace> fontsUpdated() {
        return new Event<>("CSS.fontsUpdated", ConverterFunctions.map("font", org.openqa.selenium.devtools.css.model.FontFace.class));
    }

    public static Event<Void> mediaQueryResultChanged() {
        return new Event<>("CSS.mediaQueryResultChanged", input -> null);
    }

    public static Event<org.openqa.selenium.devtools.css.model.CSSStyleSheetHeader> styleSheetAdded() {
        return new Event<>("CSS.styleSheetAdded", ConverterFunctions.map("header", org.openqa.selenium.devtools.css.model.CSSStyleSheetHeader.class));
    }

    public static Event<org.openqa.selenium.devtools.css.model.StyleSheetId> styleSheetChanged() {
        return new Event<>("CSS.styleSheetChanged", ConverterFunctions.map("styleSheetId", org.openqa.selenium.devtools.css.model.StyleSheetId.class));
    }

    public static Event<org.openqa.selenium.devtools.css.model.StyleSheetId> styleSheetRemoved() {
        return new Event<>("CSS.styleSheetRemoved", ConverterFunctions.map("styleSheetId", org.openqa.selenium.devtools.css.model.StyleSheetId.class));
    }
}
