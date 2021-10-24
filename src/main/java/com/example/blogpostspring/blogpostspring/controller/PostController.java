package com.example.blogpostspring.blogpostspring.controller;

import com.example.blogpostspring.blogpostspring.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {

    @GetMapping("api/v1/posts")
    public List<Post> getAllPosts(){
        Post post1 = new Post("Title 1");
        post1.setPostContent("This is the dummy content for post 1");

        Post post2 = new Post("Title 2");
        post2.setPostContent("This is the dummy content for post 2");

        List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);

        return postList;
    }

    @GetMapping("api/v1/post/1")
    public Post getPost(){
        Post post1 = new Post("Title 1");
        post1.setPostContent("This is the dummy content for post 1");

        return post1;
    }
}
