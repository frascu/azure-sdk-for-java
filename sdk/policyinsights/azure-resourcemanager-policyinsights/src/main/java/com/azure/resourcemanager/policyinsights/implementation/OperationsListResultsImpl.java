// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.resourcemanager.policyinsights.fluent.models.OperationsListResultsInner;
import com.azure.resourcemanager.policyinsights.models.Operation;
import com.azure.resourcemanager.policyinsights.models.OperationsListResults;
import java.util.Collections;
import java.util.List;

public final class OperationsListResultsImpl implements OperationsListResults {
    private OperationsListResultsInner innerObject;

    private final com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager;

    OperationsListResultsImpl(
        OperationsListResultsInner innerObject,
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer odataCount() {
        return this.innerModel().odataCount();
    }

    public List<Operation> value() {
        List<Operation> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OperationsListResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager() {
        return this.serviceManager;
    }
}
