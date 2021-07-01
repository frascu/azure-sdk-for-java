// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Extension Properties. */
@Fluent
public final class CloudServiceExtensionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudServiceExtensionProperties.class);

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Specifies the type of the extension.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Specifies the version of the extension. Specifies the version of the
     * extension. If this element is not specified or an asterisk (*) is used
     * as the value, the latest version of the extension is used. If the value
     * is specified with a major version number and an asterisk as the minor
     * version number (X.), the latest minor version of the specified major
     * version is selected. If a major version number and a minor version
     * number are specified (X.Y), the specific extension version is selected.
     * If a version is specified, an auto-upgrade is performed on the role
     * instance.
     */
    @JsonProperty(value = "typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Explicitly specify whether platform can automatically upgrade
     * typeHandlerVersion to higher minor versions when they become available.
     */
    @JsonProperty(value = "autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Public settings for the extension. For JSON extensions, this is the JSON
     * settings for the extension. For XML Extension (like RDP), this is the
     * XML setting for the extension.
     */
    @JsonProperty(value = "settings")
    private String settings;

    /*
     * Protected settings for the extension which are encrypted before sent to
     * the role instance.
     */
    @JsonProperty(value = "protectedSettings")
    private String protectedSettings;

    /*
     * The protectedSettingsFromKeyVault property.
     */
    @JsonProperty(value = "protectedSettingsFromKeyVault")
    private CloudServiceVaultAndSecretReference protectedSettingsFromKeyVault;

    /*
     * Tag to force apply the provided public and protected settings.
     * Changing the tag value allows for re-running the extension without
     * changing any of the public or protected settings.
     * If forceUpdateTag is not changed, updates to public or protected
     * settings would still be applied by the handler.
     * If neither forceUpdateTag nor any of public or protected settings
     * change, extension would flow to the role instance with the same
     * sequence-number, and
     * it is up to handler implementation whether to re-run it or not
     */
    @JsonProperty(value = "forceUpdateTag")
    private String forceUpdateTag;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Optional list of roles to apply this extension. If property is not
     * specified or '*' is specified, extension is applied to all roles in the
     * cloud service.
     */
    @JsonProperty(value = "rolesAppliedTo")
    private List<String> rolesAppliedTo;

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension.
     *
     * @param type the type value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the extension. Specifies the version of the
     * extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the
     * extension is used. If the value is specified with a major version number and an asterisk as the minor version
     * number (X.), the latest minor version of the specified major version is selected. If a major version number and a
     * minor version number are specified (X.Y), the specific extension version is selected. If a version is specified,
     * an auto-upgrade is performed on the role instance.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the extension. Specifies the version of the
     * extension. If this element is not specified or an asterisk (*) is used as the value, the latest version of the
     * extension is used. If the value is specified with a major version number and an asterisk as the minor version
     * number (X.), the latest minor version of the specified major version is selected. If a major version number and a
     * minor version number are specified (X.Y), the specific extension version is selected. If a version is specified,
     * an auto-upgrade is performed on the role instance.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Explicitly specify whether platform can automatically upgrade
     * typeHandlerVersion to higher minor versions when they become available.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Explicitly specify whether platform can automatically upgrade
     * typeHandlerVersion to higher minor versions when they become available.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Public settings for the extension. For JSON extensions, this is the JSON settings for
     * the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     *
     * @return the settings value.
     */
    public String settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Public settings for the extension. For JSON extensions, this is the JSON settings for
     * the extension. For XML Extension (like RDP), this is the XML setting for the extension.
     *
     * @param settings the settings value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withSettings(String settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: Protected settings for the extension which are encrypted before sent to the
     * role instance.
     *
     * @return the protectedSettings value.
     */
    public String protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: Protected settings for the extension which are encrypted before sent to the
     * role instance.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withProtectedSettings(String protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the protectedSettingsFromKeyVault property: The protectedSettingsFromKeyVault property.
     *
     * @return the protectedSettingsFromKeyVault value.
     */
    public CloudServiceVaultAndSecretReference protectedSettingsFromKeyVault() {
        return this.protectedSettingsFromKeyVault;
    }

    /**
     * Set the protectedSettingsFromKeyVault property: The protectedSettingsFromKeyVault property.
     *
     * @param protectedSettingsFromKeyVault the protectedSettingsFromKeyVault value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withProtectedSettingsFromKeyVault(
        CloudServiceVaultAndSecretReference protectedSettingsFromKeyVault) {
        this.protectedSettingsFromKeyVault = protectedSettingsFromKeyVault;
        return this;
    }

    /**
     * Get the forceUpdateTag property: Tag to force apply the provided public and protected settings. Changing the tag
     * value allows for re-running the extension without changing any of the public or protected settings. If
     * forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler. If
     * neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance
     * with the same sequence-number, and it is up to handler implementation whether to re-run it or not.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: Tag to force apply the provided public and protected settings. Changing the tag
     * value allows for re-running the extension without changing any of the public or protected settings. If
     * forceUpdateTag is not changed, updates to public or protected settings would still be applied by the handler. If
     * neither forceUpdateTag nor any of public or protected settings change, extension would flow to the role instance
     * with the same sequence-number, and it is up to handler implementation whether to re-run it or not.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the rolesAppliedTo property: Optional list of roles to apply this extension. If property is not specified or
     * '*' is specified, extension is applied to all roles in the cloud service.
     *
     * @return the rolesAppliedTo value.
     */
    public List<String> rolesAppliedTo() {
        return this.rolesAppliedTo;
    }

    /**
     * Set the rolesAppliedTo property: Optional list of roles to apply this extension. If property is not specified or
     * '*' is specified, extension is applied to all roles in the cloud service.
     *
     * @param rolesAppliedTo the rolesAppliedTo value to set.
     * @return the CloudServiceExtensionProperties object itself.
     */
    public CloudServiceExtensionProperties withRolesAppliedTo(List<String> rolesAppliedTo) {
        this.rolesAppliedTo = rolesAppliedTo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protectedSettingsFromKeyVault() != null) {
            protectedSettingsFromKeyVault().validate();
        }
    }
}
