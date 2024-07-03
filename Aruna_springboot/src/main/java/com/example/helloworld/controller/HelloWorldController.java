package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    @RequestMapping("/home")
    public String home() {
        return  "index.html";  // Assuming "index.html" is the name of your landing page
    }

    @RequestMapping("/about")
    public String aboutme() {
        return  "about.html";
    }
    @RequestMapping("/feedback")
    public String feed() {
        return  "feedback.html";
    }


    @GetMapping("/success")
    public String success() {
        return  "success.html";
    }


}
