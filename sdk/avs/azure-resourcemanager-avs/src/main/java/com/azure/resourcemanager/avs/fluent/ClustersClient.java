// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import com.azure.resourcemanager.avs.models.ClusterUpdate;

/** An instance of this class provides access to all the operations defined in ClustersClient. */
public interface ClustersClient {
    /**
     * List clusters in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List clusters in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of clusters.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterInner> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get a cluster by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner get(String resourceGroupName, String privateCloudName, String clusterName);

    /**
     * Get a cluster by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ClusterInner> getWithResponse(
        String resourceGroupName, String privateCloudName, String clusterName, Context context);

    /**
     * Create or update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param cluster A cluster in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String privateCloudName, String clusterName, ClusterInner cluster);

    /**
     * Create or update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param cluster A cluster in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginCreateOrUpdate(
        String resourceGroupName, String privateCloudName, String clusterName, ClusterInner cluster, Context context);

    /**
     * Create or update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param cluster A cluster in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(
        String resourceGroupName, String privateCloudName, String clusterName, ClusterInner cluster);

    /**
     * Create or update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param cluster A cluster in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner createOrUpdate(
        String resourceGroupName, String privateCloudName, String clusterName, ClusterInner cluster, Context context);

    /**
     * Update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param clusterUpdate The cluster properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(
        String resourceGroupName, String privateCloudName, String clusterName, ClusterUpdate clusterUpdate);

    /**
     * Update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param clusterUpdate The cluster properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ClusterInner>, ClusterInner> beginUpdate(
        String resourceGroupName,
        String privateCloudName,
        String clusterName,
        ClusterUpdate clusterUpdate,
        Context context);

    /**
     * Update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param clusterUpdate The cluster properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(
        String resourceGroupName, String privateCloudName, String clusterName, ClusterUpdate clusterUpdate);

    /**
     * Update a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param clusterUpdate The cluster properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ClusterInner update(
        String resourceGroupName,
        String privateCloudName,
        String clusterName,
        ClusterUpdate clusterUpdate,
        Context context);

    /**
     * Delete a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String clusterName);

    /**
     * Delete a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String clusterName, Context context);

    /**
     * Delete a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String clusterName);

    /**
     * Delete a cluster in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param clusterName Name of the cluster in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String clusterName, Context context);
}
