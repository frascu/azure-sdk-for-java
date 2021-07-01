// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The HookInfoPatch model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "hookType",
        defaultImpl = HookInfoPatch.class)
@JsonTypeName("HookInfoPatch")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Email", value = EmailHookInfoPatch.class),
    @JsonSubTypes.Type(name = "Webhook", value = WebhookHookInfoPatch.class)
})
@Fluent
public class HookInfoPatch {
    /*
     * hook unique name
     */
    @JsonProperty(value = "hookName")
    private String hookName;

    /*
     * hook description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * hook external link
     */
    @JsonProperty(value = "externalLink")
    private String externalLink;

    /*
     * hook administrators
     */
    @JsonProperty(value = "admins")
    private List<String> admins;

    /**
     * Get the hookName property: hook unique name.
     *
     * @return the hookName value.
     */
    public String getHookName() {
        return this.hookName;
    }

    /**
     * Set the hookName property: hook unique name.
     *
     * @param hookName the hookName value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    /**
     * Get the description property: hook description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: hook description.
     *
     * @param description the description value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the externalLink property: hook external link.
     *
     * @return the externalLink value.
     */
    public String getExternalLink() {
        return this.externalLink;
    }

    /**
     * Set the externalLink property: hook external link.
     *
     * @param externalLink the externalLink value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setExternalLink(String externalLink) {
        this.externalLink = externalLink;
        return this;
    }

    /**
     * Get the admins property: hook administrators.
     *
     * @return the admins value.
     */
    public List<String> getAdmins() {
        return this.admins;
    }

    /**
     * Set the admins property: hook administrators.
     *
     * @param admins the admins value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setAdmins(List<String> admins) {
        this.admins = admins;
        return this;
    }
}
