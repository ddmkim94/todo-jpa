package com.dongmin.todo.todo.entity;

import lombok.Getter;

@Getter
public enum TodoType {
    TODO("todo"), DOING("doing"), DONE("done");

    TodoType(String type) {
        this.type = type;
    }

    private final String type;
}
