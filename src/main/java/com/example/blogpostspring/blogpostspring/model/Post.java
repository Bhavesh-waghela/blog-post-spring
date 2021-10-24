package com.example.blogpostspring.blogpostspring.model;

public class Post {
    private String title;
    private String content;

    public Post(String title){
        this.title = title;
    }

    public String getPostTitle() {
        return title;
    }

    public void setPostContent(String content) {
        this.content = content;
    }

    public String getPostContent() {
        return content;
    }
}
