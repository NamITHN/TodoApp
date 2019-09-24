package com.hvcg.service;

import com.hvcg.model.TodoItem;

import java.util.List;

public interface TodoItemService {

    TodoItem save(TodoItem todoItem);

    List<TodoItem> findAll();

    void delete(Long todoItemId);
    void deleteAll();

    TodoItem update(Long todoItemId, TodoItem todoItem);

}
