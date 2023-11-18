package ru.twozeros.todo.views.mapper;

import ru.twozeros.todo.service.model.Task;
import ru.twozeros.todo.views.model.TaskDto;

import java.util.Date;

public class TaskMapper {

    public static Task toService(TaskDto task) {
        return new Task(task.getId(),task.getName(), task.getLongDescription(), task.getIsComplete(), new Date());
    }
}
