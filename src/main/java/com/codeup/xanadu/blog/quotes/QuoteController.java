package com.codeup.xanadu.blog.quotes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @RequestMapping("/quote")
    public Quote getRandomQuote() {
        return Quote.getRandomQuote();
    }
}
