package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/name")
    public String getName(){
        return "Mani Kumar";
    }
}