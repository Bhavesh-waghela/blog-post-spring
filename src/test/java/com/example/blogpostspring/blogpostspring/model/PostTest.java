package com.example.blogpostspring.blogpostspring.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest {

    Post post = new Post("This is new blog post");
    @Test
    public void createPostTitle(){
        assertEquals("This is new blog post", post.getPostTitle());
    }

    @Test
    public void createPostContent(){
        post.setPostContent("This is new blog post content");
        assertEquals("This is new blog post content", post.getPostContent());
    }
}
