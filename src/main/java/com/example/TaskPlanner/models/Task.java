package com.example.TaskPlanner.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Task {
    private String taskId;
    private String title;
    private String creator;
    private String userId;
    private LocalDateTime dueDate;
    private TaskStatus status;

    public Task(String taskId, String title, String creator, String assignee, LocalDateTime dueDate) {
        this.taskId = taskId;
        this.title = title;
        this.creator = creator;
        this.userId = assignee;
        this.dueDate = dueDate;
    }


}
