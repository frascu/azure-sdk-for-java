// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.resourcemanager.mediaservices.fluent.models.AssetContainerSasInner;
import com.azure.resourcemanager.mediaservices.models.AssetContainerSas;
import java.util.Collections;
import java.util.List;

public final class AssetContainerSasImpl implements AssetContainerSas {
    private AssetContainerSasInner innerObject;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    AssetContainerSasImpl(
        AssetContainerSasInner innerObject,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> assetContainerSasUrls() {
        List<String> inner = this.innerModel().assetContainerSasUrls();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AssetContainerSasInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
