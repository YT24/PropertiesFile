package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @GetMapping("say1")
    public String say() {
        return "";
    }

    public String say1() {
        return "";
    }


    public String say2() {
        return "";
    }
}
