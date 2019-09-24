package com.hvcg.repository;

import com.hvcg.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

    void deleteAllByTodoIdIsIn(List<Long> listId);
}
