package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineExtension;
import com.microsoft.azure.management.compute.VirtualMachineExtensionImage;
import com.microsoft.azure.management.compute.VirtualMachineExtensionInstanceView;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implementation of {@link VirtualMachineExtension}.
 */
class VirtualMachineExtensionImpl
        extends ExternalChildResourceImpl<VirtualMachineExtension,
        VirtualMachineExtensionInner,
        VirtualMachineExtensionImpl,
        VirtualMachineImpl>
        implements VirtualMachineExtension,
        VirtualMachineExtension.Definition<VirtualMachine.DefinitionStages.WithCreate>,
        VirtualMachineExtension.UpdateDefinition<VirtualMachine.Update>,
        VirtualMachineExtension.Update {
    private final VirtualMachineExtensionsInner client;
    private HashMap<String, Object> publicSettings;
    private HashMap<String, Object> protectedSettings;

    VirtualMachineExtensionImpl(String name,
                                VirtualMachineImpl parent,
                                VirtualMachineExtensionInner inner,
                                VirtualMachineExtensionsInner client) {
        super(name, parent, inner);
        this.client = client;

        if (this.inner().settings() == null) {
            this.publicSettings = new LinkedHashMap<>();
            this.inner().withSettings(this.publicSettings);
        } else {
            this.publicSettings = (LinkedHashMap<String, Object>) this.inner().settings();
        }

        if (this.inner().protectedSettings() == null) {
            this.protectedSettings = new LinkedHashMap<>();
            this.inner().withProtectedSettings(this.protectedSettings);
        }
    }

    protected static VirtualMachineExtensionImpl newVirtualMachineExtension(String name,
                                                                            VirtualMachineImpl parent,
                                                                            VirtualMachineExtensionsInner client) {
        VirtualMachineExtensionImpl extension = new VirtualMachineExtensionImpl(name,
                parent,
                new VirtualMachineExtensionInner(),
                client);
        return extension;
    }

    @Override
    public String publisherName() {
        return this.inner().publisher();
    }

    @Override
    public String typeName() {
        return this.inner().type();
    }

    @Override
    public String versionName() {
        return this.inner().typeHandlerVersion();
    }

    @Override
    public boolean autoUpgradeMinorVersionEnabled() {
        return this.inner().autoUpgradeMinorVersion();
    }

    @Override
    public Map<String, Object> publicSettings() {
        return Collections.unmodifiableMap(this.publicSettings);
    }

    @Override
    public String publicSettingsAsJsonString() {
        return null;
    }

    @Override
    public VirtualMachineExtensionInstanceView instanceView() {
        return this.inner().instanceView();
    }

    @Override
    public VirtualMachineExtension refresh() throws Exception {
        ServiceResponse<VirtualMachineExtensionInner> response =
                this.client.get(this.parent.resourceGroupName(), this.parent.name(), this.name());
        this.setInner(response.getBody());
        return this;
    }

    @Override
    public Observable<VirtualMachineExtension> createResourceAsync() {
        return this.client.createOrUpdateAsync(this.parent.resourceGroupName(),
                this.parent.name(),
                this.name(),
                this.inner())
                .map(innerToFluentMap(this));
    }

    @Override
    public VirtualMachineExtension createResource() throws Exception {
        return createResourceAsync().toBlocking().first();
    }

    @Override
    public VirtualMachineExtensionImpl withAutoUpgradeMinorVersionEnabled() {
        this.inner().withAutoUpgradeMinorVersion(true);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withAutoUpgradeMinorVersionDisabled() {
        this.inner().withAutoUpgradeMinorVersion(false);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withImage(VirtualMachineExtensionImage image) {
        this.inner().withPublisher(image.publisherName())
                .withVirtualMachineExtensionType(image.typeName())
                .withTypeHandlerVersion(image.versionName());
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withPublisher(String extensionImagePublisherName) {
        this.inner().withPublisher(extensionImagePublisherName);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withPublicSetting(String key, Object value) {
        this.publicSettings.put(key, value);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withProtectedSetting(String key, Object value) {
        this.protectedSettings.put(key, value);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withPublicSettings(HashMap<String, Object> settings) {
        this.publicSettings.clear();
        this.publicSettings.putAll(settings);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withProtectedSettings(HashMap<String, Object> settings) {
        this.protectedSettings.clear();
        this.protectedSettings.putAll(settings);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withType(String extensionImageTypeName) {
        this.inner().withVirtualMachineExtensionType(extensionImageTypeName);
        return this;
    }

    @Override
    public VirtualMachineExtensionImpl withVersion(String extensionImageVersionName) {
        this.inner().withTypeHandlerVersion(extensionImageVersionName);
        return this;
    }

    @Override
    public VirtualMachineImpl parent() {
        this.nullifySettingsIfEmpty();
        return this.parent;
    }

    @Override
    public VirtualMachineImpl attach() {
        this.nullifySettingsIfEmpty();
        return this.parent.withExtension(this);
    }

    private void nullifySettingsIfEmpty() {
        if (this.publicSettings.size() == 0) {
            this.inner().withSettings(null);
        }
        if (this.protectedSettings.size() == 0) {
            this.inner().withProtectedSettings(null);
        }
    }
}