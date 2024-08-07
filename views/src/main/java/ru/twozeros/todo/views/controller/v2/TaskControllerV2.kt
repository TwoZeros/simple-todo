package ru.twozeros.todo.views.controller.v2

import org.springframework.web.bind.annotation.*
import ru.twozeros.todo.service.exception.TaskArgumentException
import ru.twozeros.todo.service.model.Task
import ru.twozeros.todo.service.services.TaskService
import ru.twozeros.todo.views.mapper.TaskMapper
import ru.twozeros.todo.views.model.NewTaskDto
import ru.twozeros.todo.views.model.TaskDto


@RestController
@RequestMapping(path = ["api/v2/task/"], produces = ["application/json"])
open class TaskControllerV2(private val service: TaskService) {
    @GetMapping("list")
    fun all(): List<Task> {
        return service.all()
    }

    @PostMapping
    fun newTask(@RequestBody taskDto: NewTaskDto): Task {
        val task = TaskMapper.toService(taskDto)
        return service.add(task)
    }

    @PutMapping
    fun updateTask(@RequestBody taskDto: TaskDto): Task {
        if (taskDto.id == null) {
            throw TaskArgumentException()
        }
        val task = TaskMapper.toService(taskDto)
        return service.add(task)
    }

    @GetMapping("{id}")
    fun one(@PathVariable id: Long): Task {
        return service.one(id)
    }

    @DeleteMapping("{id}")
    fun deleteTask(@PathVariable id: Long?) {
        service.deleteTask(id)
    }
}