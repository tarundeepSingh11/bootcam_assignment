package com.example.Spring.question5;

import com.example.Spring.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Animal{
    String characteristics();
}
@Component
class dog implements Animal{

    @Override
    public String characteristics() {
        return "barkkk";
    }
}
@Component
@Primary
class  cat  implements Animal{

    @Override
    public String characteristics() {
        return "meaoooo";
    }
}
@Component
class UsAnimal{
    @Autowired
    private Animal animal;

    public UsAnimal(Animal animal) {
        this.animal = animal;
    }
    public String areaPlus4(int legs){
        //double ans=area.area(side);
        String ans=animal.characteristics();
        return ans+"side";
    }
}
public class Question5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        UsAnimal usAnimal=applicationContext.getBean(UsAnimal.class);
        String ans=usAnimal.areaPlus4(5);
        System.out.println(ans);
        System.out.println("run");
    }
}
