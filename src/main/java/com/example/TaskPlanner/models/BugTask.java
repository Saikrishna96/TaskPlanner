package com.example.TaskPlanner.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BugTask extends Task {
    private BugSeverity severity;

    public BugTask(String id, String title, String creator, String assignee, LocalDateTime dueDate, BugSeverity severity) {
        super(id, title, creator, assignee, dueDate);
        this.severity = severity;
    }
}
