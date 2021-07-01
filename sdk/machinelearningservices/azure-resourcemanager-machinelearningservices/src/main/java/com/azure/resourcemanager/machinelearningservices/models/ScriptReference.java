// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Script reference. */
@Fluent
public final class ScriptReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptReference.class);

    /*
     * The storage source of the script: inline, workspace.
     */
    @JsonProperty(value = "scriptSource")
    private String scriptSource;

    /*
     * The location of scripts in the mounted volume.
     */
    @JsonProperty(value = "scriptData")
    private String scriptData;

    /*
     * Optional command line arguments passed to the script to run.
     */
    @JsonProperty(value = "scriptArguments")
    private String scriptArguments;

    /*
     * Optional time period passed to timeout command.
     */
    @JsonProperty(value = "timeout")
    private String timeout;

    /**
     * Get the scriptSource property: The storage source of the script: inline, workspace.
     *
     * @return the scriptSource value.
     */
    public String scriptSource() {
        return this.scriptSource;
    }

    /**
     * Set the scriptSource property: The storage source of the script: inline, workspace.
     *
     * @param scriptSource the scriptSource value to set.
     * @return the ScriptReference object itself.
     */
    public ScriptReference withScriptSource(String scriptSource) {
        this.scriptSource = scriptSource;
        return this;
    }

    /**
     * Get the scriptData property: The location of scripts in the mounted volume.
     *
     * @return the scriptData value.
     */
    public String scriptData() {
        return this.scriptData;
    }

    /**
     * Set the scriptData property: The location of scripts in the mounted volume.
     *
     * @param scriptData the scriptData value to set.
     * @return the ScriptReference object itself.
     */
    public ScriptReference withScriptData(String scriptData) {
        this.scriptData = scriptData;
        return this;
    }

    /**
     * Get the scriptArguments property: Optional command line arguments passed to the script to run.
     *
     * @return the scriptArguments value.
     */
    public String scriptArguments() {
        return this.scriptArguments;
    }

    /**
     * Set the scriptArguments property: Optional command line arguments passed to the script to run.
     *
     * @param scriptArguments the scriptArguments value to set.
     * @return the ScriptReference object itself.
     */
    public ScriptReference withScriptArguments(String scriptArguments) {
        this.scriptArguments = scriptArguments;
        return this;
    }

    /**
     * Get the timeout property: Optional time period passed to timeout command.
     *
     * @return the timeout value.
     */
    public String timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: Optional time period passed to timeout command.
     *
     * @param timeout the timeout value to set.
     * @return the ScriptReference object itself.
     */
    public ScriptReference withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
