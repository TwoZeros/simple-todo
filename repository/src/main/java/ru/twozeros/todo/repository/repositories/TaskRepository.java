package ru.twozeros.todo.repository.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.twozeros.todo.repository.entity.TaskEntity;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Long> {
}
