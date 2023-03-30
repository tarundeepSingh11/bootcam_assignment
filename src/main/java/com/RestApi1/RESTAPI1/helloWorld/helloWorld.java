package com.RestApi1.RESTAPI1.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping(path = "/helloworld")
    public String helloWorld(){
        return "helloWorld";
    }
}
