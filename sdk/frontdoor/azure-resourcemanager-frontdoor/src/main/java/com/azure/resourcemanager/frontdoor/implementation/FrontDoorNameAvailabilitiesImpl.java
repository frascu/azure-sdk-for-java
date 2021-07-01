// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.fluent.FrontDoorNameAvailabilitiesClient;
import com.azure.resourcemanager.frontdoor.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.frontdoor.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.frontdoor.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.frontdoor.models.FrontDoorNameAvailabilities;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FrontDoorNameAvailabilitiesImpl implements FrontDoorNameAvailabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FrontDoorNameAvailabilitiesImpl.class);

    private final FrontDoorNameAvailabilitiesClient innerClient;

    private final com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager;

    public FrontDoorNameAvailabilitiesImpl(
        FrontDoorNameAvailabilitiesClient innerClient,
        com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityOutput check(CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput) {
        CheckNameAvailabilityOutputInner inner = this.serviceClient().check(checkFrontDoorNameAvailabilityInput);
        if (inner != null) {
            return new CheckNameAvailabilityOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityOutput> checkWithResponse(
        CheckNameAvailabilityInput checkFrontDoorNameAvailabilityInput, Context context) {
        Response<CheckNameAvailabilityOutputInner> inner =
            this.serviceClient().checkWithResponse(checkFrontDoorNameAvailabilityInput, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private FrontDoorNameAvailabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
