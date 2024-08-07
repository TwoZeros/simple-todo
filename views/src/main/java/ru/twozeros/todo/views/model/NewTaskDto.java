package ru.twozeros.todo.views.model;

import lombok.Getter;

public class NewTaskDto {


    private String name;
    private Boolean isCompleted;

    public NewTaskDto(String name, Boolean isCompleted) {
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public String getName() {
        return name;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public NewTaskDto() {
    }

}
