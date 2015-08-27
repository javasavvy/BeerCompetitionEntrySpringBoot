package com.javasavvy.beer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Justin on 8/20/2015.
 */

@Controller
public class IndexController {

    @RequestMapping("/thyme")
    public String index() {
        System.out.println("index controller");
        return "indexthyme";
    }
}
