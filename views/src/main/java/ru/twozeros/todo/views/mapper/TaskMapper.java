package ru.twozeros.todo.views.mapper;

import ru.twozeros.todo.service.model.Task;
import ru.twozeros.todo.views.model.NewTaskDto;
import ru.twozeros.todo.views.model.TaskDto;

import java.util.Date;

public class TaskMapper {

    public static Task toService(TaskDto task) {
        return Task.builder()
                .id(task.getId())
                .name(task.getName())
                .isComplete(task.getIsCompleted())
                .created(new Date())
                .build();
    }

    public static Task toService(NewTaskDto task) {
        return Task.builder()
                .name(task.getName())
                .created(new Date())
                .isComplete(task.getIsCompleted())
                .build();
    }
}
