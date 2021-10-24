package com.example.blogpostspring.blogpostspring.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    User user = new User(1, "Bhavesh", "bhavesh@gmail.com");
    @Test
    public void createUserName(){
        assertEquals("Bhavesh", user.getName());
    }

    @Test
    public void createUserId(){
        assertEquals(1, user.getId());
    }

    @Test
    public void createUserEmail(){
        assertEquals("bhavesh@gmail.com", user.getEmail());
    }
}
