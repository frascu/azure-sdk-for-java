// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The set of tasks to execute on the input documents. Cannot specify the same task more than once. */
@Fluent
public final class JobManifestTasks {
    /*
     * The entityRecognitionTasks property.
     */
    @JsonProperty(value = "entityRecognitionTasks")
    private List<EntitiesTask> entityRecognitionTasks;

    /*
     * The entityRecognitionPiiTasks property.
     */
    @JsonProperty(value = "entityRecognitionPiiTasks")
    private List<PiiTask> entityRecognitionPiiTasks;

    /*
     * The keyPhraseExtractionTasks property.
     */
    @JsonProperty(value = "keyPhraseExtractionTasks")
    private List<KeyPhrasesTask> keyPhraseExtractionTasks;

    /*
     * The entityLinkingTasks property.
     */
    @JsonProperty(value = "entityLinkingTasks")
    private List<EntityLinkingTask> entityLinkingTasks;

    /*
     * The sentimentAnalysisTasks property.
     */
    @JsonProperty(value = "sentimentAnalysisTasks")
    private List<SentimentAnalysisTask> sentimentAnalysisTasks;

    /**
     * Get the entityRecognitionTasks property: The entityRecognitionTasks property.
     *
     * @return the entityRecognitionTasks value.
     */
    public List<EntitiesTask> getEntityRecognitionTasks() {
        return this.entityRecognitionTasks;
    }

    /**
     * Set the entityRecognitionTasks property: The entityRecognitionTasks property.
     *
     * @param entityRecognitionTasks the entityRecognitionTasks value to set.
     * @return the JobManifestTasks object itself.
     */
    public JobManifestTasks setEntityRecognitionTasks(List<EntitiesTask> entityRecognitionTasks) {
        this.entityRecognitionTasks = entityRecognitionTasks;
        return this;
    }

    /**
     * Get the entityRecognitionPiiTasks property: The entityRecognitionPiiTasks property.
     *
     * @return the entityRecognitionPiiTasks value.
     */
    public List<PiiTask> getEntityRecognitionPiiTasks() {
        return this.entityRecognitionPiiTasks;
    }

    /**
     * Set the entityRecognitionPiiTasks property: The entityRecognitionPiiTasks property.
     *
     * @param entityRecognitionPiiTasks the entityRecognitionPiiTasks value to set.
     * @return the JobManifestTasks object itself.
     */
    public JobManifestTasks setEntityRecognitionPiiTasks(List<PiiTask> entityRecognitionPiiTasks) {
        this.entityRecognitionPiiTasks = entityRecognitionPiiTasks;
        return this;
    }

    /**
     * Get the keyPhraseExtractionTasks property: The keyPhraseExtractionTasks property.
     *
     * @return the keyPhraseExtractionTasks value.
     */
    public List<KeyPhrasesTask> getKeyPhraseExtractionTasks() {
        return this.keyPhraseExtractionTasks;
    }

    /**
     * Set the keyPhraseExtractionTasks property: The keyPhraseExtractionTasks property.
     *
     * @param keyPhraseExtractionTasks the keyPhraseExtractionTasks value to set.
     * @return the JobManifestTasks object itself.
     */
    public JobManifestTasks setKeyPhraseExtractionTasks(List<KeyPhrasesTask> keyPhraseExtractionTasks) {
        this.keyPhraseExtractionTasks = keyPhraseExtractionTasks;
        return this;
    }

    /**
     * Get the entityLinkingTasks property: The entityLinkingTasks property.
     *
     * @return the entityLinkingTasks value.
     */
    public List<EntityLinkingTask> getEntityLinkingTasks() {
        return this.entityLinkingTasks;
    }

    /**
     * Set the entityLinkingTasks property: The entityLinkingTasks property.
     *
     * @param entityLinkingTasks the entityLinkingTasks value to set.
     * @return the JobManifestTasks object itself.
     */
    public JobManifestTasks setEntityLinkingTasks(List<EntityLinkingTask> entityLinkingTasks) {
        this.entityLinkingTasks = entityLinkingTasks;
        return this;
    }

    /**
     * Get the sentimentAnalysisTasks property: The sentimentAnalysisTasks property.
     *
     * @return the sentimentAnalysisTasks value.
     */
    public List<SentimentAnalysisTask> getSentimentAnalysisTasks() {
        return this.sentimentAnalysisTasks;
    }

    /**
     * Set the sentimentAnalysisTasks property: The sentimentAnalysisTasks property.
     *
     * @param sentimentAnalysisTasks the sentimentAnalysisTasks value to set.
     * @return the JobManifestTasks object itself.
     */
    public JobManifestTasks setSentimentAnalysisTasks(List<SentimentAnalysisTask> sentimentAnalysisTasks) {
        this.sentimentAnalysisTasks = sentimentAnalysisTasks;
        return this;
    }
}
