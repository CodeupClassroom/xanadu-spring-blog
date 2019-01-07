package com.codeup.xanadu.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        String message = "Hello, you! So good good to run into you!";
        model.addAttribute("message", message);
        return "hello";
    }


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name, Model model) {

        String message = "Howdy, " + name + "!";
        model.addAttribute("message", message);

        return "hello";
    }

    @GetMapping("/hello/{first}/{last}")
    public String hello(@PathVariable String first, @PathVariable String last, Model model) {
        String message = "Howdy, " + first + " " + last + "!";
        model.addAttribute("message", message);
        return "hello";
    }



}
