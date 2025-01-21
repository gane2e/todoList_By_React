package com.reactapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/api/test")
    public String hello(){
        return "Hello World";
    }

}
