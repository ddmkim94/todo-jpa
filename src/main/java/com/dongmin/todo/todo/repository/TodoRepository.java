package com.dongmin.todo.todo.repository;

import com.dongmin.todo.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
