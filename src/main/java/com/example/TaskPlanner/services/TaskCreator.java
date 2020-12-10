package com.example.TaskPlanner.services;

import com.example.TaskPlanner.models.FeatureImpact;
import com.example.TaskPlanner.models.FeatureTask;
import com.example.TaskPlanner.models.Task;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskCreator {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    // taskId;
    //    private String title;
    //    private String creator;
    //    private String userId;
    //    private LocalDateTime dueDate;
    // type
//    public String createTask(JSONObject taskData) {
////        FeatureImpact.valueOf("")
////        String taskType = taskData.optString("type");
////        String creator = taskData.optString("creator");
////        String title = taskData.optString("title");
////        String userId = taskData.optString("userId");
////        String due = taskData.optString("due");
//        switch (taskType) {
//            case "Feature":
//                return new FeatureTask(title,  creator,  userId,
//                        LocalDateTime.parse(due, formatter), taskData.optString("summary"), );
//        }
//    }
}
