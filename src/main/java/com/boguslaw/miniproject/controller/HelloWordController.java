package com.boguslaw.miniproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "<div style=\"font-size:10em;text-align:center;\">\uD83D\uDC4B  \uD83C\uDF0D</div>"; //👋  🌍
    }
}
