// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.imagebuilder.fluent.models.ImageTemplateInner;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplate;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateCustomizer;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateDistributor;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateIdentity;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateLastRunStatus;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateSource;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateUpdateParameters;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateVmProfile;
import com.azure.resourcemanager.imagebuilder.models.ProvisioningError;
import com.azure.resourcemanager.imagebuilder.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ImageTemplateImpl implements ImageTemplate, ImageTemplate.Definition, ImageTemplate.Update {
    private ImageTemplateInner innerObject;

    private final com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ImageTemplateIdentity identity() {
        return this.innerModel().identity();
    }

    public ImageTemplateSource source() {
        return this.innerModel().source();
    }

    public List<ImageTemplateCustomizer> customize() {
        List<ImageTemplateCustomizer> inner = this.innerModel().customize();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ImageTemplateDistributor> distribute() {
        List<ImageTemplateDistributor> inner = this.innerModel().distribute();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ProvisioningError provisioningError() {
        return this.innerModel().provisioningError();
    }

    public ImageTemplateLastRunStatus lastRunStatus() {
        return this.innerModel().lastRunStatus();
    }

    public Integer buildTimeoutInMinutes() {
        return this.innerModel().buildTimeoutInMinutes();
    }

    public ImageTemplateVmProfile vmProfile() {
        return this.innerModel().vmProfile();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ImageTemplateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String imageTemplateName;

    private ImageTemplateUpdateParameters updateParameters;

    public ImageTemplateImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ImageTemplate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineImageTemplates()
                .createOrUpdate(resourceGroupName, imageTemplateName, this.innerModel(), Context.NONE);
        return this;
    }

    public ImageTemplate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineImageTemplates()
                .createOrUpdate(resourceGroupName, imageTemplateName, this.innerModel(), context);
        return this;
    }

    ImageTemplateImpl(String name, com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager) {
        this.innerObject = new ImageTemplateInner();
        this.serviceManager = serviceManager;
        this.imageTemplateName = name;
    }

    public ImageTemplateImpl update() {
        this.updateParameters = new ImageTemplateUpdateParameters();
        return this;
    }

    public ImageTemplate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineImageTemplates()
                .update(resourceGroupName, imageTemplateName, updateParameters, Context.NONE);
        return this;
    }

    public ImageTemplate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineImageTemplates()
                .update(resourceGroupName, imageTemplateName, updateParameters, context);
        return this;
    }

    ImageTemplateImpl(
        ImageTemplateInner innerObject, com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.imageTemplateName = Utils.getValueFromIdByName(innerObject.id(), "imageTemplates");
    }

    public ImageTemplate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineImageTemplates()
                .getByResourceGroupWithResponse(resourceGroupName, imageTemplateName, Context.NONE)
                .getValue();
        return this;
    }

    public ImageTemplate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineImageTemplates()
                .getByResourceGroupWithResponse(resourceGroupName, imageTemplateName, context)
                .getValue();
        return this;
    }

    public void run() {
        serviceManager.virtualMachineImageTemplates().run(resourceGroupName, imageTemplateName);
    }

    public void run(Context context) {
        serviceManager.virtualMachineImageTemplates().run(resourceGroupName, imageTemplateName, context);
    }

    public void cancel() {
        serviceManager.virtualMachineImageTemplates().cancel(resourceGroupName, imageTemplateName);
    }

    public void cancel(Context context) {
        serviceManager.virtualMachineImageTemplates().cancel(resourceGroupName, imageTemplateName, context);
    }

    public ImageTemplateImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ImageTemplateImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ImageTemplateImpl withIdentity(ImageTemplateIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public ImageTemplateImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ImageTemplateImpl withSource(ImageTemplateSource source) {
        this.innerModel().withSource(source);
        return this;
    }

    public ImageTemplateImpl withCustomize(List<ImageTemplateCustomizer> customize) {
        this.innerModel().withCustomize(customize);
        return this;
    }

    public ImageTemplateImpl withDistribute(List<ImageTemplateDistributor> distribute) {
        this.innerModel().withDistribute(distribute);
        return this;
    }

    public ImageTemplateImpl withBuildTimeoutInMinutes(Integer buildTimeoutInMinutes) {
        this.innerModel().withBuildTimeoutInMinutes(buildTimeoutInMinutes);
        return this;
    }

    public ImageTemplateImpl withVmProfile(ImageTemplateVmProfile vmProfile) {
        this.innerModel().withVmProfile(vmProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
