// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.resourcemanager.iothub.fluent.models.GroupIdInformationInner;

/** An immutable client-side representation of GroupIdInformation. */
public interface GroupIdInformation {
    /**
     * Gets the id property: The resource identifier.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The properties for a group information object.
     *
     * @return the properties value.
     */
    GroupIdInformationProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.fluent.models.GroupIdInformationInner object.
     *
     * @return the inner object.
     */
    GroupIdInformationInner innerModel();
}
