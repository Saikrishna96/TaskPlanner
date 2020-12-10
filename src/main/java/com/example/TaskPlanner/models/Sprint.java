package com.example.TaskPlanner.models;

import lombok.Data;

import java.util.List;

@Data
public class Sprint {
    private String sprintId;
    private List<Task> sprintTasks;

    public Sprint(List<Task> sprintTasks) {
        this.sprintTasks = sprintTasks;
    }
}
