package com.example.blogpostspring.blogpostspring.model;

public class User {
    private String name;
    private String email;
    private int id;

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

