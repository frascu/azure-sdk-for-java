// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesDirect;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesExchange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Peering location is where connectivity could be established to the Microsoft Cloud Edge. */
@JsonFlatten
@Fluent
public class PeeringLocationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringLocationInner.class);

    /*
     * The kind of peering that the peering location supports.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /*
     * The properties that define a direct peering location.
     */
    @JsonProperty(value = "properties.direct")
    private PeeringLocationPropertiesDirect direct;

    /*
     * The properties that define an exchange peering location.
     */
    @JsonProperty(value = "properties.exchange")
    private PeeringLocationPropertiesExchange exchange;

    /*
     * The name of the peering location.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /*
     * The country in which the peering location exists.
     */
    @JsonProperty(value = "properties.country")
    private String country;

    /*
     * The Azure region associated with the peering location.
     */
    @JsonProperty(value = "properties.azureRegion")
    private String azureRegion;

    /**
     * Get the kind property: The kind of peering that the peering location supports.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of peering that the peering location supports.
     *
     * @param kind the kind value to set.
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the direct property: The properties that define a direct peering location.
     *
     * @return the direct value.
     */
    public PeeringLocationPropertiesDirect direct() {
        return this.direct;
    }

    /**
     * Set the direct property: The properties that define a direct peering location.
     *
     * @param direct the direct value to set.
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withDirect(PeeringLocationPropertiesDirect direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Get the exchange property: The properties that define an exchange peering location.
     *
     * @return the exchange value.
     */
    public PeeringLocationPropertiesExchange exchange() {
        return this.exchange;
    }

    /**
     * Set the exchange property: The properties that define an exchange peering location.
     *
     * @param exchange the exchange value to set.
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withExchange(PeeringLocationPropertiesExchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get the peeringLocation property: The name of the peering location.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The name of the peering location.
     *
     * @param peeringLocation the peeringLocation value to set.
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the country property: The country in which the peering location exists.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The country in which the peering location exists.
     *
     * @param country the country value to set.
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the azureRegion property: The Azure region associated with the peering location.
     *
     * @return the azureRegion value.
     */
    public String azureRegion() {
        return this.azureRegion;
    }

    /**
     * Set the azureRegion property: The Azure region associated with the peering location.
     *
     * @param azureRegion the azureRegion value to set.
     * @return the PeeringLocationInner object itself.
     */
    public PeeringLocationInner withAzureRegion(String azureRegion) {
        this.azureRegion = azureRegion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (direct() != null) {
            direct().validate();
        }
        if (exchange() != null) {
            exchange().validate();
        }
    }
}
