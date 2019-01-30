package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList() {
    }

    public TaskList(String listName) {
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
    private String getDescription() {
        return description;
    }

    public TaskList setId(int id) {
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
}
