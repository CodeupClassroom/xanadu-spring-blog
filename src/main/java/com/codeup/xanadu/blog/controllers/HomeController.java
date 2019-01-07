package com.codeup.xanadu.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/") // the piece of URL we're listening for
    public String home(Model model) {
        int number = (int) Math.floor(Math.random() * 200) + 1;

        model.addAttribute("number", number);
        return "home";
    }

}
