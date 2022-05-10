package com.goodlikemax.AllEmployees.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * "Created by : goodlikemax"
 * "Date: "20.04.2022
 */
public enum ApplicationUserPermission {
    ADMIN_READ("admin:read"),
    ADMIN_WRITE("admin:write"),
    EMPLOYEE_READ("employee:read"),
    EMPLOYEE_WRITE("employee:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
