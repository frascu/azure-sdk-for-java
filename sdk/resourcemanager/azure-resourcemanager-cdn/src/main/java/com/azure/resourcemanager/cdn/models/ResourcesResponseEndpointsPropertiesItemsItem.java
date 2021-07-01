// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourcesResponseEndpointsPropertiesItemsItem model. */
@Fluent
public final class ResourcesResponseEndpointsPropertiesItemsItem {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ResourcesResponseEndpointsPropertiesItemsItem.class);

    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The endpointId property.
     */
    @JsonProperty(value = "endpointId")
    private String endpointId;

    /*
     * The history property.
     */
    @JsonProperty(value = "history")
    private Boolean history;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the ResourcesResponseEndpointsPropertiesItemsItem object itself.
     */
    public ResourcesResponseEndpointsPropertiesItemsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResourcesResponseEndpointsPropertiesItemsItem object itself.
     */
    public ResourcesResponseEndpointsPropertiesItemsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpointId property: The endpointId property.
     *
     * @return the endpointId value.
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Set the endpointId property: The endpointId property.
     *
     * @param endpointId the endpointId value to set.
     * @return the ResourcesResponseEndpointsPropertiesItemsItem object itself.
     */
    public ResourcesResponseEndpointsPropertiesItemsItem withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Get the history property: The history property.
     *
     * @return the history value.
     */
    public Boolean history() {
        return this.history;
    }

    /**
     * Set the history property: The history property.
     *
     * @param history the history value to set.
     * @return the ResourcesResponseEndpointsPropertiesItemsItem object itself.
     */
    public ResourcesResponseEndpointsPropertiesItemsItem withHistory(Boolean history) {
        this.history = history;
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
