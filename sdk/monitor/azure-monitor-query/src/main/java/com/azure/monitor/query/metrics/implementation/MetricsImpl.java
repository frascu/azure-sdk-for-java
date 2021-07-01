// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.metrics.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.monitor.query.metrics.implementation.models.ErrorResponseException;
import com.azure.monitor.query.metrics.implementation.models.MetricsResponse;
import com.azure.monitor.query.metrics.implementation.models.ResultType;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Metrics. */
public final class MetricsImpl {
    /** The proxy service used to perform REST calls. */
    private final MetricsService service;

    /** The service client containing this operation class. */
    private final MonitorManagementClientImpl client;

    /**
     * Initializes an instance of MetricsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    MetricsImpl(MonitorManagementClientImpl client) {
        this.service = RestProxy.create(MetricsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorManagementClientMetrics to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorManagementCli")
    private interface MetricsService {
        @Get("/{resourceUri}/providers/microsoft.insights/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<MetricsResponse>> list(
                @HostParam("$host") String host,
                @PathParam(value = "resourceUri", encoded = true) String resourceUri,
                @QueryParam("timespan") String timespan,
                @QueryParam("interval") Duration interval,
                @QueryParam("metric") String metric,
                @QueryParam("aggregation") String aggregation,
                @QueryParam("top") Integer top,
                @QueryParam("orderby") String orderby,
                @QueryParam("$filter") String filter,
                @QueryParam("resultType") ResultType resultType,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("metricnamespace") String metricnamespace,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metric The name of the metric to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricsResponse>> listWithResponseAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metric,
            String aggregation,
            Integer top,
            String orderby,
            String filter,
            ResultType resultType,
            String metricnamespace) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.list(
                                this.client.getHost(),
                                resourceUri,
                                timespan,
                                interval,
                                metric,
                                aggregation,
                                top,
                                orderby,
                                filter,
                                resultType,
                                this.client.getApiVersion(),
                                metricnamespace,
                                accept,
                                context));
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metric The name of the metric to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricsResponse>> listWithResponseAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metric,
            String aggregation,
            Integer top,
            String orderby,
            String filter,
            ResultType resultType,
            String metricnamespace,
            Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.list(
                this.client.getHost(),
                resourceUri,
                timespan,
                interval,
                metric,
                aggregation,
                top,
                orderby,
                filter,
                resultType,
                this.client.getApiVersion(),
                metricnamespace,
                accept,
                context);
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metric The name of the metric to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricsResponse> listAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metric,
            String aggregation,
            Integer top,
            String orderby,
            String filter,
            ResultType resultType,
            String metricnamespace) {
        return listWithResponseAsync(
                        resourceUri,
                        timespan,
                        interval,
                        metric,
                        aggregation,
                        top,
                        orderby,
                        filter,
                        resultType,
                        metricnamespace)
                .flatMap(
                        (Response<MetricsResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metric The name of the metric to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricsResponse> listAsync(
            String resourceUri,
            String timespan,
            Duration interval,
            String metric,
            String aggregation,
            Integer top,
            String orderby,
            String filter,
            ResultType resultType,
            String metricnamespace,
            Context context) {
        return listWithResponseAsync(
                        resourceUri,
                        timespan,
                        interval,
                        metric,
                        aggregation,
                        top,
                        orderby,
                        filter,
                        resultType,
                        metricnamespace,
                        context)
                .flatMap(
                        (Response<MetricsResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metric The name of the metric to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricsResponse list(
            String resourceUri,
            String timespan,
            Duration interval,
            String metric,
            String aggregation,
            Integer top,
            String orderby,
            String filter,
            ResultType resultType,
            String metricnamespace) {
        return listAsync(
                        resourceUri,
                        timespan,
                        interval,
                        metric,
                        aggregation,
                        top,
                        orderby,
                        filter,
                        resultType,
                        metricnamespace)
                .block();
    }

    /**
     * **Lists the metric values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param metric The name of the metric to retrieve.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param top The maximum number of records to retrieve. Valid only if $filter is specified. Defaults to 10.
     * @param orderby The aggregation to use for sorting results and the direction of the sort. Only one order can be
     *     specified. Examples: sum asc.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Reduces the set of data collected. The syntax allowed depends on the operation. See the
     *     operation's description for details.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a metrics query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MetricsResponse> listWithResponse(
            String resourceUri,
            String timespan,
            Duration interval,
            String metric,
            String aggregation,
            Integer top,
            String orderby,
            String filter,
            ResultType resultType,
            String metricnamespace,
            Context context) {
        return listWithResponseAsync(
                        resourceUri,
                        timespan,
                        interval,
                        metric,
                        aggregation,
                        top,
                        orderby,
                        filter,
                        resultType,
                        metricnamespace,
                        context)
                .block();
    }
}
