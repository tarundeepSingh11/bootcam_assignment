package com.restapi2.restapi2.verioing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class versioning {
    @GetMapping("/ll")
    public Person1 byURL(){
        return new Person1("tarun");
    }
@GetMapping("/mm")
    public Person2 byUrl2(){
        return new Person2("tarundeep","Sandhu");
}

        @GetMapping(path="/ll",params = "/v1")
        public Person1 byURLByParam(){
            return new Person1("tarun");
        }
    @GetMapping(path="/mm",params = "/v12")
    public Person2 byURLByParam3(){
        return new Person2("tarun","Singh");
    }
    @GetMapping(path="/ll",headers = "/v1=1")
    public Person1 byURLByHeader(){
        return new Person1("tarun");
    }
    @GetMapping(path="/mm",headers = "/v2=2")
    public Person2 byURLByHeader2(){
        return new Person2("tarun","Singh");
    }
   // :application/vnd.company.app-v1+json
   @GetMapping(path="/ll",produces = "application/vnd.company.app-v1+json")
   public Person1 byURLAcceptHeader(){
       return new Person1("tarun");
   }

}
