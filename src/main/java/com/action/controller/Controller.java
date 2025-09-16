package com.action.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {

    @GetMapping("/api")
    public String api() {
        return "Hello World and this is coming from srpingboot project" ;
    }
    @GetMapping(/)
    public String emptyApi() {
        return " empty api Hello World and this is coming from srpingboot project" ;
    }
}
