package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJenkins {
    @RequestMapping("/")
    public String Hello(){
        return "Hello Jenkins 20190418";
    }
}
