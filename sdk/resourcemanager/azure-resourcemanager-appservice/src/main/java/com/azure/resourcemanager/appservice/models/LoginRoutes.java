// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LoginRoutes model. */
@JsonFlatten
@Fluent
public class LoginRoutes extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoginRoutes.class);

    /*
     * The logoutEndpoint property.
     */
    @JsonProperty(value = "properties.logoutEndpoint")
    private String logoutEndpoint;

    /**
     * Get the logoutEndpoint property: The logoutEndpoint property.
     *
     * @return the logoutEndpoint value.
     */
    public String logoutEndpoint() {
        return this.logoutEndpoint;
    }

    /**
     * Set the logoutEndpoint property: The logoutEndpoint property.
     *
     * @param logoutEndpoint the logoutEndpoint value to set.
     * @return the LoginRoutes object itself.
     */
    public LoginRoutes withLogoutEndpoint(String logoutEndpoint) {
        this.logoutEndpoint = logoutEndpoint;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoginRoutes withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
