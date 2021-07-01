// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthProbeEnabled. */
public final class HealthProbeEnabled extends ExpandableStringEnum<HealthProbeEnabled> {
    /** Static value Enabled for HealthProbeEnabled. */
    public static final HealthProbeEnabled ENABLED = fromString("Enabled");

    /** Static value Disabled for HealthProbeEnabled. */
    public static final HealthProbeEnabled DISABLED = fromString("Disabled");

    /**
     * Creates or finds a HealthProbeEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthProbeEnabled.
     */
    @JsonCreator
    public static HealthProbeEnabled fromString(String name) {
        return fromString(name, HealthProbeEnabled.class);
    }

    /** @return known HealthProbeEnabled values. */
    public static Collection<HealthProbeEnabled> values() {
        return values(HealthProbeEnabled.class);
    }
}
