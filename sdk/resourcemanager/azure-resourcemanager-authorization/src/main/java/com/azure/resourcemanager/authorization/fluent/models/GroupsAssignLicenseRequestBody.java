// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** The GroupsAssignLicenseRequestBody model. */
@Fluent
public final class GroupsAssignLicenseRequestBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupsAssignLicenseRequestBody.class);

    /*
     * The addLicenses property.
     */
    @JsonProperty(value = "addLicenses")
    private List<MicrosoftGraphAssignedLicense> addLicenses;

    /*
     * The removeLicenses property.
     */
    @JsonProperty(value = "removeLicenses")
    private List<UUID> removeLicenses;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the addLicenses property: The addLicenses property.
     *
     * @return the addLicenses value.
     */
    public List<MicrosoftGraphAssignedLicense> addLicenses() {
        return this.addLicenses;
    }

    /**
     * Set the addLicenses property: The addLicenses property.
     *
     * @param addLicenses the addLicenses value to set.
     * @return the GroupsAssignLicenseRequestBody object itself.
     */
    public GroupsAssignLicenseRequestBody withAddLicenses(List<MicrosoftGraphAssignedLicense> addLicenses) {
        this.addLicenses = addLicenses;
        return this;
    }

    /**
     * Get the removeLicenses property: The removeLicenses property.
     *
     * @return the removeLicenses value.
     */
    public List<UUID> removeLicenses() {
        return this.removeLicenses;
    }

    /**
     * Set the removeLicenses property: The removeLicenses property.
     *
     * @param removeLicenses the removeLicenses value to set.
     * @return the GroupsAssignLicenseRequestBody object itself.
     */
    public GroupsAssignLicenseRequestBody withRemoveLicenses(List<UUID> removeLicenses) {
        this.removeLicenses = removeLicenses;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GroupsAssignLicenseRequestBody object itself.
     */
    public GroupsAssignLicenseRequestBody withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (addLicenses() != null) {
            addLicenses().forEach(e -> e.validate());
        }
    }
}
