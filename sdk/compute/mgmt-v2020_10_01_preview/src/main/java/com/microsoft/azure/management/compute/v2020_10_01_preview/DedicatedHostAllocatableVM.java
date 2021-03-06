/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the dedicated host unutilized capacity in terms of a specific VM
 * size.
 */
public class DedicatedHostAllocatableVM {
    /**
     * VM size in terms of which the unutilized capacity is represented.
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /**
     * Maximum number of VMs of size vmSize that can fit in the dedicated
     * host's remaining capacity.
     */
    @JsonProperty(value = "count")
    private Double count;

    /**
     * Get vM size in terms of which the unutilized capacity is represented.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set vM size in terms of which the unutilized capacity is represented.
     *
     * @param vmSize the vmSize value to set
     * @return the DedicatedHostAllocatableVM object itself.
     */
    public DedicatedHostAllocatableVM withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get maximum number of VMs of size vmSize that can fit in the dedicated host's remaining capacity.
     *
     * @return the count value
     */
    public Double count() {
        return this.count;
    }

    /**
     * Set maximum number of VMs of size vmSize that can fit in the dedicated host's remaining capacity.
     *
     * @param count the count value to set
     * @return the DedicatedHostAllocatableVM object itself.
     */
    public DedicatedHostAllocatableVM withCount(Double count) {
        this.count = count;
        return this;
    }

}
