package com.example.blogpostspring.blogpostspring.controller;

import com.example.blogpostspring.blogpostspring.model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    @Test
    public void getAllUserList(){
        User user1 = new User(1, "Bhavesh", "bhavesh@gmail.com");
        User user2 = new User(2, "Hitesh", "hitesh@gmail.com");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        assertEquals(2, userList.size());
    }

    @Test
    public void getUserDetails(){
        User user1 = new User(1, "Bhavesh", "bhavesh@gmail.com");
        assertEquals(1, user1.getId());
        assertEquals("Bhavesh", user1.getName());
        assertEquals("bhavesh@gmail.com", user1.getEmail());
    }
}
