// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.administration.models.AnomalyDetectorDirection;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HardThresholdCondition model. */
@Fluent
public final class HardThresholdCondition {
    /*
     * lower bound
     *
     * should be specified when anomalyDetectorDirection is Both or Down
     */
    @JsonProperty(value = "lowerBound")
    private Double lowerBound;

    /*
     * upper bound
     *
     * should be specified when anomalyDetectorDirection is Both or Up
     */
    @JsonProperty(value = "upperBound")
    private Double upperBound;

    /*
     * detection direction
     */
    @JsonProperty(value = "anomalyDetectorDirection", required = true)
    private AnomalyDetectorDirection anomalyDetectorDirection;

    /*
     * The suppressCondition property.
     */
    @JsonProperty(value = "suppressCondition", required = true)
    private SuppressCondition suppressCondition;

    /**
     * Get the lowerBound property: lower bound
     *
     * <p>should be specified when anomalyDetectorDirection is Both or Down.
     *
     * @return the lowerBound value.
     */
    public Double getLowerBound() {
        return this.lowerBound;
    }

    /**
     * Set the lowerBound property: lower bound
     *
     * <p>should be specified when anomalyDetectorDirection is Both or Down.
     *
     * @param lowerBound the lowerBound value to set.
     * @return the HardThresholdCondition object itself.
     */
    public HardThresholdCondition setLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    /**
     * Get the upperBound property: upper bound
     *
     * <p>should be specified when anomalyDetectorDirection is Both or Up.
     *
     * @return the upperBound value.
     */
    public Double getUpperBound() {
        return this.upperBound;
    }

    /**
     * Set the upperBound property: upper bound
     *
     * <p>should be specified when anomalyDetectorDirection is Both or Up.
     *
     * @param upperBound the upperBound value to set.
     * @return the HardThresholdCondition object itself.
     */
    public HardThresholdCondition setUpperBound(Double upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    /**
     * Get the anomalyDetectorDirection property: detection direction.
     *
     * @return the anomalyDetectorDirection value.
     */
    public AnomalyDetectorDirection getAnomalyDetectorDirection() {
        return this.anomalyDetectorDirection;
    }

    /**
     * Set the anomalyDetectorDirection property: detection direction.
     *
     * @param anomalyDetectorDirection the anomalyDetectorDirection value to set.
     * @return the HardThresholdCondition object itself.
     */
    public HardThresholdCondition setAnomalyDetectorDirection(AnomalyDetectorDirection anomalyDetectorDirection) {
        this.anomalyDetectorDirection = anomalyDetectorDirection;
        return this;
    }

    /**
     * Get the suppressCondition property: The suppressCondition property.
     *
     * @return the suppressCondition value.
     */
    public SuppressCondition getSuppressCondition() {
        return this.suppressCondition;
    }

    /**
     * Set the suppressCondition property: The suppressCondition property.
     *
     * @param suppressCondition the suppressCondition value to set.
     * @return the HardThresholdCondition object itself.
     */
    public HardThresholdCondition setSuppressCondition(SuppressCondition suppressCondition) {
        this.suppressCondition = suppressCondition;
        return this;
    }
}
