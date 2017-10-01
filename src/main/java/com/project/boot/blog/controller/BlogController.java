package com.project.boot.blog.controller;

import com.project.boot.blog.entities.Post;
import com.project.boot.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String index(){
        return "Hello world";
    }

    @GetMapping("/posts")
    public List<Post> posts(){
        return postService.getAllPosts();
    }

    @PostMapping("/post")
    public void PulishPost(@RequestBody Post post){
        postService.insert(post);
    }



}
