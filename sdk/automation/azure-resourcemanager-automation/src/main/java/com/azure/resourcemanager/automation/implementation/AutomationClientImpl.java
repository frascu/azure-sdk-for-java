// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.automation.fluent.ActivitiesClient;
import com.azure.resourcemanager.automation.fluent.AgentRegistrationInformationsClient;
import com.azure.resourcemanager.automation.fluent.AutomationAccountsClient;
import com.azure.resourcemanager.automation.fluent.AutomationClient;
import com.azure.resourcemanager.automation.fluent.CertificatesClient;
import com.azure.resourcemanager.automation.fluent.ConnectionTypesClient;
import com.azure.resourcemanager.automation.fluent.ConnectionsClient;
import com.azure.resourcemanager.automation.fluent.CredentialsClient;
import com.azure.resourcemanager.automation.fluent.DscCompilationJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.DscCompilationJobsClient;
import com.azure.resourcemanager.automation.fluent.DscConfigurationsClient;
import com.azure.resourcemanager.automation.fluent.DscNodeConfigurationsClient;
import com.azure.resourcemanager.automation.fluent.DscNodesClient;
import com.azure.resourcemanager.automation.fluent.FieldsClient;
import com.azure.resourcemanager.automation.fluent.HybridRunbookWorkerGroupsClient;
import com.azure.resourcemanager.automation.fluent.JobSchedulesClient;
import com.azure.resourcemanager.automation.fluent.JobStreamsClient;
import com.azure.resourcemanager.automation.fluent.JobsClient;
import com.azure.resourcemanager.automation.fluent.KeysClient;
import com.azure.resourcemanager.automation.fluent.LinkedWorkspacesClient;
import com.azure.resourcemanager.automation.fluent.ModulesClient;
import com.azure.resourcemanager.automation.fluent.NodeCountInformationsClient;
import com.azure.resourcemanager.automation.fluent.NodeReportsClient;
import com.azure.resourcemanager.automation.fluent.ObjectDataTypesClient;
import com.azure.resourcemanager.automation.fluent.OperationsClient;
import com.azure.resourcemanager.automation.fluent.Python2PackagesClient;
import com.azure.resourcemanager.automation.fluent.RunbookDraftsClient;
import com.azure.resourcemanager.automation.fluent.RunbooksClient;
import com.azure.resourcemanager.automation.fluent.SchedulesClient;
import com.azure.resourcemanager.automation.fluent.SoftwareUpdateConfigurationMachineRunsClient;
import com.azure.resourcemanager.automation.fluent.SoftwareUpdateConfigurationRunsClient;
import com.azure.resourcemanager.automation.fluent.SoftwareUpdateConfigurationsClient;
import com.azure.resourcemanager.automation.fluent.SourceControlSyncJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.SourceControlSyncJobsClient;
import com.azure.resourcemanager.automation.fluent.SourceControlsClient;
import com.azure.resourcemanager.automation.fluent.StatisticsOperationsClient;
import com.azure.resourcemanager.automation.fluent.TestJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.TestJobsClient;
import com.azure.resourcemanager.automation.fluent.UsagesClient;
import com.azure.resourcemanager.automation.fluent.VariablesClient;
import com.azure.resourcemanager.automation.fluent.WatchersClient;
import com.azure.resourcemanager.automation.fluent.WebhooksClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AutomationClientImpl type. */
@ServiceClient(builder = AutomationClientBuilder.class)
public final class AutomationClientImpl implements AutomationClient {
    private final ClientLogger logger = new ClientLogger(AutomationClientImpl.class);

    /**
     * Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID
     * forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The RunbookDraftsClient object to access its operations. */
    private final RunbookDraftsClient runbookDrafts;

    /**
     * Gets the RunbookDraftsClient object to access its operations.
     *
     * @return the RunbookDraftsClient object.
     */
    public RunbookDraftsClient getRunbookDrafts() {
        return this.runbookDrafts;
    }

    /** The RunbooksClient object to access its operations. */
    private final RunbooksClient runbooks;

    /**
     * Gets the RunbooksClient object to access its operations.
     *
     * @return the RunbooksClient object.
     */
    public RunbooksClient getRunbooks() {
        return this.runbooks;
    }

    /** The TestJobStreamsClient object to access its operations. */
    private final TestJobStreamsClient testJobStreams;

    /**
     * Gets the TestJobStreamsClient object to access its operations.
     *
     * @return the TestJobStreamsClient object.
     */
    public TestJobStreamsClient getTestJobStreams() {
        return this.testJobStreams;
    }

    /** The TestJobsClient object to access its operations. */
    private final TestJobsClient testJobs;

    /**
     * Gets the TestJobsClient object to access its operations.
     *
     * @return the TestJobsClient object.
     */
    public TestJobsClient getTestJobs() {
        return this.testJobs;
    }

    /** The Python2PackagesClient object to access its operations. */
    private final Python2PackagesClient python2Packages;

    /**
     * Gets the Python2PackagesClient object to access its operations.
     *
     * @return the Python2PackagesClient object.
     */
    public Python2PackagesClient getPython2Packages() {
        return this.python2Packages;
    }

    /** The AgentRegistrationInformationsClient object to access its operations. */
    private final AgentRegistrationInformationsClient agentRegistrationInformations;

    /**
     * Gets the AgentRegistrationInformationsClient object to access its operations.
     *
     * @return the AgentRegistrationInformationsClient object.
     */
    public AgentRegistrationInformationsClient getAgentRegistrationInformations() {
        return this.agentRegistrationInformations;
    }

    /** The DscNodesClient object to access its operations. */
    private final DscNodesClient dscNodes;

    /**
     * Gets the DscNodesClient object to access its operations.
     *
     * @return the DscNodesClient object.
     */
    public DscNodesClient getDscNodes() {
        return this.dscNodes;
    }

    /** The NodeReportsClient object to access its operations. */
    private final NodeReportsClient nodeReports;

    /**
     * Gets the NodeReportsClient object to access its operations.
     *
     * @return the NodeReportsClient object.
     */
    public NodeReportsClient getNodeReports() {
        return this.nodeReports;
    }

    /** The DscCompilationJobsClient object to access its operations. */
    private final DscCompilationJobsClient dscCompilationJobs;

    /**
     * Gets the DscCompilationJobsClient object to access its operations.
     *
     * @return the DscCompilationJobsClient object.
     */
    public DscCompilationJobsClient getDscCompilationJobs() {
        return this.dscCompilationJobs;
    }

    /** The DscCompilationJobStreamsClient object to access its operations. */
    private final DscCompilationJobStreamsClient dscCompilationJobStreams;

    /**
     * Gets the DscCompilationJobStreamsClient object to access its operations.
     *
     * @return the DscCompilationJobStreamsClient object.
     */
    public DscCompilationJobStreamsClient getDscCompilationJobStreams() {
        return this.dscCompilationJobStreams;
    }

    /** The DscNodeConfigurationsClient object to access its operations. */
    private final DscNodeConfigurationsClient dscNodeConfigurations;

    /**
     * Gets the DscNodeConfigurationsClient object to access its operations.
     *
     * @return the DscNodeConfigurationsClient object.
     */
    public DscNodeConfigurationsClient getDscNodeConfigurations() {
        return this.dscNodeConfigurations;
    }

    /** The NodeCountInformationsClient object to access its operations. */
    private final NodeCountInformationsClient nodeCountInformations;

    /**
     * Gets the NodeCountInformationsClient object to access its operations.
     *
     * @return the NodeCountInformationsClient object.
     */
    public NodeCountInformationsClient getNodeCountInformations() {
        return this.nodeCountInformations;
    }

    /** The SoftwareUpdateConfigurationRunsClient object to access its operations. */
    private final SoftwareUpdateConfigurationRunsClient softwareUpdateConfigurationRuns;

    /**
     * Gets the SoftwareUpdateConfigurationRunsClient object to access its operations.
     *
     * @return the SoftwareUpdateConfigurationRunsClient object.
     */
    public SoftwareUpdateConfigurationRunsClient getSoftwareUpdateConfigurationRuns() {
        return this.softwareUpdateConfigurationRuns;
    }

    /** The SoftwareUpdateConfigurationMachineRunsClient object to access its operations. */
    private final SoftwareUpdateConfigurationMachineRunsClient softwareUpdateConfigurationMachineRuns;

    /**
     * Gets the SoftwareUpdateConfigurationMachineRunsClient object to access its operations.
     *
     * @return the SoftwareUpdateConfigurationMachineRunsClient object.
     */
    public SoftwareUpdateConfigurationMachineRunsClient getSoftwareUpdateConfigurationMachineRuns() {
        return this.softwareUpdateConfigurationMachineRuns;
    }

    /** The SourceControlsClient object to access its operations. */
    private final SourceControlsClient sourceControls;

    /**
     * Gets the SourceControlsClient object to access its operations.
     *
     * @return the SourceControlsClient object.
     */
    public SourceControlsClient getSourceControls() {
        return this.sourceControls;
    }

    /** The SourceControlSyncJobsClient object to access its operations. */
    private final SourceControlSyncJobsClient sourceControlSyncJobs;

    /**
     * Gets the SourceControlSyncJobsClient object to access its operations.
     *
     * @return the SourceControlSyncJobsClient object.
     */
    public SourceControlSyncJobsClient getSourceControlSyncJobs() {
        return this.sourceControlSyncJobs;
    }

    /** The SourceControlSyncJobStreamsClient object to access its operations. */
    private final SourceControlSyncJobStreamsClient sourceControlSyncJobStreams;

    /**
     * Gets the SourceControlSyncJobStreamsClient object to access its operations.
     *
     * @return the SourceControlSyncJobStreamsClient object.
     */
    public SourceControlSyncJobStreamsClient getSourceControlSyncJobStreams() {
        return this.sourceControlSyncJobStreams;
    }

    /** The JobsClient object to access its operations. */
    private final JobsClient jobs;

    /**
     * Gets the JobsClient object to access its operations.
     *
     * @return the JobsClient object.
     */
    public JobsClient getJobs() {
        return this.jobs;
    }

    /** The JobStreamsClient object to access its operations. */
    private final JobStreamsClient jobStreams;

    /**
     * Gets the JobStreamsClient object to access its operations.
     *
     * @return the JobStreamsClient object.
     */
    public JobStreamsClient getJobStreams() {
        return this.jobStreams;
    }

    /** The AutomationAccountsClient object to access its operations. */
    private final AutomationAccountsClient automationAccounts;

    /**
     * Gets the AutomationAccountsClient object to access its operations.
     *
     * @return the AutomationAccountsClient object.
     */
    public AutomationAccountsClient getAutomationAccounts() {
        return this.automationAccounts;
    }

    /** The StatisticsOperationsClient object to access its operations. */
    private final StatisticsOperationsClient statisticsOperations;

    /**
     * Gets the StatisticsOperationsClient object to access its operations.
     *
     * @return the StatisticsOperationsClient object.
     */
    public StatisticsOperationsClient getStatisticsOperations() {
        return this.statisticsOperations;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The KeysClient object to access its operations. */
    private final KeysClient keys;

    /**
     * Gets the KeysClient object to access its operations.
     *
     * @return the KeysClient object.
     */
    public KeysClient getKeys() {
        return this.keys;
    }

    /** The CertificatesClient object to access its operations. */
    private final CertificatesClient certificates;

    /**
     * Gets the CertificatesClient object to access its operations.
     *
     * @return the CertificatesClient object.
     */
    public CertificatesClient getCertificates() {
        return this.certificates;
    }

    /** The ConnectionsClient object to access its operations. */
    private final ConnectionsClient connections;

    /**
     * Gets the ConnectionsClient object to access its operations.
     *
     * @return the ConnectionsClient object.
     */
    public ConnectionsClient getConnections() {
        return this.connections;
    }

    /** The ConnectionTypesClient object to access its operations. */
    private final ConnectionTypesClient connectionTypes;

    /**
     * Gets the ConnectionTypesClient object to access its operations.
     *
     * @return the ConnectionTypesClient object.
     */
    public ConnectionTypesClient getConnectionTypes() {
        return this.connectionTypes;
    }

    /** The CredentialsClient object to access its operations. */
    private final CredentialsClient credentials;

    /**
     * Gets the CredentialsClient object to access its operations.
     *
     * @return the CredentialsClient object.
     */
    public CredentialsClient getCredentials() {
        return this.credentials;
    }

    /** The DscConfigurationsClient object to access its operations. */
    private final DscConfigurationsClient dscConfigurations;

    /**
     * Gets the DscConfigurationsClient object to access its operations.
     *
     * @return the DscConfigurationsClient object.
     */
    public DscConfigurationsClient getDscConfigurations() {
        return this.dscConfigurations;
    }

    /** The SoftwareUpdateConfigurationsClient object to access its operations. */
    private final SoftwareUpdateConfigurationsClient softwareUpdateConfigurations;

    /**
     * Gets the SoftwareUpdateConfigurationsClient object to access its operations.
     *
     * @return the SoftwareUpdateConfigurationsClient object.
     */
    public SoftwareUpdateConfigurationsClient getSoftwareUpdateConfigurations() {
        return this.softwareUpdateConfigurations;
    }

    /** The HybridRunbookWorkerGroupsClient object to access its operations. */
    private final HybridRunbookWorkerGroupsClient hybridRunbookWorkerGroups;

    /**
     * Gets the HybridRunbookWorkerGroupsClient object to access its operations.
     *
     * @return the HybridRunbookWorkerGroupsClient object.
     */
    public HybridRunbookWorkerGroupsClient getHybridRunbookWorkerGroups() {
        return this.hybridRunbookWorkerGroups;
    }

    /** The JobSchedulesClient object to access its operations. */
    private final JobSchedulesClient jobSchedules;

    /**
     * Gets the JobSchedulesClient object to access its operations.
     *
     * @return the JobSchedulesClient object.
     */
    public JobSchedulesClient getJobSchedules() {
        return this.jobSchedules;
    }

    /** The LinkedWorkspacesClient object to access its operations. */
    private final LinkedWorkspacesClient linkedWorkspaces;

    /**
     * Gets the LinkedWorkspacesClient object to access its operations.
     *
     * @return the LinkedWorkspacesClient object.
     */
    public LinkedWorkspacesClient getLinkedWorkspaces() {
        return this.linkedWorkspaces;
    }

    /** The ActivitiesClient object to access its operations. */
    private final ActivitiesClient activities;

    /**
     * Gets the ActivitiesClient object to access its operations.
     *
     * @return the ActivitiesClient object.
     */
    public ActivitiesClient getActivities() {
        return this.activities;
    }

    /** The ModulesClient object to access its operations. */
    private final ModulesClient modules;

    /**
     * Gets the ModulesClient object to access its operations.
     *
     * @return the ModulesClient object.
     */
    public ModulesClient getModules() {
        return this.modules;
    }

    /** The ObjectDataTypesClient object to access its operations. */
    private final ObjectDataTypesClient objectDataTypes;

    /**
     * Gets the ObjectDataTypesClient object to access its operations.
     *
     * @return the ObjectDataTypesClient object.
     */
    public ObjectDataTypesClient getObjectDataTypes() {
        return this.objectDataTypes;
    }

    /** The FieldsClient object to access its operations. */
    private final FieldsClient fields;

    /**
     * Gets the FieldsClient object to access its operations.
     *
     * @return the FieldsClient object.
     */
    public FieldsClient getFields() {
        return this.fields;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The SchedulesClient object to access its operations. */
    private final SchedulesClient schedules;

    /**
     * Gets the SchedulesClient object to access its operations.
     *
     * @return the SchedulesClient object.
     */
    public SchedulesClient getSchedules() {
        return this.schedules;
    }

    /** The VariablesClient object to access its operations. */
    private final VariablesClient variables;

    /**
     * Gets the VariablesClient object to access its operations.
     *
     * @return the VariablesClient object.
     */
    public VariablesClient getVariables() {
        return this.variables;
    }

    /** The WatchersClient object to access its operations. */
    private final WatchersClient watchers;

    /**
     * Gets the WatchersClient object to access its operations.
     *
     * @return the WatchersClient object.
     */
    public WatchersClient getWatchers() {
        return this.watchers;
    }

    /** The WebhooksClient object to access its operations. */
    private final WebhooksClient webhooks;

    /**
     * Gets the WebhooksClient object to access its operations.
     *
     * @return the WebhooksClient object.
     */
    public WebhooksClient getWebhooks() {
        return this.webhooks;
    }

    /**
     * Initializes an instance of AutomationClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Gets subscription credentials which uniquely identify Microsoft Azure subscription. The
     *     subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    AutomationClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.runbookDrafts = new RunbookDraftsClientImpl(this);
        this.runbooks = new RunbooksClientImpl(this);
        this.testJobStreams = new TestJobStreamsClientImpl(this);
        this.testJobs = new TestJobsClientImpl(this);
        this.python2Packages = new Python2PackagesClientImpl(this);
        this.agentRegistrationInformations = new AgentRegistrationInformationsClientImpl(this);
        this.dscNodes = new DscNodesClientImpl(this);
        this.nodeReports = new NodeReportsClientImpl(this);
        this.dscCompilationJobs = new DscCompilationJobsClientImpl(this);
        this.dscCompilationJobStreams = new DscCompilationJobStreamsClientImpl(this);
        this.dscNodeConfigurations = new DscNodeConfigurationsClientImpl(this);
        this.nodeCountInformations = new NodeCountInformationsClientImpl(this);
        this.softwareUpdateConfigurationRuns = new SoftwareUpdateConfigurationRunsClientImpl(this);
        this.softwareUpdateConfigurationMachineRuns = new SoftwareUpdateConfigurationMachineRunsClientImpl(this);
        this.sourceControls = new SourceControlsClientImpl(this);
        this.sourceControlSyncJobs = new SourceControlSyncJobsClientImpl(this);
        this.sourceControlSyncJobStreams = new SourceControlSyncJobStreamsClientImpl(this);
        this.jobs = new JobsClientImpl(this);
        this.jobStreams = new JobStreamsClientImpl(this);
        this.automationAccounts = new AutomationAccountsClientImpl(this);
        this.statisticsOperations = new StatisticsOperationsClientImpl(this);
        this.usages = new UsagesClientImpl(this);
        this.keys = new KeysClientImpl(this);
        this.certificates = new CertificatesClientImpl(this);
        this.connections = new ConnectionsClientImpl(this);
        this.connectionTypes = new ConnectionTypesClientImpl(this);
        this.credentials = new CredentialsClientImpl(this);
        this.dscConfigurations = new DscConfigurationsClientImpl(this);
        this.softwareUpdateConfigurations = new SoftwareUpdateConfigurationsClientImpl(this);
        this.hybridRunbookWorkerGroups = new HybridRunbookWorkerGroupsClientImpl(this);
        this.jobSchedules = new JobSchedulesClientImpl(this);
        this.linkedWorkspaces = new LinkedWorkspacesClientImpl(this);
        this.activities = new ActivitiesClientImpl(this);
        this.modules = new ModulesClientImpl(this);
        this.objectDataTypes = new ObjectDataTypesClientImpl(this);
        this.fields = new FieldsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.schedules = new SchedulesClientImpl(this);
        this.variables = new VariablesClientImpl(this);
        this.watchers = new WatchersClientImpl(this);
        this.webhooks = new WebhooksClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}
