package com.restapi2.restapi2.Staticfiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gfilter {
   @GetMapping("/filter")
    public UserForFilter filterw(){
        return new UserForFilter("Tarundeep","Singh","abcd");
    }
}
