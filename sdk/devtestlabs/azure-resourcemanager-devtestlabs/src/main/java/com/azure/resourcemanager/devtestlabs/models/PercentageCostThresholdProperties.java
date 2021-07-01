// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a percentage cost threshold. */
@Fluent
public final class PercentageCostThresholdProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PercentageCostThresholdProperties.class);

    /*
     * The cost threshold value.
     */
    @JsonProperty(value = "thresholdValue")
    private Double thresholdValue;

    /**
     * Get the thresholdValue property: The cost threshold value.
     *
     * @return the thresholdValue value.
     */
    public Double thresholdValue() {
        return this.thresholdValue;
    }

    /**
     * Set the thresholdValue property: The cost threshold value.
     *
     * @param thresholdValue the thresholdValue value to set.
     * @return the PercentageCostThresholdProperties object itself.
     */
    public PercentageCostThresholdProperties withThresholdValue(Double thresholdValue) {
        this.thresholdValue = thresholdValue;
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
