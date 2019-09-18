package com.example.demo.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class CoonfigProperties {

    @Value("${my.username}")
    private String username;

    @Value("${my.password}")
    private String password;

    @Value("${test.aaa}")
    private String aaa;



}
