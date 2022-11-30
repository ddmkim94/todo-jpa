package com.dongmin.todo.member.entity;

import lombok.Getter;

@Getter
public enum MemberRole {
    USER("user"), ADMIN("admin");

    MemberRole(String role) {
        this.role = role;
    }

    private final String role;
}
