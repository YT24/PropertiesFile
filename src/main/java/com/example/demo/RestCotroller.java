package com.example.demo;

import com.example.demo.common.CoonfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCotroller {

   @Autowired
   private CoonfigProperties coonfigProperties;

    @GetMapping("say")
    public String say(){
    return coonfigProperties.getUsername()+"-"+coonfigProperties.getPassword()+"-"+ coonfigProperties.getAaa();
    }

}
