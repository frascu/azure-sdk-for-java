/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest.core;

import com.microsoft.rest.core.pipeline.HttpRequestInterceptorBackAdapter;
import com.microsoft.rest.core.pipeline.HttpRequestInterceptorFrontAdapter;
import com.microsoft.rest.core.pipeline.HttpResponseInterceptorBackAdapter;
import com.microsoft.rest.core.pipeline.HttpResponseInterceptorFrontAdapter;
import com.microsoft.rest.core.pipeline.ServiceRequestFilter;
import com.microsoft.rest.core.pipeline.ServiceResponseFilter;
import org.apache.http.HttpHost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class ServiceClient<TClient> implements
        FilterableService<TClient>, Closeable {
    private final ExecutorService executorService;
    private CloseableHttpClient httpClient;
    private HttpRequestInterceptorFrontAdapter httpRequestInterceptorFrontAdapter;
    private HttpRequestInterceptorBackAdapter httpRequestInterceptorBackAdapter;
    private HttpResponseInterceptorFrontAdapter httpResponseInterceptorFrontAdapter;
    private HttpResponseInterceptorBackAdapter httpResponseInterceptorBackAdapter;
    private final HttpClientBuilder httpClientBuilder;

    public ServiceClient() {
        this(HttpClientBuilder.create(), Executors.newCachedThreadPool());
    }

    public ServiceClient(HttpClientBuilder httpClientBuilder,
            ExecutorService executorService) {
        this.httpClientBuilder = httpClientBuilder;
        this.executorService = executorService;
        this.withRequestFilterFirst(new UserAgentFilter(this.getClass().getName()));

    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public CloseableHttpClient getHttpClient() {
        if (this.httpClient == null) {
            String proxyHost = System.getProperty("http.proxyHost");
            String proxyPort = System.getProperty("http.proxyPort");
            if ((proxyHost != null) && (proxyPort != null)) {
                HttpHost proxy = new HttpHost(proxyHost, Integer.parseInt(proxyPort));
                if (proxy != null) {
                    httpClientBuilder.setProxy(proxy);
                }
            }

            this.httpClient = httpClientBuilder.build();
        }

        return this.httpClient;
    }

    @Override
    public ServiceClient<TClient> withRequestFilterFirst(
            ServiceRequestFilter serviceRequestFilter) {
        if (httpRequestInterceptorFrontAdapter == null) {
            httpRequestInterceptorFrontAdapter = new HttpRequestInterceptorFrontAdapter();
            httpClientBuilder.addInterceptorFirst(httpRequestInterceptorFrontAdapter);
        }
        httpRequestInterceptorFrontAdapter.addFront(serviceRequestFilter);
        return this;
    }

    @Override
    public ServiceClient<TClient> withRequestFilterLast(
            ServiceRequestFilter serviceRequestFilter) {
        if (httpRequestInterceptorBackAdapter == null) {
            httpRequestInterceptorBackAdapter = new HttpRequestInterceptorBackAdapter();
            httpClientBuilder.addInterceptorLast(httpRequestInterceptorBackAdapter);
        }
        httpRequestInterceptorBackAdapter.addBack(serviceRequestFilter);
        return this;
    }

    @Override
    public ServiceClient<TClient> withResponseFilterFirst(
            ServiceResponseFilter serviceResponseFilter) {
        if (httpResponseInterceptorFrontAdapter == null) {
            httpResponseInterceptorFrontAdapter = new HttpResponseInterceptorFrontAdapter();
            httpClientBuilder.addInterceptorFirst(httpResponseInterceptorFrontAdapter);
        }
        httpResponseInterceptorFrontAdapter.addFront(serviceResponseFilter);
        return this;
    }

    @Override
    public ServiceClient<TClient> withResponseFilterLast(
            ServiceResponseFilter serviceResponseFilter) {
        if (httpResponseInterceptorBackAdapter == null) {
            httpResponseInterceptorBackAdapter = new HttpResponseInterceptorBackAdapter();
            httpClientBuilder.addInterceptorLast(httpResponseInterceptorBackAdapter);
        }
        httpResponseInterceptorBackAdapter.addBack(serviceResponseFilter);
        return this;
    }

    @Override
    public void close() throws IOException {
        if (httpClient != null) {
            httpClient.close();
        }
    }
}
