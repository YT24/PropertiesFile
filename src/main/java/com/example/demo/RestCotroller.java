package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCotroller {

    @Value("${test.aaa}")
    private String aaa;

    @GetMapping("say")
    public String say(){

        return aaa;
    }

}
