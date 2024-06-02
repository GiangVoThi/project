package com.demo.lab1.Status;

import com.demo.lab1.Entity.RoLeE;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.management.relation.Role;

@Getter
@AllArgsConstructor
public enum RoleStatus {
    SUCCESS("Thanh Cong"),
    FAIL("That Bai"),
    ROLE_NOT_FOUND("Role Khong Ton Tai"),
    ROLE_EXIST("Role Da Ton Tai");

    private final String message;
}

