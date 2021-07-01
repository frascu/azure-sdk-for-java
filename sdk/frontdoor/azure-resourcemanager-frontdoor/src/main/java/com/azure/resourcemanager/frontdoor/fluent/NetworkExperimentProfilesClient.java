// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.frontdoor.fluent.models.ProfileInner;
import com.azure.resourcemanager.frontdoor.models.ProfileUpdateModel;

/** An instance of this class provides access to all the operations defined in NetworkExperimentProfilesClient. */
public interface NetworkExperimentProfilesClient {
    /**
     * Gets a list of Network Experiment Profiles under a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles under a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> list();

    /**
     * Gets a list of Network Experiment Profiles under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles under a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> list(Context context);

    /**
     * Gets a list of Network Experiment Profiles within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles within a resource group under a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Network Experiment Profiles within a resource group under a subscription.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Network Experiment Profiles within a resource group under a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProfileInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an NetworkExperiment Profile by ProfileName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner getByResourceGroup(String resourceGroupName, String profileName);

    /**
     * Gets an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an NetworkExperiment Profile by ProfileName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProfileInner> getByResourceGroupWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Creates an NetworkExperiment Profile.
     *
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param parameters An Network Experiment Profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProfileInner>, ProfileInner> beginCreateOrUpdate(
        String profileName, String resourceGroupName, ProfileInner parameters);

    /**
     * Creates an NetworkExperiment Profile.
     *
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param parameters An Network Experiment Profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProfileInner>, ProfileInner> beginCreateOrUpdate(
        String profileName, String resourceGroupName, ProfileInner parameters, Context context);

    /**
     * Creates an NetworkExperiment Profile.
     *
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param parameters An Network Experiment Profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner createOrUpdate(String profileName, String resourceGroupName, ProfileInner parameters);

    /**
     * Creates an NetworkExperiment Profile.
     *
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param parameters An Network Experiment Profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner createOrUpdate(String profileName, String resourceGroupName, ProfileInner parameters, Context context);

    /**
     * Updates an NetworkExperimentProfiles.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param parameters The Profile Update Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProfileInner>, ProfileInner> beginUpdate(
        String resourceGroupName, String profileName, ProfileUpdateModel parameters);

    /**
     * Updates an NetworkExperimentProfiles.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param parameters The Profile Update Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProfileInner>, ProfileInner> beginUpdate(
        String resourceGroupName, String profileName, ProfileUpdateModel parameters, Context context);

    /**
     * Updates an NetworkExperimentProfiles.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param parameters The Profile Update Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner update(String resourceGroupName, String profileName, ProfileUpdateModel parameters);

    /**
     * Updates an NetworkExperimentProfiles.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param parameters The Profile Update Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines an Network Experiment Profile and lists of Experiments.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProfileInner update(String resourceGroupName, String profileName, ProfileUpdateModel parameters, Context context);

    /**
     * Deletes an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String profileName);

    /**
     * Deletes an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String profileName, Context context);

    /**
     * Deletes an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName);

    /**
     * Deletes an NetworkExperiment Profile by ProfileName.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName The Profile identifier associated with the Tenant and Partner.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, Context context);
}
