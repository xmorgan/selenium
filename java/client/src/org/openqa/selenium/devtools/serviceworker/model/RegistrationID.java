package org.openqa.selenium.devtools.serviceworker.model;

import org.openqa.selenium.Beta;
import org.openqa.selenium.json.JsonInput;

public class RegistrationID {

    private final java.lang.String registrationID;

    public RegistrationID(java.lang.String registrationID) {
        this.registrationID = java.util.Objects.requireNonNull(registrationID, "Missing value for RegistrationID");
    }

    private static RegistrationID fromJson(JsonInput input) {
        return new RegistrationID(input.nextString());
    }

    public String toJson() {
        return registrationID.toString();
    }

    public String toString() {
        return registrationID.toString();
    }
}
