package ru.twozeros.todo.service.model;



import lombok.Builder;

import java.util.Date;


@Builder
public class Task {

    private Long id;

    private String name;

    private Date created;
    private Boolean isComplete;

    public Task() {
    }

    public Task(Long id, String name, Date created, Boolean isComplete) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.isComplete = isComplete;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreated() {
        return created;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }
}
