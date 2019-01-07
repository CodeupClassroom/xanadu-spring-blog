package com.codeup.xanadu.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @ResponseBody
    @GetMapping("/add/{a}/and/{b}")
    public double add(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @ResponseBody
    @GetMapping("/subtract/{a}/from/{b}")
    public double subtract(@PathVariable double a, @PathVariable double b) {
        return b - a;
    }

    @GetMapping("/multiply/{a}/and/{b}")
    @ResponseBody
    public double multiply(@PathVariable double a, @PathVariable double b) {
        return a * b;
    }

    @ResponseBody
    @GetMapping("/divide/{numerator}/by/{denominator}")
    public double divide(@PathVariable double numerator, @PathVariable double denominator) {
        return numerator / denominator;
    }
}
