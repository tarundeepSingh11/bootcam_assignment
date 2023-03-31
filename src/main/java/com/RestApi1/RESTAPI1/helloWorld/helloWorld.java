package com.RestApi1.RESTAPI1.helloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class helloWorld {
   // @GetMapping(path = "/helloworld")
    @RequestMapping(value="/helloworld",headers = "Accept=application/json",method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "helloWorld";
    }
}
