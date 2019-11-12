package org.openqa.selenium.devtools.css.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * CSS media rule descriptor.
 */
public class CSSMedia {

    public enum Source {

        MEDIARULE("mediaRule"), IMPORTRULE("importRule"), LINKEDSHEET("linkedSheet"), INLINESHEET("inlineSheet");

        private String value;

        Source(String value) {
            this.value = value;
        }

        public static Source fromString(String s) {
            return java.util.Arrays.stream(Source.values()).filter(rs -> rs.value.equalsIgnoreCase(s)).findFirst().orElseThrow(() -> new org.openqa.selenium.devtools.DevToolsException("Given value " + s + " is not found within Source "));
        }

        public String toString() {
            return value;
        }

        public String toJson() {
            return value;
        }

        private static Source fromJson(JsonInput input) {
            return fromString(input.nextString());
        }
    }

    private final java.lang.String text;

    private final Source source;

    private final java.lang.String sourceURL;

    private final org.openqa.selenium.devtools.css.model.SourceRange range;

    private final org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId;

    private final java.util.List<org.openqa.selenium.devtools.css.model.MediaQuery> mediaList;

    public CSSMedia(java.lang.String text, Source source, java.lang.String sourceURL, org.openqa.selenium.devtools.css.model.SourceRange range, org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId, java.util.List<org.openqa.selenium.devtools.css.model.MediaQuery> mediaList) {
        this.text = java.util.Objects.requireNonNull(text, "text is required");
        this.source = java.util.Objects.requireNonNull(source, "source is required");
        this.sourceURL = sourceURL;
        this.range = range;
        this.styleSheetId = styleSheetId;
        this.mediaList = mediaList;
    }

    /**
     * Media query text.
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if
     * specified by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked
     * stylesheet's LINK tag, "inlineSheet" if specified by a "media" attribute in an inline
     * stylesheet's STYLE tag.
     */
    public Source getSource() {
        return source;
    }

    /**
     * URL of the document containing the media query description.
     */
    public java.lang.String getSourceURL() {
        return sourceURL;
    }

    /**
     * The associated rule (@media or @import) header range in the enclosing stylesheet (if
     * available).
     */
    public org.openqa.selenium.devtools.css.model.SourceRange getRange() {
        return range;
    }

    /**
     * Identifier of the stylesheet containing this object (if exists).
     */
    public org.openqa.selenium.devtools.css.model.StyleSheetId getStyleSheetId() {
        return styleSheetId;
    }

    /**
     * Array of media queries.
     */
    public java.util.List<org.openqa.selenium.devtools.css.model.MediaQuery> getMediaList() {
        return mediaList;
    }

    private static CSSMedia fromJson(JsonInput input) {
        java.lang.String text = null;
        Source source = null;
        java.lang.String sourceURL = null;
        org.openqa.selenium.devtools.css.model.SourceRange range = null;
        org.openqa.selenium.devtools.css.model.StyleSheetId styleSheetId = null;
        java.util.List<org.openqa.selenium.devtools.css.model.MediaQuery> mediaList = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "text":
                    text = input.nextString();
                    break;
                case "source":
                    source = Source.fromString(input.nextString());
                    break;
                case "sourceURL":
                    sourceURL = input.nextString();
                    break;
                case "range":
                    range = input.read(org.openqa.selenium.devtools.css.model.SourceRange.class);
                    break;
                case "styleSheetId":
                    styleSheetId = input.read(org.openqa.selenium.devtools.css.model.StyleSheetId.class);
                    break;
                case "mediaList":
                    mediaList = input.read(new com.google.common.reflect.TypeToken<java.util.List<org.openqa.selenium.devtools.css.model.MediaQuery>>() {
                    }.getType());
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new CSSMedia(text, source, sourceURL, range, styleSheetId, mediaList);
    }
}
