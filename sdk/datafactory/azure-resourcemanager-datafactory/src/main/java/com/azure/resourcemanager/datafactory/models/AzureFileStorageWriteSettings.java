// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure File Storage write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileStorageWriteSettings")
@Immutable
public final class AzureFileStorageWriteSettings extends StoreWriteSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFileStorageWriteSettings.class);

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileStorageWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
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
