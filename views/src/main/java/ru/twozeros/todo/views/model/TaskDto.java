package ru.twozeros.todo.views.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long id;
    private String name;
    private String longDescription;
    private Boolean isComplete;
}
