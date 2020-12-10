package com.example.TaskPlanner.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FeatureTask extends Task {
    private String summary;
    private FeatureImpact impact;

    public FeatureTask(String id, String title, String creator, String assignee, LocalDateTime dueDate, String summary, FeatureImpact impact) {
        super(id, title, creator, assignee, dueDate);
        this.summary = summary;
        this.impact = impact;
    }
}
