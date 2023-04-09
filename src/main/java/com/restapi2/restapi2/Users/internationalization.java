package com.restapi2.restapi2.Users;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class internationalization {
    private MessageSource messageSource;
    public  internationalization(MessageSource messageSource){
        this.messageSource=messageSource;
    }
    @GetMapping("/hello-internationalized")
    public String helloWorld(){
         Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"default message",locale);


    }
}
