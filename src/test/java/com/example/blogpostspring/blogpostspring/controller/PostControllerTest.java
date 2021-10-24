package com.example.blogpostspring.blogpostspring.controller;

import com.example.blogpostspring.blogpostspring.model.Post;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostControllerTest {

    @Test
    public void getAllPosts(){
        Post post1 = new Post("Title 1");
        post1.setPostContent("This is the dummy content for post 1");

        Post post2 = new Post("Title 2");
        post2.setPostContent("This is the dummy content for post 2");

        List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);

        assertEquals(2, postList.size());
    }

    @Test
    public void getPostDetails(){
        Post post1 = new Post("Title 1");
        post1.setPostContent("This is the dummy content for post 1");

        assertEquals("Title 1", post1.getPostTitle());
        assertEquals("This is the dummy content for post 1", post1.getPostContent());
    }
}
