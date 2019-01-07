package com.codeup.xanadu.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class PostController {

    @GetMapping("/posts")
    public String index() {
        return "Index of all blog posts";
    }


    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id) {
        return "Showing the post with id of: " + id;

    }

    @GetMapping("/posts/create")
    public String create() {
        return "View the form for creating a post";
    }

    @PostMapping("/posts")
    public String save() {
        return "Handle the POST request for saving a new blog post";
    }
}
