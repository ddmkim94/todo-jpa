package com.dongmin.todo.todo.service;

import com.dongmin.todo.todo.entity.Todo;
import com.dongmin.todo.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public Long write(Todo todo) {
        todoRepository.save(todo);
        return todo.getId();
    }
}
