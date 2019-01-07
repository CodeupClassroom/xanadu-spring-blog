package com.codeup.xanadu.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/") // the piece of URL we're listening for
    @ResponseBody // only necessary if you're returning a string/number
    public String home() {
        return "Welcome home! This is the landing page";
    }

}
