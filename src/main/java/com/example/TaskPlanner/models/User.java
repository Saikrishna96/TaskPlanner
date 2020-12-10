package com.example.TaskPlanner.models;

import lombok.Data;

@Data
public class User {
    String userid;
    String name;
    String email;
    String phoneNumber;

    public User(String userid, String name, String email, String phoneNumber) {
        this.userid = userid;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
