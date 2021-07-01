// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The definition of the prediction distribution. */
@Fluent
public final class PredictionDistributionDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PredictionDistributionDefinition.class);

    /*
     * Total positive in the distribution.
     */
    @JsonProperty(value = "totalPositives")
    private Long totalPositives;

    /*
     * Total negatives in the distribution.
     */
    @JsonProperty(value = "totalNegatives")
    private Long totalNegatives;

    /*
     * Distributions of the prediction.
     */
    @JsonProperty(value = "distributions")
    private List<PredictionDistributionDefinitionDistributionsItem> distributions;

    /**
     * Get the totalPositives property: Total positive in the distribution.
     *
     * @return the totalPositives value.
     */
    public Long totalPositives() {
        return this.totalPositives;
    }

    /**
     * Set the totalPositives property: Total positive in the distribution.
     *
     * @param totalPositives the totalPositives value to set.
     * @return the PredictionDistributionDefinition object itself.
     */
    public PredictionDistributionDefinition withTotalPositives(Long totalPositives) {
        this.totalPositives = totalPositives;
        return this;
    }

    /**
     * Get the totalNegatives property: Total negatives in the distribution.
     *
     * @return the totalNegatives value.
     */
    public Long totalNegatives() {
        return this.totalNegatives;
    }

    /**
     * Set the totalNegatives property: Total negatives in the distribution.
     *
     * @param totalNegatives the totalNegatives value to set.
     * @return the PredictionDistributionDefinition object itself.
     */
    public PredictionDistributionDefinition withTotalNegatives(Long totalNegatives) {
        this.totalNegatives = totalNegatives;
        return this;
    }

    /**
     * Get the distributions property: Distributions of the prediction.
     *
     * @return the distributions value.
     */
    public List<PredictionDistributionDefinitionDistributionsItem> distributions() {
        return this.distributions;
    }

    /**
     * Set the distributions property: Distributions of the prediction.
     *
     * @param distributions the distributions value to set.
     * @return the PredictionDistributionDefinition object itself.
     */
    public PredictionDistributionDefinition withDistributions(
        List<PredictionDistributionDefinitionDistributionsItem> distributions) {
        this.distributions = distributions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (distributions() != null) {
            distributions().forEach(e -> e.validate());
        }
    }
}
