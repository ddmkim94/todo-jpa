package com.dongmin.todo.member.entity;

import com.dongmin.todo.base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

import static javax.persistence.EnumType.STRING;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Member extends BaseEntity {

    @Column(unique = true)
    private String email;
    private String password;
    private String username;
    private String profile;

    @Enumerated(STRING)
    private MemberRole role;
}
