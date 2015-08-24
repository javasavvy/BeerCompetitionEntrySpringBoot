package com.javasavvy.beer.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}