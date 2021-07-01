// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WebServiceState. */
public final class WebServiceState extends ExpandableStringEnum<WebServiceState> {
    /** Static value Transitioning for WebServiceState. */
    public static final WebServiceState TRANSITIONING = fromString("Transitioning");

    /** Static value Healthy for WebServiceState. */
    public static final WebServiceState HEALTHY = fromString("Healthy");

    /** Static value Unhealthy for WebServiceState. */
    public static final WebServiceState UNHEALTHY = fromString("Unhealthy");

    /** Static value Failed for WebServiceState. */
    public static final WebServiceState FAILED = fromString("Failed");

    /** Static value Unschedulable for WebServiceState. */
    public static final WebServiceState UNSCHEDULABLE = fromString("Unschedulable");

    /**
     * Creates or finds a WebServiceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebServiceState.
     */
    @JsonCreator
    public static WebServiceState fromString(String name) {
        return fromString(name, WebServiceState.class);
    }

    /** @return known WebServiceState values. */
    public static Collection<WebServiceState> values() {
        return values(WebServiceState.class);
    }
}
