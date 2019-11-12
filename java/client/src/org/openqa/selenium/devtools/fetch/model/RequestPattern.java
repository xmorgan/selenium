package org.openqa.selenium.devtools.fetch.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

@org.openqa.selenium.Beta()
public class RequestPattern {

    private final java.lang.String urlPattern;

    private final org.openqa.selenium.devtools.network.model.ResourceType resourceType;

    private final org.openqa.selenium.devtools.fetch.model.RequestStage requestStage;

    public RequestPattern(java.lang.String urlPattern, org.openqa.selenium.devtools.network.model.ResourceType resourceType, org.openqa.selenium.devtools.fetch.model.RequestStage requestStage) {
        this.urlPattern = urlPattern;
        this.resourceType = resourceType;
        this.requestStage = requestStage;
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
    public org.openqa.selenium.devtools.fetch.model.RequestStage getRequestStage() {
        return requestStage;
    }

    private static RequestPattern fromJson(JsonInput input) {
        java.lang.String urlPattern = null;
        org.openqa.selenium.devtools.network.model.ResourceType resourceType = null;
        org.openqa.selenium.devtools.fetch.model.RequestStage requestStage = null;
        input.beginObject();
        while (input.hasNext()) {
            switch(input.nextName()) {
                case "urlPattern":
                    urlPattern = input.nextString();
                    break;
                case "resourceType":
                    resourceType = input.read(org.openqa.selenium.devtools.network.model.ResourceType.class);
                    break;
                case "requestStage":
                    requestStage = input.read(org.openqa.selenium.devtools.fetch.model.RequestStage.class);
                    break;
                default:
                    input.skipValue();
                    break;
            }
        }
        input.endObject();
        return new RequestPattern(urlPattern, resourceType, requestStage);
    }
}
