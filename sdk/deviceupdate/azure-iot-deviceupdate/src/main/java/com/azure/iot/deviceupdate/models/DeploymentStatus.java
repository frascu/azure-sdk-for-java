// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment status metadata. */
@Fluent
public final class DeploymentStatus {
    /*
     * Gets or sets the state of the deployment.
     */
    @JsonProperty(value = "deploymentState", required = true)
    private DeploymentState deploymentState;

    /*
     * Gets or sets the total number of devices in the deployment.
     */
    @JsonProperty(value = "totalDevices")
    private Integer totalDevices;

    /*
     * Gets or sets the number of incompatible devices in the deployment.
     */
    @JsonProperty(value = "devicesIncompatibleCount")
    private Integer devicesIncompatibleCount;

    /*
     * Gets or sets the number of devices that are currently in deployment.
     */
    @JsonProperty(value = "devicesInProgressCount")
    private Integer devicesInProgressCount;

    /*
     * Gets or sets the number of devices that have completed deployment with a
     * failure.
     */
    @JsonProperty(value = "devicesCompletedFailedCount")
    private Integer devicesCompletedFailedCount;

    /*
     * Gets or sets the number of devices which have successfully completed
     * deployment.
     */
    @JsonProperty(value = "devicesCompletedSucceededCount")
    private Integer devicesCompletedSucceededCount;

    /*
     * Gets or sets the number of devices which have had their deployment
     * canceled.
     */
    @JsonProperty(value = "devicesCanceledCount")
    private Integer devicesCanceledCount;

    /**
     * Get the deploymentState property: Gets or sets the state of the deployment.
     *
     * @return the deploymentState value.
     */
    public DeploymentState getDeploymentState() {
        return this.deploymentState;
    }

    /**
     * Set the deploymentState property: Gets or sets the state of the deployment.
     *
     * @param deploymentState the deploymentState value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setDeploymentState(DeploymentState deploymentState) {
        this.deploymentState = deploymentState;
        return this;
    }

    /**
     * Get the totalDevices property: Gets or sets the total number of devices in the deployment.
     *
     * @return the totalDevices value.
     */
    public Integer getTotalDevices() {
        return this.totalDevices;
    }

    /**
     * Set the totalDevices property: Gets or sets the total number of devices in the deployment.
     *
     * @param totalDevices the totalDevices value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setTotalDevices(Integer totalDevices) {
        this.totalDevices = totalDevices;
        return this;
    }

    /**
     * Get the devicesIncompatibleCount property: Gets or sets the number of incompatible devices in the deployment.
     *
     * @return the devicesIncompatibleCount value.
     */
    public Integer getDevicesIncompatibleCount() {
        return this.devicesIncompatibleCount;
    }

    /**
     * Set the devicesIncompatibleCount property: Gets or sets the number of incompatible devices in the deployment.
     *
     * @param devicesIncompatibleCount the devicesIncompatibleCount value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setDevicesIncompatibleCount(Integer devicesIncompatibleCount) {
        this.devicesIncompatibleCount = devicesIncompatibleCount;
        return this;
    }

    /**
     * Get the devicesInProgressCount property: Gets or sets the number of devices that are currently in deployment.
     *
     * @return the devicesInProgressCount value.
     */
    public Integer getDevicesInProgressCount() {
        return this.devicesInProgressCount;
    }

    /**
     * Set the devicesInProgressCount property: Gets or sets the number of devices that are currently in deployment.
     *
     * @param devicesInProgressCount the devicesInProgressCount value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setDevicesInProgressCount(Integer devicesInProgressCount) {
        this.devicesInProgressCount = devicesInProgressCount;
        return this;
    }

    /**
     * Get the devicesCompletedFailedCount property: Gets or sets the number of devices that have completed deployment
     * with a failure.
     *
     * @return the devicesCompletedFailedCount value.
     */
    public Integer getDevicesCompletedFailedCount() {
        return this.devicesCompletedFailedCount;
    }

    /**
     * Set the devicesCompletedFailedCount property: Gets or sets the number of devices that have completed deployment
     * with a failure.
     *
     * @param devicesCompletedFailedCount the devicesCompletedFailedCount value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setDevicesCompletedFailedCount(Integer devicesCompletedFailedCount) {
        this.devicesCompletedFailedCount = devicesCompletedFailedCount;
        return this;
    }

    /**
     * Get the devicesCompletedSucceededCount property: Gets or sets the number of devices which have successfully
     * completed deployment.
     *
     * @return the devicesCompletedSucceededCount value.
     */
    public Integer getDevicesCompletedSucceededCount() {
        return this.devicesCompletedSucceededCount;
    }

    /**
     * Set the devicesCompletedSucceededCount property: Gets or sets the number of devices which have successfully
     * completed deployment.
     *
     * @param devicesCompletedSucceededCount the devicesCompletedSucceededCount value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setDevicesCompletedSucceededCount(Integer devicesCompletedSucceededCount) {
        this.devicesCompletedSucceededCount = devicesCompletedSucceededCount;
        return this;
    }

    /**
     * Get the devicesCanceledCount property: Gets or sets the number of devices which have had their deployment
     * canceled.
     *
     * @return the devicesCanceledCount value.
     */
    public Integer getDevicesCanceledCount() {
        return this.devicesCanceledCount;
    }

    /**
     * Set the devicesCanceledCount property: Gets or sets the number of devices which have had their deployment
     * canceled.
     *
     * @param devicesCanceledCount the devicesCanceledCount value to set.
     * @return the DeploymentStatus object itself.
     */
    public DeploymentStatus setDevicesCanceledCount(Integer devicesCanceledCount) {
        this.devicesCanceledCount = devicesCanceledCount;
        return this;
    }
}
