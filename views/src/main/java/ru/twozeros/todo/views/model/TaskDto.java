package ru.twozeros.todo.views.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class TaskDto {

    @Getter
    @JsonProperty(required = true)
    private Long id;

    @Getter
    @JsonProperty(required = true)
    private String name;
    private Boolean isCompleted;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public TaskDto(Long id, String name, Boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public TaskDto() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
