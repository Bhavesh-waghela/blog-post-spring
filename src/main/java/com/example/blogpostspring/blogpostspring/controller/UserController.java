package com.example.blogpostspring.blogpostspring.controller;

import com.example.blogpostspring.blogpostspring.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/api/v1/users")
    public List<User> getAllUserList(){
        User user1 = new User(1, "Bhavesh", "bhavesh@gmail.com");
        User user2 = new User(2, "Hitesh", "hitesh@gmail.com");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

    @GetMapping("/api/v1/user/1")
    public User getUser(){
        User user1 = new User(1, "Bhavesh", "bhavesh@gmail.com");
        return user1;
    }
}
