package ru.twozeros.todo.service.exception;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(Long id) {
        super("Could not find task" + id);
    }
}
