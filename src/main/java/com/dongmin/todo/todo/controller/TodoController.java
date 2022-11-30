package com.dongmin.todo.todo.controller;

import com.dongmin.todo.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
}
