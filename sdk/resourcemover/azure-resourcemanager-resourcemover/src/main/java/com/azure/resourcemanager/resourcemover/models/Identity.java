// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the MSI properties of the Move Collection. */
@Fluent
public class Identity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Identity.class);

    /*
     * The type of identity used for the resource mover service.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /*
     * Gets or sets the principal id.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * Gets or sets the tenant id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Get the type property: The type of identity used for the resource mover service.
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the resource mover service.
     *
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: Gets or sets the principal id.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: Gets or sets the principal id.
     *
     * @param principalId the principalId value to set.
     * @return the Identity object itself.
     */
    public Identity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: Gets or sets the tenant id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Gets or sets the tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the Identity object itself.
     */
    public Identity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
