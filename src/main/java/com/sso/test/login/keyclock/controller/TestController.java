package com.sso.test.login.keyclock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloWorld")
    public String getHelloWorld() {
        return "Hello World!";
    }

}