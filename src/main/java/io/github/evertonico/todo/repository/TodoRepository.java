package io.github.evertonico.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.evertonico.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
