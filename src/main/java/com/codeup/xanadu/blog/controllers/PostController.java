package com.codeup.xanadu.blog.controllers;

import com.codeup.xanadu.blog.models.Post;
import com.codeup.xanadu.blog.models.UserRepository;
import com.codeup.xanadu.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {

    private PostService postService;
    private UserRepository userRepo;

    public PostController(PostService ps, UserRepository userRepo) {
        this.postService = ps;
        this.userRepo = userRepo;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts",postService.all());
        return "posts/index";
    }


    @GetMapping("/posts/{id}")
    public String showPost(@PathVariable int id, Model model) {
        model.addAttribute("post",postService.findOne(id));
        model.addAttribute("id", id);
        model.addAttribute("user", postService.findOne(id).getUser() );
        return "posts/show";

    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post",new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String saveNewPost(@ModelAttribute Post post) {
        int randomUser = (int) Math.floor(Math.random() * userRepo.count() + 1);
        post.setUser(userRepo.findOne(randomUser));
        postService.create(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("post",postService.findOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post) {
        postService.edit(post);
        return "redirect:/posts/"+post.getId();
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable int id) {
        postService.delete(postService.findOne(id));
        return "redirect:/posts";
    }
}
