package com.example.TaskPlanner.services;

import com.example.TaskPlanner.models.SubTrack;
import com.example.TaskPlanner.models.Task;
import com.example.TaskPlanner.models.TaskStatus;
import com.example.TaskPlanner.models.User;
import com.example.TaskPlanner.repositories.Repository;

public class TaskPlannerService {
    private Repository repository;

    public TaskPlannerService() {
        this.repository = new Repository();
    }

    public String addUser(User user) {
        return repository.addUser(user);
    }

    public String addTask(Task task) {
        return repository.addTask(task);
    }

    public String addSubtrack(SubTrack subTrack, String storyId) {
        return repository.addSubTrack(subTrack, storyId);
    }

    public boolean assignTask(String taskId, String userId) {
        return repository.addUserToTask(taskId, userId);
    }

    public void displayUserTask(String id) {
        repository.displayTask(id);
    }

    public boolean updateStatus(String id, TaskStatus status){
        return repository.updateTaskStatus(id, status);
    }
}
