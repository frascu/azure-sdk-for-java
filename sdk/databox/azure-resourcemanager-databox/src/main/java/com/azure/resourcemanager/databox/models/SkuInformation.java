// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.resourcemanager.databox.fluent.models.SkuInformationInner;
import java.util.List;

/** An immutable client-side representation of SkuInformation. */
public interface SkuInformation {
    /**
     * Gets the sku property: The Sku.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the enabled property: The sku is enabled or not.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the dataLocationToServiceLocationMap property: The map of data location to service location.
     *
     * @return the dataLocationToServiceLocationMap value.
     */
    List<DataLocationToServiceLocationMap> dataLocationToServiceLocationMap();

    /**
     * Gets the capacity property: Capacity of the Sku.
     *
     * @return the capacity value.
     */
    SkuCapacity capacity();

    /**
     * Gets the costs property: Cost of the Sku.
     *
     * @return the costs value.
     */
    List<SkuCost> costs();

    /**
     * Gets the apiVersions property: Api versions that support this Sku.
     *
     * @return the apiVersions value.
     */
    List<String> apiVersions();

    /**
     * Gets the disabledReason property: Reason why the Sku is disabled.
     *
     * @return the disabledReason value.
     */
    SkuDisabledReason disabledReason();

    /**
     * Gets the disabledReasonMessage property: Message for why the Sku is disabled.
     *
     * @return the disabledReasonMessage value.
     */
    String disabledReasonMessage();

    /**
     * Gets the requiredFeature property: Required feature to access the sku.
     *
     * @return the requiredFeature value.
     */
    String requiredFeature();

    /**
     * Gets the inner com.azure.resourcemanager.databox.fluent.models.SkuInformationInner object.
     *
     * @return the inner object.
     */
    SkuInformationInner innerModel();
}
