package org.hyperskill.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/")
    public String hello() {
       return "Hello, World!";
    }

    @GetMapping("/about")
    public String about() {
        return "Website for Spring Boot testing";
    }

    @GetMapping("cooking")
    public String cooking(@RequestParam String item) {
        char fLetter = item.charAt(0);
        // minutes to cook item:
        int minutes = -1;
        if (fLetter < 'o')
            minutes = 15;
        else minutes = 35;
        return "Cook " + item + " for " + minutes + " minutes.";
    }
}