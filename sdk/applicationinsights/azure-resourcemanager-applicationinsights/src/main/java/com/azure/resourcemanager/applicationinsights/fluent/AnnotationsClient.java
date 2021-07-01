// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.AnnotationInner;
import java.util.List;

/** An instance of this class provides access to all the operations defined in AnnotationsClient. */
public interface AnnotationsClient {
    /**
     * Gets the list of annotations for a component for given time range.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.AnnotationErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AnnotationInner> list(String resourceGroupName, String resourceName, String start, String end);

    /**
     * Gets the list of annotations for a component for given time range.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param start The start time to query from for annotations, cannot be older than 90 days from current date.
     * @param end The end time to query for annotations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.AnnotationErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of annotations for a component for given time range.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AnnotationInner> list(
        String resourceGroupName, String resourceName, String start, String end, Context context);

    /**
     * Create an Annotation of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application
     *     Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.AnnotationErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<AnnotationInner> create(String resourceGroupName, String resourceName, AnnotationInner annotationProperties);

    /**
     * Create an Annotation of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationProperties Properties that need to be specified to create an annotation of a Application
     *     Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.AnnotationErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<AnnotationInner>> createWithResponse(
        String resourceGroupName, String resourceName, AnnotationInner annotationProperties, Context context);

    /**
     * Delete an Annotation of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String annotationId);

    /**
     * Delete an Annotation of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String annotationId, Context context);

    /**
     * Get the annotation for given id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.AnnotationErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<AnnotationInner> get(String resourceGroupName, String resourceName, String annotationId);

    /**
     * Get the annotation for given id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param annotationId The unique annotation ID. This is unique within a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.AnnotationErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the annotation for given id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<AnnotationInner>> getWithResponse(
        String resourceGroupName, String resourceName, String annotationId, Context context);
}
