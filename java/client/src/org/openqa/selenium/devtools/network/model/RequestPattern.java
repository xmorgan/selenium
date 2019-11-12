package org.openqa.selenium.devtools.network.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

/**
 * Request pattern for interception.
 */
@org.openqa.selenium.Beta()
public class RequestPattern {

    private final java.lang.String urlPattern;

    private final org.openqa.selenium.devtools.network.model.ResourceType resourceType;

    private final org.openqa.selenium.devtools.network.model.InterceptionStage interceptionStage;

    public RequestPattern(java.lang.String urlPattern, org.openqa.selenium.devtools.network.model.ResourceType resourceType, org.openqa.selenium.devtools.network.model.InterceptionStage interceptionStage) {
        this.urlPattern = urlPattern;
        this.resourceType = resourceType;
        this.interceptionStage = interceptionStage;
    }

    /**
     * Wildcards ('*' -> zero or more, '?' -> exactly one) are allowed. Escape character is
     * backslash. Omitting is equivalent to "*".
     */
    public java.lang.String getUrlPattern() {
        return urlPattern;
    }

    /**
     * If set, only requests for matching resource types will be intercepted.
     */
    public org.openqa.selenium.devtools.network.model.ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Stage at wich to begin intercepting requests. Default is Request.
     */
    public org.openqa.selenium.devtools.network.model.InterceptionStage getInterceptionStage() {
        return interceptionStage;
    }

    private static RequestPattern fromJson(JsonInput input) {
        java.lang.String urlPattern = null;
        org.openqa.selenium.devtools.network.model.ResourceType resourceType = null;
        org.openqa.selenium.devtools.network.model.InterceptionStage interceptionStage = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "urlPattern":
                    urlPattern = input.nextString();
                    break;
                case "resourceType":
                    resourceType = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "interceptionStage":
                    interceptionStage = input.read(org.openqa.selenium.devtools.network.model.InterceptionStage.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RequestPattern(urlPattern, resourceType, interceptionStage);
    }
}
