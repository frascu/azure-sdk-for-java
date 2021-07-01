// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UserState. */
public final class UserState extends ExpandableStringEnum<UserState> {
    /** Static value active for UserState. */
    public static final UserState ACTIVE = fromString("active");

    /** Static value blocked for UserState. */
    public static final UserState BLOCKED = fromString("blocked");

    /** Static value pending for UserState. */
    public static final UserState PENDING = fromString("pending");

    /** Static value deleted for UserState. */
    public static final UserState DELETED = fromString("deleted");

    /**
     * Creates or finds a UserState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserState.
     */
    @JsonCreator
    public static UserState fromString(String name) {
        return fromString(name, UserState.class);
    }

    /** @return known UserState values. */
    public static Collection<UserState> values() {
        return values(UserState.class);
    }
}
