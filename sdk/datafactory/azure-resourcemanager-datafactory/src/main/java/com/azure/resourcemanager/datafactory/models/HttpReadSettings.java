// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Sftp read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpReadSettings")
@Fluent
public final class HttpReadSettings extends StoreReadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpReadSettings.class);

    /*
     * The HTTP method used to call the RESTful API. The default is GET. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /*
     * The HTTP request body to the RESTful API if requestMethod is POST. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestBody")
    private Object requestBody;

    /*
     * The additional HTTP headers in the request to the RESTful API. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "additionalHeaders")
    private Object additionalHeaders;

    /*
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP
     * server.
     */
    @JsonProperty(value = "requestTimeout")
    private Object requestTimeout;

    /*
     * Indicates whether to enable partition discovery.
     */
    @JsonProperty(value = "enablePartitionDiscovery")
    private Boolean enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionRootPath")
    private Object partitionRootPath;

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @return the requestBody value.
     */
    public Object requestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @param requestBody the requestBody value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @return the additionalHeaders value.
     */
    public Object additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings withAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the requestTimeout property: Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     *
     * @return the requestTimeout value.
     */
    public Object requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout property: Specifies the timeout for a HTTP client to get HTTP response from HTTP server.
     *
     * @param requestTimeout the requestTimeout value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings withRequestTimeout(Object requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @return the enablePartitionDiscovery value.
     */
    public Boolean enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery.
     *
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings withEnablePartitionDiscovery(Boolean enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     *
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the HttpReadSettings object itself.
     */
    public HttpReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
