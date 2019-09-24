package com.hvcg.service.impl;


import com.hvcg.model.TodoItem;
import com.hvcg.repository.TodoItemRepository;
import com.hvcg.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TodoItemServiceImpl implements TodoItemService {

    @Autowired
    TodoItemRepository todoItemRepository;


    public TodoItem save(TodoItem todoItem) {
        return todoItemRepository.save(todoItem);
    }


    public List<TodoItem> findAll() {
        return todoItemRepository.findAll();
    }


    public void delete(Long todoItemId) {
        todoItemRepository.deleteById(todoItemId);
    }

    @Override
    public void deleteAll() {
        todoItemRepository.deleteAll();
    }

    public void deleteList(List<Long> todoItemId) {
        todoItemRepository.deleteAllByTodoIdIsIn(todoItemId);
    }


    public TodoItem update(Long todoItemId, TodoItem todoItem) {
        Optional<TodoItem> optionalTodoItem = todoItemRepository.findById(todoItemId);
        if (!optionalTodoItem.isPresent()) return null;
        return todoItemRepository.save(todoItem);
    }

}
