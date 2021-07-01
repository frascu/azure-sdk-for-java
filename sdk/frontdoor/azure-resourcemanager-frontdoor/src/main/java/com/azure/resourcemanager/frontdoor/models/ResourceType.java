// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ResourceType. */
public enum ResourceType {
    /** Enum value Microsoft.Network/frontDoors. */
    MICROSOFT_NETWORK_FRONT_DOORS("Microsoft.Network/frontDoors"),

    /** Enum value Microsoft.Network/frontDoors/frontendEndpoints. */
    MICROSOFT_NETWORK_FRONT_DOORS_FRONTEND_ENDPOINTS("Microsoft.Network/frontDoors/frontendEndpoints");

    /** The actual serialized value for a ResourceType instance. */
    private final String value;

    ResourceType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceType fromString(String value) {
        ResourceType[] items = ResourceType.values();
        for (ResourceType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
