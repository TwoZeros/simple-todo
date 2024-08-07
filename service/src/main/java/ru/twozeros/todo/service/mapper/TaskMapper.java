package ru.twozeros.todo.service.mapper;

import ru.twozeros.todo.repository.entity.TaskEntity;
import ru.twozeros.todo.service.model.Task;

public class TaskMapper {

    public static TaskEntity toRequest(Task task) {
        return TaskEntity.builder()
                .id(task.getId())
                .name(task.getName())
                .isComplete(task.getComplete())
                .created(task.getCreated())
                .build();
    }

    public static Task toResponse(TaskEntity task) {
       return Task.builder()
               .id(task.getId())
               .created(task.getCreated())
               .isComplete(task.getIsComplete())
               .name(task.getName())
               .build();
    }
}
