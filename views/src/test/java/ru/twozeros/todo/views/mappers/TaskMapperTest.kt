package ru.twozeros.todo.views.mappers

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.twozeros.todo.views.mapper.v2.toService
import ru.twozeros.todo.views.model.NewTaskDto

class TaskMapperTest {

    @Test
    fun taskToServiceBaseTest() {
        val newTask = NewTaskDto().also {
            it.name = "todo"
            it.completed = false
        }

        val task = newTask.toService()
        Assertions.assertNotNull(task)
        Assertions.assertEquals(newTask.name, task.name)
        Assertions.assertEquals(newTask.completed, task.complete)
        Assertions.assertNotNull(task.created)
    }

}