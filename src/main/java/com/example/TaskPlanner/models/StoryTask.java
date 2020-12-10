package com.example.TaskPlanner.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class StoryTask extends Task {
    private String summary;
    private List<SubTrack> subTracks;

    public StoryTask(String id, String title, String creator, String assignee, LocalDateTime dueDate, String summary, List<SubTrack> subTracks) {
        super(id, title, creator, assignee, dueDate);
        this.summary = summary;
        this.subTracks = subTracks;
    }
}
