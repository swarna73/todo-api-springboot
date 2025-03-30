package com.swarnalatha.todo_api;

import com.swarnalatha.todo_api.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
