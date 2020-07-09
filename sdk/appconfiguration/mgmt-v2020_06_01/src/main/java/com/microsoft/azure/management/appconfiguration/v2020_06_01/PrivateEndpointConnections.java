/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.implementation.PrivateEndpointConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateEndpointConnections.
 */
public interface PrivateEndpointConnections extends SupportsCreating<PrivateEndpointConnection.DefinitionStages.Blank>, HasInner<PrivateEndpointConnectionsInner> {
    /**
     * Gets the specified private endpoint connection associated with the configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param privateEndpointConnectionName Private endpoint connection name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> getAsync(String resourceGroupName, String configStoreName, String privateEndpointConnectionName);

    /**
     * Lists all private endpoint connections for a configuration store.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PrivateEndpointConnection> listByConfigurationStoreAsync(final String resourceGroupName, final String configStoreName);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param configStoreName The name of the configuration store.
     * @param privateEndpointConnectionName Private endpoint connection name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String configStoreName, String privateEndpointConnectionName);

}