package com.example.git_action_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("")
    public String hello() {
        return "hello";
    }
}
