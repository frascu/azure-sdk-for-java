/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A class that describes a test that failed during NSG and UDR validation.
 */
@JsonFlatten
public class VnetValidationTestFailure extends ProxyOnlyResource {
    /**
     * The name of the test that failed.
     */
    @JsonProperty(value = "properties.testName")
    private String testName;

    /**
     * The details of what caused the failure, e.g. the blocking rule name,
     * etc.
     */
    @JsonProperty(value = "properties.details")
    private String details;

    /**
     * Get the name of the test that failed.
     *
     * @return the testName value
     */
    public String testName() {
        return this.testName;
    }

    /**
     * Set the name of the test that failed.
     *
     * @param testName the testName value to set
     * @return the VnetValidationTestFailure object itself.
     */
    public VnetValidationTestFailure withTestName(String testName) {
        this.testName = testName;
        return this;
    }

    /**
     * Get the details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details of what caused the failure, e.g. the blocking rule name, etc.
     *
     * @param details the details value to set
     * @return the VnetValidationTestFailure object itself.
     */
    public VnetValidationTestFailure withDetails(String details) {
        this.details = details;
        return this;
    }

}
