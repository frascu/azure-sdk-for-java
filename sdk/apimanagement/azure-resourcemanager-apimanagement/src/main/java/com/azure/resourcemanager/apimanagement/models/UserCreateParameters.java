// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** User create details. */
@JsonFlatten
@Fluent
public class UserCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserCreateParameters.class);

    /*
     * Account state. Specifies whether the user is active or not. Blocked
     * users are unable to sign into the developer portal or call any APIs of
     * subscribed products. Default state is Active.
     */
    @JsonProperty(value = "properties.state")
    private UserState state;

    /*
     * Optional note about a user set by the administrator.
     */
    @JsonProperty(value = "properties.note")
    private String note;

    /*
     * Collection of user identities.
     */
    @JsonProperty(value = "properties.identities")
    private List<UserIdentityContractInner> identities;

    /*
     * Email address. Must not be empty and must be unique within the service
     * instance.
     */
    @JsonProperty(value = "properties.email")
    private String email;

    /*
     * First name.
     */
    @JsonProperty(value = "properties.firstName")
    private String firstName;

    /*
     * Last name.
     */
    @JsonProperty(value = "properties.lastName")
    private String lastName;

    /*
     * User Password. If no value is provided, a default password is generated.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /*
     * Determines the type of application which send the create user request.
     * Default is legacy portal.
     */
    @JsonProperty(value = "properties.appType")
    private AppType appType;

    /*
     * Determines the type of confirmation e-mail that will be sent to the
     * newly created user.
     */
    @JsonProperty(value = "properties.confirmation")
    private Confirmation confirmation;

    /**
     * Get the state property: Account state. Specifies whether the user is active or not. Blocked users are unable to
     * sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     *
     * @return the state value.
     */
    public UserState state() {
        return this.state;
    }

    /**
     * Set the state property: Account state. Specifies whether the user is active or not. Blocked users are unable to
     * sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     *
     * @param state the state value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withState(UserState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the note property: Optional note about a user set by the administrator.
     *
     * @return the note value.
     */
    public String note() {
        return this.note;
    }

    /**
     * Set the note property: Optional note about a user set by the administrator.
     *
     * @param note the note value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get the identities property: Collection of user identities.
     *
     * @return the identities value.
     */
    public List<UserIdentityContractInner> identities() {
        return this.identities;
    }

    /**
     * Set the identities property: Collection of user identities.
     *
     * @param identities the identities value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withIdentities(List<UserIdentityContractInner> identities) {
        this.identities = identities;
        return this;
    }

    /**
     * Get the email property: Email address. Must not be empty and must be unique within the service instance.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address. Must not be empty and must be unique within the service instance.
     *
     * @param email the email value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the firstName property: First name.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     *
     * @param firstName the firstName value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     *
     * @param lastName the lastName value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the password property: User Password. If no value is provided, a default password is generated.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: User Password. If no value is provided, a default password is generated.
     *
     * @param password the password value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the appType property: Determines the type of application which send the create user request. Default is
     * legacy portal.
     *
     * @return the appType value.
     */
    public AppType appType() {
        return this.appType;
    }

    /**
     * Set the appType property: Determines the type of application which send the create user request. Default is
     * legacy portal.
     *
     * @param appType the appType value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withAppType(AppType appType) {
        this.appType = appType;
        return this;
    }

    /**
     * Get the confirmation property: Determines the type of confirmation e-mail that will be sent to the newly created
     * user.
     *
     * @return the confirmation value.
     */
    public Confirmation confirmation() {
        return this.confirmation;
    }

    /**
     * Set the confirmation property: Determines the type of confirmation e-mail that will be sent to the newly created
     * user.
     *
     * @param confirmation the confirmation value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withConfirmation(Confirmation confirmation) {
        this.confirmation = confirmation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identities() != null) {
            identities().forEach(e -> e.validate());
        }
    }
}
