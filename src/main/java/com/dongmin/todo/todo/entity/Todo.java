package com.dongmin.todo.todo.entity;

import com.dongmin.todo.base.entity.BaseEntity;
import com.dongmin.todo.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Todo extends BaseEntity {

    private String title;

    private String content;

    @Enumerated(STRING)
    private TodoType type;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
