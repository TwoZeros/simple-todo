package ru.twozeros.todo.service.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.twozeros.todo.repository.entity.TaskEntity;
import ru.twozeros.todo.repository.repositories.TaskRepository;
import ru.twozeros.todo.service.exception.TaskNotFoundException;
import ru.twozeros.todo.service.mapper.TaskMapper;
import ru.twozeros.todo.service.model.Task;

import java.util.Date;
import java.util.List;

import static ru.twozeros.todo.service.utils.ListUtils.toList;

@Service
public class TaskService {
    private final TaskRepository repository;

    TaskService(TaskRepository repository) {
        this.repository = repository;
    }


    public List<Task> all() {

        return toList(repository.findAll()).stream().map(TaskMapper::toResponse).toList();
    }


    public Task add(@RequestBody Task task) {
        task.setCreated(new Date());
        var createdTask = repository.save(TaskMapper.toRequest(task));
        return TaskMapper.toResponse(createdTask);
    }

    public Task one(@PathVariable Long id) {
        var task = repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
            return TaskMapper.toResponse(task);
    }



    public void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
