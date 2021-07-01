// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.models.Compute;
import com.azure.resourcemanager.machinelearningservices.models.Identity;
import com.azure.resourcemanager.machinelearningservices.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Machine Learning compute object wrapped into ARM resource envelope. */
@Fluent
public final class ComputeResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeResourceInner.class);

    /*
     * Compute properties
     */
    @JsonProperty(value = "properties")
    private Compute properties;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The sku of the workspace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Compute properties.
     *
     * @return the properties value.
     */
    public Compute properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Compute properties.
     *
     * @param properties the properties value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withProperties(Compute properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: The sku of the workspace.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the workspace.
     *
     * @param sku the sku value to set.
     * @return the ComputeResourceInner object itself.
     */
    public ComputeResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ComputeResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComputeResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
