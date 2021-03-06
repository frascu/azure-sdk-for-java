/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DataFactoryManager;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.CreateDataFlowDebugSessionResponseInner;

/**
 * Type representing CreateDataFlowDebugSessionResponse.
 */
public interface CreateDataFlowDebugSessionResponse extends HasInner<CreateDataFlowDebugSessionResponseInner>, HasManager<DataFactoryManager> {
    /**
     * @return the sessionId value.
     */
    String sessionId();

    /**
     * @return the status value.
     */
    String status();

}
