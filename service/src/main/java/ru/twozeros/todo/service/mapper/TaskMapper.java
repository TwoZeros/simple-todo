package ru.twozeros.todo.service.mapper;

import ru.twozeros.todo.repository.entity.TaskEntity;
import ru.twozeros.todo.service.model.Task;

public class TaskMapper {

    public static TaskEntity toRequest(Task task) {
        return new TaskEntity(task.getId(), task.getName(), task.getCreated());
    }

    public static Task toResponse(TaskEntity task) {
        return new Task(task.getId(), task.getName(), task.getCreated());
    }
}
