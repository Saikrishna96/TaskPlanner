package com.example.TaskPlanner.models;

import lombok.Data;

@Data
public class SubTrack {
    private String subTrackId;
   private String title;
   private SubTrackStatus subTrackStatus;

    public SubTrack(String id, String title, SubTrackStatus subTrackStatus) {
        this.subTrackId = id;
        this.title = title;
        this.subTrackStatus = subTrackStatus;
    }
}
