package ru.twozeros.todo.views.controller;

import org.springframework.web.bind.annotation.*;
import ru.twozeros.todo.service.exception.TaskArgumentException;
import ru.twozeros.todo.service.model.Task;
import ru.twozeros.todo.service.services.TaskService;
import ru.twozeros.todo.views.mapper.TaskMapper;
import ru.twozeros.todo.views.model.NewTaskDto;
import ru.twozeros.todo.views.model.TaskDto;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/task/" , produces = "application/json")
class TaskController {

    private final TaskService service;

    TaskController(TaskService service) {
        this.service = service;
    }


    @GetMapping("list")
    List<Task> all() {
        return service.all();
    }

    @PostMapping()
    Task newTask(@RequestBody NewTaskDto taskDto) {
        var task = TaskMapper.toService(taskDto);
        return service.add(task);
    }

    @PutMapping()
    Task updateTask(@RequestBody TaskDto taskDto) {

        if(taskDto.getId() == null) {
            throw new TaskArgumentException();
        }
        var task = TaskMapper.toService(taskDto);
        return service.add(task);
    }


    @GetMapping("{id}")
    Task one(@PathVariable Long id) {

        return service.one(id);
    }

    @DeleteMapping("{id}")
    void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}