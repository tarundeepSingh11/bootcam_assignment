package com.restapi2.restapi2.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.Locale;

@RestController
public class UserController {

    //private MessageSource messageSource;
//    public  UserController(MessageSource messageSource){
//        this.messageSource=messageSource;
//    }
@Autowired
    private UserDAO  userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("/hello")
    public String hello(){
       return  "helloWorld";
    }
    @GetMapping("/Users")
    public List<User> users(){
     return userDAO.findAll();
    }
  @GetMapping("/Users/{id}")
    public EntityModel<User> etonr(@PathVariable int id){
       User user=userDAO.findOne(id);
      EntityModel<User> entityModel=EntityModel.of(user);
      WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).users());
      entityModel.add(link.withRel("all-users"));
      return entityModel;

  }

  @PostMapping("/Users")
    public User post(@RequestBody User user){
        return userDAO.addUser(user);
  }
    @PutMapping("/Users")
    public void put(@RequestBody User user){
        userDAO.update(user);
    }
  @DeleteMapping("/Users/{id}")
    public void del(@PathVariable int id){
        userDAO.dell(id);
    }
//    @GetMapping("/hello-internationalized")
//    public String helloWorld(){
//       // Locale locale= LocaleContextHolder.getLocale();
//       //return messageSource.getMessage("good.morning.message",null,"default message",locale);
//        return  "helloWorld";
//    }
   @GetMapping("/param")
   public String param(@RequestParam String id){
    return "hello:"+id;
    }

}