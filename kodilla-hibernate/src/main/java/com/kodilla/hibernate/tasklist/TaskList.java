package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;
    private List <Task> tasks = new ArrayList <>();

    public TaskList() {
    }

    public TaskList(String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List <Task> getTasks() {
        return tasks;
    }

    private TaskList setId(int id) {
        this.id = id;
        return this;
    }

    private TaskList setListName(String listName) {
        this.listName = listName;
        return this;
    }

    private TaskList setDescription(String description) {
        this.description = description;
        return this;
    }

    public void setTasks(List <Task> tasks) {
        this.tasks = tasks;
    }
}
