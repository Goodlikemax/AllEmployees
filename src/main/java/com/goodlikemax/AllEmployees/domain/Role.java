package com.goodlikemax.AllEmployees.domain;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.goodlikemax.AllEmployees.domain.ApplicationUserPermission.*;

/**
 * "Created by : goodlikemax"
 * "Date: "13.02.2022
 */


public enum Role{
    USER(Sets.newHashSet(EMPLOYEE_READ, EMPLOYEE_WRITE)),
    ADMIN(Sets.newHashSet(ADMIN_READ, ADMIN_WRITE, EMPLOYEE_READ, EMPLOYEE_WRITE));

    private final Set<ApplicationUserPermission> permission;

    Role(Set<ApplicationUserPermission> permission) {
        this.permission = permission;
    }

    public Set<ApplicationUserPermission> getPermission() {
        return permission;
    }

}

