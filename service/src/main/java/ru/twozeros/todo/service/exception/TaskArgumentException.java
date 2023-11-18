package ru.twozeros.todo.service.exception;

public class TaskArgumentException extends RuntimeException {
    public TaskArgumentException() {
        super("Не указан Id задачи" );
    }
}
