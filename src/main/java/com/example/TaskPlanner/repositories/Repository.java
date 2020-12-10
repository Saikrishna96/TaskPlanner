package com.example.TaskPlanner.repositories;

import com.example.TaskPlanner.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {
    Map<String, Task> taskMap;
    Map<String, SubTrack> subTrackMap;
    Map<String, Sprint> sprintMap;
    //    Map<String, Map<String, List<Task>>> userTasks;
    Map<String, List<String>> userTasks;
    Map<String, User> userMap;

    public Repository() {
        this.taskMap = new HashMap<>();
        this.subTrackMap = new HashMap<>();
        this.sprintMap = new HashMap<>();
        this.userTasks = new HashMap<>();
        this.userMap = new HashMap<>();
    }

    public String addUser(User user) {
        userMap.put(user.getUserid(), user);
        return user.getUserid();
    }

    public String addTask(Task task) {
        taskMap.put(task.getTaskId(), task);
        return task.getTaskId();
    }

    public String addSprint(Sprint sprint) {
        sprintMap.put(sprint.getSprintId(), sprint);
        return sprint.getSprintId();
    }


    public String addSubTrack(SubTrack subTrack, String id) {
        StoryTask task = (StoryTask) taskMap.get(id);
        if (task.getSubTracks() == null)
            task.setSubTracks(new ArrayList<>());
        task.getSubTracks().add(subTrack);
        return subTrack.getSubTrackId();
    }

    public boolean updateTaskStatus(String id, TaskStatus status) {
        taskMap.get(id).setStatus(status);
        return true;
        // any exception return false
    }

    public boolean updateSubTrackStatus(String id, SubTrackStatus status, String taskId) throws Exception {
        try {
            subTrackMap.get(id).setSubTrackStatus(status);
            StoryTask task = (StoryTask) taskMap.get(taskId);
            task.getSubTracks().forEach(subTrack -> {
                if (subTrack.getSubTrackId() == id)
                    subTrack.setSubTrackStatus(status);
            });
            return true;
        } catch (Exception e) {
            // we can the exception accordingly
        }
        return false;
    }

    public boolean addUserToTask(String id, String userId) {
        taskMap.get(id).setUserId(userId);
        if (userTasks.get(userId) == null)
            userTasks.put(userId, new ArrayList<>());
        userTasks.get(userId).add(id);
        return true;
        // any exception return false
    }

    public void displayTask(String id) {
        userTasks.get(id).forEach(taskId -> {

            System.out.println("taskId : " + taskId + ", title : " + taskMap.get(taskId).getTitle() + ", task type " + taskMap.get(taskId).getClass());
        });
        // can categorize based on feature
    }
}
