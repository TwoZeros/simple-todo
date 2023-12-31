package ru.twozeros.todo.views.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    @JsonProperty(required = true)
    private Long id;
    @JsonProperty(required = true)
    private String name;
    private Boolean isCompleted;
}
