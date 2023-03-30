package com.RestApi1.RESTAPI1.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class secondd {
        @GetMapping(path = "/hello")
        public String helloWorld(){
            return "hello";
        }

}

