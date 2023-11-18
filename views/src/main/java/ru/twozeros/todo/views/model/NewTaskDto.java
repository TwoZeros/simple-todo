package ru.twozeros.todo.views.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewTaskDto {

    private String name;
    private Boolean isCompleted;
}
