package com.codeup.xanadu.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DiceController {

    private Integer[] dice;

    @GetMapping("/roll-dice")
    public String rollDice() {
        dice = new Integer[10];
        for (int i = 0; i < 10; i++) {
            dice[i] = ((int) Math.floor(Math.random() * 6) + 1);
        }
        return "rollDice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollDice(@PathVariable int guess, Model mod){
        mod.addAttribute("guess",guess);
        int guessedRight = 0;
        for (int i = 0; i < 10; i++) {
            if (guess == dice[i]) guessedRight++;
        }
        mod.addAttribute("correct",guessedRight);
//        mod.addAttribute("correct", guess==pips);
        return "diceResults";
    }
}
