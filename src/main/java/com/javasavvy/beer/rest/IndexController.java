package com.javasavvy.beer.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Justin on 8/20/2015.
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "indexthyme";
    }
}
