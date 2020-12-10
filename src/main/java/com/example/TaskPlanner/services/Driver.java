package com.example.TaskPlanner.services;

import com.example.TaskPlanner.models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // create users

        User user1 = new User("u1", "user1", "u1@gmail.com", "999999990");
        User user2 = new User("u2", "user2", "u2@gmail.com", "992999990");

        TaskPlannerService taskPlannerService = new TaskPlannerService();
        taskPlannerService.addUser(user1);
        taskPlannerService.addUser(user2);

        // add tasks
//        Task task = new FeatureTask(String title, String creator, String assignee, LocalDateTime dueDate, String summary, FeatureImpact impact)

        Task task = new FeatureTask("t1", "title1", "c1", "u1", LocalDateTime.now().plusDays(3), "summary", FeatureImpact.Low);
        taskPlannerService.addTask(task);

        SubTrack subTrack = new SubTrack("sub1", "title", SubTrackStatus.Open);
        List<SubTrack> subTrackList = new ArrayList<>();
        subTrackList.add(subTrack);

        Task storyTask = new StoryTask("s1", "story1", "c2", null, LocalDateTime.now().plusDays(2), "storysummary", subTrackList);

        Task bugTask = new BugTask("bug1", "bug title1", "c3", null, LocalDateTime.now().plusDays(1), BugSeverity.P0);
        Task bugTask1 = new BugTask("bug2", "bug title2", "c3", null, LocalDateTime.now().plusDays(1), BugSeverity.P0);

//        taskPlannerService.updateStatus("t1", TaskStatus.Testing);
        taskPlannerService.addTask(storyTask);
        taskPlannerService.addTask(bugTask);
        taskPlannerService.addTask(bugTask1);

        taskPlannerService.assignTask("t1", "u1");
        taskPlannerService.assignTask("bug1", "u1");
        taskPlannerService.assignTask("bug2", "u2");
        taskPlannerService.assignTask("s1", "u1");


        taskPlannerService.displayUserTask("u1");
        System.out.println("--------------------------");
        taskPlannerService.displayUserTask("u2");

        SubTrack subTrack1 = new SubTrack("sub2", "title2", SubTrackStatus.Open);
        taskPlannerService.addSubtrack(subTrack1, "s1");





    }
}
