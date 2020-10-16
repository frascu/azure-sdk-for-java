/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * disk encryption set update resource.
 */
@JsonFlatten
public class DiskEncryptionSetUpdate {
    /**
     * The activeKey property.
     */
    @JsonProperty(value = "properties.activeKey")
    private KeyVaultAndKeyReference activeKey;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the activeKey value.
     *
     * @return the activeKey value
     */
    public KeyVaultAndKeyReference activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey value.
     *
     * @param activeKey the activeKey value to set
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withActiveKey(KeyVaultAndKeyReference activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the DiskEncryptionSetUpdate object itself.
     */
    public DiskEncryptionSetUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
