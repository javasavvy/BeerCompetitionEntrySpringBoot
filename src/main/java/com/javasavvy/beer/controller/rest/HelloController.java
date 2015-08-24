package com.javasavvy.beer.controller.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}