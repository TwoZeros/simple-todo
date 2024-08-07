package ru.twozeros.todo.views.mapper.v2

import ru.twozeros.todo.service.model.Task
import ru.twozeros.todo.views.model.NewTaskDto
import java.util.*

fun NewTaskDto.toService(): Task {
    return Task().also { it ->
        it.name = this.name
        it.complete = this.completed
        it.created = Date()
    }
}